package api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiAddToShoppingListResult {
    private Long id;
    private String name;
    private Object measures;
    private List<ApiSearchResultItem> usages;
    private List<ApiSearchResultItem> usageRecipeIds;
    private Boolean pantryItem;
    private String aisle;
    private Long cost;
    private Long ingredientId;
}
