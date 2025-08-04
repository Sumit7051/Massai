//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.setEmployeeName("Sumit Sharma");
        E1.setEmployeeDesignation("Software Developer 1");
        E1.setEmployeeSalary(60000);
        E1.setEmployeeDOB("25-07-2003");
        E1.setEmployeeAddress("Jammu & Kashmir");
        E1.setEmployeeAge(101);

        System.out.println(E1);
    }
}