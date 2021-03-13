package qa.util;

import org.openqa.selenium.WebElement; 

public class SeleniumUtil {

public static boolean isDisplayed(WebElement ele) {
       try {
             if(ele!=null && ele.isDisplayed()){
                return true;
          }
      }catch(Exception e) {
          return false;
          }
   
       return false;
}

}