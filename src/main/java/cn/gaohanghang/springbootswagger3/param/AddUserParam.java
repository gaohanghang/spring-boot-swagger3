package cn.gaohanghang.springbootswagger3.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "新增用户参数")
public class AddUserParam {

	@ApiModelProperty(value="ID")
	private String id;

	@ApiModelProperty(value="名称")
	private String name;

	@ApiModelProperty(value="年龄")
	private int age;

}
