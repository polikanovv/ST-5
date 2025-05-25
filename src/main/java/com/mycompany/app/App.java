package com.mycompany.app;

public class App
{
   public static void main(String[] args)
   {
      double value=Double.parseDouble("2.0");
      Sqrt sqrtCalculator=new Sqrt(value);
      double calculationResult=sqrtCalculator.calc();
      System.out.println("Sqrt of " + value + " = " + calculationResult);
   }
}