package com.alibaba.easyexcel.test.temp.simple;

import java.util.Date;

import com.fushun.framework.json.config.JsonGraalVMNativeBean;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * write data
 *
 * @author Jiaju Zhuang
 **/
@Getter
@Setter
@EqualsAndHashCode
public class WriteData implements JsonGraalVMNativeBean {
    //    @ContentStyle(locked = true)
    private Date dd;
    //    @ContentStyle(locked = false)
    private float f1;
}
