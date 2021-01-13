package tablero.plans;

import jadex.runtime.*;
import jadex.adapter.fipa.*;


public class CompletarJugadoresPlan extends Plan
{
	//-------- methods --------
	
	/**
	 *  Plan body.
	 */
	public void body()
	{
		ServiceDescription sd = new ServiceDescription();
		// ?? sd.setType("agresivo"); // TODO <- pasar esto como param
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
		int numjugscasa= result.length;
		int numJugadoresActual = Integer.parseInt(getBeliefbase().getBelief("num_jugadores").getFact().toString());
		System.out.println(numjugscasa+" jugadores casa encontrados, requeridos " + numJugadoresActual);
		// INCREMENTS -> getBeliefbase().getBelief("num_jugadores").setFact(++numJugadoresActual);
		//getBeliefbase().getBelief("agresivo").setFact(numjugscasa);
	}

}
