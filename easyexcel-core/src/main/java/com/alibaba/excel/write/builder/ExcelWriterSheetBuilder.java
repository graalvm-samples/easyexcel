package com.alibaba.excel.write.builder;

import java.util.Collection;
import java.util.Map;
import java.util.function.Supplier;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.fill.FillConfig;
import com.alibaba.excel.write.metadata.fill.FillMapWrapper;
import com.alibaba.excel.write.metadata.fill.FillWrapper;
import com.fushun.framework.json.config.JsonGraalVMNativeBean;

/**
 * Build sheet
 *
 * @author Jiaju Zhuang
 */
public class ExcelWriterSheetBuilder extends AbstractExcelWriterParameterBuilder<ExcelWriterSheetBuilder, WriteSheet> {
    private ExcelWriter excelWriter;
    /**
     * Sheet
     */
    private final WriteSheet writeSheet;

    public ExcelWriterSheetBuilder() {
        this.writeSheet = new WriteSheet();
    }

    public ExcelWriterSheetBuilder(ExcelWriter excelWriter) {
        this.writeSheet = new WriteSheet();
        this.excelWriter = excelWriter;
    }

    /**
     * Starting from 0
     *
     * @param sheetNo
     * @return
     */
    public ExcelWriterSheetBuilder sheetNo(Integer sheetNo) {
        writeSheet.setSheetNo(sheetNo);
        return this;
    }

    /**
     * sheet name
     *
     * @param sheetName
     * @return
     */
    public ExcelWriterSheetBuilder sheetName(String sheetName) {
        writeSheet.setSheetName(sheetName);
        return this;
    }

    public WriteSheet build() {
        return writeSheet;
    }

    public void doWrite(Collection<? extends JsonGraalVMNativeBean> data) {
        if (excelWriter == null) {
            throw new ExcelGenerateException("Must use 'EasyExcelFactory.write().sheet()' to call this method");
        }
        excelWriter.write(data, build());
        excelWriter.finish();
    }

    public void doWriteMap(Collection<? extends Map> data) {
        if (excelWriter == null) {
            throw new ExcelGenerateException("Must use 'EasyExcelFactory.write().sheet()' to call this method");
        }
        excelWriter.writeMap(data, build());
        excelWriter.finish();
    }

    public void doWriteCollection(Collection<?  extends Collection> data) {
        if (excelWriter == null) {
            throw new ExcelGenerateException("Must use 'EasyExcelFactory.write().sheet()' to call this method");
        }
        excelWriter.writeCollection(data, build());
        excelWriter.finish();
    }
    //===============

    public void doFill(Collection<? extends JsonGraalVMNativeBean> data) {
        doFill(data, null);
    }

    public void doFillFillWrapper(FillWrapper data) {
        doFillFillWrapper(data, null);
    }

    public void doFillFillMapWrapper(FillMapWrapper data) {
        doFillFillMapWrapper(data, null);
    }

    public void doFillCollectionMap(Collection<? extends Map> data) {
        doFillCollectionMap(data, null);
    }

    public void doFillJava (JsonGraalVMNativeBean data) {
        doFillJava(data, null);
    }

    public void doFillMap(Map data) {
        doFillMap(data, null);
    }
    //==============

    public void doFill(Collection<? extends JsonGraalVMNativeBean> data, FillConfig fillConfig) {
        if (excelWriter == null) {
            throw new ExcelGenerateException("Must use 'EasyExcelFactory.write().sheet()' to call this method");
        }
        excelWriter.fill(data, fillConfig, build());
        excelWriter.finish();
    }

