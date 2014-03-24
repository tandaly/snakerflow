/* Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.snaker.engine.job;

import java.util.Map;

import org.quartz.JobExecutionException;

/**
 * 提醒的job
 * @author yuqs
 * @since 1.4
 */
public class ReminderJob extends AbstractJob {
	public void exec(String id, Map<String, Object> args) 
			throws JobExecutionException {
		
	}
}
