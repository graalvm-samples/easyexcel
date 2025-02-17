package com.alibaba.excel.write.metadata.fill;

import com.fushun.framework.json.config.JsonGraalVMNativeBean;

import java.util.Collection;
import java.util.Map;

/**
 * Multiple lists are supported when packing
 *
 * @author Jiaju Zhuang
 **/
public class FillWrapper {
    /**
     * The collection prefix that needs to be filled.
     */
    private String name;
    /**
     * Data that needs to be filled.
     */
    private Collection<? extends JsonGraalVMNativeBean> collectionData;

    public FillWrapper(Collection<? extends JsonGraalVMNativeBean> collectionData) {
        this.collectionData = collectionData;
    }

    public FillWrapper(String name, Collection<? extends JsonGraalVMNativeBean> collectionData) {
        this.name = name;
        this.collectionData = collectionData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<? extends JsonGraalVMNativeBean> getCollectionData() {
        return collectionData;
    }

    public void setCollectionData(Collection<? extends JsonGraalVMNativeBean> collectionData) {
        this.collectionData = collectionData;
    }
}
