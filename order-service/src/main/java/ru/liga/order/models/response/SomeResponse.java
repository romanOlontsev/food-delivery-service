package ru.liga.order.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.net.URL;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class SomeResponse {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("secret_payment_url")
    private URL secretPaymentUrl;

    @JsonProperty("estimated_time_of_arrival")
    private LocalDateTime estimatedTimeOfArrival;

}
