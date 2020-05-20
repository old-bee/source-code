package annotation.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/19
 * @Description:
 */
@Component
public class OrderService implements ApplicationContextAware {

	@Autowired
	private PaymentService paymentService;

	public OrderService() {
		System.out.println("OrderService 实例化");
	}

	public String hello() {
		return "OrderService.hello()";
	}

	public PaymentService getPaymentService() {
		return paymentService;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(this.toString()+"\tApplicationContextAware 执行");
	}

	@PostConstruct
	public void init() {
		System.out.println(this.toString()+"\tinit() 执行");
	}

	@PreDestroy
	public void destroy() {
		System.out.println(this.toString()+"\tdestroy() 执行");
	}
}
