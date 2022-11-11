import  static java.lang.Math.*;
public class Dot {
    double x;
    double y;
    public Dot(double x,double y){
        this.x = x;
        this.y =y;
    }
    double CalculateDistance(Dot a){
        return (sqrt((a.x-x)*(a.x-x)+(a.y-y)*(a.y-y)));
    }

    public String toString() {
        return "x= " + x + " y= " + y;
    }
}
