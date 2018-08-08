package com.gaurav.springs;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
			throws BeansException {
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("helloWorld");
		System.out.println("After Initialization using BeanFactoryPostProcessor." + beanDefinition.getDescription());
	}


}
