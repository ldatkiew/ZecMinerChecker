package com.lda.checker.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lda.checker.domain.MinerStat;

@Component
public class Checker {

	@Autowired
	private ZecMinerApiReader zmar;

	public boolean check() {
		MinerStat minerStat = zmar.readApi();
		return minerStat.isAllWorking();
	}
}
