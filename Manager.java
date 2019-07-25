package com.shishir;


public class Manager extends Employee {
    double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    static void sort() {
//        int [] sortArray = new int[10];

    }

    public double totalSalary() {
        int i;
        double totalSalary = getSalary() + getBonus();
        double[] sortArray = new double[10];

        for (i = 1; i < sortArray.length; ++i) {
            sortArray[i] = totalSalary; //1.51000, 2.56500, 3.62000
        }
        System.out.println("Sortarray: " + sortArray[i]);
//        if (sortArray[i+1] > sortArray[i] ){
//            sortArray[i+1] = sortArray[i];
//        }

        return totalSalary;
    }

    public static void main(String[] args) {
        Manager obj1 = new Manager();

        obj1.setId(101);//Emp's.
        obj1.setName("Sawyer");//Emp's.
        obj1.setSalary(50000);//Emp's.
        obj1.setBonus(1000);//Got bonus of 1000.


        Manager obj2 = new Manager();

        obj2.setId(102);
        obj2.setName("Jack");//Emp's.
        obj2.setSalary(55000);//Emp's.
        obj2.setBonus(1500);//Got bonus of 1500.


        Manager obj3 = new Manager();

        obj3.setId(102);
        obj3.setName("Percy");//Emp's.
        obj3.setSalary(60000);//Emp's.
        obj3.setBonus(2000);//Got bonus of 2000.

        Manager objj = new Manager();
        objj.totalSalary();
    }

    

}