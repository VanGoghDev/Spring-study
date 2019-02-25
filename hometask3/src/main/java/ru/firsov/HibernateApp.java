package ru.firsov;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class HibernateApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Goods.class)
                .buildSessionFactory();

        Session session = null;

        Scanner in = new Scanner(System.in);

        try {
            while (true) {
                session = factory.getCurrentSession();
                session.beginTransaction();
                String msg = in.nextLine();
                if (msg.startsWith(Command.CLIENTS_GOODS.getText())) {
                    String cust = msg.substring(Command.CLIENTS_GOODS.getText().length() + 1);
                    long cust_id = Long.parseLong(cust);
                    Customer customer = session.get(Customer.class, cust_id);
                    System.out.println(customer.getCustomers());
                    session.getTransaction().commit();
                } else if (msg.startsWith(Command.GOODS_BY_CL.getText())) {
                    String good = msg.substring(Command.GOODS_BY_CL.getText().length() + 1);
                    long goods_id = Long.parseLong(good);
                    Goods goods = session.get(Goods.class, goods_id);
                    System.out.println(goods.getCustomers());
                    session.getTransaction().commit();
                } else if (msg.startsWith(Command.DELETE_CL.getText())) {
                    String cust = msg.substring(Command.GOODS_BY_CL.getText().length() + 1);
                    long cust_id = Long.parseLong(cust);
                    Customer customer = session.get(Customer.class, cust_id);
                    session.delete(customer);
                    session.getTransaction().commit();
                } else if (msg.startsWith(Command.DELETE_GOOD.getText())) {
                    String good = msg.substring(Command.DELETE_GOOD.getText().length() + 1);
                    long good_id = Long.parseLong(good);
                    Customer customer = session.get(Customer.class, good_id);
                    session.delete(good);
                    session.getTransaction().commit();
                }

            }
            //Customer customer = session.get(Customer.class, 1L);
            //System.out.println(customer.getCustomers());
            //session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
