package day11_custom_class_tasks;

import java.util.Arrays;


public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Extra spicy", "round the corner", 5);

        Server server1 = new Server("John Johnson",1, 15, true);
        Server server2 = new Server("Jen Jenson", 2, 15, false );
        Server[] servers = {server1, server2};

        Chef chef1 = new Chef("Perter Peterson", 3, 25, true);
        Chef chef2 = new Chef("Jack Jackson", 4, 20,false);
        Chef[] chefs = {chef1, chef2};

        //restaurant1.hireServer(servers);
        //restaurant1.hireChef(chefs);
        System.out.println(Arrays.toString(servers));
        System.out.println(Arrays.toString(chefs));

        System.out.println(restaurant1);

            }
        }

