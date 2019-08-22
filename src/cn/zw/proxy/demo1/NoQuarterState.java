package cn.zw.proxy.demo1;

public class NoQuarterState implements Sate {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setSate(gumballMachine.getHasQuarterSate());

    }

    @Override
    public void ejectQuarter() {
        System.out.println("You have not inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there is  no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
