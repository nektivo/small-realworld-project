# 🧾 Warkop 76 – Cashier System (Java)

A **console-based cashier application** written in **Java** that simulates ordering food and beverages at _Warkop 76_.  
This project is designed as a **small real-world application** to practice:

- Object-Oriented Programming (OOP)
- Clean architecture
- Input validation
- Business logic separation

---

## ✨ Features

✅ Predefined menu (drinks & foods)  
🛒 Interactive ordering via console  
🧾 Purchase receipt with itemized list  
🔢 Automatic discount system  
📦 Modular architecture (Model – Service – UI)

### Discount Rules

| Total Purchase | Discount |
| -------------- | -------- |
| ≥ Rp 200.000   | 10%      |
| ≥ Rp 100.000   | 5%       |
| < Rp 100.000   | None     |

---

## 🗂 Project Structure

```bash
src/
└── com/
└── cashier/
├── Main.java
├── model/
│ ├── MenuItem.java
│ └── PurchasedItem.java
├── service/
│ ├── MenuService.java
│ ├── Basket.java
│ └── Payment.java
└── ui/
└── Console.java
```

---

## 🧩 Class Responsibilities

| Class           | Responsibility                               |
| --------------- | -------------------------------------------- |
| `Main`          | Entry point of the program                   |
| `MenuItem`      | Represents a menu item (name & price)        |
| `PurchasedItem` | Represents an ordered item (menu + quantity) |
| `MenuService`   | Manages menu data                            |
| `Basket`        | Stores ordered items                         |
| `Payment`       | Calculates total and applies discount        |
| `Console`       | Handles user input & output                  |

---

## 🚀 Getting Started

### 📌 Prerequisites

- Java Development Kit (**JDK 8+**)
- Terminal / Command Prompt

---

### 📥 Installation

Clone the repository:

```bash
git clone https://github.com/<your-username>/cashier-project.git
cd cashier-project
```

### ▶️ Compile & Run

Compile:

```bash
javac com/cashier/**/*.java
```

Run:

```bash
java com.cashier.Main
```

### 🎮 Usage Example

```bash
=== WARKOP 76 ===
1. air putih        Rp 3000
2. es teh           Rp 4000
3. kopi hitam       Rp 5000
4. kopi susu        Rp 6000
5. hot chocolate    Rp 7000
6. es cappucino     Rp 5000
7. es jeruk         Rp 5000
8. susu jahe        Rp 8000
9. kentang goreng   Rp 9000
10. roti bakar      Rp 12000

Pilih menu (0 untuk selesai): 3
Jumlah: 2
Berhasil ditambahkan!

Pilih menu (0 untuk selesai): 10
Jumlah: 1
Berhasil ditambahkan!

=== STRUK ===
2 x kopi hitam = Rp 10000
1 x roti bakar = Rp 12000
Total: Rp 22000
Bayar: Rp 22000
Terima kasih!
```

### 🧠 Design Principles Applied

- Single Responsibility Principle
  Each class has one responsibility only.

- Encapsulation
  Data is accessed through objects, not static global variables.

- Low Coupling
  UI, logic, and data are separated.

- Extensible
  Easy to add:
  - GUI
  - Database
  - Payment gateway
  - API layer

### ⚠ Known Limitations

- Console-based interface only
- No persistent storage (data resets on restart)
- No item removal feature yet

### 🔮 Future Improvements

- Add remove item from cart
- Add payment method (cash & QRIS)
- Store transactions in file or database
- Convert to GUI (JavaFX)
- Convert to REST API (Spring Boot)
- Add unit tests (JUnit)

### 🧪 Testing

Currently tested manually via console input.
Future testing can be implemented using JUnit.

### 📄 License

This project is released for **educational purposes.**
You are free to use, modify, and distribute this project.

☕ Happy Coding – Learn by building real systems!