    public void doFillFillWrapper(FillWrapper data, FillConfig fillConfig) {
        if (excelWriter == null) {
            throw new ExcelGenerateException("Must use 'EasyExcelFactory.write().sheet()' to call this method");
        }
        excelWriter.fillFillWrapper(data, fillConfig, build());
        excelWriter.finish();
    }
    public void doFillFillMapWrapper(FillMapWrapper data, FillConfig fillConfig) {
        if (excelWriter == null) {
            throw new ExcelGenerateException("Must use 'EasyExcelFactory.write().sheet()' to call this method");
        }
        excelWriter.fillFillMapWrapper(data, fillConfig, build());
        excelWriter.finish();
    }
    public void doFillCollectionMap(Collection<? extends Map> data, FillConfig fillConfig) {
        if (excelWriter == null) {
            throw new ExcelGenerateException("Must use 'EasyExcelFactory.write().sheet()' to call this method");
        }
        excelWriter.fillCollectionMap(data, fillConfig, build());
        excelWriter.finish();
    }
    public void doFillJava (JsonGraalVMNativeBean data, FillConfig fillConfig) {
        if (excelWriter == null) {
            throw new ExcelGenerateException("Must use 'EasyExcelFactory.write().sheet()' to call this method");
        }
        excelWriter.fillJava(data, fillConfig, build());
        excelWriter.finish();
    }
    public void doFillMap(Map data, FillConfig fillConfig) {
        if (excelWriter == null) {
            throw new ExcelGenerateException("Must use 'EasyExcelFactory.write().sheet()' to call this method");
        }
        excelWriter.fillMap(data, fillConfig, build());
        excelWriter.finish();
    }
    // ==============


    public void doWrite(Supplier<Collection<? extends JsonGraalVMNativeBean>> supplier) {
        doWrite(supplier.get());
    }

    public void doWriteMap(Supplier<Collection<? extends Map>> supplier) {
        doWriteMap(supplier.get());
    }

    public void doWriteCollection(Supplier<Collection<?  extends Collection>> supplier) {
        doWriteCollection(supplier.get());
    }
    // ==============


    public void doFill(Supplier<Collection<?  extends JsonGraalVMNativeBean>> supplier) {
        doFill(supplier.get());
    }

    public void doFillFillWrapper(Supplier<FillWrapper> supplier) {
        doFillFillWrapper(supplier.get());
    }

    public void doFillFillMapWrapper(Supplier<FillMapWrapper> supplier) {
        doFillFillMapWrapper(supplier.get());
    }

    public void doFillCollectionMap(Supplier<Collection<? extends Map>> supplier) {
        doFillCollectionMap(supplier.get());
    }

    public void doFillJava(Supplier<JsonGraalVMNativeBean> supplier) {
        doFillJava(supplier.get());
    }

    public void doFillMap(Supplier<Map> supplier) {
        doFillMap(supplier.get());
    }
    //====

    public void doFill(Supplier<Collection<?  extends JsonGraalVMNativeBean>> supplier, FillConfig fillConfig) {
        doFill(supplier.get(), fillConfig);
    }

    public void doFillFillWrapper(Supplier<FillWrapper> supplier, FillConfig fillConfig) {
        doFillFillWrapper(supplier.get(), fillConfig);
    }
    public void doFillFillMapWrapper(Supplier<FillMapWrapper> supplier, FillConfig fillConfig) {
        doFillFillMapWrapper(supplier.get(), fillConfig);
    }
    public void doFillCollectionMap(Supplier<Collection<? extends Map>> supplier, FillConfig fillConfig) {
        doFillCollectionMap(supplier.get(), fillConfig);
    }
    public void doFillJava(Supplier<JsonGraalVMNativeBean> supplier, FillConfig fillConfig) {
        doFillJava(supplier.get(), fillConfig);
    }
    public void doFillMap(Supplier<Map> supplier, FillConfig fillConfig) {
        doFillMap(supplier.get(), fillConfig);
    }


    public ExcelWriterTableBuilder table() {
        return table(null);
    }

    public ExcelWriterTableBuilder table(Integer tableNo) {
        ExcelWriterTableBuilder excelWriterTableBuilder = new ExcelWriterTableBuilder(excelWriter, build());
        if (tableNo != null) {
            excelWriterTableBuilder.tableNo(tableNo);
        }
        return excelWriterTableBuilder;
    }

    @Override
    protected WriteSheet parameter() {
        return writeSheet;
    }

}
