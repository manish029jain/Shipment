package com.monsanto.mbt;

import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Date;


public class Shipment {
	

     public static List<Widget> testShipment_Sorted_By_Date(List<Widget> a){
    	 List<Widget> res = new ArrayList<>();
    	 if(a.size()>10){
    		 res = a.subList(0, 10);
    	 }
    	  Collections.sort(res,new Comparator<Widget>(){
    		  public int compare(Widget w1,Widget w2){
    			  Date d1 =  w1.getProductionDate();
    			  Date d2 =  w2.getProductionDate();
    			  return d1.compareTo(d2);
    		  }
    	  });
    	  return res;
     }

     public static List<Widget> testShipment_Sorted_By_Color(List<Widget> a){
    	 List<Widget> res = new ArrayList<>();
    	 if(a.size()>10){
    		 res = a.subList(0, 10);
    	 }
   	  Collections.sort(res,new Comparator<Widget>(){
   		  public int compare(Widget w1,Widget w2){
   			  String c1 = w1.getColor();
   			  String c2 = w2.getColor();
   			  int a ,b;
   			  if(c1.equals("Red"))
   				  a = 1;
   			  else if(c1.equals("Blue"))
   				  a = 2;
   			  else
   				  a = 3;
   			if(c2.equals("Red"))
 				  b = 1;
 			  else if(c2.equals("Blue"))
 				  b = 2;
 			  else
 				  b = 3;
   			if(a == b){
   				return w1.getSerialNumber() - w2.getSerialNumber();
   			}
   			  return a-b;
   		  }
   	  });
   	  return res;
    }
}
