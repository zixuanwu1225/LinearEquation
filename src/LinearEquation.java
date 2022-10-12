import java.util.Scanner;
public class LinearEquation {
    public String coords1;
    Scanner s = new Scanner(System.in);
    private int x1;
    private int y1;
    private int y2;
    private int x2;
    public String LinearEquation(String coords1)
    {
        String given1 = s.nextLine();
        String removeParentheses1 = coords1.substring(0,1);
        String removeParentheses2 = coords1.substring(1,removeParentheses1.length()-1);
        int p1Placement = coords1.indexOf(",");
        String firstInteger = coords1.substring(p1Placement,removeParentheses2.length()-1);
        String secondInteger = coords1.substring(removeParentheses2.length(), p1Placement-1);
        return firstInteger + " " + secondInteger;
        //need to figure out how to convert string integers inside coords1 to integers for calling and to input into equations
    }


}
