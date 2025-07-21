package com.adash.explorer.oopsyjava.encapsulation;

class Employee {

    private Long empId;
    private String name;
    private Float salary;
    private String department;

    public Employee() {
        System.out.println("Inside Employee() default constructor");
    }

    public Employee(Long empId,
                    String name,
                    Float salary,
                    String department) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Float getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return  department;
    }

    @Override public String toString() {
        return "Employee [ ID :" + this.getEmpId() +
                ", Name :" + this.getName() +
                ", Salary :" + this.getSalary() +
                ", Department :" + this.getDepartment() +
                "]";
    }

}


public class EmployeeUseCase {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setEmpId(111111L);
        employee.setName("Jonathan De'costa");
        employee.setSalary(45000.50f);
        employee.setDepartment("Hardware");

        System.out.println(employee);
    }
}
