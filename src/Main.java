import  java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
       final int Triangle_Quantity = 3;
       Dot firstDot = new Dot(5,5);
       Dot secondDot = new Dot(0,0);
       Dot thirdDot = new Dot(0,5);
       ArrayList<Triangle> trianglesList = new ArrayList<>();
       for (int i = 0; i < Triangle_Quantity; i++) {
          trianglesList.add(new Triangle());

       }
        trianglesList.get(0).addVertex(0,firstDot);
        trianglesList.get(0).addVertex(1,secondDot);
        trianglesList.get(0).addVertex(2,thirdDot);
        trianglesList.get(0).checkType();

        for (int i = 0;i<Triangle_Quantity;i++) {
            System.out.println(trianglesList.get(i)+"\n");
        }
        ListOfTriangles list = new ListOfTriangles(trianglesList);
        System.out.println("min perimeter для прямоугольных = " + list.minPerimeter("Прямоугольный"));
        System.out.println("max perimeter для произвольгых = " + list.maxPerimeter("Произвольный"));
    }
    static boolean isEqual(double x, double y) {
        final double EPS = 1e-9;
        if(Math.abs(x - y) < EPS) {
            return true;
        }
        else return false;
    }
}