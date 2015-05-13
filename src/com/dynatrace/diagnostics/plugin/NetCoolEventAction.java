
 /**
  * This template file was generated by dynaTrace client.
  * The dynaTrace community portal can be found here: http://community.compuwareapm.com/
  * For information how to publish a plugin please visit http://community.compuwareapm.com/plugins/contribute/
  **/ 

package com.dynatrace.diagnostics.plugin;

import com.dynatrace.diagnostics.pdk.*;
import java.util.logging.Logger;


public class NetCoolEventAction implements Action {

	private static final Logger log = Logger.getLogger(NetCoolEventAction.class.getName());

	/**
	 * Initializes the Action Plugin. This method is always 
	 * called before <tt>execute</tt>.
	 * If the returned status is <tt>null</tt> or the status code is a
	 * non-success code then <tt>execute</tt> will not be called.
	 *
	 * @param env the configured <tt>ActionEnvironment</tt> for this Plugin;
	 *            <b>does not contain any incidents</b>
	 * @see Plugin#teardown()
	 * @return a <tt>Status</tt> object that describes the result of the
	 *         method call
	 * @throws Exception
	 */
	@Override
	public Status setup(ActionEnvironment env) throws Exception {
		// TODO
		return new Status(Status.StatusCode.Success);
	}

	/**
	 * Executes the Action Plugin to process incidents.
	 *
	 * <p>
	 * This method is called at the scheduled intervals, but only if incidents
	 * occurred in the meantime. If the Plugin execution takes longer than the
	 * schedule interval, subsequent calls to
	 * {@link #execute(ActionEnvironment)} will be skipped until this method
	 * returns. After the execution duration exceeds the schedule timeout,
	 * {@link TaskEnvironment#isStopped()} will return <tt>true</tt>. In this
	 * case execution should be stopped as soon as possible. If the Plugin
	 * ignores {@link TaskEnvironment#isStopped()} or fails to stop execution in
	 * a reasonable timeframe, the execution thread will be stopped ungracefully
	 * which might lead to resource leaks!
	 *
	 * @param env
	 *            a <tt>ActionEnvironment</tt> object that contains the Plugin
	 *            configuration and incidents
	 * @return a <tt>Status</tt> object that describes the result of the
	 *         method call
	 */	@Override
	public Status execute(ActionEnvironment env) throws Exception {
		/*
		// this sample shows how to receive and act on incidents
		Collection<Incident> incidents = env.getIncidents();
		for (Incident incident : incidents) {
			String message = incident.getMessage();
			log.info("Incident " + message + " triggered.");
			for (Violation violation : incident.getViolations()) {
				log.info("Measure " + violation.getViolatedMeasure().getName() + " violoated threshold.");
			}
		}
		*/
		return new Status(Status.StatusCode.Success);
	}
	/**
	 * Shuts the Plugin down and frees resources. This method is called either way
	 * if the Action setup/execution has failed or was successful.
	 *
	 * @see Action#setup(ActionEnvironment)
	 */
	@Override
	public void teardown(ActionEnvironment env) throws Exception {
		// TODO
	}
}
