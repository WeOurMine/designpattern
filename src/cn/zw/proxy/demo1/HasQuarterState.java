package cn.zw.proxy.demo1;

public class HasQuarterState  implements Sate {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can not insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println(" Quarter returned");

        gumballMachine.setSate(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned ....");
        gumballMachine.setSate(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed ");
    }
}
