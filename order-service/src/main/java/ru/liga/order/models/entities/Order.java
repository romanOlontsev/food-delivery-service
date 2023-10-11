package ru.liga.order.models.entities;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.List;

@Entity
@DynamicInsert
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "customer_id")
    private Long customerId;

    @ManyToOne()
    @Column(name = "restaurant")
    private Restaurant restaurant;

    @Column(name = "status")
    private Long status;

    @OneToMany(fetch = FetchType.LAZY)
    @Column(name = "items")
    private List<Items> items;
}
