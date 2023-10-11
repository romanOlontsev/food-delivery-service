package ru.liga.order.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class RestaurantRequest {

    @JsonProperty(value = "restaurant_id")
    private Long restaurantId;

    @JsonProperty(value = "menu_items")
    private List<ItemRequest> menuItems;
}
