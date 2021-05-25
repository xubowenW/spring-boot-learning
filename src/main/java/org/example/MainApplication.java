package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
//点开springbootapplication
/**
 * springbootapplication中包含以下几个注解
 * @SpringBootConfiguration 代表当前是一个配置类
 * @EnableAutoConfiguration
 * @ComponentScan 指定扫描哪些内容
 *
 * @EnableAutoConfiguration注解是以下几个注解的合成注解：
 * @AutoConfigurationPackage 指定了默认的包规则
 * @Import({AutoConfigurationImportSelector.class}) 将指定的包下所有的组件导入进来，MainApplication所在的包
 *
 */
public class MainApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(MainApplication.class,args);
    }
}
