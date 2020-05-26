package annotation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: lichangkai
 * @Date: 2020/5/22
 * @Description:
 */
public class Test {

	public static void main(String[] args) throws InterruptedException {

		LocalDateTime end = LocalDateTime.of(LocalDate.now(), LocalTime.of(18, 0, 0));
		System.out.println(end);
		do{
			TimeUnit.SECONDS.sleep(1);
			long nano = end.toEpochSecond(ZoneOffset.of("+8"))-LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
			System.out.println(nano+" seconds");
		} while (LocalDateTime.now().isBefore(end));
	}
}
