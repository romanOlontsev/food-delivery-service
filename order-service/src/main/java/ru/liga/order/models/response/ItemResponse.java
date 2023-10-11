package ru.liga.order.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.net.URI;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ItemResponse {

    @Column(name = "price")
    private BigDecimal price;

    @JsonProperty(value = "quantity")
    private BigDecimal quantity;

    @JsonProperty(value = "description")
    private String description;

    @JsonProperty(value = "image")
    private URI image;
}
