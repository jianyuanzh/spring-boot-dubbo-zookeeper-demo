package cc.databus;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created by vincent on 27/04/2018.
 */
@Service(interfaceClass = IHelloService.class)
@Component
public class HelloService implements IHelloService {
    @Override
    public String sayHello(String fromWho) {
        return "Hello from " + fromWho;
    }
}
