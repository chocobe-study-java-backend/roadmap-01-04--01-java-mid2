package _02_collection._03_list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Item> itemList = new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int totalPrice = 0;

        for (Item item : itemList) {
            totalPrice += item.getTotalPrice();
            System.out.println("상품명:%s, 합계:%d".formatted(
                    item.getName(),
                    item.getTotalPrice()
            ));
        }

        System.out.println("전체 가격 합:" + totalPrice);
    }
}
