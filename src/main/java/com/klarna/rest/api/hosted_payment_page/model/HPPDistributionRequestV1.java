/*
 * HPP
 * Hosted Payment Page
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.klarna.rest.api.hosted_payment_page.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.klarna.rest.api.hosted_payment_page.model.HPPDistributionContactV1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * HPPDistributionRequestV1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-20T10:31:07.217Z")
public class HPPDistributionRequestV1 {
  @JsonProperty("contact_information")
  private HPPDistributionContactV1 contactInformation = null;

  /**
   * Method used for distribution
   */
  public enum MethodEnum {
    SMS("sms"),
    
    EMAIL("email");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MethodEnum fromValue(String text) {
      for (MethodEnum b : MethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("method")
  private MethodEnum method = null;

  /**
   * Gets or Sets template
   */
  public enum TemplateEnum {
    INSTORE_PURCHASE("INSTORE_PURCHASE");

    private String value;

    TemplateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TemplateEnum fromValue(String text) {
      for (TemplateEnum b : TemplateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("template")
  private TemplateEnum template = null;

  public HPPDistributionRequestV1 contactInformation(HPPDistributionContactV1 contactInformation) {
    this.contactInformation = contactInformation;
    return this;
  }

   /**
   * Contact information for the link distribution
   * @return contactInformation
  **/
  @ApiModelProperty(required = true, value = "Contact information for the link distribution")
  public HPPDistributionContactV1 getContactInformation() {
    return contactInformation;
  }

  public void setContactInformation(HPPDistributionContactV1 contactInformation) {
    this.contactInformation = contactInformation;
  }

  public HPPDistributionRequestV1 method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * Method used for distribution
   * @return method
  **/
  @ApiModelProperty(example = "sms", required = true, value = "Method used for distribution")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public HPPDistributionRequestV1 template(TemplateEnum template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(required = true, value = "")
  public TemplateEnum getTemplate() {
    return template;
  }

  public void setTemplate(TemplateEnum template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HPPDistributionRequestV1 distributionRequestV1 = (HPPDistributionRequestV1) o;
    return Objects.equals(this.contactInformation, distributionRequestV1.contactInformation) &&
        Objects.equals(this.method, distributionRequestV1.method) &&
        Objects.equals(this.template, distributionRequestV1.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactInformation, method, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HPPDistributionRequestV1 {\n");
    
    sb.append("    contactInformation: ").append(toIndentedString(contactInformation)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

