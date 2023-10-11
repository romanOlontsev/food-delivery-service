package ru.liga.kitchen.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class OrderResponse {

    @JsonProperty("restaurant_id")
    private Long restaurantId;

    @JsonProperty("items")
    private List<ItemResponse> items;
}
