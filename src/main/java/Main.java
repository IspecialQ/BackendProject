import api.*;
import db.dao.CategoriesMapper;
import db.dao.ProductsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import db.dao.CategoriesMapper;
import db.dao.ProductsMapper;
import db.model.Categories;
import db.model.Products;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        //SpoonaccularService spoonaccularService = new SpoonaccularService();
        //ApiSearchResult recipes = spoonaccularService.findRecipes("Bread", 3);
        //System.out.println(recipes);

        //ApiUserConnectResult connectResult = spoonaccularService.connect(new ApiUserConnectRequest());
        //System.out.println(connectResult);

        //GetEmptyItemsResult getEmptyItemsResult = spoonaccularService.getEmptyItems(connectResult.getUsername(), connectResult.getHash());
        //System.out.println(getEmptyItemsResult);

        //ApiAddToShoppingListResult apiAddToShoppingListResult = spoonaccularService.apiAddToShoppingListResult(new ApiAddToShoppingListRequest(),
        //        connectResult.getUsername(),
        //        connectResult.getHash());
        //System.out.println(apiAddToShoppingListResult);
        //тут почему то происходит ошибка авторизации и не понял как передать нужное боди

        //ApiDeleteObjectResult apiDeleteObjectResult = spoonaccularService.apiDeleteObjectResult(connectResult.getUsername(),
        //        apiAddToShoppingListResult.getId(),
        //        connectResult.getHash());
        //System.out.println(apiDeleteObjectResult);
        //а это по идее должно работать но изза ошибки автоизации не узнаю этого

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
                .build(Resources.getResourceAsStream("myBatisConfig.xml"));

        try (SqlSession session = sessionFactory.openSession()) {
            ProductsMapper productsMapper = session.getMapper(ProductsMapper.class);
            CategoriesMapper categoriesMapper = session.getMapper(CategoriesMapper.class);
            productsMapper.deleteByPrimaryKey(1382L);
            Products product = productsMapper.selectByPrimaryKey(1382L);
            System.out.println(product);
        }
    }
}
