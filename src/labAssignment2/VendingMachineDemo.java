package labAssignment2;

public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(1); // Only 1 item

        machine.selectItem();   // Transitions to ItemSelected
        machine.insertCoin();   // Processes coin
        machine.dispenseItem(); // Dispenses, then transitions to OutOfOrder because stock is 0

        System.out.println("\nAttempting to use empty machine:");
        machine.selectItem();   // Will show "Machine Out of Order"
    }
}