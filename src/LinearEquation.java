import java.net.URISyntaxException;
import java.util.Scanner;
public class LinearEquation {
    public String coords1;
    Scanner s = new Scanner(System.in);
    private String newString;
    private double x1;
    private double y1;
    private double y2;
    private double x2;
    private double Rise;
    private double Run;

    public LinearEquation(double intx, double inty, double finx, double finy) {
        intx = x1;
        finx = x2;
        inty = y1;
        finy = y2;
        Rise = finy - inty;
        Run = finx - intx;
    }

    public double findSlope() {
        double slope = Rise / Run;
        return slope;

    }
    public double findIntercept()
    {
        double intercept = y1 - (findSlope()+x1);
        return intercept;
    }

    public Integer printEquation1(String coords1) {
        String removeParentheses1 = coords1.substring(0, 1);
        String removeParentheses2 = coords1.substring(1, removeParentheses1.length() - 1);
        int p1Placement = coords1.indexOf(",");
        String firstInteger = coords1.substring(p1Placement, removeParentheses2.length() - 1);
        int converted1 = Integer.parseInt(firstInteger);
        return converted1;
    }

    public String printEquation2(String coords1) {
        String removeParentheses1 = coords1.substring(0, 1);
        String removeParentheses2 = coords1.substring(1, removeParentheses1.length() - 1);
        int p1Placement = coords1.indexOf(",");
        String secondInteger = coords1.substring(removeParentheses2.length(), p1Placement - 1);
        Integer.valueOf(secondInteger);
        return secondInteger;
    }
    public void printEquation()
    {
        System.out.println("y="+Rise+"/"+Run+"x"+"+"+findIntercept());
    }
}