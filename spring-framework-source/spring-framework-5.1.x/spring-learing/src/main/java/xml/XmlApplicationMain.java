package xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xml.service.UserService;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/20
 * @Description:
 */
public class XmlApplicationMain {

	public static void main(String[] args) {

		//xml方式
		//ApplicationContext 实现了BeanFactory接口 但是不应该理解为BeanFactory的实现
		//其内部持有一个BeanFactory的实例(DefaultListableBeanFactory), 以后所有BeanFactory的操作都交给该实例完成
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//可以在此关闭循环依赖
		((ClassPathXmlApplicationContext) context).setAllowCircularReferences(false);
		UserService userService = (UserService) context.getBean("userService");
		System.out.println(userService.getAddressService());
		System.out.println(userService.toString());
		System.out.println(userService.helloword());
	}
}
