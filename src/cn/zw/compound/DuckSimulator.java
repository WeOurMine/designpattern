package cn.zw.compound;

public class DuckSimulator {


    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();

        AbstractDuckFactory factory = new CountingDuckFactory();

        simulator.simulate(factory);

    }


    void simulate(AbstractDuckFactory factory){
//        Quackable mallardDuck =  new QuackCounter(new MallardDuck()) ;
//
//        Quackable redheadDuck =  new QuackCounter(new RedheadDuck()) ;
//
//        Quackable duckCall = new QuackCounter(new DuckCall()) ;
//
//        Quackable  rubberDuck = new QuackCounter(new RubberDuck()) ;

        Quackable mallardDuck =  factory.createMallardDuck() ;

        Quackable redheadDuck =  factory.createRedheadDuck() ;

        Quackable duckCall =  factory.createDuckCall() ;

        Quackable  rubberDuck = factory.createRubberDuck() ;

        Quackable   gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);

        simulate(redheadDuck);

        simulate(duckCall);

        simulate(rubberDuck);

        simulate(gooseDuck);

        System.out.println("The ducks quacked:"+ QuackCounter.getNumberOfQuacks()+" times");

    }


    void simulate(Quackable duck){
        duck.quack();
    }
}
