package annotation.service.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @Auther: lichangkai
 * @Date: 2020/6/12
 * @Description:
 */
@Component
public class MyPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}


	public void publishEvent() {
		applicationEventPublisher.publishEvent(new MyEvent("MyPublisher.publishEvent()", "asd"));
	}

}
