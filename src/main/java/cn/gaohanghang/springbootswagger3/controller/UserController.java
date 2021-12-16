package cn.gaohanghang.springbootswagger3.controller;


import cn.gaohanghang.springbootswagger3.dto.UserDto;
import cn.gaohanghang.springbootswagger3.param.AddUserParam;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@Api(tags = {" 用户接口 "})
@RestController
public class UserController {

    @ApiOperation(value = "查询用户")
    @GetMapping("/user")
    public UserDto getUser(@RequestParam("id") String id) {
        return new UserDto();
    }

    @ApiOperation(value = "新增用户")
    @PostMapping("/user")
    public UserDto addUser(@RequestBody AddUserParam param) {
        System.err.println(param.getName());
        return new UserDto();
    }

}
