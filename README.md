📘 YorkU Lab Equipment Reservation Platform
👥 Group 16

Omar Fakousa

Adan Sheikh

Declan Palmateer

Salik Karim

📌 Project Overview

This project is a Java-based GUI application for managing laboratory equipment reservations at York University.

The system allows users to:

Create accounts based on roles (Student, Faculty, Researcher, Guest)

Reserve lab equipment for specific time intervals

Modify, cancel, and extend reservations

Process payments

Manage equipment status (enable, disable, maintenance)

Receive system updates through observer notifications

The system is built using object-oriented design principles and incorporates multiple design patterns to improve modularity, maintainability, and scalability.

🧠 Design Patterns Used

Singleton → ReservationSystem, CSVDataStore

Factory Method → AccountFactory, EquipmentFactory

Strategy → pricing rules based on user type

Observer → equipment status updates and notifications

Command → encapsulation of GUI actions

State → reservation and equipment lifecycle management

🏗 Project Structure
src/
├── app/            # Core system logic (ReservationSystem)
├── command/        # Command pattern implementations
├── factory/        # Object creation (Factory pattern)
├── gui/            # Swing GUI and controller
├── model/          # Core domain classes
├── observer/       # Observer pattern implementation
├── persistence/    # CSV data storage (Singleton)
├── state/          # State pattern classes
└── strategy/       # Pricing strategies
💾 Data Storage

The system uses CSV files (located in the data/ folder) to simulate database persistence:

users.csv

equipment.csv

reservations.csv

payments.csv

These files store system data and allow it to persist across executions.

⚙️ Requirements

Before running the project, ensure you have:

Java JDK 17 or higher

VS Code (recommended) or any Java IDE

Java Extension Pack installed (if using VS Code)

Check installation:

java -version
javac -version
🚀 How to Clone and Run the Project
1. Clone the repository
git clone <your-repo-url>
cd YorkU-Lab-Equipment-Reservation-Platform
2. Open in VS Code

Open VS Code

Click File → Open Folder

Select the project folder

3. Ensure project structure

Make sure the following folders exist:

src/
data/

And that CSV files exist inside data/.

4. Run the application

Navigate to:

src/gui/Main.java

Then:

Click Run ▶️ (top right in VS Code)
OR

Right-click → Run Java

5. Use the application

A GUI window will open with multiple tabs:

Register User

Add Equipment

Reserve Equipment

Modify / Cancel / Extend Reservation

Process Payment

Equipment Status

View Data

You can interact with the system directly through these tabs.

🧪 Example Workflow

Register a user

Add equipment

Reserve equipment

View reservation

Modify / cancel / extend reservation

Process payment

Update equipment status

Apply sensor update

⚠️ Notes

Reservation IDs are required for modification, cancellation, and extension
→ Use “View Data” tab to retrieve them

Observer notifications are printed in the console

CSV files are rewritten when new data is added

📊 System Architecture

The system follows a layered architecture:

Presentation Layer (GUI)
        ↓
Application Layer (Controller, Commands)
        ↓
Domain Layer (User, Equipment, Reservation, etc.)
        ↓
Persistence Layer (CSVDataStore)
🧩 Future Improvements

Improve CSV update handling for modifications

Add undo functionality for commands

Enhance GUI design and usability

Replace CSV storage with a database

✅ Conclusion

This project demonstrates the application of software engineering principles and design patterns in building a modular and scalable system. The integration of design patterns ensures maintainability, flexibility, and clear separation of concerns.
