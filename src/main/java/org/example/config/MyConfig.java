package org.example.config;


import ch.qos.logback.core.db.DBHelper;
import org.example.bean.Car;
import org.example.bean.Pet;
import org.example.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

/**
 * 1. 配置类中使用@Bean表述在方法上给容器注册组件，默认为单实例。
 * 2. 配置类本身也是组件
 * 3. proxyBeanMethods,代理Bean的方法。
 * 4. @Import({User.class, DBHelper.class}) 给容器中自动创建这两个类型的组件。默认组件的名字就是全类名。
 */


//@Conditional 条件注解，当容器中满足某个条件的时候，类下面的配置才能生效否则不能生效


//@Import({User.class, DBHelper.class})


//如果proxyBeanMethods默认值为true，这个配置类会被CGLIB代理，保持单实例模式
    //如果为false，就会跳过容器中的实例检查，创建新的实例。这个参数用于组件依赖，ture为full模式，false为Lite模式。


@Configuration(proxyBeanMethods = true)
//@Configuration(proxyBeanMethods = false)
//告诉springboot这是一个配置类==配置文件

//@ImportResource( "classpath:bean.xml"),导入配置文件，使配置文件生效。

//开启Car的属性配置绑定功能，将Car组件自动注册到了容器中，这样就不用写@ConfigurationProperties上面的@Component
@EnableConfigurationProperties(Car.class)
public class MyConfig {

    @Bean
    //@Conditional,当容器中满足某个条件的时候，方法才能返回组件。
    //给容器中添加组件，以方法名作为组件的id，返回类型是组件的类型，返回的值就是组件在容器中的实例。
    public User user01() {
        return new User("zhang",29);
    }

    @Bean
    public Pet tomcat() {
        return new Pet("tomcat");
    }
}
