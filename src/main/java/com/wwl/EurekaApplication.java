/**
 * Copyright (C) 2014-2020 <a href="http://www.xxxxtech.com>">XXXXTech</a> All Rights Reserved.
 */
package com.wwl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 文件名：EurekaApplication <br>
 * 创建时间： 2020-05-07 上午11:25 <br>
 * 文件描述：<br>
 * TODO: 这里对类的描述
 *
 * @author <a href="mailto:ppl@ctznfs.com">ppl</a> <br>
 * @version v0.1  <br>
 * @since JDK 1.8
 */
@EnableEurekaServer //标识是一个服务注册中心内
@SpringBootApplication
public class EurekaApplication {


    public static void main(String[] args){
        SpringApplication.run(EurekaApplication.class,args);
    }


}
