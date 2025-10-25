package Homework1.Lesson3;

public class Light {
    public static void main(String[] args) {
        int Lightspeed = 0;
        long days;
        long seconds;
        long distance;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = Lightspeed + seconds;
        System.out.print("за " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");


    }
}
