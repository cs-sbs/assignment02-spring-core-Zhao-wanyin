public class Spring {
    package org.example; //

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

    // 标记为 Spring 配置类
    @Configuration
// 扫描 Bean（@Component、@Service 等）所在包，根据实际包路径调整
    @ComponentScan(basePackages = "org.example")
// 启用 AOP 自动代理
    @EnableAspectJAutoProxy
    public class AppConfig { // 类名改为 AppConfig，语义更清晰
    }
}