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
    //Used for privates + finding variables for usage in slope
    public double findSlope() {
        double slope = Rise / Run;
        return slope;

    }
    //finds slope
    public double findIntercept()
    {
        double intercept = y1 - (findSlope()+x1);
        return intercept;
    }
    //finds intercept
    public double getFirstX()
    {
        return x1;
    }
    public void setFirstX(int FirstX)
    {
        x1 =  FirstX;
    }
    public double getFirstY()
    {
        return y1;
    }
    public void setFirstY(int FirstY)
    {
        x1 =  FirstY;
    }
    public double getSecondX()
    {
        return x2;
    }
    public void setSecondX(int SecondX)
    {
        x1 =  SecondX;
    }
    public double getSecondY()
    {
        return y2;
    }
    public void setSecondY(int SecondY)
    {
        x1 =  SecondY;
    }
    //getter methods for x1,y1,x2,y2 values
    //setter methods for x1,y1,x2,y2 values

    public void printEquation()
    {
        System. out.println("y="+Rise+"/"+Run+"x"+"+"+findIntercept());
    }
}