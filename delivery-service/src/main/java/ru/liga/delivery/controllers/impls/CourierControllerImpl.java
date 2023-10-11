package ru.liga.delivery.controllers.impls;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;
import ru.liga.delivery.controllers.CourierController;
import ru.liga.delivery.models.request.OrderActionRequest;
import ru.liga.delivery.models.response.CourierResponse;

@RestController
public class CourierControllerImpl implements CourierController {

    @Override
    public Page<CourierResponse> getDeliveryPage(String status) {
        return null;
    }

    @Override
    public void changeOrderStatus(Long id, OrderActionRequest request) {

    }
}
