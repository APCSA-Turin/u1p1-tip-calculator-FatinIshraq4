package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here 
        double tip = (((double) percent) / 100) * cost;
        double totalBill = tip + cost;
        double costBeforeTip = cost / people;
        double tipPerPerson = tip / people;
        double totalCostPerPerson = totalBill / people;

        // Learned how to round with string.format from https://www.javatpoint.com/two-decimal-places-java

        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: $" +  String.format("%.2f", tip) + "\n");
        result.append("Total Bill with tip: $" +  String.format("%.2f", totalBill) + "\n");
        result.append("Per person cost before tip: $" +  String.format("%.2f", costBeforeTip) + "\n");
        result.append("Tip per person: $" +  String.format("%.2f", tipPerPerson) + "\n");
        result.append("Total cost per person: $" +  String.format("%.2f", totalCostPerPerson) + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
      public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people,percent,cost)); 
        }       
    }