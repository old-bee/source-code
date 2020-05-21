package annotation.service.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/21
 * @Description:
 */
@Component
@Aspect
public class TestAspect {

	@Pointcut("execution(* annotation.service.OrderService.*(..))")
	public void pointCut() {}

	@Before("pointCut()")
	public void before() {
		System.out.println("Aop Before执行");
	}
}
