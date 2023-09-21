import java.util.Scanner;
public class Activity2 {
    public static void main(String[] args) {
        int intSalary = 0, intHoursWorked = 0, intContribution = 0, intBonus = 0, intLevel = 0;
        double dblTax = 0.00, dblFinalPay = 0.00;
        Scanner s = new Scanner(System.in);
        /* 1. Display the tax and final pay given the below table where salary and hours worked are inputs: (use if-else)
         *  Salary           Tax     Contribution
         *  0-10000          0%          300
         *  10001-20000      5%          350 
         *  20001-30000      6%          400
         *  30001-50000      9%          450
         *  50001-80000      12%         500
         *  80001 and above  15%         600
         * 
         * Hours Worked    Bonus
         *    0-40           0
         *    41-45         500
         *    46-48         1000
         *    49-50         1500
         *    51 and above  2000
         * 
         * Final Pay = Salary - Tax - Contribution + Bonus
         */
        System.out.print("Enter salary: ");
        intSalary = s.nextInt();
        if (intSalary < 0)
        {
            System.out.println("Salary cannot be negative.");
            System.exit(1);
        }

        System.out.print("Enter hours worked: ");
        intHoursWorked = s.nextInt();
        if (intHoursWorked < 0)
        {
            System.out.println("Hours worked cannot be negative.");
            System.exit(1);
        }

        if (intSalary >= 80001)
        {
            dblTax = 0.15;
            intContribution = 600;
        }
        else if (intSalary >= 50001)
        {
            dblTax = 0.12;
            intContribution = 500;
        }
        else if (intSalary >= 30001)
        {
            dblTax = 0.09;
            intContribution = 450;
        }
        else if (intSalary >= 20001)
        {
            dblTax = 0.06;
            intContribution = 400;
        }
        else if (intSalary >= 10001)
        {
            dblTax = 0.05;
            intContribution = 350;
        }
        else
        {
            dblTax = 0.00;
            intContribution = 300;
        }

        if (intHoursWorked >= 51)
            intBonus = 2000;
        else if (intHoursWorked >= 49)
            intBonus = 1500;
        else if (intHoursWorked >= 46)
            intBonus = 1000;
        else if (intBonus >= 41)
            intBonus = 500;
        else
            intBonus = 0;
        
        dblFinalPay = intSalary - (intSalary * dblTax) - intContribution + intBonus;
        System.out.printf("Tax (%.0f%%): %.2f\nFinal Pay: %.2f", (dblTax * 100), (intSalary * dblTax), dblFinalPay);

        /* 2. Use switch statment to display the student's level remark and discount given his year level as input
         * Student Level     Remark      Discount
         *      1           Freshman        10%
         *      2           Sophomore       8%
         *      3           Junior          6%
         *      4           Senior          4%
         *      5           Senior          4%
         * 
         *   other values Invalid
         */

        System.out.print("\n\nEnter student level: ");
        intLevel = s.nextInt();
        switch(intLevel)
        {
            case 1: System.out.println("Remark: Freshman\nDiscount: 10%");
                    break;
            case 2: System.out.println("Remark: Sophomore\nDiscount: 8%");
                    break;
            case 3: System.out.println("Remark: Junior\nDiscount: 6%");
                    break;
            case 4:
            case 5: System.out.println("Remark: Senior\nDiscount: 4%");
                    break;
            default: System.out.println("Invalid");
        }
    }
}
