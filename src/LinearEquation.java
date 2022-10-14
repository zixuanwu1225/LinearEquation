import java.net.URISyntaxException;
import java.util.Scanner;
import java.text.*;
public class LinearEquation {
    public String coords1;
    Scanner s = new Scanner(System.in);
    DecimalFormat currency = new DecimalFormat("###0.00");
    private String newString;
    private double x1;
    private double y1;
    private double y2;
    private double x2;
    private double Rise;
    private double Run;
    private double Value;

    public LinearEquation(double intx, double inty, double finx, double finy) {
        x1 = intx;
        x2 = finx;
        y1 = inty;
        y2 = finy;
        Rise = finy - inty;
        Run = finx - intx;
    }
    public LinearEquation(double intx, double inty, double finx, double finy,double value)
    {
        x1 = intx;
        x2 = finx;
        y1 = inty;
        y2 = finy;
        Rise = finy - inty;
        Run = finx - intx;
        Value = value;
    }
    public double findNew()
    {
        double newValue = (Rise/Run)*Value + findIntercept();
        return newValue;
    }
    //Used for privates + finding variables for usage in slope
    public double findSlope() {
        double slope = Rise / Run;
        return slope;
    }
    public String printSlope()
    {
        String giveSlope = Rise + "/" + Run;
        return giveSlope;
    }

    //finds slope
    public double findIntercept()
    {
        double intercept = y1 - (findSlope()+x1);
        return intercept;
    }
    public double findDistance()
    {
        double distance = Math.sqrt(Math.pow(Rise,2)+Math.pow(Run,2));
        return distance;
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
}