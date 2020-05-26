package proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/26
 * @Description:
 */
public class CityServiceProxy implements MethodInterceptor {

	private CityService cityService;

	public CityServiceProxy(CityService cityService) {
		this.cityService = cityService;
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("------------befor proxy------------");
		Object invoke = method.invoke(cityService, objects);
		System.out.println("------------after proxy-----------");
		return invoke;
	}
}
