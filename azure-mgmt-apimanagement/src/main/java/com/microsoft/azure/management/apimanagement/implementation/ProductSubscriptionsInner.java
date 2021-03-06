/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.apimanagement.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ProductSubscriptions.
 */
public class ProductSubscriptionsInner {
    /** The Retrofit service to perform REST calls. */
    private ProductSubscriptionsService service;
    /** The service client containing this operation class. */
    private ApiManagementClientImpl client;

    /**
     * Initializes an instance of ProductSubscriptionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ProductSubscriptionsInner(Retrofit retrofit, ApiManagementClientImpl client) {
        this.service = retrofit.create(ProductSubscriptionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ProductSubscriptions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ProductSubscriptionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.ProductSubscriptions list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/products/{productId}/subscriptions")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("productId") String productId, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("$top") Integer top, @Query("$skip") Integer skip, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.ProductSubscriptions listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the collection of subscriptions to the specified product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SubscriptionContractInner&gt; object if successful.
     */
    public PagedList<SubscriptionContractInner> list(final String resourceGroupName, final String serviceName, final String productId) {
        ServiceResponse<Page<SubscriptionContractInner>> response = listSinglePageAsync(resourceGroupName, serviceName, productId).toBlocking().single();
        return new PagedList<SubscriptionContractInner>(response.body()) {
            @Override
            public Page<SubscriptionContractInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the collection of subscriptions to the specified product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SubscriptionContractInner>> listAsync(final String resourceGroupName, final String serviceName, final String productId, final ListOperationCallback<SubscriptionContractInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, serviceName, productId),
            new Func1<String, Observable<ServiceResponse<Page<SubscriptionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionContractInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the collection of subscriptions to the specified product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SubscriptionContractInner&gt; object
     */
    public Observable<Page<SubscriptionContractInner>> listAsync(final String resourceGroupName, final String serviceName, final String productId) {
        return listWithServiceResponseAsync(resourceGroupName, serviceName, productId)
            .map(new Func1<ServiceResponse<Page<SubscriptionContractInner>>, Page<SubscriptionContractInner>>() {
                @Override
                public Page<SubscriptionContractInner> call(ServiceResponse<Page<SubscriptionContractInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the collection of subscriptions to the specified product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SubscriptionContractInner&gt; object
     */
    public Observable<ServiceResponse<Page<SubscriptionContractInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String serviceName, final String productId) {
        return listSinglePageAsync(resourceGroupName, serviceName, productId)
            .concatMap(new Func1<ServiceResponse<Page<SubscriptionContractInner>>, Observable<ServiceResponse<Page<SubscriptionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionContractInner>>> call(ServiceResponse<Page<SubscriptionContractInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the collection of subscriptions to the specified product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SubscriptionContractInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SubscriptionContractInner>>> listSinglePageAsync(final String resourceGroupName, final String serviceName, final String productId) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (productId == null) {
            throw new IllegalArgumentException("Parameter productId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        final Integer top = null;
        final Integer skip = null;
        return service.list(resourceGroupName, serviceName, productId, this.client.subscriptionId(), filter, top, skip, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SubscriptionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionContractInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SubscriptionContractInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SubscriptionContractInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists the collection of subscriptions to the specified product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param filter | Field        | Supported operators    | Supported functions                         |
     |--------------|------------------------|---------------------------------------------|
     | id           | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | name         | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | stateComment | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | userId       | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | productId    | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | state        | eq                     |                                             |
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SubscriptionContractInner&gt; object if successful.
     */
    public PagedList<SubscriptionContractInner> list(final String resourceGroupName, final String serviceName, final String productId, final String filter, final Integer top, final Integer skip) {
        ServiceResponse<Page<SubscriptionContractInner>> response = listSinglePageAsync(resourceGroupName, serviceName, productId, filter, top, skip).toBlocking().single();
        return new PagedList<SubscriptionContractInner>(response.body()) {
            @Override
            public Page<SubscriptionContractInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the collection of subscriptions to the specified product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param filter | Field        | Supported operators    | Supported functions                         |
     |--------------|------------------------|---------------------------------------------|
     | id           | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | name         | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | stateComment | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | userId       | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | productId    | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | state        | eq                     |                                             |
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SubscriptionContractInner>> listAsync(final String resourceGroupName, final String serviceName, final String productId, final String filter, final Integer top, final Integer skip, final ListOperationCallback<SubscriptionContractInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, serviceName, productId, filter, top, skip),
            new Func1<String, Observable<ServiceResponse<Page<SubscriptionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionContractInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the collection of subscriptions to the specified product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param filter | Field        | Supported operators    | Supported functions                         |
     |--------------|------------------------|---------------------------------------------|
     | id           | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | name         | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | stateComment | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | userId       | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | productId    | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | state        | eq                     |                                             |
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SubscriptionContractInner&gt; object
     */
    public Observable<Page<SubscriptionContractInner>> listAsync(final String resourceGroupName, final String serviceName, final String productId, final String filter, final Integer top, final Integer skip) {
        return listWithServiceResponseAsync(resourceGroupName, serviceName, productId, filter, top, skip)
            .map(new Func1<ServiceResponse<Page<SubscriptionContractInner>>, Page<SubscriptionContractInner>>() {
                @Override
                public Page<SubscriptionContractInner> call(ServiceResponse<Page<SubscriptionContractInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the collection of subscriptions to the specified product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param productId Product identifier. Must be unique in the current API Management service instance.
     * @param filter | Field        | Supported operators    | Supported functions                         |
     |--------------|------------------------|---------------------------------------------|
     | id           | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | name         | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | stateComment | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | userId       | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | productId    | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | state        | eq                     |                                             |
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SubscriptionContractInner&gt; object
     */
    public Observable<ServiceResponse<Page<SubscriptionContractInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String serviceName, final String productId, final String filter, final Integer top, final Integer skip) {
        return listSinglePageAsync(resourceGroupName, serviceName, productId, filter, top, skip)
            .concatMap(new Func1<ServiceResponse<Page<SubscriptionContractInner>>, Observable<ServiceResponse<Page<SubscriptionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionContractInner>>> call(ServiceResponse<Page<SubscriptionContractInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the collection of subscriptions to the specified product.
     *
    ServiceResponse<PageImpl<SubscriptionContractInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<SubscriptionContractInner>> * @param serviceName The name of the API Management service.
    ServiceResponse<PageImpl<SubscriptionContractInner>> * @param productId Product identifier. Must be unique in the current API Management service instance.
    ServiceResponse<PageImpl<SubscriptionContractInner>> * @param filter | Field        | Supported operators    | Supported functions                         |
     |--------------|------------------------|---------------------------------------------|
     | id           | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | name         | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | stateComment | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | userId       | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | productId    | ge, le, eq, ne, gt, lt | substringof, contains, startswith, endswith |
     | state        | eq                     |                                             |
    ServiceResponse<PageImpl<SubscriptionContractInner>> * @param top Number of records to return.
    ServiceResponse<PageImpl<SubscriptionContractInner>> * @param skip Number of records to skip.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SubscriptionContractInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SubscriptionContractInner>>> listSinglePageAsync(final String resourceGroupName, final String serviceName, final String productId, final String filter, final Integer top, final Integer skip) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (productId == null) {
            throw new IllegalArgumentException("Parameter productId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(resourceGroupName, serviceName, productId, this.client.subscriptionId(), filter, top, skip, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SubscriptionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionContractInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SubscriptionContractInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SubscriptionContractInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SubscriptionContractInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SubscriptionContractInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SubscriptionContractInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists the collection of subscriptions to the specified product.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SubscriptionContractInner&gt; object if successful.
     */
    public PagedList<SubscriptionContractInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<SubscriptionContractInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<SubscriptionContractInner>(response.body()) {
            @Override
            public Page<SubscriptionContractInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the collection of subscriptions to the specified product.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SubscriptionContractInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<SubscriptionContractInner>> serviceFuture, final ListOperationCallback<SubscriptionContractInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<SubscriptionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionContractInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the collection of subscriptions to the specified product.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SubscriptionContractInner&gt; object
     */
    public Observable<Page<SubscriptionContractInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<SubscriptionContractInner>>, Page<SubscriptionContractInner>>() {
                @Override
                public Page<SubscriptionContractInner> call(ServiceResponse<Page<SubscriptionContractInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the collection of subscriptions to the specified product.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SubscriptionContractInner&gt; object
     */
    public Observable<ServiceResponse<Page<SubscriptionContractInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<SubscriptionContractInner>>, Observable<ServiceResponse<Page<SubscriptionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionContractInner>>> call(ServiceResponse<Page<SubscriptionContractInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the collection of subscriptions to the specified product.
     *
    ServiceResponse<PageImpl<SubscriptionContractInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SubscriptionContractInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SubscriptionContractInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SubscriptionContractInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SubscriptionContractInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SubscriptionContractInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SubscriptionContractInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SubscriptionContractInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SubscriptionContractInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SubscriptionContractInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
