package annotation.service.config;

import annotation.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/19
 * @Description:
 */
@ComponentScan(basePackages = "annotation.service")
@EnableAspectJAutoProxy
public class BeanConfig {

}
