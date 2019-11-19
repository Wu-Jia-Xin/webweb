package edu.swjtuhc.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.service.UserService;

//JSON 格式
//RESTful 风格
@RestController  // 纯粹的数据格式
@RequestMapping("/user")
public class UserController {
  @Autowired
  UserService userService;
  
}
