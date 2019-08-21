package cn.zw.adapter.demo1;


/**
 * 适配器
 *
 * 想用火鸡对象冒充鸭子对象，所以需要适配器
 */
public class TurkeyAdapter implements  Duck {

    /**
     * 被转换的对象
     */
    Turkey turkey;


    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {

        turkey.gobble();
    }

    @Override
    public void fly() {

        for(int i = 0;i<5;i++){
            turkey.fly();
        }


    }
}
