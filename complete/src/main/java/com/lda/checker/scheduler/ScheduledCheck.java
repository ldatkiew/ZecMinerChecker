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

	private static final Logger log = LoggerFactory.getLogger(ScheduledCheck.class);
	
	@Autowired
	private Checker checker;
	
	@Autowired
	private Restarter restarter;
	
	@Scheduled(initialDelay = 300000, fixedRate = 30000)
	public void checkMiner()
	{
		boolean result = checker.check();
		if(result != true)
		{
			log.info("Restarting mashines");
			restarter.restart();
		}
		else
		{
			log.info("All GPU's works");;
		}
	}
}
