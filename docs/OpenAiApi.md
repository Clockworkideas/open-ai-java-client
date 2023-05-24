# OpenAiApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFineTune**](OpenAiApi.md#cancelFineTune) | **POST** /fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**createAnswer**](OpenAiApi.md#createAnswer) | **POST** /answers | Answers the specified question using the provided documents and examples.  The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions). 
[**createChatCompletion**](OpenAiApi.md#createChatCompletion) | **POST** /chat/completions | Creates a completion for the chat message
[**createClassification**](OpenAiApi.md#createClassification) | **POST** /classifications | Classifies the specified &#x60;query&#x60; using provided examples.  The endpoint first [searches](/docs/api-reference/searches) over the labeled examples to select the ones most relevant for the particular query. Then, the relevant examples are combined with the query to construct a prompt to produce the final label via the [completions](/docs/api-reference/completions) endpoint.  Labeled examples can be provided via an uploaded &#x60;file&#x60;, or explicitly listed in the request using the &#x60;examples&#x60; parameter for quick tests and small scale use cases. 
[**createCompletion**](OpenAiApi.md#createCompletion) | **POST** /completions | Creates a completion for the provided prompt and parameters
[**createEdit**](OpenAiApi.md#createEdit) | **POST** /edits | Creates a new edit for the provided input, instruction, and parameters.
[**createEmbedding**](OpenAiApi.md#createEmbedding) | **POST** /embeddings | Creates an embedding vector representing the input text.
[**createFile**](OpenAiApi.md#createFile) | **POST** /files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**createFineTune**](OpenAiApi.md#createFineTune) | **POST** /fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**createImage**](OpenAiApi.md#createImage) | **POST** /images/generations | Creates an image given a prompt.
[**createImageEdit**](OpenAiApi.md#createImageEdit) | **POST** /images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageVariation**](OpenAiApi.md#createImageVariation) | **POST** /images/variations | Creates a variation of a given image.
[**createModeration**](OpenAiApi.md#createModeration) | **POST** /moderations | Classifies if text violates OpenAI&#x27;s Content Policy
[**createSearch**](OpenAiApi.md#createSearch) | **POST** /engines/{engine_id}/search | The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.  To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When &#x60;file&#x60; is set, the search endpoint searches over all the documents in the given file and returns up to the &#x60;max_rerank&#x60; number of documents. These documents will be returned along with their search scores.  The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query. 
[**createTranscription**](OpenAiApi.md#createTranscription) | **POST** /audio/transcriptions | Transcribes audio into the input language.
[**createTranslation**](OpenAiApi.md#createTranslation) | **POST** /audio/translations | Translates audio into into English.
[**deleteFile**](OpenAiApi.md#deleteFile) | **DELETE** /files/{file_id} | Delete a file.
[**deleteModel**](OpenAiApi.md#deleteModel) | **DELETE** /models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**downloadFile**](OpenAiApi.md#downloadFile) | **GET** /files/{file_id}/content | Returns the contents of the specified file
[**listEngines**](OpenAiApi.md#listEngines) | **GET** /engines | Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability.
[**listFiles**](OpenAiApi.md#listFiles) | **GET** /files | Returns a list of files that belong to the user&#x27;s organization.
[**listFineTuneEvents**](OpenAiApi.md#listFineTuneEvents) | **GET** /fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**listFineTunes**](OpenAiApi.md#listFineTunes) | **GET** /fine-tunes | List your organization&#x27;s fine-tuning jobs 
[**listModels**](OpenAiApi.md#listModels) | **GET** /models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieveEngine**](OpenAiApi.md#retrieveEngine) | **GET** /engines/{engine_id} | Retrieves a model instance, providing basic information about it such as the owner and availability.
[**retrieveFile**](OpenAiApi.md#retrieveFile) | **GET** /files/{file_id} | Returns information about a specific file.
[**retrieveFineTune**](OpenAiApi.md#retrieveFineTune) | **GET** /fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**retrieveModel**](OpenAiApi.md#retrieveModel) | **GET** /models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

<a name="cancelFineTune"></a>
# **cancelFineTune**
> FineTune cancelFineTune(fineTuneId)

Immediately cancel a fine-tune job. 

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
String fineTuneId = "fineTuneId_example"; // String | The ID of the fine-tune job to cancel 
try {
    FineTune result = apiInstance.cancelFineTune(fineTuneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#cancelFineTune");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **String**| The ID of the fine-tune job to cancel  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createAnswer"></a>
# **createAnswer**
> CreateAnswerResponse createAnswer(body)

Answers the specified question using the provided documents and examples.  The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions). 

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
CreateAnswerRequest body = new CreateAnswerRequest(); // CreateAnswerRequest | 
try {
    CreateAnswerResponse result = apiInstance.createAnswer(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#createAnswer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAnswerRequest**](CreateAnswerRequest.md)|  |

### Return type

[**CreateAnswerResponse**](CreateAnswerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createChatCompletion"></a>
# **createChatCompletion**
> CreateChatCompletionResponse createChatCompletion(body)

Creates a completion for the chat message

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
CreateChatCompletionRequest body = new CreateChatCompletionRequest(); // CreateChatCompletionRequest | 
try {
    CreateChatCompletionResponse result = apiInstance.createChatCompletion(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#createChatCompletion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateChatCompletionRequest**](CreateChatCompletionRequest.md)|  |

### Return type

[**CreateChatCompletionResponse**](CreateChatCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClassification"></a>
# **createClassification**
> CreateClassificationResponse createClassification(body)

Classifies the specified &#x60;query&#x60; using provided examples.  The endpoint first [searches](/docs/api-reference/searches) over the labeled examples to select the ones most relevant for the particular query. Then, the relevant examples are combined with the query to construct a prompt to produce the final label via the [completions](/docs/api-reference/completions) endpoint.  Labeled examples can be provided via an uploaded &#x60;file&#x60;, or explicitly listed in the request using the &#x60;examples&#x60; parameter for quick tests and small scale use cases. 

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
CreateClassificationRequest body = new CreateClassificationRequest(); // CreateClassificationRequest | 
try {
    CreateClassificationResponse result = apiInstance.createClassification(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#createClassification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateClassificationRequest**](CreateClassificationRequest.md)|  |

### Return type

[**CreateClassificationResponse**](CreateClassificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCompletion"></a>
# **createCompletion**
> CreateCompletionResponse createCompletion(body)

Creates a completion for the provided prompt and parameters

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
CreateCompletionRequest body = new CreateCompletionRequest(); // CreateCompletionRequest | 
try {
    CreateCompletionResponse result = apiInstance.createCompletion(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#createCompletion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  |

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEdit"></a>
# **createEdit**
> CreateEditResponse createEdit(body)

Creates a new edit for the provided input, instruction, and parameters.

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
CreateEditRequest body = new CreateEditRequest(); // CreateEditRequest | 
try {
    CreateEditResponse result = apiInstance.createEdit(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#createEdit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateEditRequest**](CreateEditRequest.md)|  |

### Return type

[**CreateEditResponse**](CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEmbedding"></a>
# **createEmbedding**
> CreateEmbeddingResponse createEmbedding(body)

Creates an embedding vector representing the input text.

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
CreateEmbeddingRequest body = new CreateEmbeddingRequest(); // CreateEmbeddingRequest | 
try {
    CreateEmbeddingResponse result = apiInstance.createEmbedding(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#createEmbedding");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  |

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFile"></a>
# **createFile**
> OpenAIFile createFile(file, purpose)

Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
File file = new File("file_example"); // File | 
String purpose = "purpose_example"; // String | 
try {
    OpenAIFile result = apiInstance.createFile(file, purpose);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#createFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |
 **purpose** | **String**|  |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createFineTune"></a>
# **createFineTune**
> FineTune createFineTune(body)

Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
CreateFineTuneRequest body = new CreateFineTuneRequest(); // CreateFineTuneRequest | 
try {
    FineTune result = apiInstance.createFineTune(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#createFineTune");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md)|  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createImage"></a>
# **createImage**
> ImagesResponse createImage(body)

Creates an image given a prompt.

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
CreateImageRequest body = new CreateImageRequest(); // CreateImageRequest | 
try {
    ImagesResponse result = apiInstance.createImage(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#createImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateImageRequest**](CreateImageRequest.md)|  |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createImageEdit"></a>
# **createImageEdit**
> ImagesResponse createImageEdit(image, mask, prompt, n, size, responseFormat, user)

Creates an edited or extended image given an original image and a prompt.

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
File image = new File("image_example"); // File | 
File mask = new File("mask_example"); // File | 
String prompt = "prompt_example"; // String | 
Integer n = 56; // Integer | 
String size = "size_example"; // String | 
String responseFormat = "responseFormat_example"; // String | 
String user = "user_example"; // String | 
try {
    ImagesResponse result = apiInstance.createImageEdit(image, mask, prompt, n, size, responseFormat, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#createImageEdit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**|  |
 **mask** | **File**|  |
 **prompt** | **String**|  |
 **n** | **Integer**|  | [enum: 10, 1]
 **size** | **String**|  | [enum: 256x256, 512x512, 1024x1024]
 **responseFormat** | **String**|  | [enum: url, b64_json]
 **user** | **String**|  |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createImageVariation"></a>
# **createImageVariation**
> ImagesResponse createImageVariation(image, n, size, responseFormat, user)

Creates a variation of a given image.

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
File image = new File("image_example"); // File | 
Integer n = 56; // Integer | 
String size = "size_example"; // String | 
String responseFormat = "responseFormat_example"; // String | 
String user = "user_example"; // String | 
try {
    ImagesResponse result = apiInstance.createImageVariation(image, n, size, responseFormat, user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#createImageVariation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**|  |
 **n** | **Integer**|  | [enum: 10, 1]
 **size** | **String**|  | [enum: 256x256, 512x512, 1024x1024]
 **responseFormat** | **String**|  | [enum: url, b64_json]
 **user** | **String**|  |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createModeration"></a>
# **createModeration**
> CreateModerationResponse createModeration(body)

Classifies if text violates OpenAI&#x27;s Content Policy

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
CreateModerationRequest body = new CreateModerationRequest(); // CreateModerationRequest | 
try {
    CreateModerationResponse result = apiInstance.createModeration(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#createModeration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateModerationRequest**](CreateModerationRequest.md)|  |

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSearch"></a>
# **createSearch**
> CreateSearchResponse createSearch(body, engineId)

The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.  To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When &#x60;file&#x60; is set, the search endpoint searches over all the documents in the given file and returns up to the &#x60;max_rerank&#x60; number of documents. These documents will be returned along with their search scores.  The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query. 

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
CreateSearchRequest body = new CreateSearchRequest(); // CreateSearchRequest | 
String engineId = "engineId_example"; // String | The ID of the engine to use for this request.  You can select one of `ada`, `babbage`, `curie`, or `davinci`.
try {
    CreateSearchResponse result = apiInstance.createSearch(body, engineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#createSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateSearchRequest**](CreateSearchRequest.md)|  |
 **engineId** | **String**| The ID of the engine to use for this request.  You can select one of &#x60;ada&#x60;, &#x60;babbage&#x60;, &#x60;curie&#x60;, or &#x60;davinci&#x60;. |

### Return type

[**CreateSearchResponse**](CreateSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTranscription"></a>
# **createTranscription**
> CreateTranscriptionResponse createTranscription(file, model, prompt, responseFormat, temperature, language)

Transcribes audio into the input language.

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
File file = new File("file_example"); // File | 
String model = "model_example"; // String | 
String prompt = "prompt_example"; // String | 
String responseFormat = "responseFormat_example"; // String | 
BigDecimal temperature = new BigDecimal(); // BigDecimal | 
String language = "language_example"; // String | 
try {
    CreateTranscriptionResponse result = apiInstance.createTranscription(file, model, prompt, responseFormat, temperature, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#createTranscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |
 **model** | **String**|  |
 **prompt** | **String**|  |
 **responseFormat** | **String**|  |
 **temperature** | **BigDecimal**|  |
 **language** | **String**|  |

### Return type

[**CreateTranscriptionResponse**](CreateTranscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createTranslation"></a>
# **createTranslation**
> CreateTranslationResponse createTranslation(file, model, prompt, responseFormat, temperature)

Translates audio into into English.

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
File file = new File("file_example"); // File | 
String model = "model_example"; // String | 
String prompt = "prompt_example"; // String | 
String responseFormat = "responseFormat_example"; // String | 
BigDecimal temperature = new BigDecimal(); // BigDecimal | 
try {
    CreateTranslationResponse result = apiInstance.createTranslation(file, model, prompt, responseFormat, temperature);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#createTranslation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |
 **model** | **String**|  |
 **prompt** | **String**|  |
 **responseFormat** | **String**|  |
 **temperature** | **BigDecimal**|  |

### Return type

[**CreateTranslationResponse**](CreateTranslationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="deleteFile"></a>
# **deleteFile**
> DeleteFileResponse deleteFile(fileId)

Delete a file.

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
String fileId = "fileId_example"; // String | The ID of the file to use for this request
try {
    DeleteFileResponse result = apiInstance.deleteFile(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#deleteFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to use for this request |

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteModel"></a>
# **deleteModel**
> DeleteModelResponse deleteModel(model)

Delete a fine-tuned model. You must have the Owner role in your organization.

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
String model = "model_example"; // String | The model to delete
try {
    DeleteModelResponse result = apiInstance.deleteModel(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#deleteModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **String**| The model to delete |

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadFile"></a>
# **downloadFile**
> String downloadFile(fileId)

Returns the contents of the specified file

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
String fileId = "fileId_example"; // String | The ID of the file to use for this request
try {
    String result = apiInstance.downloadFile(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#downloadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to use for this request |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEngines"></a>
# **listEngines**
> ListEnginesResponse listEngines()

Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability.

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
try {
    ListEnginesResponse result = apiInstance.listEngines();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#listEngines");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListEnginesResponse**](ListEnginesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFiles"></a>
# **listFiles**
> ListFilesResponse listFiles()

Returns a list of files that belong to the user&#x27;s organization.

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
try {
    ListFilesResponse result = apiInstance.listFiles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#listFiles");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFilesResponse**](ListFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFineTuneEvents"></a>
# **listFineTuneEvents**
> ListFineTuneEventsResponse listFineTuneEvents(fineTuneId, stream)

Get fine-grained status updates for a fine-tune job. 

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
String fineTuneId = "fineTuneId_example"; // String | The ID of the fine-tune job to get events for. 
Boolean stream = false; // Boolean | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
try {
    ListFineTuneEventsResponse result = apiInstance.listFineTuneEvents(fineTuneId, stream);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#listFineTuneEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **String**| The ID of the fine-tune job to get events for.  |
 **stream** | **Boolean**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to false]

### Return type

[**ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listFineTunes"></a>
# **listFineTunes**
> ListFineTunesResponse listFineTunes()

List your organization&#x27;s fine-tuning jobs 

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
try {
    ListFineTunesResponse result = apiInstance.listFineTunes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#listFineTunes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFineTunesResponse**](ListFineTunesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listModels"></a>
# **listModels**
> ListModelsResponse listModels()

Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
try {
    ListModelsResponse result = apiInstance.listModels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#listModels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListModelsResponse**](ListModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveEngine"></a>
# **retrieveEngine**
> Engine retrieveEngine(engineId)

Retrieves a model instance, providing basic information about it such as the owner and availability.

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
String engineId = "engineId_example"; // String | The ID of the engine to use for this request 
try {
    Engine result = apiInstance.retrieveEngine(engineId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#retrieveEngine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String**| The ID of the engine to use for this request  |

### Return type

[**Engine**](Engine.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveFile"></a>
# **retrieveFile**
> OpenAIFile retrieveFile(fileId)

Returns information about a specific file.

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
String fileId = "fileId_example"; // String | The ID of the file to use for this request
try {
    OpenAIFile result = apiInstance.retrieveFile(fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#retrieveFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **String**| The ID of the file to use for this request |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveFineTune"></a>
# **retrieveFineTune**
> FineTune retrieveFineTune(fineTuneId)

Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
String fineTuneId = "fineTuneId_example"; // String | The ID of the fine-tune job 
try {
    FineTune result = apiInstance.retrieveFineTune(fineTuneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#retrieveFineTune");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **String**| The ID of the fine-tune job  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="retrieveModel"></a>
# **retrieveModel**
> Model retrieveModel(model)

Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```java
// Import classes:
//import org.clockwork.openai.handler.ApiException;
//import org.clockwork.openai.handler.OpenAiApi;


OpenAiApi apiInstance = new OpenAiApi();
String model = "model_example"; // String | The ID of the model to use for this request
try {
    Model result = apiInstance.retrieveModel(model);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenAiApi#retrieveModel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **String**| The ID of the model to use for this request |

### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

