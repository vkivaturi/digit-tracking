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
 * AlertAlertsInner
 */

@JsonTypeName("Alert_alerts_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-29T10:39:40.023515100+05:30[Asia/Calcutta]")
public class AlertAlertsInner {

  private String code;

  private String title;

  public AlertAlertsInner code(String code) {
    this.code = code;
    return this;
  }

  /**
   * A unique code assigned to alerts of different types
   * @return code
  */
  
  @Schema(name = "code", description = "A unique code assigned to alerts of different types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AlertAlertsInner title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the alert which can be displayed on client side
   * @return title
  */
  
  @Schema(name = "title", description = "Title of the alert which can be displayed on client side", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertAlertsInner alertAlertsInner = (AlertAlertsInner) o;
    return Objects.equals(this.code, alertAlertsInner.code) &&
        Objects.equals(this.title, alertAlertsInner.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertAlertsInner {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
