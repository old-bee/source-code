import config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.OrderService;
import service.UserService;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/18
 * @Description:
 */
public class ApplicationMain {

	public static void main(String[] args) throws Exception{

		//xml方式
		//ApplicationContext 实现了BeanFactory接口 但是不应该理解为BeanFactory的实现
		//其内部持有一个BeanFactory的实例(DefaultListableBeanFactory), 以后所有BeanFactory的操作都交给该实例完成
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//可以在此关闭循环依赖
		((ClassPathXmlApplicationContext) context).setAllowCircularReferences(false);
		UserService userService = (UserService) context.getBean("userService");

		//注解配置方式
//		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//		OrderService orderService = (OrderService) context.getBean("orderService");
		System.out.println(userService.helloword());
	}


}
