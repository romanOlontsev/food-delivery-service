package ru.liga.order.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ItemRequest {

    @JsonProperty(value = "menu_item_id")
    private Long itemId;

    @JsonProperty(value = "quantity")
    private Integer quantity;

}
