package ru.liga.delivery.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class RestaurantResponse {

    @JsonProperty(value = "address")
    private String address;

    @JsonProperty(value = "distance")
    private Integer distance;
}
