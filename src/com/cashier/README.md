# 🧠 Small RealWorld Projects (Java)

A curated collection of **small Java applications** that model real-world scenarios to improve **Object-Oriented Programming**, **clean code**, and **problem-solving skills**.  
Each module provides a focused learning experience with practical application logic for everyday programming tasks.

This repository includes projects such as:

✔️ Cashier System  
✔️ Boarding House Manager  
✔️ Inventory System  
✔️ Queue System

_All projects follow structured design principles and aim to teach core programming patterns in Java._

---

## 🚀 Table of Contents

- [🧠 Overview](#🧠-overview)
- [📌 Projects Included](#📌-projects-included)
- [📂 Architecture & Design](#📂-architecture--design)
- [⚙️ Getting Started](#⚙️-getting-started)
  - [Requirements](#requirements)
  - [Installation](#installation)
  - [Usage](#usage)
- [📘 Coding Standards](#📘-coding-standards)
- [🧪 Testing](#🧪-testing)
- [✨ Contributing](#✨-contributing)
- [📄 License](#📄-license)

---

## 📌 Projects Included

Each subproject is standalone and demonstrates a specific domain or pattern:

### 🛒 Cashier System

A **console-based ordering system** where users can browse a menu, place orders, and view receipts with auto discounts.  
Highlights: Menu management, interaction loop, purchase logging.

### 🏘️ Boarding House Manager

Simulates tenant check-ins and check-outs for a boarding house.  
Highlights: Object lists, status tracking, basic CRUD.

### 📦 Inventory System

Tracks products, quantity levels, and updates stock through user interaction.  
Highlights: Data encapsulation, state management, dynamic storage.

### 📊 Queue System

Implements a queue data structure as an application module for customer processing or task ordering.  
Highlights: FIFO logic, queue operations, user controls.

---

## 📂 Architecture & Design

Every project follows Java best practices with:

- **Package-based structure**
- **Separation of logic** (models, services, UI handling)
- **Clean and readable source code**
- **Consistent naming conventions**

Example directory structure:

src/
└── com/
└── cashier/ # (Or other scenario folder)
├── Main.java
├── Model.java
├── Service.java
└── Utils.java

---

## ⚙️ Getting Started

### 🧰 Requirements

Before running the code, make sure you have:

✔️ Java Development Kit (JDK 8 or higher) installed  
✔️ Terminal or command line access  
✔️ Source code cloned

---

### 📥 Installation

1. Clone the repository:

```bash
git clone https://github.com/nektivo/small-realworld-project.git
```

Navigate into the project folder:

```bash
cd small-realworld-project
```

Find the project subfolder you want to compile.

▶️ Usage

Compile the Java files:

```bash
javac com/<scenario>/*.java
```

Execute the main class:

```bash
java com.<scenario>.Main
```

💡 Replace `<scenario>` with the specific module folder (e.g., `cashier`, `boardinghouse`).

📘 Coding Standards

- To maintain readability and quality:

- Use clear and descriptive class/method names

- Group related logic into separate packages

- Avoid large methods by applying single-responsibility principle

- Comment intent, not implementation

🧪 Testing

These projects are designed for manual interaction testing. To improve:

🔹 Add unit tests using JUnit
🔹 Validate edge cases for inputs
🔹 Automate scenario workflows

✨ Contributing

Contributions are welcome! To add a new module or improve existing ones:

1. Fork the repo

2. Create a feature branch:

```bash
git checkout -b feature/<name>
```

3. Commit improvements

4. Open a Pull Request

We value clear design, comments, and test coverage.

📄 License

Distributed under the **MIT License**.
See `LICENSE` for details.

Happy coding — build practical skills with every commit! 🚀
