package com.alibaba.excel.write.builder;

import java.util.Collection;
import java.util.Map;
import java.util.function.Supplier;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.exception.ExcelGenerateException;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import com.fushun.framework.json.config.JsonGraalVMNativeBean;

/**
 * Build sheet
 *
 * @author Jiaju Zhuang
 */
public class ExcelWriterTableBuilder extends AbstractExcelWriterParameterBuilder<ExcelWriterTableBuilder, WriteTable> {

    private ExcelWriter excelWriter;

    private WriteSheet writeSheet;
    /**
     * table
     */
    private final WriteTable writeTable;

    public ExcelWriterTableBuilder() {
        this.writeTable = new WriteTable();
    }

    public ExcelWriterTableBuilder(ExcelWriter excelWriter, WriteSheet writeSheet) {
        this.excelWriter = excelWriter;
        this.writeSheet = writeSheet;
        this.writeTable = new WriteTable();
    }

    /**
     * Starting from 0
     *
     * @param tableNo
     * @return
     */
    public ExcelWriterTableBuilder tableNo(Integer tableNo) {
        writeTable.setTableNo(tableNo);
        return this;
    }

    public WriteTable build() {
        return writeTable;
    }

    public void doWrite(Collection<? extends JsonGraalVMNativeBean> data) {
        if (excelWriter == null) {
            throw new ExcelGenerateException("Must use 'EasyExcelFactory.write().sheet().table()' to call this method");
        }
        excelWriter.write(data, writeSheet, build());
        excelWriter.finish();
    }

    public void doWriteMap(Collection<? extends Map> data) {
        if (excelWriter == null) {
            throw new ExcelGenerateException("Must use 'EasyExcelFactory.write().sheet().table()' to call this method");
        }
        excelWriter.writeMap(data, writeSheet, build());
        excelWriter.finish();
    }

    public void doWriteCollection(Collection<? extends Collection> data) {
        if (excelWriter == null) {
            throw new ExcelGenerateException("Must use 'EasyExcelFactory.write().sheet().table()' to call this method");
        }
        excelWriter.writeCollection(data, writeSheet, build());
        excelWriter.finish();
    }

    public void doWrite(Supplier<Collection<? extends JsonGraalVMNativeBean>> supplier) {
        doWrite(supplier.get());
    }

    public void doWriteMap(Supplier<Collection<? extends Map>> supplier) {
        doWriteMap(supplier.get());
    }

    public void doWriteCollection(Supplier<Collection<? extends Collection>> supplier) {
        doWriteCollection(supplier.get());
    }

    @Override
    protected WriteTable parameter() {
        return writeTable;
    }
}
