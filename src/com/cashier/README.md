🧾 Warkop 76 Cashier Program
A simple console-based cashier application written in Java that simulates ordering food and beverages at Warkop 76. Users can browse a menu, select items, specify quantities, and receive a detailed receipt with applicable discounts. Perfect for learning object-oriented programming and basic Java I/O.

✨ Features
✅ Pre‑defined Menu – Drinks and foods with names and prices.

🛒 Interactive Ordering – Choose items by number, enter quantity, and get immediate subtotal feedback.

🧾 Purchase Log – All selected items are stored and displayed at checkout.

🔢 Automatic Discounts –

10% off for orders ≥ Rp 200.000

5% off for orders ≥ Rp 100.000

(Discount logic is ready but needs integration into the final receipt)

📦 Modular Design – Four well‑separated classes (Main, Item, Basket, Payment).

🗂️ Project Structure
text
com.cashier/
├── Main.java # Entry point – initialises menu and starts ordering
├── Item.java # Manages menu items (name + price)
├── Basket.java # Handles user input and order processing
├── Payment.java # Stores purchased items and prints the receipt
└── (PurchasedItem inner class inside Payment)
🧩 Class Details
Class Responsibility Key Members
Main Starts the program, creates the menu, and links Payment with it. static Scanner inputUser, main()
Item Stores and displays the menu. String[] nameItem, int[] priceItem, addItem(), displayMenu()
Basket Interacts with the user (item choice, quantity). buyItem(), input()
Payment Keeps a list of purchased items and prints the final receipt. static ArrayList<PurchasedItem>, addPurchasedItem(), allItem()
PurchasedItem (inner) Represents one line of the receipt. name, pricePerItem, quantity, total
🚀 How to Run
Prerequisites
Java Development Kit (JDK) 8 or higher installed.

A terminal / command prompt.

Steps
Clone or download the source files into a directory (preserve the package structure com/cashier/).

Compile all Java files:

bash
javac com/cashier/\*.java
Run the program:

bash
java com.cashier.Main
⚠️ Important: Before running, make sure you have added the following line inside Main.java after creating the Item object:

java
Payment.menu = menu;
Without this, Payment cannot access the menu and a NullPointerException will occur when you try to add items.

🎮 Usage Example
text
WELCOME TO WARKOP 76

## No. Name Menu Price

Drinks Menu

1.  air putih 3000
2.  es teh 4000
3.  kopi hitam 5000
    ...
    Foods Menu
4.  kentang goreng 9000
5.  roti bakar 12000
    ...

---

Continue shopping?
Input item number or '0 to finish': 3
Enter the amount : 2
2 x kopi hitam = Rp 10000
successfully added to cart

Continue shopping?
Input item number or '0 to finish': 10
Enter the amount : 1
1 x roti bakar = Rp 12000
successfully added to cart

Continue shopping?
Input item number or '0 to finish': 0

Thank you for shopping!
Daftar item yang telah dibeli:
2 x kopi hitam = Rp 10000
1 x roti bakar = Rp 12000
⚠️ Important Notes / Known Issues
🔧 Missing Initialisation – As mentioned above, you must set Payment.menu = menu; in Main. This is the most common cause of runtime errors.

🧮 Discount Integration – The discount logic (provided separately) is not yet applied to the final receipt. The current Payment.allItem() only shows raw totals without discounts. You can enhance it by calculating the total of all items and then applying the discount before printing.

📋 Menu Display – The method displayMenu() in Item uses name.length (the full array capacity) instead of index (the actual number of items). This may print many empty lines. Consider changing the loop condition to i < index.

🧪 Input Validation – Only basic exception handling is present; invalid menu numbers may cause an ArrayIndexOutOfBoundsException.

🔮 Future Improvements
Integrate discount calculation into the final receipt.

Replace fixed‑size arrays with ArrayList for the menu to allow dynamic addition/removal of items.

Add input validation for menu choices (e.g., check range before accessing array).

Implement a more user‑friendly interface (maybe a simple GUI).

Separate discount logic into its own utility class.

Add the ability to remove items from the cart.

📄 License
This project is open source and available for educational purposes. Feel free to use, modify, and distribute it as you like.

Happy Coding! ☕🍟
