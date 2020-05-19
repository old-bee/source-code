package service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/18
 * @Description:
 */
public class UserService {

	@Autowired
	private AddressService addressService;

	public UserService() {
		System.out.println("UserService 实例化");
	}

	public Map<String, Object> list() {
		return new HashMap<>();
	}

	public String helloword() {
		return "UserService.helloword()";
	}
}
