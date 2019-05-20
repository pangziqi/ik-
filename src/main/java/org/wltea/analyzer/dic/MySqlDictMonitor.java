package org.wltea.analyzer.dic;

import org.apache.logging.log4j.Logger;
import org.elasticsearch.common.logging.ESLoggerFactory;

public class MySqlDictMonitor implements Runnable{

	private static final Logger logger = ESLoggerFactory.getLogger(MySqlDictMonitor.class.getName());
	
	@Override
	public void run() {
		logger.info("reloading ext dict and stop dict from mysql....");
		Dictionary.getSingleton().reLoadMySqlDict();
	}

}
