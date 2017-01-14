package com.kakachan.consumer.webservice.hystrix;

import com.kakachan.consumer.webservice.ComputeClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by kakachan on 17/1/14.
 */
@Component
public class ComputeClientHystrix implements ComputeClient {

    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }

}
