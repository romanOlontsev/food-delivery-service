package ru.liga.kitchen.controllers.impls;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;
import ru.liga.kitchen.controllers.RestaurantController;
import ru.liga.kitchen.models.response.OrderResponse;

@RestController
public class RestaurantControllerImpl implements RestaurantController {
    @Override
    public Page<OrderResponse> getOrdersPage(String status) {
        return null;
    }
}
