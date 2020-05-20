package xml.service;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/19
 * @Description:
 */
public class AddressService {


	private UserService userService;

	public AddressService(UserService userService) {
		this.userService = userService;
		System.out.println("AddressService 实例化");
	}

}
