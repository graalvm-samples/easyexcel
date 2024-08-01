package com.alibaba.easyexcel.test.core.fill.style;

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
public class FillStyleData implements JsonGraalVMNativeBean {
    private String name;
    private Double number;
    private Date date;
    private String empty;
}
