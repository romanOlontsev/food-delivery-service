package ru.liga.order.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class RestaurantResponse {

    @JsonProperty(value = "name")
    private String name;
}
