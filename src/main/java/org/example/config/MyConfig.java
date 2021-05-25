package org.example.config;


import org.example.bean.Pet;
import org.example.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1. 配置类中使用@Bean表述在方法上给容器注册组件，默认为单实例。
 * 2. 配置类本身也是组件
 * 3. proxyBeanMethods,代理Bean的方法。
 */

//如果proxyBeanMethods默认值为true，这个配置类会被CGLIB代理，保持单实例模式
    //如果为false，就会跳过容器中的实例检查，创建新的实例。这个参数用于组件依赖，ture为full模式，false为Lite模式。
@Configuration(proxyBeanMethods = true)
//@Configuration(proxyBeanMethods = false)
//告诉springboot这是一个配置类==配置文件
public class MyConfig {

    @Bean
    //给容器中添加组件，以方法名作为组件的id，返回类型是组件的类型，返回的值就是组件在容器中的实例。
    public User user01() {
        return new User("zhang",29);
    }

    @Bean
    public Pet tomcat() {
        return new Pet("tomcat");
    }
}
