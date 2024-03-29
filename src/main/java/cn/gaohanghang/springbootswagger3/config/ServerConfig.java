package cn.gaohanghang.springbootswagger3.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Description 控制台输出 Swagger 接口文档地址
 * @Author Gao Hang Hang
 * @Date 2019-12-11 01:09
 **/
@Component
@Slf4j
public class ServerConfig implements ApplicationListener<WebServerInitializedEvent> {

    private int serverPort;

    public int getPort() {
        return this.serverPort;
    }

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        try {
            // 获取IP地址
            InetAddress inetAddress = Inet4Address.getLocalHost();
            // 获取端口号
            this.serverPort = event.getWebServer().getPort();
            log.info("项目启动启动成功！接口文档地址: http://"+inetAddress.getHostAddress()+":"+serverPort+"/swagger-ui/index.html");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
