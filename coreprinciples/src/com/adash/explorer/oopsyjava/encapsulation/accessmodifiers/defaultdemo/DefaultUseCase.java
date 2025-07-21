package com.adash.explorer.oopsyjava.encapsulation.accessmodifiers.defaultdemo;

/**
 *  By default, the access modifier is `default` only
 */
class DefaultUseCase {

    /**
     *  Default data member
     */
    String name;

    /*
        Default constructor
     */
    DefaultUseCase(String name) {
        this.name = name;
    }

    /*
        Default method
     */
    void myName() {
        System.out.println("Inside run() default method. \n Name : " + this.name);
    }
}
