package AccessModifire;

public class Employee {
     double salary;


     void DveZp(){
        double result = salary * 2;
         System.out.println("новая зп = " + result);
    }

     Employee( double salary2){
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);

        emp.DveZp();
    }
}



class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);

        emp.DveZp();
    }
}
