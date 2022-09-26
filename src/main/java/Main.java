import api.*;


public class Main {
    public static void main(String[] args) {

        SpoonaccularService spoonaccularService = new SpoonaccularService();
        ApiSearchResult recipes = spoonaccularService.findRecipes("Bread", 3);
        System.out.println(recipes);

        ApiUserConnectResult connectResult = spoonaccularService.connect(new ApiUserConnectRequest());
        System.out.println(connectResult);

        GetEmptyItemsResult getEmptyItemsResult = spoonaccularService.getEmptyItems(connectResult.getUsername(), connectResult.getHash());
        System.out.println(getEmptyItemsResult);

        ApiAddToShoppingListResult apiAddToShoppingListResult = spoonaccularService.apiAddToShoppingListResult(new ApiAddToShoppingListRequest(),
                connectResult.getUsername(),
                connectResult.getHash());
        System.out.println(apiAddToShoppingListResult);
        //тут почему то происходит ошибка авторизации и не понял как передать нужное боди

        ApiDeleteObjectResult apiDeleteObjectResult = spoonaccularService.apiDeleteObjectResult(connectResult.getUsername(),
                apiAddToShoppingListResult.getId(),
                connectResult.getHash());
        System.out.println(apiDeleteObjectResult);
        //а это по идее должно работать но изза ошибки автоизации не узнаю этого
    }
}
