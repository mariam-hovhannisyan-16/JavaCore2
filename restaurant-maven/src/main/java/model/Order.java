package model;

import java.time.LocalDateTime;

public class Order {
    private int id;
    private Customer coustomer;
    private LocalDateTime orderDate;
    private double totalPrice;
    private String status;

    public Dish getCustomer() {
        return  null;
    }

    public <E extends Enum<E>>Enum<E> getStatus() {
        return null;
    }

    public void setId(int id) {

    }

    public void setOrderDate(LocalDateTime orderDate) {

    }

    public void setTotalPrice(double totalPrice) {

    }

    public double getTotalPrice() {
        return 0;
    }

    public void setCustomer(Customer customer) {
    }

    public void setStatus(Status status) {
    }
}
