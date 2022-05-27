



/*package com.company;

import java.util.Random;

class Dice
        {
            int rollDice1;
            int rollDice2;
            int rollDice;

            void generateRand()
            {
                Random num = new Random();
                rollDice1 = num.nextInt(6) +1 ;
                rollDice2 = num.nextInt(6) +1 ;
                rollDice = rollDice1 + rollDice2;
            }
            boolean winLose()
            {
              if (rollDice == 2 || rollDice == 3 || rollDice == 12)
              {
                  return false;
              }
              else{
                  return true;
              }
            }


           boolean estaPoint()
            {
                boolean temp = false;
                int info = rollDice;
                System.out.printf("Point is (established) set to %d\n",  rollDice);
               boolean validation = true;
              while(validation )
              {

                generateRand();
                System.out.printf("You rolled up %d + %d = %d\n", rollDice1, rollDice2, rollDice);
                if( info == rollDice )
                {
                    temp = true;
                    validation = false;
                }
                else if(rollDice == 7)
                {
                   temp = false;
                   validation = false;

                }
              }
              return temp;
            }
        }
public class Craps {

    public static void main(String[] args) {
        boolean decison = false;
      Dice record = new Dice();
      record.generateRand();

      int sum = record.rollDice;
      System.out.printf("You rolled up %d + %d = %d\n", record.rollDice1, record.rollDice2, sum);
      if( sum == 2 || sum == 3 ||sum == 12 ||sum == 7 ||sum == 11)
      {
          decison = record.winLose();

      }
      else if (sum == 4 || sum == 5 ||sum == 6 ||sum == 8 ||sum == 9 || sum == 10 )
      {

          decison = record.estaPoint();
      }

      if(decison == true)
      {
          System.out.println("Congratulations, you win ");

      }
      else
      {
          System.out.println("Craps, Better Luck Next Time, you lose");
      }
    }
    }*/


// Java program to illustrate the
// concept of Abstraction



