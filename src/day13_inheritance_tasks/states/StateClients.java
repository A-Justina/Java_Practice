package day13_inheritance_tasks.states;

public class StateClients {
    public static void main(String[] args) {

        Texas texas = new Texas("Texas","TX", "Republican", "Greg Abbott", "Ted Cruz",31_000_000);
        System.out.println(texas);
        texas.voting();

        Florida florida = new Florida("Florida", "FL", "Republican", "Ron DeSantis", "Marco Rubio", 23_000_000);
        System.out.println(florida);

        California california = new California("California", "CA", "Democratic", "Gevin Newsom", "Alex Padilla", 39_000_000);
        System.out.println(california);

        Virginia virginia = new Virginia("Virginia", null, "Republican",  "Don't know", " ",9_000_000);
        //virginia.setAbbreviation(null);
        System.out.println(virginia);
    }
}
