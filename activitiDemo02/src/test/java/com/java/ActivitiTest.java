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
		 * 创建工作流核心对象
		 * processEngine
		 * 
		 */
		ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
		
		System.out.println("processEngine=" + processEngine);
		
	}
	
	
	
	
}
