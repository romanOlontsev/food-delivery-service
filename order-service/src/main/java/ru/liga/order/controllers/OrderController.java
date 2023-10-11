package ru.liga.order.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import ru.liga.order.models.entities.Order;
import ru.liga.order.models.request.OrderRequest;
import ru.liga.order.models.response.SomeResponse;
import ru.liga.order.models.response.OrdersResponse;

@RestController
public interface OrderController {

    @Operation(summary = "Get orders page")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "OK",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Order.class)))),
            @ApiResponse(
                    responseCode = "400",
                    description = "Bad Request",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Order.class)))),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal Server Error")})
    @GetMapping(value = "/orders", produces = "application/json")
    Page<OrdersResponse> getOrdersPage();

    @Operation(summary = "Get order by id")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "OK",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Order.class)))),
            @ApiResponse(
                    responseCode = "404",
                    description = "Not found",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Order.class)))),
            @ApiResponse(
                    responseCode = "500",
                    description = "Internal Server Error")})
    @GetMapping(value = "/order/{id}", produces = "application/json")
    OrdersResponse getOrderById(@PathVariable("id") Long orderId);

    @Operation(summary = "Get order by id")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "OK",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Order.class))))})
    @PostMapping(value = "/order", produces = "application/json", consumes = "application/json")
    SomeResponse makeOrder(@RequestBody OrderRequest request);
}
