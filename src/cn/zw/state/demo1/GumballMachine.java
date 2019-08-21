package cn.zw.state.demo1;


public class GumballMachine {


//    final  static  int SOLD_OUT = 0 ;//糖果售罄
//
//    final  static  int NO_QUARTER = 1 ;//没有25分
//
//    final  static  int HAS_QUARTER = 2;//有25分
//
//    final  static  int SOLD = 3;//售出糖果
//
//    int state = 3;
//
//    int count = 0 ;
//
//    public GumballMachine(int count) {
//        this.count = count;
//        if(count>0){
//            state = NO_QUARTER;
//        }
//    }
//
//    /**
//     * 插入25分
//     */
//
//    public void insertQuarter(){
//        if(state == HAS_QUARTER){
//            System.out.println("You can not insert another quarter");
//        }else  if(state == NO_QUARTER){
//            state = HAS_QUARTER;
//            System.out.println("You inserted a quarter");
//        }else if(state == SOLD_OUT){
//            System.out.println("You can not insert a quarter , the machine is sold out");
//        }else if(state == SOLD){
//            System.out.println("Please wait , we are already giving you a gumball");
//        }
//    }
//
//
//    /**
//     * 插入25分
//     */
//
//    public void ejectQuarter(){
//        if(state == HAS_QUARTER){
//            System.out.println(" Quarter returned");
//            state = NO_QUARTER;
//        }else  if(state == NO_QUARTER){
//            System.out.println("You have not inserted a quarter");
//        }else if(state == SOLD_OUT){
//            System.out.println("You can not  eject , you have not inserted a quarter yet");
//        }else if(state == SOLD){
//            System.out.println("Sorry , you already turned the crank");
//        }
//    }
//
//
//    /**
//     * 转动手柄
//     */
//
//    public void turnCrank(){
//        if(state == SOLD){
//            System.out.println("Truning twice dose not get you another gumball! ");
//        }else  if(state == NO_QUARTER){
//            System.out.println("You turned but there is  no quarter");
//        }else if(state == SOLD_OUT){
//            System.out.println("You turned , but there are no gumballs");
//        }else if(state == HAS_QUARTER){
//            System.out.println("You turned ....");
//            state =SOLD;
//            dispense();
//        }
//
//    }
//
//
//    public void dispense(){
//        if(state == SOLD){
//            System.out.println(" A gumball comes rolling out the sloat ");
//            count = count -1;
//            if(count == 0){
//                System.out.println("Oops ,out of gumballs!");
//                state = SOLD_OUT;
//            }else{
//                state = NO_QUARTER;
//            }
//        }else  if(state == NO_QUARTER){
//            System.out.println("You need to pay first");
//        }else if(state == SOLD_OUT){
//            System.out.println("No gumball dispensed ");
//        }else if(state == HAS_QUARTER){
//            System.out.println("No gumball dispensed ");
//
//        }
//
//    }


    Sate soldOutSate;

    Sate noQuarterState;

    Sate hasQuarterSate;

    Sate soldState;

    Sate sate = soldOutSate;

    int count = 0;

    public GumballMachine(int numberGumballs) {

        this.count = numberGumballs;

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
}
