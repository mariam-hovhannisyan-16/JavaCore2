package homework.homework3;

public class DynamicArrayDemo {
    public  static void main(String[] args) {
    DynamicArray dynamicArray = new DynamicArray();
    dynamicArray.add(10);
    dynamicArray.add(20);
    dynamicArray.add(30);
    dynamicArray.add(40);

        int [] array = {1, 2, 3, 4};
        dynamicArray.print();
        System.out.println("Index 2-ի արժեքը՝ " + dynamicArray.GetByIndex(2));
    }

}
