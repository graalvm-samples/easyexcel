package com.alibaba.easyexcel.test.demo.fill;

import java.util.Date;

import com.fushun.framework.json.config.JsonGraalVMNativeBean;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Jiaju Zhuang
 */
@Getter
@Setter
@EqualsAndHashCode
public class FillData implements JsonGraalVMNativeBean {
    private String name;
    private double number;
    private Date date;

}
