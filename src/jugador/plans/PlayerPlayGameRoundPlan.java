package jugador.plans;
import jadex.runtime.*;

/**
 *  This plan is executed for every game round.
 */
public class PlayerPlayGameRoundPlan extends Plan
{
    /**
     *  Execute a plan.
     */
    public void body()
    {
        System.out.println("hola mundo, recibido el turno");
        getLogger().info("waiting round...");
    }

}
