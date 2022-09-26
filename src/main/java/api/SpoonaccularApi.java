package api;

import retrofit2.Call;
import retrofit2.http.*;

public interface SpoonaccularApi {

    @GET("/recipes/complexSearch")
    Call<ApiSearchResult> findRecipes(
            @Query("apiKey") String apiKey,
            @Query("query") String query,
            @Query("number") Integer number);

    @POST("/users/connect")
    Call<ApiUserConnectResult> connect(@Body ApiUserConnectRequest request, @Query("apiKey") String apiKey);

    @GET("/mealplanner/{username}/shopping-list")
    Call<GetEmptyItemsResult> getEmptyItems(@Path("username") String username, @Query("hash") String hash, @Query("apiKey") String apiKey);

    @POST("/mealplanner/{username}/shopping-list/items")
    Call<ApiAddToShoppingListResult> addToList (@Body ApiAddToShoppingListRequest request,
                                                @Path("username") String username,
                                                @Query("apiKey") String apiKey,
                                                @Query("hash") String hash);

    Call<ApiDeleteObjectResult> deleteObject (@Path("username") String username,
                                              @Path("id") Long id,
                                              @Query("hash") String hash,
                                              @Query("apiKey") String apiKey
                                              );


}
