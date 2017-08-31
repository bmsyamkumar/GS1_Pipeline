package com.web.poc.script;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.web.automation.accelerators.TestEngineWeb;
import com.web.automation.fileutils.ExcelReader;
import com.web.automation.logs.ExtentLogs;
import com.web.automation.utilities.CommonVariables;


public class GS1_PipeLine  {

	@Test(description = "GS1", groups = { "smoke", "regression" })
	@Parameters("Counter")
	public void GS1_PipeLine(String Counter) throws Throwable {
	
		for(int i=0;i< Integer.valueOf(Counter);i++)
		{
			Thread.sleep(2000);
			System.out.println("Process " + (i+1) + " is Completed");
		}
		
	
}
}
