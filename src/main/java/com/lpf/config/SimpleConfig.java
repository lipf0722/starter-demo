package com.lpf.config;

import com.lpf.properties.SimpleProperty;
import com.lpf.service.SimpleService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SimpleProperty.class)
@ConditionalOnProperty//存在对应配置信息时初始化该配置类
        (
                prefix = "simple",//存在配置前缀simple
                name = "isopen",
                havingValue = "true",//开启
                matchIfMissing = true//缺失检查
        )
@ConditionalOnClass(SimpleProperty.class)//存在SimpleService时初始化该配置类
//@Import(SimpleService.class)
/**
 * 第二种引入@Import(SimpleService.class)
 * 然后SimpleService类中加入@Component注解
 */
public class SimpleConfig {

    /**
     * 第一种方式，@Bean实例化，然后方法名用类名首字母小写，否则@Autowired引不进来。
     * @return
     */

    /**
     * 可以做到不管用户使用什么包名，都可以找到
     * @return
     */
  @Bean("initService")
  public SimpleService  initService(){
    return new SimpleService();
}






}
