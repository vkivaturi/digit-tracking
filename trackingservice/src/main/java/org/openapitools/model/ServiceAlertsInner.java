package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServiceAlertsInner
 */

@JsonTypeName("Service_alerts_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-29T10:39:40.023515100+05:30[Asia/Calcutta]")
public class ServiceAlertsInner {

  private String code;

  private String name;

  private String ulbId;

  public ServiceAlertsInner code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Unique code given to each service
   * @return code
  */
  
  @Schema(name = "code", description = "Unique code given to each service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ServiceAlertsInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the service. For example - Mosquito fumigation, Fecal sludge pickup
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the service. For example - Mosquito fumigation, Fecal sludge pickup", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceAlertsInner ulbId(String ulbId) {
    this.ulbId = ulbId;
    return this;
  }

  /**
   * Identifier of the ULB where this service is offered
   * @return ulbId
  */
  
  @Schema(name = "ulbId", description = "Identifier of the ULB where this service is offered", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ulbId")
  public String getUlbId() {
    return ulbId;
  }

  public void setUlbId(String ulbId) {
    this.ulbId = ulbId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceAlertsInner serviceAlertsInner = (ServiceAlertsInner) o;
    return Objects.equals(this.code, serviceAlertsInner.code) &&
        Objects.equals(this.name, serviceAlertsInner.name) &&
        Objects.equals(this.ulbId, serviceAlertsInner.ulbId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, ulbId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAlertsInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ulbId: ").append(toIndentedString(ulbId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
