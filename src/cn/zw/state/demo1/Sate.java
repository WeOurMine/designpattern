package cn.zw.state.demo1;

public interface Sate {

    public void insertQuarter();

    /**
     * 插入25分
     */

    public void ejectQuarter();
    /**
     * 转动手柄
     */

    public void turnCrank();

    /**
     * 发糖
     */
    public void dispense();




}
