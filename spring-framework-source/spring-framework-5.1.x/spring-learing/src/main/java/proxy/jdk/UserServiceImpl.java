package proxy.jdk;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/26
 * @Description:
 */
public class UserServiceImpl implements Userservice {
	@Override
	public void sayHello() {
		System.out.println("UserServiceImpl.sayHello()");
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("UserServiceImpl{");
		sb.append('}');
		return sb.toString();
	}
}
