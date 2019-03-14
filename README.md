# Major Programming Assignment 2
## COMP 167 Spring 2019
### Due March 27th 2019 @ 6:00 pm

##  Introduction

This assignment requires you to create a Java application that will be used to inventory mowers in a mower store.  In addition to the classes that store the mower data, you will create a GUI to manage the inventory.

## Git and GitHub

You will submit this project using GitHub pull requests. You **must** create a GitHub pull request for each level to receive credit. You should request your assigned reviewer on your pull request. Review the following resource on git and GitHub for major programs _before_ you start work:

- [Written Explanation](https://gist.github.com/ccannon94/511115be821a873ae9ec5f4db9cfdda0)
- [YouTube Video](https://www.youtube.com/watch?v=l2bP9JKQkdA)

You **must** complete all work on a separate branch. You CAN NOT push code to the master branch. Review the above git and GitHub resources to learn about branching.

You **must** add your assigned TA as a reviewer for your pull requests. You can find your assigned reviewer [here](./assigned-reviewers.csv). **Reviewer assignments have changed since MP1 so please check this document again**.

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

### toString() Methods

The `toString()` method for _each_ concrete subclass of `Mower` must include a letter designating the subtype. "L" for `LawnTractor`, "C" for `CommercialMower`, "G" for `GasPoweredMower` and "P" for `PushReelMower`. This should be the first line after the `serialNumber` as shown in the input file format below.

Properties should be returned in the order they are listed in the UML diagram, from superclass to subclass.

## Input File

The name of the input file will be supplied using command-line arguments.  If no command-line argument is supplied, then your program should prompt the user for the input file using the `JFileChooser` class.  Here is the format of the input file:

```
storeName
mower0Manufacturer
mower0Year
mower0SerialNumber
mower0SubClassType
mower0SubClassProperties
mower1Manufacturer
mower1Year
mower1SerialNumber
mower1SubClassType
mower1SubClassProperties
...
mowerNManufacturer
mowerNYear
mowerNSerialNumber
mowerNSubClassType
mowerNSubClassProperties
```

## Output File

The format for the output file should be identical to that of the input file.  In other words, after writing your output file, you should be able to read it back in as an input file.  The `toString()` methods of your classes are designed to make file output simple.

## Graphical User Interface

If you would like to add a GUI to your application, look for the [GUI addendum](./gui-addendum.md).  It will be posted later in the same folder as this assignment.  You should not attempt this portion of the assignment if you have not completed the other classes.

## Grading

If your project does not compile, it receives a grade of zero.  If you do not document your program according to the documentation guidelines, the graders have been instructed to deduct up to 25%.

### Level 1 (40 points)
Implement all the classes except the `MowerWareHouse` class.

### Level 2 (20 points)
Implement the `MowerWareHouse` class except the `readMowerData()` and `saveMowerData()` methods.  Use the `main()` method to create one of each type of concrete class and add them to the `ArrayList`.  Output the contents of the MowerWareHouse object to a JOptionPane using the toString() method of the MowerWareHouse class.

### Level 3 (25 points)
Modify your main so that it uses command-line arguments to provide the input file name.  Add the logic to obtain the input file name from a `JFileChooser` if no command-line argument is provided.  Implement the `readMowerData()` and `saveMowerData()` methods.   To prove your code works, read the input file and add additional mowers by creating objects in the main method and adding them to the `MowerWareHouse` object.  Save the updated `MowerWareHouse` object using the `saveMowerData()` method.

###Level 4 (15 points)
Implement the GUI.  See the [GUI addendum](./gui-addendum.md) for details
