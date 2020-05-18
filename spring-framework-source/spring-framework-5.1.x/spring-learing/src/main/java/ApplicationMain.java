import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/18
 * @Description:
 */
public class ApplicationMain {

	public static void main(String[] args) throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// retrieve configured instance
		UserService userService = (UserService) context.getBean("userService");
		System.out.println(userService.list());
	}


}
