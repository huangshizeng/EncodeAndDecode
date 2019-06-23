package com.huang.xmlschematest.controller;

import com.huang.xmlschematest.DataBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hsz
 */

@RestController
@RequestMapping("/api/")
public class DataController {
    @PostMapping("test")
    public DataBean test(@RequestBody DataBean dataBean) {
        System.out.println("controller::::" + dataBean);
        dataBean.setKey("456");
        dataBean.setValue("0000");
        return dataBean;
    }
}
