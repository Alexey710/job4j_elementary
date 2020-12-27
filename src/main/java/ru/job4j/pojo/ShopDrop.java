package ru.job4j.pojo;

public class ShopDrop {

    public static Product[] leftShift(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
            if (i - 1 >= 0) {
                products[i - 1] = products[i];
            }
            products[i] = null;
        }
        return products;
    }

}
