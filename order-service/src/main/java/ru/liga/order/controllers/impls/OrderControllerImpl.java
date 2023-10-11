package ru.liga.order.controllers.impls;


import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;
import ru.liga.order.controllers.OrderController;
import ru.liga.order.models.request.OrderRequest;
import ru.liga.order.models.response.OrdersResponse;
import ru.liga.order.models.response.SomeResponse;

@RestController
public class OrderControllerImpl implements OrderController {

    @Override
    public Page<OrdersResponse> getOrdersPage() {
        return null;
    }

    @Override
    public OrdersResponse getOrderById(Long orderId) {
        return null;
    }

    @Override
    public SomeResponse makeOrder(OrderRequest request) {
        return null;
    }
}
