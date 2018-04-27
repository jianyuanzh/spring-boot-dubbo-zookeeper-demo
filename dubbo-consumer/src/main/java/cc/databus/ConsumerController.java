package cc.databus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vincent on 27/04/2018.
 */
@RestController
public class ConsumerController {
    @Autowired
    private HelloServiceConsumer helloServiceConsumer;

    @RequestMapping("/greet")
    public String sayHello(@RequestParam(name = "user") String user) {
        return helloServiceConsumer.sayHelloe(user);
    }
}
