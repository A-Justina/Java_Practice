package day13_inheritance_tasks.states;

public class Texas extends State{
    public Texas(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
    }
    public void voting(){
        System.out.println(getName() + " is voting for " + getPoliticalParty() + " party.");
    }
}
