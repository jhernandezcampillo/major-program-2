# Major Programming Assignment 2
## COMP 167 Spring 2019
### Due March 27th 2019 @ 6:00 pm

##  Introduction

This assignment requires you to create a Java application that will be used to inventory mowers in a mower store.  In addition to the classes that store the mower data, you will create a GUI to manage the inventory.

## UML Domain Diagram

![Major Program UML Domain Diagram](https://github.com/NCATCS/Spring2019-MP2/blob/master/img/UMLDiagram.png)

## Classes

You are required to implement the following classes at a minimum.   You may add other classes (and methods) if you need them.

### Engine Class

![Engine Class UML Diagram Diagram](https://github.com/NCATCS/Spring2019-MP2/blob/master/img/Engine.png)

### _Mower_ Class (Abstract)

![Mower Class UML Diagram Diagram](https://github.com/NCATCS/Spring2019-MP2/blob/master/img/Mower.png)

### LawnTractor Class

![LawnTractor Class UML Diagram Diagram](https://github.com/NCATCS/Spring2019-MP2/blob/master/img/LawnTractor.png)

### CommercialMower Class

![CommercialMower Class UML Diagram Diagram](https://github.com/NCATCS/Spring2019-MP2/blob/master/img/CommercialMower.png)

### _WalkBehindMower_ Class (Abstract)

![WalkBehindMower Class UML Diagram Diagram](https://github.com/NCATCS/Spring2019-MP2/blob/master/img/WalkBehindMower.png)

### GasPoweredMower Class

![GasPoweredMower Class UML Diagram Diagram](https://github.com/NCATCS/Spring2019-MP2/blob/master/img/GasPoweredMower.png)

### PushReelMower Class

![PushReelMower Class UML Diagram Diagram](https://github.com/NCATCS/Spring2019-MP2/blob/master/img/PushReelMower.png)

### MowerWareHouse

![MowerWareHouse Class UML Diagram Diagram](https://github.com/NCATCS/Spring2019-MP2/blob/master/img/MowerWareHouse.png)

### Handling ArrayLists

Each ArrayList should have five associated methods to perform: getNum, add, remove, get and set.  So if you have an ArrayList named widgets that stored items of type Widget, then the associated UML behaviors would be:

```
+getNumWidgets() : int  //Return the number of items in the ArrayList widgets.
+getWidget(index:int) : Widget  //get the Widget at location index in ArrayList widgets
+setWidget(index:int, item:Widget):void	 //store item at location index in the ArrayList widgets.
+addWidget(item:Widget):void   //Append the Widget to the ArrayList.
+removeWidget( index:int ) : Widget  //remove and return the Widget at location index
```

## Input File

The name of the input file will be supplied using command-line arguments.  If no command-line argument is supplied, then your program should prompt the user for the input file using the `JFileChooser` class.  Here is the format of the input file:

```
//TODO: Input file format here
```

## Output File

The format for the output file should be identical to that of the input file.  In other words, after writing your output file, you should be able to read it back in as an input file.  The `toString()` methods of your classes are designed to make file output simple.

## Graphical User Interface

If you would like to add a GUI to your application, look for the GUI addendum.  It will be posted later in the same folder as this assignment.  You should not attempt this portion of the assignment if you have not completed the other classes.

## Grading

If your project does not compile, it receives a grade of zero.  If you do not document your program according to the documentation guidelines, the graders have been instructed to deduct up to 25%.

### Level 1 (40 points)
Implement all the classes except the `MowerWareHouse` class.

### Level 2 (20 points)
Implement the `MowerWareHouse` class except the `readMowerData()` and `saveMowerData()` methods.  Use the `main()` method to create one of each type of concrete class and add them to the `ArrayList`.  Output the contents of the MowerWareHouse object to a JOptionPane using the toString() method of the MowerWareHouse class.

### Level 3 (25 points)
Modify your main so that it uses command-line arguments to provide the input file name.  Add the logic to obtain the input file name from a `JFileChooser` if no command-line argument is provided.  Implement the `readMowerData()` and `saveMowerData()` methods.   To prove your code works, read the input file and add additional mowers by creating objects in the main method and adding them to the `MowerWareHouse` object.  Save the updated `MowerWareHouse` object using the `saveMowerData()` method.

###Level 4 (15 points)
Implement the GUI.  See the GUI addendum for details
