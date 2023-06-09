package jpabook.jpashop;

import hellojpa.Member;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderItem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
            EntityManager em = entityManagerFactory.createEntityManager();

            EntityTransaction tx = em.getTransaction();
            tx.begin();
            try {
                Order order = new Order();
                order.addOrderItem(new OrderItem());
                tx.commit();
            } catch (Exception e){
                tx.rollback();
            } finally {
                em.close();
            }

            entityManagerFactory.close();
        }
}

