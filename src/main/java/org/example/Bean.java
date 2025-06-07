package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// 导入你自己的配置类（假设在 org.example 包下）
import org.example.AppConfig;

public class Main<AnnotationConfigApplicationContext> {
    public static <AnnotationConfigApplicationContext, 
            main(String[] args;) {
        // 用 Spring 官方的 AnnotationConfigApplicationContext
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // 测试 Bean 获取、AOP 增强（根据你的业务类调整）
        UserService service = context.getClass(UserService.class);
        service.doBusiness();

        context.close();
    }
}
