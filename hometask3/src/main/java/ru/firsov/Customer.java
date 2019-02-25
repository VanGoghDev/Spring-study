package ru.firsov;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(
            name = "cust_goods",
            joinColumns = @JoinColumn(name = "cust_id"),
            inverseJoinColumns = @JoinColumn(name = "good_id")
    )
    private List<Goods> customers;

    public List<Goods> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Goods> customers) {
        this.customers = customers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer id = " + id + ", name = " + name;
    }
}
