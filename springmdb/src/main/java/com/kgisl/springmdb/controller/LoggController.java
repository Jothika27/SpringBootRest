package com.kgisl.springmdb.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
public class LoggController {
	Logger logger = (Logger) LoggerFactory.getLogger(LoggController.class);

	@RequestMapping("/")
	public String index() {
		logger.trace("A TRACE Message");
		logger.debug("A DEBUG Message");
		logger.info("An INFO Message");
		logger.warn("A WARN Message");
		logger.error("An ERROR Message");

		return "Hey! Check out the Logs to see the output...";
	}
}
