package com.java;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.jupiter.api.Test;

public class ActivitiTest {

	@Test
	public void create() {
		ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti-custom-context.xml");
	
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
