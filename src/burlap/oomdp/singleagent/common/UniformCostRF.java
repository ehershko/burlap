package burlap.oomdp.singleagent.common;

import burlap.oomdp.core.State;
import burlap.oomdp.singleagent.GroundedAction;
import burlap.oomdp.singleagent.RewardFunction;


/**
 * Defines a reward function that always returns -1.
 * @author James MacGlashan
 *
 */
public class UniformCostRF implements RewardFunction {

	
	public UniformCostRF(){
		
	}
	
	@Override
	public double reward(State s, GroundedAction a, State sprime) {
		return -1;
	}

}
