package annotation;

import annotation.service.OrderService;
import annotation.service.config.BeanConfig;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/20
 * @Description:
 */
public class AnnotationApplicationMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		//注册配置类
		context.register(BeanConfig.class);
		DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) context.getBeanFactory();
//		beanFactory.setAllowCircularReferences(true);  //不允许循环依赖
		//初始化spring容器
		context.refresh();

		OrderService orderService = (OrderService) context.getBean("orderService");
		System.out.println(orderService.hello());

	}
}
