package lesson;

public class TrafficLight {

    String[] color = {"RED", "ORANGE", "GREEN"};
    private int index = 0;

     public TrafficLight() {

     }

     void changeLight() {
         System.out.println(color[index]);
         if (index > 1) {
             index = 0;
         }
         else {
             index++;
         }
     }

    public static void main() {
        for (Planets p : Planets.values()) {
            System.out.println(p);
            System.out.printf("Diameter: %.0f km\n", p.getDiameter());
        }

    }

}
