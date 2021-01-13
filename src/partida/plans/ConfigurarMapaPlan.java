package partida.plans;

import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.SearchConstraints;
import jadex.adapter.fipa.ServiceDescription;
import jadex.runtime.IGoal;
import jadex.runtime.Plan;
import partida.beliefs.Mapa;


public class ConfigurarMapaPlan extends Plan
{
	//-------- methods --------
	
	/**
	 *  Plan body.
	 */
	public void body()
	{
		Mapa[] mapa = (Mapa[]) getBeliefbase().getBeliefSet("mapa").getFacts()[0];
		System.out.println(mapa);
	}

}
