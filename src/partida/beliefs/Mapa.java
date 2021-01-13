package partida.beliefs;

import jadex.adapter.fipa.AgentIdentifier;

public class Mapa
{
    protected AgentIdentifier human;
    protected int beers;

    public Mapa() {}

    public AgentIdentifier getId()
    {
        return human;
    }
    public int getBeers()
    {
        return beers;
    }
    public void setBeers(int b)
    {
        this.beers=b;
    }
    public void setId(AgentIdentifier h)
    {
        this.human=h;
    }

    @Override
    public String toString() {
        return "Mapa{" +
                "human=" + human +
                ", beers=" + beers +
                '}';
    }
}