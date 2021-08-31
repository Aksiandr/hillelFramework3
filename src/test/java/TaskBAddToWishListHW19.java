import org.testng.Assert;
import org.testng.annotations.Test;
import page.ShopDemoQaHeader;
import page.ShopDemoQaMain;
import page.ShopDemoQaWishList;

public class TaskBAddToWishListHW19 extends BaseTest {

    @Test
    public void addProductToWishList() {

        getWebDriver().get("https://shop.demoqa.com/");
        ShopDemoQaMain mainPage = new ShopDemoQaMain(getWebDriver());
        ShopDemoQaHeader header = new ShopDemoQaHeader(getWebDriver());
        ShopDemoQaWishList wishList = new ShopDemoQaWishList(getWebDriver());

        mainPage.setHovertokioDress();
        mainPage.setAddTokioToWishList();
        header.setWishList();
        Assert.assertTrue(wishList.isProductName("TOKYO TALKIES"));
    }
}
