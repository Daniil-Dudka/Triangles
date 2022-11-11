import java.util.ArrayList;

public class ListOfTriangles {
   private ArrayList<Triangle> Triangles= new ArrayList<>();
   public ListOfTriangles(ArrayList<Triangle> list) {
      Triangles = new ArrayList<>(list);
   }
   public double minPerimeter(String type) {
   double min = 10000;
   int indexMin = 1000;
   for(int i=0;i<Triangles.size();i++){
      if(type.equals(Triangles.get(i).getType()) && min>Triangles.get(i).CalculatePerimeter() ){
         min = Triangles.get(i).CalculatePerimeter();
         indexMin = i;
      }
   }

      if(min==10000)
         return 0;
      else
         return min;
   }
   public double maxPerimeter(String type) {
      double max = 0;
      int indexMax = 1000;
      for(int i = 0;i<Triangles.size();i++){
         if(type.equals(Triangles.get(i).getType()) && max <= Triangles.get(i).CalculatePerimeter() ){
            max = Triangles.get(i).CalculatePerimeter();
            indexMax = i;
         }
      }
      if(max==0)
         return 0;
      else
         return max;
   }
   public double maxSquare(String type) {
      double max = 0;
      int indexMax = 1000;
      for(int i = 0;i<Triangles.size();i++){
         if(type.equals(Triangles.get(i).getType()) && max<Triangles.get(i).CalculateSquare() ){
            max = Triangles.get(i).CalculatePerimeter();
            indexMax = i;
         }
      }

      if(max==0)
         return 0;
      else
         return max;
   }
   public double minSquare(String type) {
      double min = 10000;
      int indexMin = 1000;
      for(int i=0;i<Triangles.size();i++){
         if(type.equals(Triangles.get(i).getType()) && min>Triangles.get(i).CalculateSquare() ){
            min = Triangles.get(i).CalculatePerimeter();
            indexMin = i;
         }
      }

      if(min==10000)
         return 0;
      else
         return min;
   }
   public void addTriangle(Triangle triangle) {
      Triangles.add(triangle);
   }
   public Triangle getTriangle(int index) {
      return Triangles.get(index);
   }
}
