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
 * CreateClassificationResponseSelectedExamples
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-24T16:11:32.543455-05:00[America/Chicago]")

public class CreateClassificationResponseSelectedExamples {
  @SerializedName("document")
  private Integer document = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("label")
  private String label = null;

  public CreateClassificationResponseSelectedExamples document(Integer document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  @Schema(description = "")
  public Integer getDocument() {
    return document;
  }

  public void setDocument(Integer document) {
    this.document = document;
  }

  public CreateClassificationResponseSelectedExamples text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @Schema(description = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CreateClassificationResponseSelectedExamples label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @Schema(description = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClassificationResponseSelectedExamples createClassificationResponseSelectedExamples = (CreateClassificationResponseSelectedExamples) o;
    return Objects.equals(this.document, createClassificationResponseSelectedExamples.document) &&
        Objects.equals(this.text, createClassificationResponseSelectedExamples.text) &&
        Objects.equals(this.label, createClassificationResponseSelectedExamples.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document, text, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClassificationResponseSelectedExamples {\n");
    
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
