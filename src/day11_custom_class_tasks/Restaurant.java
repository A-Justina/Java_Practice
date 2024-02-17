package day11_custom_class_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner;
    public String location;
    public int numberOfStars;
    public ArrayList<Server> servers = new ArrayList<>();
    public ArrayList<Chef> chefs = new ArrayList<>();


    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }
    public void hireServer(Server server){
        servers.add(server);
    }
    public void hireServer(Server[] servers){
        this.servers.addAll(Arrays.asList(servers));

    }
    public void hireChef(Chef chef){
        chefs.add(chef);
    }
    public void hireChef(Chef[] chefs){

    }
    public void terminateChef (int employeeId){
        chefs.remove(employeeId);
    }
    public void terminateServer (int employeeId){
        servers.remove(employeeId);
    }


    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers +
                ", chefs=" + chefs +
                '}';
    }
}
