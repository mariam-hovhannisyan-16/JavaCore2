package homework.Lessons.Lesson9;

public interface MyInterface {

  default void print(){
     System.out.println("hello");
}
static void seyHola() {
    System.out.println("Hola");
}

}