package Employee;

public class Employee {
    int Id;
    String Surname;
    int age;
    double salary;
    String department;

    Employee(int Id2, String Surnamee2, int age2, double salary2, String department2) {

        Id = Id2;
        Surname = Surnamee2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double increase() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {

    Employee emp1 = new Employee(1, "Ivanow", 25, 3453,"BimbaPig");
    Employee emp2 = new Employee(2, "Petrow", 44, 345.43,"MEOW");

    emp1.increase();
        System.out.println("New salary" + emp1.Surname + "" + emp1.salary);


        double newSalary = emp2.increase();
        System.out.println(emp2.Surname + newSalary);
}
}