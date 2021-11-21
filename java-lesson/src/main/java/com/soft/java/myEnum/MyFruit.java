package com.soft.java.myEnum;

public class MyFruit {

    public static void main(String[] args){
        Fruit f1=Fruit.APPLE;
        System.out.println(f1);
        System.out.println("=====================");

        for(Fruit myVar:Fruit.values()){
            System.out.println(myVar);
        }
        System.out.println("=====================");

        Fruit myVar = Fruit.ORANGE;
        switch (myVar){
            case APPLE:
                System.out.println("苹果");
                break;
            case ORANGE:
                System.out.println("橘子");
                break;
            case GRAPES:
                System.out.println("葡萄");
                break;
        }
        System.out.println("=====================");

        Fruit[] arr=Fruit.values();
        for(Fruit myf:arr){
            System.out.println(myf+" at index "+myf.ordinal());
        }
        System.out.println(Fruit.valueOf("APPLE"));
        System.out.println("=====================");

        Fruit f2=Fruit.APPLE;
        System.out.println(f2);
        f2.fruitInfo();
    }
}
