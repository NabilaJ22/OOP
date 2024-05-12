public class PolymorphismTest
{
    public static void main(String[] args)
    {
        CommissionEmployee commissionEmployee = new CommissionEmployee( "Sue", "jones", "222-22-223", 10000, .06);
        CommissionEmployee employee1 = new CommissionEmployee("Nabila", "Islam", "221-134-006", 70000, .07);

        BasePlusCommissionEmployee basepluscommissionEmployee = new BasePlusCommissionEmployee( "Bob", "Lewis", "333-33-3333", 50000, .06, 300);
        
        System.out.printf("%s %s:%n%n%s%n%n", "Call CommissionEmployee's toString with superclass reference", "to superclass object", commissionEmployee.toString());

        System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with subclass", "reference to subclass object", basepluscommissionEmployee.toString());

        CommissionEmployee commissionEmployee2 = basepluscommissionEmployee;

        System.out.printf("%s %s:%n%n%s%n%n", "Call BasePlusCommissionEmployee's toString with superclass", "reference to subclass object", commissionEmployee2.toString());

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee1);

    }

}


