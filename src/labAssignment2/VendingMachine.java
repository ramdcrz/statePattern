package labAssignment2;

public class VendingMachine {
    private VendingMachineState state;
    private int inventory;

    public VendingMachine(int inventory) {
        this.inventory = inventory;
        this.state = new IdleState();
    }

    public void selectItem() { state.selectItem(this); }
    public void insertCoin() { state.insertCoin(this); }
    public void dispenseItem() { state.dispenseItem(this); }
    public void setOutOfOrder() { state.setOutOfOrder(this); }

    public void setState(VendingMachineState state) { this.state = state; }
    public VendingMachineState getState() { return state; }

    public void decreaseInventory() {
        this.inventory--;
        // Transition based on stock
        this.state = (inventory > 0) ? new IdleState() : new OutOfOrderState();
    }
}