package day13_inheritance_tasks.states;

import java.util.logging.StreamHandler;

public class State {

    private String name;
    private String abbreviation;
    private String politicalParty;
    private String governor;
    private String senator;
    private int population;

    public State(String name, String abbreviation, String politicalParty,
                 String governor, String senator, int population) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isBlank()|| name.isEmpty()){
            throw new IllegalArgumentException("Can't be null, empty, or blank");
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation==null || abbreviation.isBlank()|| abbreviation.isEmpty()){
            throw new IllegalArgumentException("Can't be null, empty, or blank");
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty==null || politicalParty.isBlank()|| politicalParty.isEmpty()){
            throw new IllegalArgumentException("Can't be null, empty, or blank");
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if(governor==null || governor.isBlank()|| governor.isEmpty()){
            throw new IllegalArgumentException("Can't be null, empty, or blank");
        }
        this.governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(senator==null || senator.isBlank()|| senator.isEmpty()){
            throw new IllegalArgumentException("Can't be null, empty, or blank");
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population<=0){
            throw new IllegalArgumentException("Can't be zero or negative");
        }
        this.population = population;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
