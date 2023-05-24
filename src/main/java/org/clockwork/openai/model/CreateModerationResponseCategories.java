/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.clockwork.openai.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CreateModerationResponseCategories
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-24T16:11:32.543455-05:00[America/Chicago]")

public class CreateModerationResponseCategories {
  @SerializedName("hate")
  private Boolean hate = null;

  @SerializedName("hate/threatening")
  private Boolean hatethreatening = null;

  @SerializedName("self-harm")
  private Boolean selfHarm = null;

  @SerializedName("sexual")
  private Boolean sexual = null;

  @SerializedName("sexual/minors")
  private Boolean sexualminors = null;

  @SerializedName("violence")
  private Boolean violence = null;

  @SerializedName("violence/graphic")
  private Boolean violencegraphic = null;

  public CreateModerationResponseCategories hate(Boolean hate) {
    this.hate = hate;
    return this;
  }

   /**
   * Get hate
   * @return hate
  **/
  @Schema(required = true, description = "")
  public Boolean isHate() {
    return hate;
  }

  public void setHate(Boolean hate) {
    this.hate = hate;
  }

  public CreateModerationResponseCategories hatethreatening(Boolean hatethreatening) {
    this.hatethreatening = hatethreatening;
    return this;
  }

   /**
   * Get hatethreatening
   * @return hatethreatening
  **/
  @Schema(required = true, description = "")
  public Boolean isHatethreatening() {
    return hatethreatening;
  }

  public void setHatethreatening(Boolean hatethreatening) {
    this.hatethreatening = hatethreatening;
  }

  public CreateModerationResponseCategories selfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

   /**
   * Get selfHarm
   * @return selfHarm
  **/
  @Schema(required = true, description = "")
  public Boolean isSelfHarm() {
    return selfHarm;
  }

  public void setSelfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
  }

  public CreateModerationResponseCategories sexual(Boolean sexual) {
    this.sexual = sexual;
    return this;
  }

   /**
   * Get sexual
   * @return sexual
  **/
  @Schema(required = true, description = "")
  public Boolean isSexual() {
    return sexual;
  }

  public void setSexual(Boolean sexual) {
    this.sexual = sexual;
  }

  public CreateModerationResponseCategories sexualminors(Boolean sexualminors) {
    this.sexualminors = sexualminors;
    return this;
  }

   /**
   * Get sexualminors
   * @return sexualminors
  **/
  @Schema(required = true, description = "")
  public Boolean isSexualminors() {
    return sexualminors;
  }

  public void setSexualminors(Boolean sexualminors) {
    this.sexualminors = sexualminors;
  }

  public CreateModerationResponseCategories violence(Boolean violence) {
    this.violence = violence;
    return this;
  }

   /**
   * Get violence
   * @return violence
  **/
  @Schema(required = true, description = "")
  public Boolean isViolence() {
    return violence;
  }

  public void setViolence(Boolean violence) {
    this.violence = violence;
  }

  public CreateModerationResponseCategories violencegraphic(Boolean violencegraphic) {
    this.violencegraphic = violencegraphic;
    return this;
  }

   /**
   * Get violencegraphic
   * @return violencegraphic
  **/
  @Schema(required = true, description = "")
  public Boolean isViolencegraphic() {
    return violencegraphic;
  }

  public void setViolencegraphic(Boolean violencegraphic) {
    this.violencegraphic = violencegraphic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModerationResponseCategories createModerationResponseCategories = (CreateModerationResponseCategories) o;
    return Objects.equals(this.hate, createModerationResponseCategories.hate) &&
        Objects.equals(this.hatethreatening, createModerationResponseCategories.hatethreatening) &&
        Objects.equals(this.selfHarm, createModerationResponseCategories.selfHarm) &&
        Objects.equals(this.sexual, createModerationResponseCategories.sexual) &&
        Objects.equals(this.sexualminors, createModerationResponseCategories.sexualminors) &&
        Objects.equals(this.violence, createModerationResponseCategories.violence) &&
        Objects.equals(this.violencegraphic, createModerationResponseCategories.violencegraphic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hate, hatethreatening, selfHarm, sexual, sexualminors, violence, violencegraphic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseCategories {\n");
    
    sb.append("    hate: ").append(toIndentedString(hate)).append("\n");
    sb.append("    hatethreatening: ").append(toIndentedString(hatethreatening)).append("\n");
    sb.append("    selfHarm: ").append(toIndentedString(selfHarm)).append("\n");
    sb.append("    sexual: ").append(toIndentedString(sexual)).append("\n");
    sb.append("    sexualminors: ").append(toIndentedString(sexualminors)).append("\n");
    sb.append("    violence: ").append(toIndentedString(violence)).append("\n");
    sb.append("    violencegraphic: ").append(toIndentedString(violencegraphic)).append("\n");
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
