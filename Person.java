package total;

import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private double Salary;

   // public Person(String name, String address, double salary) {
       // this.name = name;
       // this.address = address;
        //this. Salary = salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
    public void inputPersonInfo (String name, String address, String
            sSalary) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("name:");
        this.name = input.nextLine();
        System.out.println("address:");
        this.address = input.nextLine();
        System.out.println("salary:");
        this.Salary = input.nextInt();
        boolean isNumber = false;

        do {
            try {
                this.Salary = Double.parseDouble(sSalary);
                isNumber = true;
                if (this.Salary < 0) {
                    throw new Exception("Salary phai lon hown 0.");
                }
            } catch (NumberFormatException e) {
                throw new Exception("Salary phai la so");
            }
        }while (!isNumber);
        }

}


