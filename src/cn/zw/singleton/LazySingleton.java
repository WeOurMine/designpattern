package cn.zw.singleton;

/**
 * 懒汉式
 * 如果使用双重检查锁定来实现懒汉式单例类，需要在静态成员变量instance之前增加修饰符volatile，
 * 被volatile修饰的成员变量可以确保多个线程都能够正确处理
 * 
 * @author zw
 *
 */
public class LazySingleton {
	private volatile LazySingleton singleton = null;

	private final Object object = new Object();

	private LazySingleton() {
	}

	public LazySingleton getInstance() {
		if (singleton == null) {
			synchronized (object) {
				if (singleton == null)
					singleton = new LazySingleton();
			}
		}

		return singleton;
	}
}
