class Employee{
    employeeId;
    employeeName;
    email;
    dob;
    gender

    printEmployee(){
        console.log(this);
    }

    constructor(employeeId,employeeName,email,dob,gender){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.email=email;
        this.dob=dob;
        this.gender=gender;

    }
}

let emp=new Employee(1001,'Javed','javed@gmail.com','20-10-2000','M');
console.log(emp);

emp.printEmployee();
