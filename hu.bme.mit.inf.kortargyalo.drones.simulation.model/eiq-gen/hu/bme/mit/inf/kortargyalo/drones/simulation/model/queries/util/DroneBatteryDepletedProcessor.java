package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.DroneBatteryDepletedMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.droneBatteryDepleted pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DroneBatteryDepletedProcessor implements IMatchProcessor<DroneBatteryDepletedMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDrone the value of pattern parameter drone in the currently processed match
   * 
   */
  public abstract void process(final DroneInstance pDrone);
  
  @Override
  public void process(final DroneBatteryDepletedMatch match) {
    process(match.getDrone());
  }
}
