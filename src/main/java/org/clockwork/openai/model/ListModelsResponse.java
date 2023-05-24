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
import org.clockwork.openai.model.Model;
/**
 * ListModelsResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-24T16:11:32.543455-05:00[America/Chicago]")

public class ListModelsResponse {
  @SerializedName("object")
  private String object = null;

  @SerializedName("data")
  private List<Model> data = new ArrayList<Model>();

  public ListModelsResponse object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @Schema(required = true, description = "")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public ListModelsResponse data(List<Model> data) {
    this.data = data;
    return this;
  }

  public ListModelsResponse addDataItem(Model dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(required = true, description = "")
  public List<Model> getData() {
    return data;
  }

  public void setData(List<Model> data) {
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
    ListModelsResponse listModelsResponse = (ListModelsResponse) o;
    return Objects.equals(this.object, listModelsResponse.object) &&
        Objects.equals(this.data, listModelsResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListModelsResponse {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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
