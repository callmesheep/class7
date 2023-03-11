package total;

import java.util.Scanner;

public class Mainclass {

    public static void main(String[] args) {
    Person person = new Person();

    try{
        person.inputPersonInfo("","","");
        System.out.println("name:"+person.getName());
        System.out.println("Address:" + person.getAddress());
        System.out.println("Salary:" +person.getSalary());

    }catch (Exception e){
        System.out.println(e.getMessage());
    }

 }
        }




    

