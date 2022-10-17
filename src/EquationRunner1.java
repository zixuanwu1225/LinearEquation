import java.text.DecimalFormat;
import java.util.Scanner;
public class EquationRunner1 {
    public static void main(String[] args) {
        DecimalFormat currency = new DecimalFormat("###0.00");
        System.out.println("Type your first coordinate");
        Scanner s = new Scanner(System.in);
        //for first scanner
        String coordinates1 = s.nextLine();
        String coordinates2 = coordinates1;
        //for second scanner
        System.out.println("Type out your second coordinate");
        Scanner x = new Scanner(System.in);
        String coordinates3 = x.nextLine();
        String coordinates4 = coordinates3;
        //converts strings into integers
        String removeParentheses1 = coordinates1.substring(0, 1);
        String removeParentheses2 = coordinates1.substring(coordinates1.length()-1);
        int p1Placement = coordinates1.indexOf(",");
        String firstInteger = coordinates1.substring(p1Placement+1,coordinates1.length()-1);
        int converted1 = Integer.parseInt(firstInteger);
        int d1Placement = coordinates2.indexOf(",");
        String secondInteger = coordinates2.substring(removeParentheses1.length(), d1Placement);
        int converted2 = Integer.parseInt(secondInteger);
        //converts strings into integers
        //converts strings into integers
        String removeParentheses5 = coordinates3.substring(0, 1);
        String removeParentheses6 = coordinates3.substring(coordinates3.length()-1);
        int f1Placement = coordinates3.indexOf(",");
        String thirdInteger = coordinates3.substring(f1Placement+1,coordinates3.length()-1);
        int converted3 = Integer.parseInt(thirdInteger);
        int q1Placement = coordinates4.indexOf(",");
        String fourthInteger = coordinates4.substring(removeParentheses5.length(), q1Placement);
        int converted4 = Integer.parseInt(fourthInteger);
        //converts strings into integers
        LinearEquation p = new LinearEquation(converted1,converted2,converted3,converted4);
        System.out.println("First Pair: " + coordinates1);
        System.out.println("Second Pair: " + coordinates3);
        System.out.println("y= " + p.printSlope()+"x "+"+ "+currency.format(p.findIntercept()));
        System.out.println("Distance between two points: "+currency.format(p.findDistance()));
        //For later use with printing out
        System.out.println("Type in an x value");
        Double value = x.nextDouble();
        LinearEquation b = new LinearEquation(converted1,converted2,converted3,converted4,value);
        System.out.println("Solved coordinate point is: (" + value + ","+currency.format(b.findNew())+")");
    }

}
