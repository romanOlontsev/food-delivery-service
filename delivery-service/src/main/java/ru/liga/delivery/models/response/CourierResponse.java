package ru.liga.delivery.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CourierResponse {

    @JsonProperty(value = "delivery")
    List<DeliveryResponse> delivery;

}
