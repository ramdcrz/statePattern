package labAssignment2;

public class IdleState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Item selected. Please insert coins.");
        machine.setState(new ItemSelectedState());
    }
    public void insertCoin(VendingMachine machine) { System.out.println("Select item first."); }
    public void dispenseItem(VendingMachine machine) { System.out.println("Select item first."); }
    public void setOutOfOrder(VendingMachine machine) { machine.setState(new OutOfOrderState()); }
}