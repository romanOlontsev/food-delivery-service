package ru.liga.order.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class OrdersResponse {

    @JsonProperty(value = "id")
    private Long orderId;

    @JsonProperty(value = "restaurant")
    private RestaurantResponse restaurant;

    @JsonProperty(value = "timestamp")
    private LocalDateTime timestamp;

    @JsonProperty(value = "items")
    private List<ItemResponse> items;
}
