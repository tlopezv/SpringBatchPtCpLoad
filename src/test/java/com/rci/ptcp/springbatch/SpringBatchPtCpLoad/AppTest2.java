package com.rci.ptcp.springbatch.SpringBatchPtCpLoad;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest2 {
	
	@Test
    public void runTest(){
		
		App.getSingletonInstance().launch();
        assertTrue( true );
        
        App.getSingletonInstance().launch();
        assertTrue( true );
	}

}
