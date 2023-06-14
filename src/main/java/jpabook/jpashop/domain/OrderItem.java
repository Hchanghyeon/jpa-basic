package jpabook.jpashop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @Column(name = "ORDER_ID")
    private Long ORDER_ID;

    @Column(name = "ITEM_ID")
    private Long ITEM_ID;

    private int orderPrice;
    private int count;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getORDER_ID() {
        return ORDER_ID;
    }

    public void setORDER_ID(Long ORDER_ID) {
        this.ORDER_ID = ORDER_ID;
    }

    public Long getITEM_ID() {
        return ITEM_ID;
    }

    public void setITEM_ID(Long ITEM_ID) {
        this.ITEM_ID = ITEM_ID;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
