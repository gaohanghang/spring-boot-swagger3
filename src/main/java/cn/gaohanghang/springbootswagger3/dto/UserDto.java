package cn.gaohanghang.springbootswagger3.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "用户信息")
public class UserDto {

	@ApiModelProperty(value="ID")
	private String id;

	@ApiModelProperty(value="名称")
	private String name;

}
