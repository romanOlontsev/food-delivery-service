package ru.liga.order.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class OrderRequest {

    @JsonProperty("restaurant_id")
    private Long restaurantId;

    @JsonProperty("items")
    private List<ItemRequest> items;
}
