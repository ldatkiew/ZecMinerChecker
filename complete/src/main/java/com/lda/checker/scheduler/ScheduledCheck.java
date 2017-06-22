package com.lda.checker.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.lda.checker.business.Restarter;
import com.lda.checker.web.Checker;

@Component
public class ScheduledCheck {

	private static final int NOT_WORKING_LIMIT = 1;

	private static final Logger log = LoggerFactory.getLogger(ScheduledCheck.class);
	
	private int notWorkingCounter = 0;
	
	@Autowired
	private Checker checker;
	
	@Autowired
	private Restarter restarter;
	
//	@Autowired
//	private Environment environment;
	
	@Scheduled(initialDelay = 300000, fixedRate = 30000)
//	@Scheduled(initialDelay = 3000, fixedRate = 5000)
	public void checkMiner()
	{
//		log.info(environment.getProperty("logging.file"));
		
		boolean result = checker.check();
		if(result != true)
		{
			notWorkingCounter++;
			log.info("Something went wrong for: " + notWorkingCounter + " time(s)");
		}
		else
		{
			log.info("All GPU's works");;
		}
		
		if(notWorkingCounter > NOT_WORKING_LIMIT)
		{
			log.info("Restarting mashines");
			restarter.restart();
		}
	}
}
