/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.0-beta).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ACK;
import org.openapitools.model.Route;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-08-05T19:49:57.031819500+05:30[Asia/Calcutta]")
@Validated
@Tag(name = "Route", description = "Route is a sequence of POIs. Route indicate the path the operator should take while delivering a service.")
public interface RouteApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /route/_create : Create a new route by providing a list of POIs
     * Create a new Route by Id
     *
     * @param route Create a new Route in the system (required)
     * @return Successful operation (status code 200)
     *         or Validation exception (status code 405)
     */
    @Operation(
        operationId = "createRoute",
        summary = "Create a new route by providing a list of POIs",
        description = "Create a new Route by Id",
        tags = { "Route" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ACK.class))
            }),
            @ApiResponse(responseCode = "405", description = "Validation exception", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ACK.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/route/_create",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ACK> createRoute(
        @Parameter(name = "Route", description = "Create a new Route in the system", required = true) @Valid @RequestBody Route route
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"116bd8d3-e5a9-4e1c-86dc-b2a9c17e3fb1\", \"responseMessage\" : \"Update is succesful\", \"responseCode\" : \"CODE-123\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /route/_search : Find Route based on supported parameters
     * Search Route based on multiple filters
     *
     * @param status Status values that need to be considered for filter (optional, default to active)
     * @param routeName route name that needs to be considered for filter (optional)
     * @return successful operation (status code 200)
     *         or Invalid search value (status code 400)
     */
    @Operation(
        operationId = "findRoute",
        summary = "Find Route based on supported parameters",
        description = "Search Route based on multiple filters",
        tags = { "Route" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Route.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid search value", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ACK.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/route/_search",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Route>> findRoute(
        @Parameter(name = "status", description = "Status values that need to be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "status", required = false, defaultValue = "active") String status,
        @Parameter(name = "routeName", description = "route name that needs to be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "routeName", required = false) String routeName
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"startPoi\" : \"startPoi\", \"name\" : \"name\", \"endPoi\" : \"endPoi\", \"id\" : \"id\", \"userId\" : \"rajan123\", \"intermediatePois\" : [ \"intermediatePois\", \"intermediatePois\" ], \"status\" : \"active\" }, { \"startPoi\" : \"startPoi\", \"name\" : \"name\", \"endPoi\" : \"endPoi\", \"id\" : \"id\", \"userId\" : \"rajan123\", \"intermediatePois\" : [ \"intermediatePois\", \"intermediatePois\" ], \"status\" : \"active\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /route/{routeId} : Find Route by its id
     * Returns a single Route
     *
     * @param routeId ID of Route to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Route not found (status code 404)
     */
    @Operation(
        operationId = "getRouteById",
        summary = "Find Route by its id",
        description = "Returns a single Route",
        tags = { "Route" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Route.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ACK.class))
            }),
            @ApiResponse(responseCode = "404", description = "Route not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ACK.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/route/{routeId}",
        produces = { "application/json" }
    )
    default ResponseEntity<Route> getRouteById(
        @Parameter(name = "routeId", description = "ID of Route to return", required = true, in = ParameterIn.PATH) @PathVariable("routeId") String routeId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"startPoi\" : \"startPoi\", \"name\" : \"name\", \"endPoi\" : \"endPoi\", \"id\" : \"id\", \"userId\" : \"rajan123\", \"intermediatePois\" : [ \"intermediatePois\", \"intermediatePois\" ], \"status\" : \"active\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /route/_update : Update an existing route by id
     * Update an existing route by Id
     *
     * @param route Update an existent route in the system (required)
     * @return Successful operation (status code 200)
     *         or Invalid Route ID is supplied (status code 400)
     *         or Route not found (status code 404)
     *         or Validation exception (status code 405)
     */
    @Operation(
        operationId = "updateRoute",
        summary = "Update an existing route by id",
        description = "Update an existing route by Id",
        tags = { "Route" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ACK.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid Route ID is supplied", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ACK.class))
            }),
            @ApiResponse(responseCode = "404", description = "Route not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ACK.class))
            }),
            @ApiResponse(responseCode = "405", description = "Validation exception", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ACK.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/route/_update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<ACK> updateRoute(
        @Parameter(name = "Route", description = "Update an existent route in the system", required = true) @Valid @RequestBody Route route
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"116bd8d3-e5a9-4e1c-86dc-b2a9c17e3fb1\", \"responseMessage\" : \"Update is succesful\", \"responseCode\" : \"CODE-123\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
