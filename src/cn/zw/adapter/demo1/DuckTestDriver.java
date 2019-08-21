package cn.zw.adapter.demo1;

public class DuckTestDriver {


    public static void main(String[] args) {


        WildTurkey turkey = new WildTurkey();

        Duck tureAdapter = new TurkeyAdapter(turkey);

        tureAdapter.quack();

        tureAdapter.fly();


    }
}
