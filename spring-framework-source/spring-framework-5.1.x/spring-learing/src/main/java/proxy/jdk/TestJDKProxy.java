package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/26
 * @Description:
 */
public class TestJDKProxy {

	public static void main(String[] args) {
		Userservice userservice = new UserServiceImpl();

		InvocationHandler proxy = new UserserviceProxy(userservice);

		Userservice proxyUserservice = (Userservice) Proxy.newProxyInstance(
				userservice.getClass().getClassLoader(), userservice.getClass().getInterfaces(), proxy);

		proxyUserservice.sayHello();
	}
}
