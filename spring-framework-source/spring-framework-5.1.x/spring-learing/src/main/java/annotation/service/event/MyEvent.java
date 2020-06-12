package annotation.service.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Auther: lichangkai
 * @Date: 2020/6/12
 * @Description:
 */
public class MyEvent extends ApplicationEvent {
	private String eventname;
	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public MyEvent(Object source, String eventname) {
		super(source);
		this.eventname = eventname;
	}
}
