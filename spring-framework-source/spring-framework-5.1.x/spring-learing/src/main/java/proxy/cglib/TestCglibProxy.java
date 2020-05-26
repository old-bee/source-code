package proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/26
 * @Description:
 */
public class TestCglibProxy {

	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(CityService.class);
		enhancer.setCallback(new CityServiceProxy(new CityService()));
		CityService proxycityService = (CityService) enhancer.create();
		proxycityService.sayHello();
	}
}
