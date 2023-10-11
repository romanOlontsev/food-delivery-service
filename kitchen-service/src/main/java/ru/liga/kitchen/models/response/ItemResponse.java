package ru.liga.kitchen.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ItemResponse {

    @JsonProperty(value = "menu_item_id")
    private Long itemId;

    @JsonProperty(value = "quantity")
    private Integer quantity;
}
