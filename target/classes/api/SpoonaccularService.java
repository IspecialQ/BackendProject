package api;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class SpoonaccularService {

    private SpoonaccularApi api;
    private static final String API_KEY = "1c1cc608bf274134842dd396bd93f7e3";

    public SpoonaccularService() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.spoonacular.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(SpoonaccularApi.class);
    }

    public ApiSearchResult findRecipes(String query, Integer number) {
        Call<ApiSearchResult> call = api.findRecipes(API_KEY, query, number);
        return RetrofitUtils.execute(call);
    }

    public ApiUserConnectResult connect(@Body ApiUserConnectRequest request) {
        Call<ApiUserConnectResult> call = api.connect(request, API_KEY);
        return RetrofitUtils.execute(call);
    }

    public GetEmptyItemsResult getEmptyItems(String username, String hash) {
        Call<GetEmptyItemsResult> call = api.getEmptyItems(username, hash, API_KEY);
        return RetrofitUtils.execute(call);
    }

    public ApiAddToShoppingListResult apiAddToShoppingListResult(@Body ApiAddToShoppingListRequest request, String username, String hash) {
        Call<ApiAddToShoppingListResult> call = api.addToList(request, username, hash, API_KEY);
        return RetrofitUtils.execute(call);
    }

    public ApiDeleteObjectResult apiDeleteObjectResult(String username, Long id, String hash) {
        Call<ApiDeleteObjectResult> call = api.deleteObject(username, id, hash, API_KEY);
        return RetrofitUtils.execute(call);
    }
}