/*package com.company;
        import java.util.*;

class Craps
{
    private double taxAmount;
    private int[][] taxIntervals2011 = {{27050, 65550, 136750, 297350}, {45200, 109250, 166500, 297350},{22600, 54625, 83250,148675},{36250,93650,151650,297350}};;
    private int[][] taxIntervals2022 = {{8350,33950,82250,171550,372950 },{16700,67900,137050,208850,372950},{8350,33950,68525, 104425, 186475},{11950,45500,117450, 190200,372950}};

    private double[] taxRates2011 = {15, 27.5, 30.5, 35.5, 39.1};
    private double[] taxRates2021 = {10, 15, 25, 28, 33, 35};
    private int taxableIncomeFrom;
    private int taxableIncomeTo;
    private int taxableAmount;


    public void setTaxableAmount(int taxableAmount) {
        this.taxableAmount = taxableAmount;
    }
    public int getTaxableAmount()
    {
        return taxableAmount;
    }
    public void setTaxableIncomeFrom(int taxableIncome)
    {
        this.taxableIncomeFrom = taxableIncome;
    }
    public int getTaxableIncomeFrom()
    {
        return taxableIncomeFrom;
    }
    public void setTaxableIncomeTo(int taxableIncome)
    {
        this.taxableIncomeTo = taxableIncome;
    }

    public Craps()
    {

        taxAmount = 0;
        taxableAmount = 0;
        taxableIncomeFrom = 0;
        taxableIncomeTo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("0 - Compute personal Income Tax");

        System.out.println("1 - Print the tax tables for taxable incomes (with range)");
        System.out.println("2 - Exit");
        int inputOption;
        inputOption = sc.nextInt();
        if (inputOption == 1)
        {
            choice1();
        }
        else if(inputOption == 2)
        {
            choice2();
        }
        else
        {

        }
    }



    public void choice1()
    {
        Scanner sc = new Scanner (System.in);
        //double tax=0;
        System.out.println("0 - single filer");
        System.out.println("1 - married jointly or qualifying widow(er)");
        System.out.println("2 - married separately");
        System.out.println("3 - head of household");
        System.out.print("Enter the filing status: ");
        int filingStatus = sc.nextInt();
        System.out.print("Enter the Taxable Income: $");
        taxableAmount = sc.nextInt();

        if (filingStatus == 0)
            taxAmount = SINGLE_FILER(taxableAmount);

        if (filingStatus == 1)
            taxAmount = MARRIED_JOINTLY_QUALIFIED_WIDOWER(taxableAmount);
        if (filingStatus == 2)
            taxAmount = MARRIED_SEPERATELY(taxableAmount);

        if (filingStatus == 3)
            taxAmount = HEAD_OF_HOUSEHOLD(taxableAmount);

        System.out.println("Tax is: $"+taxAmount);


    }

    public static double SINGLE_FILER(double taxableIncome)
    {
        double tax=0;
        if (taxableIncome <= 27050)
            tax = 0.15*taxableIncome;
        else if (taxableIncome > 27050 && taxableIncome <= 65550)
            tax = (0.15*27050)+(0.275*(taxableIncome-27050));
        else if (taxableIncome > 65550 && taxableIncome <= 136750)
            tax = (0.15*27050)+(0.275*(65550-27050))+(0.305*(taxableIncome-65550));
        else if (taxableIncome > 136750 && taxableIncome <= 297350)
            tax = (0.15*27050)+(0.275*(65550-27050))+(0.305*(136750-65550)) + (0.355*(taxableIncome - 136750));
        else if (taxableIncome>297350)
            tax = (0.15*27050)+(0.275*(65550-27050))+(0.305*(136750-65550)) + (0.355*(297351 - 136750)) + (0.391*(taxableIncome-297351));

        return tax;
    }

    public static double MARRIED_JOINTLY_QUALIFIED_WIDOWER(double taxableIncome)
    {
        double tax=0;
        if (taxableIncome <= 45200)
            tax = 0.15*taxableIncome;
        else if (taxableIncome > 45200 && taxableIncome <= 109250)
            tax = (0.15*45200)+(0.275*(taxableIncome-45200));
        else if (taxableIncome > 109250 && taxableIncome <= 166500)
            tax = (0.15*45200)+(0.275*(109250-45200))+(0.305*(taxableIncome-109250));
        else if (taxableIncome > 166500 && taxableIncome <= 297350)
            tax = (0.15*45200)+(0.275*(109250-45200))+(0.305*(166500-109250)) + (0.355*(taxableIncome - 136750));
        else if (taxableIncome>297350)
            tax = (0.15*45200)+(0.275*(109250-45200))+(0.305*(166500-109250)) + (0.355*(297351 - 166500)) + (0.391*(taxableIncome-297351));
        return tax;
    }

    public static double MARRIED_SEPERATELY(double taxableIncome)
    {
        double tax=0;
        if (taxableIncome <= 22600)
            tax = 0.15*taxableIncome;
        else if (taxableIncome > 22600 && taxableIncome <= 54625)
            tax = (0.15*22600)+(0.275*(taxableIncome-22600));
        else if (taxableIncome > 54625 && taxableIncome <= 83250)
            tax = (0.15*22600)+(0.275*(54625-22600))+(0.305*(taxableIncome-54625));
        else if (taxableIncome > 83250 && taxableIncome <= 148675)
            tax = (0.15*22600)+(0.275*(54625-22600))+(0.305*(83250-54625)) + (0.355*(taxableIncome - 136750));
        else if (taxableIncome>148675)
            tax = (0.15*22600)+(0.275*(54625-22600))+(0.305*(83250-54625)) + (0.355*(148675 - 83250)) + (0.391*(taxableIncome-148675));
        return tax;
    }

    public static double HEAD_OF_HOUSEHOLD(double taxableIncome)
    {
        double tax=0;
        if (taxableIncome <= 36250)
            tax = 0.15*taxableIncome;
        else if (taxableIncome > 36250 && taxableIncome <= 93650)
            tax = (0.15*36250)+(0.275*(taxableIncome-36250));
        else if (taxableIncome > 93650 && taxableIncome <= 151650)
            tax = (0.15*36250)+(0.275*(93650-36250))+(0.305*(taxableIncome-93650));
        else if (taxableIncome > 151650 && taxableIncome <= 297350)
            tax = (0.15*36250)+(0.275*(93650-36250))+(0.305*(151650-93650)) + (0.355*(taxableIncome - 136750));
        else if (taxableIncome>297350)
            tax = (0.15*36250)+(0.275*(93650-36250))+(0.305*(151650-93650)) + (0.355*(297350 - 151650)) + (0.391*(taxableIncome-297350));
        return tax;
    }

    public void choice2()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the amount From: $");
        double lLimit = sc.nextDouble();
        System.out.print("Enter the amount To: $");
        double ulimit = sc.nextDouble();
        System.out.println("2001 tax tables for taxable incomes from $"+lLimit+" to $"+ulimit);
        System.out.println("*******************************************************************");
        System.out.println("Taxable Income \t Single \t Married Joint or Qualifying widow(er) \t Married Seperately \t Head of House");
        System.out.println("*******************************************************************");
        double i;
        for (i=lLimit; i<=ulimit; i+=1000.0)
        {
            double s = SINGLE_FILER(i);
            double mj = MARRIED_JOINTLY_QUALIFIED_WIDOWER(i);
            double ms = MARRIED_SEPERATELY(i);
            double h = HEAD_OF_HOUSEHOLD(i);
            System.out.println(i+"\t"+s+"\t"+mj+"\t"+ms+"\t"+h);
        }
        System.out.println("2009 tax tables for taxable incomes from $"+lLimit+" to $"+ulimit);
        for (i=lLimit; i<=ulimit; i+=1000.0)
        {
            double s = SINGLE_FILER(i);
            double mj = MARRIED_JOINTLY_QUALIFIED_WIDOWER(i);
            double ms = MARRIED_SEPERATELY(i);
            double h = HEAD_OF_HOUSEHOLD(i);
            System.out.println(i+"\t"+s+"\t"+mj+"\t"+ms+"\t"+h);
        }
    }
    public static void main(String args[])
    {

    }
}*/









