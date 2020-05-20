package annotation.service.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/20
 * @Description:
 */
@Component
public class OrderServiceBPP implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(this.toString()+"\tBeanPostProcessor#OrderServiceBPP.postProcessBeforeInitialization() 执行");
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(this.toString()+"\tBeanPostProcessor#OrderServiceBPP.postProcessAfterInitialization() 执行");
		return null;
	}
}
