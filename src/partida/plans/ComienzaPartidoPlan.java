package partida.plans;

import jadex.adapter.fipa.SFipa;
import jadex.examples.blackjack.RequestBet;
import jadex.runtime.*;


public class ComienzaPartidoPlan extends Plan
{
	//-------- methods --------
	
	/**
	 *  Plan body.
	 */
	public void body()
	{
		System.out.println("ya somos suficientes para jugar!!!");

		RequestBet rb = new RequestBet();
		IMessageEvent	msg	= createMessageEvent("play_round_req");
		msg.setContent(rb);
		//msg.getParameterSet(SFipa.RECEIVERS).addValue(new BasicAgentIdentifier("player"));
		IFilter	betmsg	= sendMessage(msg);
		// Ask player for her bet.
		getLogger().info("Asking for bet from player: ");

	}

}
