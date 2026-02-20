package labAssignment2;

public class DispensingState implements VendingMachineState {
    public void selectItem(VendingMachine machine) { System.out.println("Wait, dispensing..."); }
    public void insertCoin(VendingMachine machine) { System.out.println("Wait, dispensing..."); }

    public void dispenseItem(VendingMachine machine) {
        machine.decreaseInventory();
        System.out.println("Item dispensed.");
        // The machine logic inside decreaseInventory handles the transition
        // to Idle or OutOfOrder automatically to avoid 'if' statements here.
    }
    public void setOutOfOrder(VendingMachine machine) { machine.setState(new OutOfOrderState()); }
}