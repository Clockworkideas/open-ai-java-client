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
import java.util.ArrayList;
import java.util.List;
import org.clockwork.openai.model.CreateSearchResponseData;
/**
 * CreateSearchResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-24T16:11:32.543455-05:00[America/Chicago]")

public class CreateSearchResponse {
  @SerializedName("object")
  private String object = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("data")
  private List<CreateSearchResponseData> data = null;

  public CreateSearchResponse object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @Schema(description = "")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public CreateSearchResponse model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @Schema(description = "")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateSearchResponse data(List<CreateSearchResponseData> data) {
    this.data = data;
    return this;
  }

  public CreateSearchResponse addDataItem(CreateSearchResponseData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<CreateSearchResponseData>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public List<CreateSearchResponseData> getData() {
    return data;
  }

  public void setData(List<CreateSearchResponseData> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSearchResponse createSearchResponse = (CreateSearchResponse) o;
    return Objects.equals(this.object, createSearchResponse.object) &&
        Objects.equals(this.model, createSearchResponse.model) &&
        Objects.equals(this.data, createSearchResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, model, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSearchResponse {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
