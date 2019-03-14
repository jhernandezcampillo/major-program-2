# Major Programming Assignment 2
## GUI Addendum
## COMP 167 Spring 2019

For this assignment, you will create a Graphical User Interface using for your `MowerWareHouse` using the Java Swing graphics Library via the Netbeans GUI builder.   Here is the functionality that your GUI must provide:

### Main Menu/Window

When the user first views the GUI it should provide buttons that allow viewing, adding, loading, saving and exiting.  The warehouse name should also be displayed at the top of this window.

### Viewing

The `View` window should display the name of each type of concrete mower (`LawnTractor`, `CommericalMower`, `GasPoweredMower` and `PushReelMower`).  Also include a `JButton` next to each of these mower types that will initiate the population of a `JList` showing all the properties of each mower of that type.  The `JList` can be included on the `View` window or as a separate `JDialog`.

### Adding

The `Add` window should allow the user to select a mower type and then input appropriate properties for that mower type.  The new `Mower` is then added to the warehouse `ArrayList`.

### Saving

Clicking the `Save` button on the main menu should provide a dialog to allow the user to provide an output file name and then save the in-memory warehouse to a file.

### Exiting

Your program should keep track of whether the user has saved the warehouse to a file since the last change was made (i.e. new mower added).  If so, pressing the `Exit` button should provide them with an opportunity to save the file before closing the application.  If the file has been saved since the last change then the program should just exit.

### Hints on Design:
Your main class should pass a populated `MowerWareHouse` object to the GUI.  The GUI should have a `MowerWareHouse` property that should be assigned the `MowerWareHouse` object passed through the constructor.

Consider extending the `JDialog` class for the `View` and `Add` windows.  Your main class can just instantiate and display the window when the corresponding button is clicked.
