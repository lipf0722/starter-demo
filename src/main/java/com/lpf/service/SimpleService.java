package com.lpf.service;

import cn.hutool.core.date.DateUtil;
import com.lpf.properties.SimpleProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
@Data
public class SimpleService {

    @Autowired
    private SimpleProperty simpleProperty;
    /**
     * 简单的测试方法
     * @return
     */
    public String testSimple(){
      return DateUtil.now()+simpleProperty.getHeight()+"----"+simpleProperty.getName();
    }



}
