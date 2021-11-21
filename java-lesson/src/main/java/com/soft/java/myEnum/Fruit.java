package com.soft.java.myEnum;

enum Fruit {
    APPLE, ORANGE, GRAPES;

    //构造函数
    private Fruit(){
        System.out.println("Constructor called for : " + this.toString());
    }

    public void fruitInfo()
    {
        System.out.println("Universal Fruit");
    }
}
