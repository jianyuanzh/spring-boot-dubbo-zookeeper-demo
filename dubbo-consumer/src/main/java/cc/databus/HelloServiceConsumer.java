package cc.databus;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * Created by vincent on 27/04/2018.
 */
@Component
public class HelloServiceConsumer {

    @Reference
    IHelloService service;

    public String sayHelloe(String user) {
        String helloStr = service.sayHello(user);
        System.out.println(helloStr);
        return helloStr;
    }
}
