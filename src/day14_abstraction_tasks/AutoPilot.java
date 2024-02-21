package day14_abstraction_tasks;


public interface AutoPilot extends AutoPark {

    boolean hasAutoPilot = true;

    void selfDrive();

}
/*
Create a Child Interface of AutoPark Named 'AutoPilot':
    - Note: Use the 'extends' keyword for inheritance.
    - Variables:
        - hasAutoPilot
    - Abstract Method:
        - selfDrive()
 */