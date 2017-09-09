package com.gaurav.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Service
//@Repository
@Controller
public class Circle implements Shape, ApplicationEventPublisherAware{

	private Point center;
	private MessageSource messageSource;
	private ApplicationEventPublisher publisher;
	
	
	public MessageSource getMessageSource() {
		return messageSource;
	}
	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void initializeCircle()
	{
		System.out.println("initializeCircle Points");
	}

	@PreDestroy
	public void DestroyCircle()
	{
		System.out.println("DestroyCircle Points");
	}

	
	public void draw()
	{		
		System.out.println(this.messageSource.getMessage("draw",new Object[] { center.getX(), center.getY()},"Default message",null));
		System.out.println(this.messageSource.getMessage("msg",null,"Default message",null));
		DrawEvent draw = new DrawEvent(this);
		publisher.publishEvent(draw);
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
	}
	
}
