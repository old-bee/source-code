package annotation.service.bfpp;

import annotation.service.PaymentService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;
import xml.service.UserService;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/19
 * @Description:
 */
@Component
public class OrderServiceBFPP implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("orderService");
//		beanDefinition.setBeanClass(PaymentService.class);
		System.out.println(this.toString()+"\tBeanFactoryPostProcessor#OrderServiceBFPP 执行");
	}
}
