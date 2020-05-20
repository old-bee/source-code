package xml.service;

import java.util.*;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/18
 * @Description:
 */
public class UserService {

	private Integer[] ints;

	private List<String> list;

	private Set<String> set;

	private Map<String, Object> map;

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

	public AddressService getAddressService() {
		return addressService;
	}

	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}

	public void setInts(Integer[] ints) {
		this.ints = ints;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("UserService{");
		sb.append("ints=").append(Arrays.toString(ints));
		sb.append(", list=").append(list);
		sb.append(", set=").append(set);
		sb.append(", map=").append(map);
		sb.append(", addressService=").append(addressService);
		sb.append('}');
		return sb.toString();
	}
}
