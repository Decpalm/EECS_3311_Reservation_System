# 📘 YorkU Lab Equipment Reservation Platform (Group 16)

**Members:**  
Omar Fakousa  
Adan Sheikh  
Declan Palmateer  
Salik Karim  

---

## 📌 Overview
A Java-based GUI application for managing lab equipment reservations at York University.

### Features
- Create user accounts (Student, Faculty, Researcher, Guest)
- Reserve equipment for time intervals
- Modify, cancel, and extend reservations
- Process payments
- Manage equipment status
- Receive updates via observer notifications

---

## 🧠 Design Patterns
- **Singleton** → `ReservationSystem`, `CSVDataStore`  
- **Factory** → `AccountFactory`, `EquipmentFactory`  
- **Strategy** → pricing based on user type  
- **Observer** → equipment status updates  
- **Command** → GUI actions  
- **State** → reservation & equipment lifecycle  

---

## 🏗 Project Structure
```
src/
├── app/
├── command/
├── factory/
├── gui/
├── model/
├── observer/
├── persistence/
├── state/
└── strategy/
```

---

## 💾 Data Storage
CSV files in the `data/` folder simulate persistence:
- `users.csv`
- `equipment.csv`
- `reservations.csv`
- `payments.csv`

---

## ⚙️ Requirements
- Java JDK 17+
- VS Code (recommended) with Java Extension Pack

Check installation:
```bash
java -version
javac -version
```

---

## 🚀 How to Run

### 1. Clone the repository
```bash
git clone https://github.com/Decpalm/EECS_3311_Reservation_System
```

### 2. Open in VS Code
- File → Open Folder → select project

### 3. Run the application
Run:
```
src/gui/Main.java
```

---

## 🧪 Example Workflow
1. Register user  
2. Add equipment  
3. Reserve equipment  
4. View reservations  
5. Modify / cancel / extend  
6. Process payment  

---

## 🏛 Architecture
```
Presentation (GUI)
      ↓
Controller + Commands
      ↓
Domain Model
      ↓
Persistence (CSVDataStore)
```

---

## ⚠️ Notes
- Use "View Data" tab to get reservation IDs  
- Observer updates appear in console  
- CSV files persist data between runs  

---

## ✅ Summary
A modular Java system applying design patterns to ensure clean architecture, maintainability, and scalability.
