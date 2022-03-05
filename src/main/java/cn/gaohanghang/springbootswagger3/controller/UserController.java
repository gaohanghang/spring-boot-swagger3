package cn.gaohanghang.springbootswagger3.controller;


import cn.gaohanghang.springbootswagger3.dto.UserDto;
import cn.gaohanghang.springbootswagger3.model.User;
import cn.gaohanghang.springbootswagger3.param.AddUserParam;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {" 用户接口 "})
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    @ApiOperation("查询方法")
    public String getAll() {
        return "getAll";
    }

    @ApiOperation(value = "查询用户")
    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable("id") String id) {
        return new UserDto();
    }

    @ApiOperation(value = "新增用户")
    @PostMapping
    public UserDto addUser(@RequestBody AddUserParam param) {
        System.err.println(param.getName());
        return new UserDto();
    }

    @PutMapping
    @ApiOperation("修改")
    public String update(User user) {
        return "update";
    }

    @DeleteMapping
    @ApiOperation("删除")
    public String delete() {
        return "delete";
    }

    @RequestMapping(path = "/findTaskSeriesByIds", method = RequestMethod.POST)
    public String findTaskSeriesByIds(@RequestBody List<Long> taskIds){
        System.out.println(taskIds);
        return "哈哈";
    }

}
