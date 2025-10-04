package Homework1;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }

    private void extend() {
        int[] dynamicArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            dynamicArray[i] = array[i];
        }
        array = dynamicArray;

    }
    public int GetByIndex(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        return array[index];
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}

