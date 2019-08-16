package cn.zw.singleton;

/**
 * 使用静态内部类实现单例模式
 * 由Java虚拟机来保证其线程安全性，确保该成员变量只能初始化一次
 * @author zw
 *
 */
public class InnerClassSingleton {

	private InnerClassSingleton() {
	}

	private static class newInstance {
		private static final InnerClassSingleton singleton = new InnerClassSingleton();
	}

	public static InnerClassSingleton getInstance() {
		return newInstance.singleton;
	}

}
