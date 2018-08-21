package cn.org.scrooged.continent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BlogApplication {

    private static Logger logger = LoggerFactory.getLogger(BlogApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(BlogApplication.class, args);

        logger.info("==========  服务启动成功  ==========");
    }
}


