package com.alibaba.excel;

import java.io.Closeable;
import java.util.Collection;
import java.util.Map;
import java.util.function.Supplier;

import com.alibaba.excel.context.WriteContext;
import com.alibaba.excel.write.ExcelBuilder;
import com.alibaba.excel.write.ExcelBuilderImpl;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import com.alibaba.excel.write.metadata.WriteWorkbook;
import com.alibaba.excel.write.metadata.fill.FillConfig;

import com.alibaba.excel.write.metadata.fill.FillMapWrapper;
import com.alibaba.excel.write.metadata.fill.FillWrapper;
import com.fushun.framework.json.config.JsonGraalVMNativeBean;
import lombok.extern.slf4j.Slf4j;

/**
 * Excel Writer This tool is used to write value out to Excel via POI. This object can perform the following two
 * functions.
 *
 * <pre>
 *    1. Create a new empty Excel workbook, write the value to the stream after the value is filled.
 *    2. Edit existing Excel, write the original Excel file, or write it to other places.}
 * </pre>
 *
 * @author jipengfei
 */
@Slf4j
public class ExcelWriter implements Closeable {

    private final ExcelBuilder excelBuilder;

    /**
     * Create new writer
     *
     * @param writeWorkbook
     */
    public ExcelWriter(WriteWorkbook writeWorkbook) {
        excelBuilder = new ExcelBuilderImpl(writeWorkbook);
    }

    /**
     * Write data to a sheet
     *
     * @param data       Data to be written
     * @param writeSheet Write to this sheet
     * @return this current writer
     */
    public ExcelWriter write(Collection<? extends JsonGraalVMNativeBean> data, WriteSheet writeSheet) {
        return write(data, writeSheet, null);
    }

    public ExcelWriter writeMap(Collection<? extends Map> data, WriteSheet writeSheet) {
        return writeMap(data, writeSheet, null);
    }

    public ExcelWriter writeCollection(Collection<? extends Collection> data, WriteSheet writeSheet) {
        return writeCollection(data, writeSheet, null);
    }

    /**
     * Write data to a sheet
     *
     * @param supplier   Data to be written
     * @param writeSheet Write to this sheet
     * @return this current writer
     */
    public ExcelWriter write(Supplier<Collection<? extends JsonGraalVMNativeBean>> supplier, WriteSheet writeSheet) {
        return write(supplier.get(), writeSheet, null);
    }

    public ExcelWriter writeMap(Supplier<Collection<? extends Map>> supplier, WriteSheet writeSheet) {
        return writeMap(supplier.get(), writeSheet, null);
    }

    public ExcelWriter writeCollection(Supplier<Collection<? extends Collection>> supplier, WriteSheet writeSheet) {
        return writeCollection(supplier.get(), writeSheet, null);
    }

    /**
     * Write value to a sheet
     *
     * @param data       Data to be written
     * @param writeSheet Write to this sheet
     * @param writeTable Write to this table
     * @return this
     */
    public ExcelWriter write(Collection<? extends JsonGraalVMNativeBean> data, WriteSheet writeSheet, WriteTable writeTable) {
        excelBuilder.addContent(data, writeSheet, writeTable);
        return this;
    }
    public ExcelWriter writeMap(Collection<? extends Map> data, WriteSheet writeSheet, WriteTable writeTable) {
        excelBuilder.addContent(data, writeSheet, writeTable);
        return this;
    }
    public ExcelWriter writeCollection(Collection<? extends Collection> data, WriteSheet writeSheet, WriteTable writeTable) {
        excelBuilder.addContent(data, writeSheet, writeTable);
        return this;
    }

    /**
     * Write value to a sheet
     *
     * @param supplier   Data to be written
     * @param writeSheet Write to this sheet
     * @param writeTable Write to this table
     * @return this
     */
    public ExcelWriter write(Supplier<Collection<? extends JsonGraalVMNativeBean>> supplier, WriteSheet writeSheet, WriteTable writeTable) {
        excelBuilder.addContent(supplier.get(), writeSheet, writeTable);
        return this;
    }

    public ExcelWriter writeMap(Supplier<Collection<? extends Map>> supplier, WriteSheet writeSheet, WriteTable writeTable) {
        excelBuilder.addContent(supplier.get(), writeSheet, writeTable);
        return this;
    }

    public ExcelWriter writeCollection(Supplier<Collection<? extends Collection>> supplier, WriteSheet writeSheet, WriteTable writeTable) {
        excelBuilder.addContent(supplier.get(), writeSheet, writeTable);
        return this;
    }

    /**
     * Fill value to a sheet
     *
     * @param data
     * @param writeSheet
     * @return
     */
    public ExcelWriter fill(Collection<? extends JsonGraalVMNativeBean> data, WriteSheet writeSheet) {
        return fill(data, null, writeSheet);
    }

    public ExcelWriter fillFillWrapper(FillWrapper data, WriteSheet writeSheet) {
        return fillFillWrapper(data, null, writeSheet);
    }


    public ExcelWriter fillFillMapWrapper(FillMapWrapper data, WriteSheet writeSheet) {
        return fillFillMapWrapper(data, null, writeSheet);
    }

    public ExcelWriter fillCollectionMap(Collection<? extends Map> data, WriteSheet writeSheet) {
        return fillCollectionMap(data, null, writeSheet);
    }

