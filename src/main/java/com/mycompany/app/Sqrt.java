package com.mycompany.app;

public class Sqrt
{
   double precision=0.00000001;
   double argument;

   public Sqrt(double argument) {
      this.argument=argument;
   }
   public double average(double firstValue,double secondValue) {
      return (firstValue+secondValue)/2.0;
   }
   public boolean good(double estimation,double target) {
      return Math.abs(estimation*estimation-target)<precision;
   }
   public double improve(double estimation,double target) {
      return average(estimation,target/estimation);
   }
   public double iter(double estimation, double target) {
      if(good(estimation,target))
         return estimation;
      else
         return iter(improve(estimation,target),target);
   }
   public double calc() {
      return iter(1.0,argument);
   }
}