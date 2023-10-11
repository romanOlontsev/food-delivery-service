package ru.liga.delivery.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class DeliveryResponse {

    @JsonProperty(value = "order_id")
    private Long orderId;

    @JsonProperty(value = "restaurant")
    private RestaurantResponse restaurant;

    @JsonProperty(value = "customer")
    private CustomerResponse customer;

    @JsonProperty(value = "payment")
    private String payment;
}
