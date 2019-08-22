package cn.zw.proxy.demo1;


/**
 * 糖果监视器
 */
public class GumballMonitor {

    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report(){

        System.out.println("Gumball Machine: "+machine.getLocation());

        System.out.println("Current inventory: "+ machine.getCount()+" gumballs");

        System.out.println("Current state: "+ machine.getSate());
    }
}
