package br.com.ATS.Controller.Users;

import br.com.ATS.Model.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.ATS.Service.User.UserTypeService;
import java.util.List;
@RestController
public class UserController {

    @Autowired
    private UserTypeService userTypeService;

    @GetMapping("/userType")
    public List<UserType> findAll() {
        return userTypeService.getAllUserTypes();
    }
}
