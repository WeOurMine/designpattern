package cn.zw.singleton;

/**
 * 饿汉式
 * 当类被加载时，静态变量instance会被初始化，此时类的私有构造函数会被调用，
 * 单例类的唯一实例将被创建。
 * 
 * @author zw
 *
 */
public class EagerSingleton {

	private static final EagerSingleton singleton = new EagerSingleton();

	/**
	 * 私有化默认构造函数
	 */
	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return singleton;
	}

}
