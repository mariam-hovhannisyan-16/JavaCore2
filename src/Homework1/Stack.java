package Homework1;

public class Stack {
    public boolean isEmpty;
    private char[] array;
    private int size;

    public Stack(int cap) {
        array = new char[cap];
        size = 0;
    }
    public void push(char value) {
        array[size++] = value;
    }
    public char pop() {
        if (isEmpty()) {
            return '0';
        }
        return array[--size];
    } 
        public boolean isEmpty() {
            return size == 0;
       
    }
    }
