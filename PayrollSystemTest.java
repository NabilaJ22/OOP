// Fig. 10.9: PayrollSystemTest.java

public class PayrollSystemTest 
{
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Nabila", "Islam", "223-134-006", 800.5);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Nabila", "Islam", "221-134-006", 800.5, 40);
        Employee commissionEmployee = new CommissionEmployee("Shafat", "Alam", "221-134-006", 1000, 0.6);
        Employee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Nabila", "Islam", "221-134-006", 5000,0.6,300);

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];

        employees[0] = salariedEmployee; 
        employees[1] = hourlyEmployee; 
        employees[2] = commissionEmployee; 
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        for ( Employee currentEmployee : employees ) 
        {
            System.out.println( currentEmployee );
            if ( currentEmployee instanceof BasePlusCommissionEmployee ) 
            {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee ;
                double oldBaseSalary = employee.getBaseSalary();
                employee.setBaseSalary( 1.10 * oldBaseSalary );
                System.out.printf( "new base salary with 10%% increase is: $%,.2f\n",employee.getBaseSalary() );
            }
            System.out.printf( "earned $%,.2f\n\n", currentEmployee.earnings() );}
            for ( int j = 0; j < employees.length; j++ )
            System.out.printf( "Employee %d is a %s\n", j, employees[ j ].getClass().getName() ); 
    }
}
