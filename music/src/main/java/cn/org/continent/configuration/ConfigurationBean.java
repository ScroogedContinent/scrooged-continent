package cn.org.continent.configuration;

import cn.org.continent.util.FieldMetaObjectHandler;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Design By Scrooged
 * @version 1.0
 * @description
 * @date 2018/8/23 22:03
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.baomidou.cloud.service.*.mapper*")
public class ConfigurationBean {
    @Bean
    public FieldMetaObjectHandler getFieldMetaObjectHandler(){
        return new FieldMetaObjectHandler();
    }

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor().setDialectType("mysql");
    }
}
