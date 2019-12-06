package cn.itsutdies.product.controller;

import cn.itstudies.pojo.User;
import cn.itstudies.service.ProductService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Farewell is well
 * @date 2019-12-03 15:59
 */
@RestController
public class ProductController implements ProductService {

    @Override
    public String showMessage() {
        return "message";
    }

    @Override
    public String showMessage2(String message) {
        return "---"+message+"---";
    }

    @Override
    public String showUser(User user) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return user.getUsername()+"-->"+user.getPassword();
    }

}
