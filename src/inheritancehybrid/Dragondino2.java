package inheritancehybrid;

public class Dragondino2 extends Dragondino {
protected String abilityname;
protected String abilitydescription;

public Dragondino2(String species, String consumptiontype, boolean canbreathfire, boolean hasheatresistance,
int noofwings, int noofscales, boolean canfly, String abilityname, String abilitydescription) {
super(species, consumptiontype, canbreathfire, hasheatresistance, noofwings, noofscales, canfly);
this.abilityname = abilityname;
this.abilitydescription = abilitydescription;
}

public void displaydinoability()
{
System.out.println("Ability Name:"+abilityname);
System.out.println("Ability Description:"+abilitydescription);
}
}
