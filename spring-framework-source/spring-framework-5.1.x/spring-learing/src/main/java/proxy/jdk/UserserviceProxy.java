package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/26
 * @Description:
 */
public class UserserviceProxy implements InvocationHandler {

	private Userservice userservice;

	public UserserviceProxy(Userservice userservice) {
		this.userservice = userservice;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("----------- before proxy ------------");
		System.out.println("------------" + method.getName() + "---------");
		//利用反射调用实际方法 返回方法返回值 无返回值为null
		Object invoke = method.invoke(userservice, args);
		System.out.println("----------- after proxy ------------ ");
		return invoke;
	}
}
