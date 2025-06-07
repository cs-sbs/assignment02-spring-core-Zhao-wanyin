package org.example;
import org.springframework.stereotype.Service;
@Service // 标记为 Spring Bean，IoC 容器会管理
public class UserService {
    public void doBusiness() {
        System.out.println("用户业务逻辑执行...");
        // 模拟业务耗时，方便 AOP 统计
        try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
public class Service {
}
