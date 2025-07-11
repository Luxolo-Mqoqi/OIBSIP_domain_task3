# OIBSIP_domain_task3
ATM INTERFACE – JAVA SWING GUI APPLICATION
==========================================

Description:
------------
This is a simple ATM Interface application developed using Java and the Swing GUI toolkit. 
The system simulates basic banking operations such as login, deposit, withdrawal, transaction 
history, and fund transfers. It is intended for educational or demonstration purposes and does 
not connect to any real banking systems.

Features:
---------
- User login with ID and PIN authentication
- View last transaction (deposit or withdrawal)
- Deposit money
- Withdraw money (with balance validation)
- Transfer money to a recipient (simulation only)
- Exit the application

Default Login Credentials:
--------------------------
- User ID : Luxolo
- PIN     : 1234

You can change the default credentials inside the `ATMGUI.java` file.

Project Structure:
------------------
ATMGUIProject/
├── ATM.java                --> Core banking logic
├── ATMLoginPanel.java      --> Swing panel for user login
├── ATMMenuPanel.java       --> Swing panel for ATM features
└── ATMGUI.java             --> Main application entry point and controller

How to Compile and Run:
-----------------------
1. Ensure that Java (JDK 8 or higher) is installed on your machine.
2. Open a terminal or command prompt.
3. Navigate to the project folder where the .java files are stored.
4. Compile all Java files with:
   javac *.java
5. Run the program with:
   java ATMGUI

Usage:
------
- Launch the program and enter the user ID and PIN.
- If authenticated, you will be taken to the ATM main menu.
- Use the buttons to perform banking actions.
- Input dialogs will guide you through amounts and confirmations.
- Exit the application by clicking "Quit".

Limitations:
------------
- All data is stored in memory only; there is no file/database saving.
- Transfer is a simulated operation and doesn't involve multiple accounts.
- Single user system with hardcoded login for simplicity.

Author:
-------
Developed by Luxolo Mqoqi

License:
--------
This project is free to use for personal, academic, and educational purposes.
