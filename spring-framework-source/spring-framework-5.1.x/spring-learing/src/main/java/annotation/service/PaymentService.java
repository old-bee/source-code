package annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/20
 * @Description:
 */
@Component
public class PaymentService {

	@Autowired
	private OrderService orderService;

	public PaymentService() {
		System.out.println("PaymentService 实例化");
	}
}
