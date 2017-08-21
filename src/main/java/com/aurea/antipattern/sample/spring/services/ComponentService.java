package com.aurea.antipattern.sample.spring.services;

import org.springframework.stereotype.Service;

import com.aurea.antipattern.sample.spring.bean.Component;
import com.aurea.antipattern.sample.spring.helper.ComponentHelper;
import com.aurea.antipattern.sample.spring.repository.ComponentRepository;

@Service
public class ComponentService {

  private ComponentHelper helper;
  private ComponentRepository compomentRepository;
  

  public void setHelper(ComponentHelper helper) {
    this.helper = helper;
  }

  public ComponentHelper getHelper() {
    return helper;
  }

  public String getComponentDetails(String component) {
    return helper.findComponentDetails(component);
  }

  public void saveComponent(Component component) {
	  compomentRepository.save(component); 
  }

}
