package com.java;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.jupiter.api.Test;

public class ActivitiTest {

	@Test
	public void create() {
		ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
		/**
		 * 	�������ݿ�����
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
		 *   public static final String DB_SCHEMA_UPDATE_FALSE = "false";   �����Զ�������Ҫ�����
		 *   public static final String DB_SCHEMA_UPDATE_CREATE_DROP = "create-drop";    ��ɾ�����ٴ�����
		 *   public static final String DB_SCHEMA_UPDATE_TRUE = "true";    ����������Զ�������
		 */
		processEngineConfiguration.setDatabaseSchemaUpdate(processEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
		
		/**
		 * 
		 * �������������Ķ���
		 * processEngine
		 * 
		 */
		ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
		
		System.out.println("processEngine=" + processEngine);
		
	}
	
	
	
	
}
