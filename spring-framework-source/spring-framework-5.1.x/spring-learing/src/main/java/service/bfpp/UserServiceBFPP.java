package service.bfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import service.OrderService;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/19
 * @Description:
 */
public class UserServiceBFPP implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition userServiceBeanDef = (GenericBeanDefinition) beanFactory.getBeanDefinition("userService");
		userServiceBeanDef.setBeanClass(OrderService.class);
	}
}
