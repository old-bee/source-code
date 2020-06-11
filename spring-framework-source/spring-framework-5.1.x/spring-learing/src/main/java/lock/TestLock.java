package lock;


import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;


/**
 * @Auther: lichangkai
 * @Date: 2020/5/27
 * @Description:
 */
public class TestLock {

	static L l = new L();

	public static void main(String[] args) throws InterruptedException {
		System.out.println(ClassLayout.parseInstance(l).toPrintable());

		synchronized (l) {
			System.out.println(ClassLayout.parseInstance(l).toPrintable());
		}

		new Thread(() -> {
			try {
				test();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();

		new Thread(() -> {
			try {
				test();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();

	}

	public static void test() throws InterruptedException {
		synchronized (l) {
			TimeUnit.SECONDS.sleep(1);
			System.out.println(ClassLayout.parseInstance(l).toPrintable());
		}
	}

}
