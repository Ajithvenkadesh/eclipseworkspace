package com.mycompany.cool.project.impl;
  
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
  
@Component
public class MyFirstComponent {
    public EventAdmin eventAdmin;
    public volatile boolean doRun;
    
    @Activate
    public void activate() {
       System.out.println ("start");
    }
  
    public void doIt() {
    	 System.out.println ("started");
    }
    
    @Deactivate
    public void deactivate() {
    	 System.out.println ("end ");
    }
}