package com.adash.explorer.oopsyjava.encapsulation.accessmodifiers.privatedemo;

public class PrivateUseCase {

    private String name;
    private Double salary;

    private PrivateUseCase(String name,
                           Double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Inside PrivateUseCase class args. constructor");
    }

    private String getName() {
        return this.name;
    }

    private Double getSalary() {
        return this.salary;
    }

    private String details() {
        return this.getName() + ", " + this.getSalary();
    }

    public static void main(String[] args) {

        PrivateUseCase privateUseCase = new PrivateUseCase("Avinash",
                50000.00d);
        System.out.println(privateUseCase.details());

        privateUseCase.name = "Abinash Dash";
        privateUseCase.salary = 80000.00d;

        System.out.println("After modifying the employee details ... ");

        System.out.println(privateUseCase.details());

    }
}
