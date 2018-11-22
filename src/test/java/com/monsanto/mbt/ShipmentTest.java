package com.monsanto.mbt;


import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import junit.framework.Assert;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class ShipmentTest {
	List<Widget> TestList = new ArrayList<>();
	
    @Test
    public void testShipment_Sorted_By_Color(){
    	TestList.add(new Widget(1, "Red", WidgetUtils.stringToDateConverter("01-01-2006")));
    	TestList.add(new Widget(3, "Red",  WidgetUtils.stringToDateConverter("03-09-2006")));
    	TestList.add(new Widget(9, "Red",  WidgetUtils.stringToDateConverter("09-01-2005")));
	    TestList.add(new Widget(2, "Blue",  WidgetUtils.stringToDateConverter("02-03-2007")));
	    TestList.add(new Widget(6, "Blue", WidgetUtils.stringToDateConverter( "06-02-2016")));
	    TestList.add(new Widget(8, "Blue",  WidgetUtils.stringToDateConverter("08-02-2009")));
	    TestList.add(new Widget(10, "Blue",  WidgetUtils.stringToDateConverter("01-03-2013")));
	    TestList.add(new Widget(4, "Green", WidgetUtils.stringToDateConverter( "04-01-2009")));
	    TestList.add(new Widget(5, "Green",  WidgetUtils.stringToDateConverter("05-07-2011")));
	    TestList.add(new Widget(7, "Green",  WidgetUtils.stringToDateConverter("07-01-2008")));
    	List<Widget> a = WidgetUtils.getSampleWidgets();
    	a = Shipment.testShipment_Sorted_By_Color(a);
    	/*for(Widget x: a){
    		System.out.println(x.getSerialNumber());
    	}*/
    	for(int i = 0;i<10;i++){
    		Assert.assertEquals(TestList.get(i).getSerialNumber(), a.get(i).getSerialNumber());
    	}
    }

    @Test
    public void testShipment_Sorted_By_Date(){
    	TestList.add(new Widget(9, "Red",  WidgetUtils.stringToDateConverter("09-01-2005")));
		TestList.add(new Widget(1, "Red", WidgetUtils.stringToDateConverter("01-01-2006")));
		TestList.add(new Widget(3, "Red",  WidgetUtils.stringToDateConverter("03-09-2006")));
	    TestList.add(new Widget(2, "Blue",  WidgetUtils.stringToDateConverter("02-03-2007")));
	    TestList.add(new Widget(7, "Green",  WidgetUtils.stringToDateConverter("07-01-2008")));
	    TestList.add(new Widget(4, "Green", WidgetUtils.stringToDateConverter( "04-01-2009")));
	    TestList.add(new Widget(8, "Blue",  WidgetUtils.stringToDateConverter("08-02-2009")));
	    TestList.add(new Widget(5, "Green",  WidgetUtils.stringToDateConverter("05-07-2011")));
	    TestList.add(new Widget(10, "Blue",  WidgetUtils.stringToDateConverter("01-03-2013")));
	    TestList.add(new Widget(6, "Blue", WidgetUtils.stringToDateConverter( "06-02-2016")));
    	List<Widget> a = WidgetUtils.getSampleWidgets();
    	a = Shipment.testShipment_Sorted_By_Date(a);
    	for(int i = 0;i<10;i++){
    		Assert.assertEquals(TestList.get(i).getSerialNumber(), a.get(i).getSerialNumber());
    	}
    }


}
