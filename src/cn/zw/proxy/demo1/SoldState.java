package cn.zw.proxy.demo1;

public class SoldState implements Sate {

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait , we are already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry , you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Truning twice dose not get you another gumball! ");
    }

    @Override
    public void dispense() {

        gumballMachine.releaseBall();

        if(gumballMachine.getCount()> 0){
            gumballMachine.setSate(gumballMachine.getNoQuarterState());
        }else {
            System.out.println("Oops,Out of gumballs");
            gumballMachine.setSate(gumballMachine.getSoldOutSate());
        }
    }
}
