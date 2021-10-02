package com.inner_classes_advanced;


public class Main {
    public static void main(String[] args) {
        OuterClassA outerClassA=new OuterClassA();
        OuterClassA.ChildInnerClass childInnerClass=outerClassA.new ChildInnerClass();
        childInnerClass.innerMethod();

        ChildInnerClass childInnerClass1=new ChildInnerClass();
        childInnerClass1.innerMethod();
        System.out.println(childInnerClass1.data);

        StaticChildInnerClass staticChildInnerClass=new StaticChildInnerClass();
        staticChildInnerClass.method();
        staticChildInnerClass.staticInnerMethod();
    }
}
