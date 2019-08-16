package cn.zw.decorate.decorate1;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        //订一杯Espresso ，不要调料
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription()+" $"+beverage.cost());


        //订一杯Espresso ，添加Mocha调料
        Beverage beverage2 = new Espresso();

        beverage2 = new Mocha(beverage2);

        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());


    }
}

