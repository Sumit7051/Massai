

public class Employee {
    private String employeeName;
    private String employeeDesignation;
    private int employeeSalary;
    private String employeeDOB;
    private String employeeAddress;
    private int employeeAge;

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {

        if(employeeAge > 100)
        {
            System.out.println("Age not possible");
        }else {
            this.employeeAge = employeeAge;
        }
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeDOB() {
        return employeeDOB;
    }

    public void setEmployeeDOB(String employeeDOB) {
        this.employeeDOB = employeeDOB;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeDOB='" + employeeDOB + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeAge=" + employeeAge +
                '}';
    }

    //    public void displayEmployeeDetails()
//    {
//        System.out.println("Name - " + employeeName + " Designation - " + employeeDesignation + " Salary - " +employeeSalary+ " DOB - " +employeeDOB+ " Address - " +employeeAddress);
//    }
}
