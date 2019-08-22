package cn.zw.proxy.demo1;


public class GumballMachine {


    Sate soldOutSate;

    Sate noQuarterState;

    Sate hasQuarterSate;

    Sate soldState;

    Sate sate = soldOutSate;

    int count = 0;

    String location;



    public GumballMachine( String location ,int numberGumballs) {

        this.count = numberGumballs;

        this.location = location;

        soldOutSate = new SoldOutState(this);

        soldState = new SoldState(this);

        noQuarterState = new NoQuarterState(this);

        hasQuarterSate = new HasQuarterState(this);

        if(numberGumballs > 0){
            sate = noQuarterState;
        }
    }

    public void insertQuarter(){

        sate.insertQuarter();
    }


    /**
     * 插入25分
     */

    public void ejectQuarter(){

        sate.ejectQuarter();
    }


    /**
     * 转动手柄
     */

    public void turnCrank(){

        sate.turnCrank();
        sate.dispense();

    }

    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0){
            count = count - 1;
        }
    }


    public Sate getSoldOutSate() {
        return soldOutSate;
    }

    public void setSoldOutSate(Sate soldOutSate) {
        this.soldOutSate = soldOutSate;
    }

    public Sate getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(Sate noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public Sate getHasQuarterSate() {
        return hasQuarterSate;
    }

    public void setHasQuarterSate(Sate hasQuarterSate) {
        this.hasQuarterSate = hasQuarterSate;
    }

    public Sate getSoldState() {
        return soldState;
    }

    public void setSoldState(Sate soldState) {
        this.soldState = soldState;
    }

    public Sate getSate() {
        return sate;
    }

    public void setSate(Sate sate) {
        this.sate = sate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
