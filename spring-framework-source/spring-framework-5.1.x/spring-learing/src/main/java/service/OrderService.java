package service;

import org.springframework.stereotype.Component;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/19
 * @Description:
 */
@Component
public class OrderService {

	public OrderService() {
		System.out.println("OrderService 实例化");
	}

	public String hello() {
		return "OrderService.hello()";
	}
}
