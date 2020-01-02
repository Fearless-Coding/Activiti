package com.java;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.jupiter.api.Test;

public class ActivitiTest {

	@Test
	public void create() {
		ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
		/**
		 * 	创建数据库连接
		 *   protected String jdbcDriver = "org.h2.Driver";
		 *   protected String jdbcUrl = "jdbc:h2:tcp://localhost/~/activiti";
		 *   protected String jdbcUsername = "sa";
		 *   protected String jdbcPassword = "";
		 */
		processEngineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");
		processEngineConfiguration.setJdbcUrl("jdbc:mysql://localhost:3306/activiti");
		processEngineConfiguration.setJdbcUsername("root");
		processEngineConfiguration.setJdbcPassword("root");
		
		
		/**
		 *   public static final String DB_SCHEMA_UPDATE_FALSE = "false";   不能自动创建需要表存在
		 *   public static final String DB_SCHEMA_UPDATE_CREATE_DROP = "create-drop";    先删除表再创建表
		 *   public static final String DB_SCHEMA_UPDATE_TRUE = "true";    如果表不存在自动创建表
		 */
		processEngineConfiguration.setDatabaseSchemaUpdate(processEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
		
		/**
		 * 
		 * 创建工作流核心对象
		 * processEngine
		 * 
		 */
		ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
		
		System.out.println("processEngine=" + processEngine);
		
	}
	
	
	
	
}
