package partida.plans;

import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.SearchConstraints;
import jadex.adapter.fipa.ServiceDescription;
import jadex.runtime.*;


public class CompletarJugadoresPlan extends Plan
{
	//-------- methods --------
	
	/**
	 *  Plan body.
	 */
	public void body()
	{
		ServiceDescription sd = new ServiceDescription();
		//sd.setType("jugador"); // TODO <- pasar esto como param
		sd.setName("jugador");
		AgentDescription adesc = new AgentDescription();
		adesc.addService(sd);
		SearchConstraints sc = new SearchConstraints();
		sc.setMaxResults(-1);
		IGoal busqueda = createGoal("df_search");
		busqueda.getParameter("description").setValue(adesc);
		busqueda.getParameter("constraints").setValue(sc);
		dispatchSubgoalAndWait(busqueda);
		AgentDescription[] result =(AgentDescription[])busqueda.getParameterSet("result").getValues();
		int numJugs= result.length;
		System.out.println(numJugs+" jugadores casa encontrados, requeridos 6");
		getBeliefbase().getBelief("jugador").setFact(numJugs);
	}

}
