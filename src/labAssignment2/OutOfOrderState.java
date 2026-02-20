package labAssignment2;

public class OutOfOrderState implements VendingMachineState {
    public void selectItem(VendingMachine machine) { System.out.println("Machine Out of Order."); }
    public void insertCoin(VendingMachine machine) { System.out.println("Machine Out of Order."); }
    public void dispenseItem(VendingMachine machine) { System.out.println("Machine Out of Order."); }
    public void setOutOfOrder(VendingMachine machine) { System.out.println("Already Out of Order."); }
}