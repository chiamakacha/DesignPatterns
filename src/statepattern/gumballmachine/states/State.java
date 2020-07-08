package statepattern.gumballmachine.states;

public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

}
