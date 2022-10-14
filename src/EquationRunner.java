import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //for first scanner
        String coordinates1 = s.nextLine();
        String coordinates2 = coordinates1;
        //for second scanner
        Scanner x = new Scanner(System.in);
        String coordinates3 = x.nextLine();
        String coordinates4 = coordinates3;
        //converts strings into integers
        String removeParentheses1 = coordinates1.substring(0, 1);
        String removeParentheses2 = coordinates1.substring(1, removeParentheses1.length() - 1);
        int p1Placement = coordinates1.indexOf(",");
        String firstInteger = coordinates1.substring(p1Placement, removeParentheses2.length() - 1);
        int converted1 = Integer.parseInt(firstInteger);
        String removeParentheses3 = coordinates2.substring(0, 1);
        String removeParentheses4 = coordinates2.substring(1, removeParentheses1.length() - 1);
        int d1Placement = coordinates2.indexOf(",");
        String secondInteger = coordinates2.substring(removeParentheses2.length(), d1Placement - 1);
        int converted2 = Integer.parseInt(secondInteger);
        //converts strings into integers
        //converts strings into integers
        String removeParentheses5 = coordinates1.substring(0, 1);
        String removeParentheses6 = coordinates1.substring(1, removeParentheses1.length() - 1);
        int f1Placement = coordinates1.indexOf(",");
        String thirdInteger = coordinates1.substring(f1Placement, removeParentheses2.length() - 1);
        int converted3 = Integer.parseInt(thirdInteger);
        String removeParentheses7 = coordinates2.substring(0, 1);
        String removeParentheses8 = coordinates2.substring(1, removeParentheses1.length() - 1);
        int q1Placement = coordinates2.indexOf(",");
        String fourthInteger = coordinates2.substring(removeParentheses2.length(), q1Placement - 1);
        int converted4 = Integer.parseInt(fourthInteger);
        //converts strings into integers
        LinearEquation p = new LinearEquation(converted1,converted2,converted3,converted4);
        //For later use with printing out
    }

}
