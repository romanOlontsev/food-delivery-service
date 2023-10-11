package ru.liga.kitchen.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.liga.kitchen.models.response.OrderResponse;

@RestController
public interface RestaurantController {

    @Operation(summary = "Get orders page")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "OK",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = OrderResponse.class))))})
    @GetMapping(value = "/orders", produces = "application/json")
    Page<OrderResponse> getOrdersPage(
            @Parameter(in = ParameterIn.QUERY, examples = {
                    @ExampleObject(value = "active"),
                    @ExampleObject(value = "complete"),
                    @ExampleObject(value = "denied")})
            @RequestParam("status") String status);

}
