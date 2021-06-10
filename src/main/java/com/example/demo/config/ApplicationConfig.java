package com.example.demo.config;


import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.jolbox.bonecp.BoneCPDataSource;

@Configuration
//@EnableTransactionManagement
@MapperScan("com.example.demo.dao")
public class ApplicationConfig 
{

	@Value("${spring.datasource.url}")
	private String dbUrl;
	
	@Value("${spring.datasource.username}")
	private String dbUserName;
	
	@Value("${spring.datasource.password}")
	private String dbPassword;

    @Value("${spring.datasource.driverClass}")
    private String driverClass;

    @Value("${spring.datasource.idleMaxAgeInMinutes}")
    private Integer idleMaxAgeInMinutes;

    @Value("${spring.datasource.idleConnectionTestPeriodInMinutes}")
    private Integer idleConnectionTestPeriodInMinutes;

    @Value("${spring.datasource.maxConnectionsPerPartition}")
    private Integer maxConnectionsPerPartition;

    @Value("${spring.datasource.minConnectionsPerPartition}")
    private Integer minConnectionsPerPartition;

    @Value("${spring.datasource.partitionCount}")
    private Integer partitionCount;

    @Value("${spring.datasource.acquireIncrement}")
    private Integer acquireIncrement;

    @Value("${spring.datasource.statementsCacheSize}")
    private Integer statementsCacheSize;
	
	
    @Bean(destroyMethod = "close")
	public DataSource dataSource() {
		
        BoneCPDataSource dataSource = new BoneCPDataSource();
        dataSource.setDriverClass(driverClass);
        dataSource.setJdbcUrl(dbUrl);
        dataSource.setUsername(dbUserName);
        dataSource.setPassword(dbPassword);
        dataSource.setIdleConnectionTestPeriodInMinutes(idleConnectionTestPeriodInMinutes);
        dataSource.setIdleMaxAgeInMinutes(idleMaxAgeInMinutes);
        dataSource.setMaxConnectionsPerPartition(maxConnectionsPerPartition);
        dataSource.setMinConnectionsPerPartition(minConnectionsPerPartition);
        dataSource.setPartitionCount(partitionCount);
        dataSource.setAcquireIncrement(acquireIncrement);
        dataSource.setStatementsCacheSize(statementsCacheSize);
		
		return dataSource;
	}
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}	
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setTypeAliasesPackage("com.example.demo.entity");
		return sessionFactory;
	}
}

