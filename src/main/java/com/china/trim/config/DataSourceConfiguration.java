package com.china.trim.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

/**
 * dataSource配置类
 *
 * @author wzryzhw
 */
@Configuration
@MapperScan("com.china.trim.dao")
public class DataSourceConfiguration {
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${dbc.url")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    /**
     * 创建dataSource bean
     * @return
     * @throws PropertyVetoException
     */
    @Bean(name = "dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException{
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDriver);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(jdbcUsername);
        dataSource.setPassword(jdbcPassword);
        //连接池最大线程数
        dataSource.setMaxPoolSize(30);
        //连接池最小线程数
        dataSource.setMinPoolSize(10);
        //关闭连接后不自动提交
        dataSource.setAutoCommitOnClose(false);
        //设置连接超时时间
        dataSource.setCheckoutTimeout(10000);
        //设置连接失败重试次数
        dataSource.setAcquireRetryAttempts(2);
        return dataSource;
    }
}
