package com.douhuitao.java.designMode.jiegouxingmoshi.flyweight;

import java.util.HashMap;
import java.util.Map;

import com.douhuitao.java.designMode.jiegouxingmoshi.flyweight.impl.ConcreteWebsite;

public class WebsiteFactory {
     private static Map flyweights=new HashMap<String,Website>();
     public static Website getWebsite(String key){
    	    if(!flyweights.containsKey(key)){
    	    	flyweights.put(key, new ConcreteWebsite(key));
    	    }
    		return (Website)flyweights.get(key);
     }
     public int getWebsiteSize(){
    	 return flyweights.size();
     }
}
