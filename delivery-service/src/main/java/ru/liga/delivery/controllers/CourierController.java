package ru.liga.delivery.controllers;

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
import org.springframework.web.bind.annotation.*;
import ru.liga.delivery.models.request.OrderActionRequest;
import ru.liga.delivery.models.response.CourierResponse;

@RestController
public interface CourierController {

    @Operation(summary = "Get delivery page")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "OK",
                    content = @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = CourierResponse.class))))})
    @GetMapping(value = "/deliveries", produces = "application/json")
    Page<CourierResponse> getDeliveryPage(
            @Parameter(in = ParameterIn.QUERY, examples = {
                    @ExampleObject(value = "active"),
                    @ExampleObject(value = "complete")})
            @RequestParam("status") String status);

    @Operation(summary = "Get delivery page")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "OK")})
    @PostMapping(value = "/delivery/{id}", produces = "application/json")
    void changeOrderStatus(
            @Parameter(in = ParameterIn.PATH)
            @PathVariable("id") Long id,
            @Parameter(in = ParameterIn.DEFAULT)
            @RequestBody OrderActionRequest request);

}
