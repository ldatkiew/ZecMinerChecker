package com.lda.checker.business;

import java.io.IOException;

import org.springframework.stereotype.Component;

@Component
public class Restarter {

	
	public void restart()
	{
		    String shutdownCommand = "shutdown.exe -r -t 0";;
		    try {
				Runtime.getRuntime().exec(shutdownCommand);
			} catch (IOException e) {
				e.printStackTrace();
			}
		    System.exit(0);
	}
	
	
/*	 // Create Runtime object
	 Runtime r=Runtime.getRuntime();

	 // Shutdown system
	 r.exec("shutdown -s");

	 // Restart system
	 r.exec("shutdown -r");

	 // Shutdown after specific time (here 60 seconds)
	 r.exec("shutdown -s -t 60");

	 // Restart after specific time (here 60 seconds)
	 r.exec("shutdown -r -t 60");*/
	
/*    String shutdownCommand;
    String operatingSystem = System.getProperty("os.name");
    
    System.out.println(operatingSystem);

//    if ("Linux".equals(operatingSystem) || "Mac OS X".equals(operatingSystem)) {
//        shutdownCommand = "shutdown -h now";
//    }
//    else if ("Windows".equals(operatingSystem)) {
//        shutdownCommand = "shutdown.exe -r -t 0";
//    }
//    else {
//        throw new RuntimeException("Unsupported operating system.");
//    }

//    try {
//		Runtime.getRuntime().exec(shutdownCommand);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//    System.exit(0);
*/}