    public ExcelWriter fillJava(JsonGraalVMNativeBean data, WriteSheet writeSheet) {
        return fillJava(data, null, writeSheet);
    }

    public ExcelWriter fillMap(Map data, WriteSheet writeSheet) {
        return fillMap(data, null, writeSheet);
    }

    /**
     * Fill value to a sheet
     *
     * @param data
     * @param fillConfig
     * @param writeSheet
     * @return
     */
    public ExcelWriter fill(Collection<? extends JsonGraalVMNativeBean> data, FillConfig fillConfig, WriteSheet writeSheet) {
        excelBuilder.fill(data, fillConfig, writeSheet);
        return this;
    }

    public ExcelWriter fillFillWrapper(FillWrapper data, FillConfig fillConfig, WriteSheet writeSheet) {
        excelBuilder.fill(data, fillConfig, writeSheet);
        return this;
    }


    public ExcelWriter fillFillMapWrapper(FillMapWrapper data, FillConfig fillConfig, WriteSheet writeSheet) {
        excelBuilder.fill(data, fillConfig, writeSheet);
        return this;
    }

    public ExcelWriter fillCollectionMap(Collection<? extends Map> data, FillConfig fillConfig, WriteSheet writeSheet) {
        excelBuilder.fill(data, fillConfig, writeSheet);
        return this;
    }

    public ExcelWriter fillJava(JsonGraalVMNativeBean data, FillConfig fillConfig, WriteSheet writeSheet) {
        excelBuilder.fill(data, fillConfig, writeSheet);
        return this;
    }

    public ExcelWriter fillMap(Map data, FillConfig fillConfig, WriteSheet writeSheet) {
        excelBuilder.fill(data, fillConfig, writeSheet);
        return this;
    }

    /**
     * Fill value to a sheet
     *
     * @param supplier
     * @param writeSheet
     * @return
     */
    public ExcelWriter fill(Supplier<Collection<? extends JsonGraalVMNativeBean>> supplier, WriteSheet writeSheet) {
        return fill(supplier.get(), null, writeSheet);
    }
    public ExcelWriter fillFillWrapper(Supplier<FillWrapper> supplier, WriteSheet writeSheet) {
        return fillFillWrapper(supplier.get(), null, writeSheet);
    }
    public ExcelWriter fillFillMapWrapper(Supplier<FillMapWrapper> supplier, WriteSheet writeSheet) {
        return fillFillMapWrapper(supplier.get(), null, writeSheet);
    }
    public ExcelWriter fillCollectionMap(Supplier<Collection<? extends Map>> supplier, WriteSheet writeSheet) {
        return fillCollectionMap(supplier.get(), null, writeSheet);
    }
    public ExcelWriter fillJava(Supplier<JsonGraalVMNativeBean> supplier, WriteSheet writeSheet) {
        return fillJava(supplier.get(), null, writeSheet);
    }
    public ExcelWriter fillMap(Supplier<Map> supplier, WriteSheet writeSheet) {
        return fillMap(supplier.get(), null, writeSheet);
    }

    /**
     * Fill value to a sheet
     *
     * @param supplier
     * @param fillConfig
     * @param writeSheet
     * @return
     */
    public ExcelWriter fill(Supplier<Collection<? extends JsonGraalVMNativeBean>> supplier, FillConfig fillConfig, WriteSheet writeSheet) {
        excelBuilder.fill(supplier.get(), fillConfig, writeSheet);
        return this;
    }

    public ExcelWriter fillFillWrapper(Supplier<FillWrapper> supplier, FillConfig fillConfig, WriteSheet writeSheet) {
        excelBuilder.fill(supplier.get(), fillConfig, writeSheet);
        return this;
    }
    public ExcelWriter fillFillMapWrapper(Supplier<FillMapWrapper> supplier, FillConfig fillConfig, WriteSheet writeSheet) {
        excelBuilder.fill(supplier.get(), fillConfig, writeSheet);
        return this;
    }
    public ExcelWriter fillCollectionMap(Supplier<Collection<? extends Map>> supplier, FillConfig fillConfig, WriteSheet writeSheet) {
        excelBuilder.fill(supplier.get(), fillConfig, writeSheet);
        return this;
    }
    public ExcelWriter fillJava(Supplier<JsonGraalVMNativeBean> supplier, FillConfig fillConfig, WriteSheet writeSheet) {
        excelBuilder.fill(supplier.get(), fillConfig, writeSheet);
        return this;
    }
    public ExcelWriter fillMap(Supplier<Map> supplier, FillConfig fillConfig, WriteSheet writeSheet) {
        excelBuilder.fill(supplier.get(), fillConfig, writeSheet);
        return this;
    }

    /**
     * Close IO
     */
    public void finish() {
        if (excelBuilder != null) {
            excelBuilder.finish(false);
        }
    }

    /**
     * The context of the entire writing process
     *
     * @return
     */
    public WriteContext writeContext() {
        return excelBuilder.writeContext();
    }

    @Override
    public void close() {
        finish();
    }

    /**
     * Prevents calls to {@link #finish} from freeing the cache
     */
    @Override
    protected void finalize() {
        try {
            finish();
        } catch (Throwable e) {
            log.warn("Destroy object failed", e);
        }
    }
}
