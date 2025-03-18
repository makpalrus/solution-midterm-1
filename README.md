## ☕ Coffee Order System  

### 📌 Project Description  
**Coffee Order System** is a Java console application that allows the user to order coffee with a choice of parameters:
- Type (hot/cold)  
- Type of coffee (Espresso, Latte, Cappuccino, Americano)  
- Cup size  
- Strength of the drink  
- Additional ingredients (Milk, Sugar, Syrup)  
- Payment method (Kaspi, Halyk, Cash)  

After selecting all the parameters, the system calculates the total amount and places the order.  

---

### 🚀 Functionality  
✅ **Choice of drink** – hot or cold coffee  
✅ **Coffee type selection** – 4 popular types of coffee  
✅ **Size Selection** – Small, Medium, Large (with different price)  
✅ **The choice of fortress** is Ordinary, Strong, Very strong  
✅ **Additives** – Milk, Sugar, Syrup (with cost)
 **Multiple orders** – multiple drinks can be added  
✅ **Payment methods** – Kaspi, Halyk, Cash  
✅ **Correct input validation** – the program does not allow incorrect values  

---

### 📂 Project structure  
```
SolutionMidterm1/
│── src/
│   ├── models/             
│   │   ├── Coffee.java
│   │   ├── Americano.java
│   │   ├── Espresso.java
│   │   ├── Latte.java
│   │   ├── Cappuccino.java
│   ├── payments/            
│   │   ├── PaymentStrategy.java
│   │   ├── KaspiPayment.java
│   │   ├── HalykPayment.java
│   │   ├── CashPayment.java
│   ├── Main.java             
│── README.md             
```

### 🎯 Work example  
```
Enter your name: Makpal
Hello, Alina! Welcome to the coffee shop
What kind of coffee do you want?
1 - Hot
2 - Cold 🧊
> 1
Choose a coffee:
1 - Espresso ($2.0)
2 - Latte ($3.5)
3 - Cappuccino ($4.0)
4 - Americano ($3.0)
> 3
Choose a size:
1 - Small (-$0.5)
2 - Medium ($0.0)
3 - Large (+$1.0)
> 3
Choose a fortress:
1 - Regular (+$0.0)
2 - Strong (+$0.3)
3 - Very strong (+$0.5)
> 2
Additives:
1 - Milk (+$0.5)
2 - Sugar (+$0.3)
3 - Syrup (+$1.0)
Add milk? (yes/no)
> yes
Add sugar? (yes/no)
> no
Add syrup? (yes/no)
> yes
Would you like to add another drink? (yes/no)
> no

Your order, Makpal:
Cappuccino (Large, Strong) - $5.8
Additives: Milk, Syrup
Total amount: $5.8
Choose a payment method:
1 - Kaspi 💳
2 - Halyk 🏦
3 - Cash 💵
> 2
Payment via Halyk: $5.8
Thanks for ordering, Alina! We are waiting for you again ☕😊


