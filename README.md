# statePattern
<b>Lab Assignment 2: Vending Machine State Pattern</b>

<p>
A vending machine needs to manage different states, including "Idle", "ItemSelected", "Dispensing", and "OutOfOrder". Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like item inventory and balance.
<ul>
<li><b>Idle State:</b> Allows item selection but disallows dispensing items and inserting coins.</li>
<li><b>ItemSelected State:</b> Allows inserting coins and dispensing items but disallows item selection.</li>
<li><b>Dispensing State:</b> Allows no operations and automatically transitions back to the "Idle" state after dispensing is complete.</li>
<li><b>OutOfOrder State:</b> Disallows all operations.</li>
</ul>
</p>

<p>
Currently, the system relies on conditional statements within the VendingMachine class to check the machine state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.

Implement the State Pattern to improve code maintainability and flexibility:

<ol>
<li><b>Implement State Interface:</b> Define an interface <code>VendingMachineState</code> with methods for common actions: <code>selectItem</code>, <code>insertCoin</code>, <code>dispenseItem</code>, and <code>setOutOfOrder</code>.</li>
<li><b>Define VendingMachine States:</b> Create separate classes representing different machine states that implement the interface: <code>IdleState</code>, <code>ItemSelectedState</code>, <code>DispensingState</code>, and <code>OutOfOrderState</code>.</li>
<li><b>Implement State Behaviors:</b> Each concrete state class provides specific behavior for its respective state (e.g., <code>IdleState</code> allows item selection, while <code>OutOfOrderState</code> blocks all actions).</li>
<li><b>Update VendingMachine Class:</b></li>
<ul>
<li>Include attributes for <code>inventory</code> (int) and <code>balance</code> (int).</li>
<li>Remove all state-specific <code>if-else</code> or <code>switch</code> logic from the class.</li>
<li>Introduce a reference to the current <code>VendingMachineState</code> object.</li>
<li>Delegate actions like <code>selectItem()</code>, <code>insertCoin()</code>, and <code>dispenseItem()</code> to the current state object.</li>
</ul>
</ol>
</p>

<p><b>Logic and Transitions:</b>
<ul>
<li><b>IdleState:</b>
<ul>
<li><code>selectItem</code> transitions the machine to <b>ItemSelectedState</b>.</li>
</ul>
</li>
<li><b>ItemSelectedState:</b>
<ul>
<li><code>insertCoin</code> updates the balance.</li>
<li><code>dispenseItem</code> transitions the machine to <b>DispensingState</b>.</li>
</ul>
</li>
<li><b>DispensingState:</b>
<ul>
<li>Decreases inventory and sets balance to zero.</li>
<li>Automatically transitions back to <b>IdleState</b> (or <b>OutOfOrderState</b> if inventory is empty).</li>
</ul>
</li>
</ul>
</p>

<p><b>Composition of VendingMachine:</b>
<ul>
<li><b>state:</b> VendingMachineState</li>
<li><b>inventory:</b> int</li>
<li><b>balance:</b> int</li>
</ul>
</p>

<p><b>Methods:</b>
<ul>
<li><b>selectItem():</b> void // calls state.selectItem(this)</li>
<li><b>insertCoin():</b> void // calls state.insertCoin(this)</li>
<li><b>dispenseItem():</b> void // calls state.dispenseItem(this)</li>
<li><b>setState(VendingMachineState):</b> void</li>
</ul>
</p>

<p><b>Note:</b> No if-else or switch statements will be used for behavior execution within the VendingMachine action methods.</p>
<p>See <b>VendingMachineDemo.java</b> class to test the machine and its state transitions.</p>

## UML Diagram
![alt text](https://github.com/ramdcrz/statePattern/blob/main/statePattern_UML.png)
