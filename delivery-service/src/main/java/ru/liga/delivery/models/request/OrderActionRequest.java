package ru.liga.delivery.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class OrderActionRequest {

    @JsonProperty(value = "order_action")
    private String orderAction;
}
