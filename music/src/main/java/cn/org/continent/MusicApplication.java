package cn.org.continent;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Design By Scrooged
 * @version 1.0
 * @description
 * @date 2018/8/23 16:08
 */
@MapperScan(basePackages = {"cn.org.continent.mapper"})
@SpringBootApplication
public class MusicApplication {
    private static Logger logger = LoggerFactory.getLogger(MusicApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(MusicApplication.class, args);

        logger.info("==========  服务启动成功  ==========");
    }
}
