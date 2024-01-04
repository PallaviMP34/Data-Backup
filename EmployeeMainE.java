class Employee{
    int  employeeId;
    String employeeName;
    String email;

public void printEmployee(){
    System.out.println("ID : "+employeeId);
    System.out.println("Name : "+employeeName);
    System.out.println("Email : "+email);
}
}
class EmployeeMainE{

    public static void main(String []args){
        Employee e1=new Employee();
        e1.employeeId=101;
        e1.employeeName="harsh";
        e1.email="harsh@gmail.com";

         Employee e2=new Employee();
        e2.employeeId=102;
        e2.employeeName="arsh";
        e2.email="arsh@gmail.com";
        e1.printEmployee();
        e2.printEmployee();
    }
}