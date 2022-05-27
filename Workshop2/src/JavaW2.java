
/*import java.util.Scanner;

class taxReport
{
private int taxableAmount, taxableAmountFrom, taxableAmountTo, inputOption, filingStatus;
private double taxAmount;
    private int[][] taxIntervals2011 = {{9876, 40126, 85526, 163301, 207351, 518401}, {19751,80251,171051,326601,414701,622051},{9876, 40126, 85526, 163301, 207351, 311026},{14101,53701,85501,163301,207351,518401}};
    private int[][] taxIntervals2022 = {{8350,33951,82251,171551,372951 },{16700,67901,137051,208851,372951},{8351,33951,68526, 104426, 186476},{11951,45501,117451, 190201,372951}};
    private double[] taxRates2011 = {0.10, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37};
    private double[] taxRates2021 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
public void setTaxableAmount(int taxableAmount)
{
    this.taxableAmount = taxableAmount;
}
public void setTaxableAmountFrom(int taxableAmountFrom)
{
    this.taxableAmountFrom = taxableAmountFrom;
}
public void setTaxableAmountTo(int taxableAmountTo)
{
    this.taxableAmountTo = taxableAmountTo;
}
public double getTaxAmount()
{
    return taxAmount;
}
public void setFilingStatus(int filingStatus)
{
    this.filingStatus = filingStatus;
}

public int getInputOption()
{
    return inputOption;
}
public int getTaxableAmount()
{
    return taxableAmount;
}
public taxReport()
{
    System.out.println("Enter your input");
    System.out.println("1. Computer Person Income Tax");
    System.out.println("2. Print the tax tables incomes(with range)");
    System.out.println("Exit");
    Scanner keep = new Scanner(System.in);
    inputOption = keep.nextInt();
}

    public double taxCalculate(double taxableAmount)
    {

        if (taxableAmount <= taxIntervals2022[filingStatus][0])
            taxAmount = taxRates2021[0]*taxableAmount;
        else if ((taxableAmount > taxIntervals2022[filingStatus][0]) && (taxableAmount <= taxIntervals2022[filingStatus][1]))
            taxAmount = (taxRates2021[0]*taxIntervals2022[filingStatus][0])+(taxRates2021[1]*(taxableAmount-taxIntervals2022[filingStatus][0]));
        else if (taxableAmount > taxIntervals2022[filingStatus][1] && taxableAmount <= taxIntervals2022[filingStatus][2])
            taxAmount = (taxRates2021[0]*taxIntervals2022[filingStatus][0])+(taxRates2021[1]*(taxIntervals2022[filingStatus][1]-taxIntervals2022[filingStatus][0]))+(taxRates2021[2]*(taxableAmount-taxIntervals2022[filingStatus][1]));
        else if (taxableAmount > taxIntervals2022[filingStatus][2] && taxableAmount <= taxIntervals2022[filingStatus][3])
            taxAmount = (taxRates2021[0]*taxIntervals2022[filingStatus][0])+(taxRates2021[1]*(taxIntervals2022[filingStatus][1]-taxIntervals2022[filingStatus][0]))+(taxRates2021[2]*(taxIntervals2022[filingStatus][2]-taxIntervals2022[filingStatus][1])) + (taxRates2021[3]*(taxableAmount - taxIntervals2022[filingStatus][2]));
        else if (taxableAmount> taxIntervals2022[filingStatus][3] && taxableAmount <= taxIntervals2022[filingStatus][4])
            taxAmount = (taxRates2021[0]*taxIntervals2022[filingStatus][0])+(taxRates2021[1]*(taxIntervals2022[filingStatus][1]-taxIntervals2022[filingStatus][0]))+(taxRates2021[2]*(taxIntervals2022[filingStatus][2]-taxIntervals2022[filingStatus][1])) + (taxRates2021[3]*(taxIntervals2022[filingStatus][3] - taxIntervals2022[filingStatus][2])) + (taxRates2021[4]*(taxableAmount - taxIntervals2022[filingStatus][3] ));
        else if (taxableAmount > taxIntervals2022[filingStatus][4])
            taxAmount = (taxRates2021[0]*taxIntervals2022[filingStatus][0])+(taxRates2021[1]*(taxIntervals2022[filingStatus][1]-taxIntervals2022[filingStatus][0]))+(taxRates2021[2]*(taxIntervals2022[filingStatus][2]-taxIntervals2022[filingStatus][1])) + (taxRates2021[3]*(taxIntervals2022[filingStatus][3] - taxIntervals2022[filingStatus][2])) + (taxRates2021[4]*(taxIntervals2022[filingStatus][4] - taxIntervals2022[filingStatus][3] ))+(taxRates2021[5]*(taxableAmount - taxIntervals2022[filingStatus][4]));
        return taxAmount;
    }

    public double taxCalculate2011(double taxableAmount)
    {

        if (taxableAmount <= taxIntervals2011[filingStatus][0])
            taxAmount = taxRates2011[0]*taxableAmount;
        else if ((taxableAmount > taxIntervals2011[filingStatus][0]) && (taxableAmount <= taxIntervals2011[filingStatus][1]))
            taxAmount = (taxRates2011[0]*taxIntervals2011[filingStatus][0])
                    +(taxRates2011[1]*(taxableAmount-taxIntervals2011[filingStatus][0]));
        else if (taxableAmount > taxIntervals2011[filingStatus][1] && taxableAmount <= taxIntervals2011[filingStatus][2])
            taxAmount = (taxRates2011[0]*taxIntervals2011[filingStatus][0])
                    +(taxRates2011[1]*(taxIntervals2011[filingStatus][1]-taxIntervals2011[filingStatus][0]))
                    +(taxRates2011[2]*(taxableAmount-taxIntervals2011[filingStatus][1]));
        else if (taxableAmount > taxIntervals2011[filingStatus][2] && taxableAmount <= taxIntervals2022[filingStatus][3])
            taxAmount = (taxRates2011[0]*taxIntervals2011[filingStatus][0])
                    +(taxRates2011[1]*(taxIntervals2011[filingStatus][1]-taxIntervals2011[filingStatus][0]))
                    +(taxRates2011[2]*(taxIntervals2011[filingStatus][2]-taxIntervals2011[filingStatus][1]))
                    + (taxRates2011[3]*(taxableAmount - taxIntervals2011[filingStatus][2]));
        else if (taxableAmount> taxIntervals2011[filingStatus][3]&& taxableAmount <= taxIntervals2022[filingStatus][4])
            taxAmount = (taxRates2011[0]*taxIntervals2011[filingStatus][0])
                    +(taxRates2011[1]*(taxIntervals2011[filingStatus][1]-taxIntervals2011[filingStatus][0]))
                    +(taxRates2011[2]*(taxIntervals2011[filingStatus][2]-taxIntervals2011[filingStatus][1]))
                    + (taxRates2011[3]*(taxIntervals2011[filingStatus][3] - taxIntervals2011[filingStatus][2]))
                    + (taxRates2011[4]*(taxableAmount - taxIntervals2011[filingStatus][3] ));
        else if (taxableAmount> taxIntervals2011[filingStatus][4] && taxableAmount <= taxIntervals2022[filingStatus][5])
            taxAmount = (taxRates2011[0]*taxIntervals2011[filingStatus][0])
                    +(taxRates2011[1]*(taxIntervals2011[filingStatus][1]-taxIntervals2011[filingStatus][0]))
                    +(taxRates2011[2]*(taxIntervals2011[filingStatus][2]-taxIntervals2011[filingStatus][1]))
                    + (taxRates2011[3]*(taxIntervals2011[filingStatus][3] - taxIntervals2011[filingStatus][2]))
                    + (taxRates2011[4]*(taxIntervals2011[filingStatus][4] - taxIntervals2011[filingStatus][3]))
                    + (taxRates2011[5]*(taxableAmount - taxIntervals2011[filingStatus][4] ));
        else if (taxableAmount> taxIntervals2011[filingStatus][5])
            taxAmount = (taxRates2011[0]*taxIntervals2011[filingStatus][0])
                    +(taxRates2011[1]*(taxIntervals2011[filingStatus][1]-taxIntervals2011[filingStatus][0]))
                    +(taxRates2011[2]*(taxIntervals2011[filingStatus][2]-taxIntervals2011[filingStatus][1]))
                    + (taxRates2011[3]*(taxIntervals2011[filingStatus][3] - taxIntervals2011[filingStatus][2]))
                    + (taxRates2011[4]*(taxIntervals2011[filingStatus][4] - taxIntervals2011[filingStatus][3]))
                    + (taxRates2011[5]*(taxIntervals2011[filingStatus][5] - taxIntervals2011[filingStatus][4]))
                    + (taxRates2011[6]*(taxableAmount - taxIntervals2011[filingStatus][5] ));
               return taxAmount;
    }

public void option2()
{
       System.out.printf("2011 tax table for taxable income from $%d to $%d\n", taxableAmountFrom, taxableAmountTo);
       System.out.println(" **************************************************************");
       System.out.println(" Taxable  Single  Married Joint   Married      Head of\n Income           or Qualifying   Separate     a House \n                   Window(er)\n");
       System.out.println(" **************************************************************");
           for (int j = taxableAmountFrom; j <= taxableAmountTo; j += 1000) {
               System.out.printf("%d   ", j);
               for (int k = 0; k < 4; k++) {
                   filingStatus = k;
                   System.out.printf("%.2f      ", taxCalculate2011(j));
               }
               System.out.println("\n");
           }

    System.out.printf("2021 tax table for taxable income from $%d to $%d\n", taxableAmountFrom, taxableAmountTo);
    System.out.println(" **************************************************************");
    System.out.println(" Taxable  Single  Married Joint  Married    Head of\n Income           or Qualifying  Separate   a House \n                   Window(er)\n");
    System.out.println(" **************************************************************");
           for (int j = taxableAmountFrom; j <= taxableAmountTo; j += 1000) {
               System.out.printf("%d    ", j);
               for (int k = 0; k < 4; k++) {
                   filingStatus = k;
                   System.out.printf("%.2f     ", taxCalculate(j));
               }
               System.out.println("\n");
           }
}
}

public class JavaW2
{
    public static void main(String[] args)
    {
        taxReport record = new taxReport();
        Scanner sc = new Scanner(System.in);

        if(record.getInputOption() == 1)
        {
            Scanner temp= new Scanner(System.in);
            System.out.println("One of the four tax-filing statuses:");
            System.out.println("0 -single filter");
            System.out.println("1 -married filing jointly or qualifying widow(er)");
            System.out.println("2 -married filing separately");
            System.out.println("3 -head of household");
            int fileSta = temp.nextInt();
            if(fileSta >=0 && fileSta <=3) {
                record.setFilingStatus(fileSta);
                System.out.println("Enter the taxable amount: ");
                int taxAmount1 = sc.nextInt();
                record.setTaxableAmount(taxAmount1);
                record.taxCalculate(record.getTaxableAmount());
                System.out.printf("Tax is: %.2f", record.getTaxAmount());
            }
        }
        else if(record.getInputOption() == 2)
        {
            int num1, num2;
            System.out.print("Enter the amount From: $");
            num1 = sc.nextInt();
            record.setTaxableAmountFrom(num1);
            System.out.print("Enter the amount To: $");
            num2 = sc.nextInt();
            record.setTaxableAmountTo(num2);
            record.option2();
        }
    }
}
*/


import java.io.*;


import java.io.*;
import java.lang.*;
import java.util.*;

class one {
    one()
    {
        System.out.println("one nonparameterized");
    }
    one(int rec, int rec2)
    {
        System.out.println("one class");
    }
    public int info =20;
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

class two extends one {
    two()
    {

    }
    two(int rec, int rec2)
    {
        System.out.println("Second class");
    }
    public void print_for() { System.out.println("for"); }
}
class three extends two{
    three(int rec, int rec2)
    {
        System.out.println("three nonparameterized");
    }
    public void record()
    {
        System.out.println("I am here in the middle");
        System.out.printf("%d", info);
        print_geek();
    }
}
// Driver class
public class JavaW2 {
    public static void main(String[] args)
    {
     three g = new three(2,3);


    }
}