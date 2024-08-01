package com.alibaba.excel.write.metadata.fill;

import com.fushun.framework.json.config.JsonGraalVMNativeBean;

import java.util.Collection;
import java.util.Map;

/**
 * Multiple lists are supported when packing
 *
 * @author Jiaju Zhuang
 **/
public class FillMapWrapper {
    /**
     * The collection prefix that needs to be filled.
     */
    private String name;
    /**
     * Data that needs to be filled.
     */
    private Collection<? extends Map> collectionData;

    public FillMapWrapper(Collection<? extends Map> collectionData) {
        this.collectionData = collectionData;
    }

    public FillMapWrapper(String name, Collection<? extends Map> collectionData) {
        this.name = name;
        this.collectionData = collectionData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<? extends Map> getCollectionData() {
        return collectionData;
    }

    public void setCollectionData(Collection<? extends Map> collectionData) {
        this.collectionData = collectionData;
    }
}
