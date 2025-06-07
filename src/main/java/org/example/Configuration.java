package org.example;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration // 标记为 Spring 配置类，替代 XML
@ComponentScan("org.example") // 扫描当前包及子包，让 @Service 等注解生效
@EnableAspectJAutoProxy // 启用 AOP 自动代理，让 AOP 生效
public class Configuration {
}
