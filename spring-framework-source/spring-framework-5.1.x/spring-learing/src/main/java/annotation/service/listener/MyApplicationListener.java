package annotation.service.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: lichangkai
 * @Date: 2020/6/12
 * @Description:
 */
@Component
public class MyApplicationListener implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("收到事件： "+ event.getClass().getName() + "  --- "+event.getSource().toString());
	}
}
