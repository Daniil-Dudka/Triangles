import  java.util.ArrayList;
import static java.lang.Math.*;

public class Triangle {

    private String type;
    //double square;
    //double perimeter;
    private ArrayList<Dot> Vertexes=new ArrayList<>(3);
    // конструкторы
    public Triangle() {
        for(int i=0;i<3;i++) {
            Dot dot = new Dot((int) (Math.random() * 20 + 2), (int) (Math.random() * 20 + 2));
            Vertexes.add(dot);
        }
            type = null;
        checkType();
    }

    public Triangle(String name, String type, ArrayList<Dot> points) {
        this.type = type;
        this.Vertexes = new ArrayList<Dot>(points);
    }
    public Triangle(Triangle triangle) {
        this.type = triangle.type;
        this.Vertexes = new ArrayList<Dot>(triangle.Vertexes);
    }

    public String getType() {
        return  type;
    }
    public void addVertex(Dot dot) {
        if(Vertexes.size() < 3)
            Vertexes.add(dot);
    }
    public void addVertex(int index,Dot dot) {
        if(index < 3){
            Vertexes.remove(index);
            Vertexes.add(index, dot);
        }

    }
    public void setVertexes(ArrayList<Dot> dots) {
        Vertexes = new ArrayList<Dot>(dots);
    }
    public void checkType() {
    double firstSide = Vertexes.get(0).CalculateDistance(Vertexes.get(1));
    double secondSide = Vertexes.get(0).CalculateDistance(Vertexes.get(2));
    double thirdSide = Vertexes.get(1).CalculateDistance(Vertexes.get(2));
    if(Main.isEqual(firstSide*firstSide, secondSide*secondSide + thirdSide*thirdSide )
            || Main.isEqual(secondSide*secondSide, firstSide*firstSide + thirdSide*thirdSide )
            || Main.isEqual(thirdSide*thirdSide, firstSide*firstSide + secondSide*secondSide ))
        type = "Прямоугольный";
    else if((firstSide==secondSide) && (secondSide==thirdSide))
        type = "Равносторонний";
    else if((firstSide != secondSide) && (secondSide != thirdSide))
        type = "Произвольный";
    else if((firstSide == secondSide) || (firstSide ==thirdSide) || (secondSide== thirdSide))
        type = "Равнобедренный";

    }
    public double CalculatePerimeter() {
        return(Vertexes.get(0).CalculateDistance(Vertexes.get(1))+Vertexes.get(0).CalculateDistance(Vertexes.get(2))+Vertexes.get(1).CalculateDistance(Vertexes.get(2)));
    }
    public double CalculateSquare(){
        return (abs((Vertexes.get(1).x-Vertexes.get(0).x)*(Vertexes.get(2).y-Vertexes.get(0).y)-(Vertexes.get(2).x-Vertexes.get(0).x)*(Vertexes.get(1).y-Vertexes.get(0).y))/2);
    }

    public String toString() {
        return "Тип: " + type + "\nВершины" + Vertexes +  "\nПериметр: " + CalculatePerimeter() + "\nПлощадь: " + CalculateSquare();
    } 
}
