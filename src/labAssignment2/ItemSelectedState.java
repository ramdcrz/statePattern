package labAssignment2;

public class ItemSelectedState implements VendingMachineState {
    public void selectItem(VendingMachine machine) { System.out.println("Already selected."); }
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin accepted.");
    }
    public void dispenseItem(VendingMachine machine) {
        machine.setState(new DispensingState());
        machine.getState().dispenseItem(machine); // Trigger auto-dispense
    }
    public void setOutOfOrder(VendingMachine machine) { machine.setState(new OutOfOrderState()); }
}