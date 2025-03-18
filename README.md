## ☕ Coffee Shop Project

### 📄 Description
This project is a coffee shop simulation where users can order coffee, choose sizes, add toppings, and select payment methods. Discounts, order history, and personalized recommendations are also implemented.

---

## 🔧 Project Structure
```
src/
│── com.example/
    ├── decorators/
    │   ├── CoffeeDecorator.java
    │   ├── MilkDecorator.java
    │   ├── SugarDecorator.java
    │   └── SyrupDecorator.java
    │
    ├── models/
    │   ├── Coffee.java
    │   ├── Espresso.java
    │   ├── Latte.java
    │   ├── Cappuccino.java
    │   ├── OrderService.java
    │   └── Order.java
    │   └── CoffeeComponent.java
    │
    ├── payments/
    │   ├── CashPayment.java
    │   └── CreditCardPayment.java
    │   └── PaymentStrategy.java
    │
    └── Main.java
```

---

## 🔥 Features
- ✅ Various coffee types: Espresso, Latte, Cappuccino, Tea.
- ✅ Size options: Small, Medium, Large.
- ✅ Additions: Milk, Sugar, Syrup.
- ✅ Payment methods: Cash or Credit Card.
- ✅ User balance with the ability to top up.
- ✅ Discounts and free coffee for every 5 purchases.
- ✅ Coffee ratings and reviews.
- ✅ Order history.
- ✅ Personalized recommendations based on order history.

---
## 💡 Example Usage
```
Choose a coffee: 
1 - Espresso ($2.0) 
2 - Latte ($3.5) 
3 - Cappuccino ($4.0)
> 2

You selected: Latte - $3.5
Choose a size: 
1 - Small (-$0.5) 
2 - Medium ($0.0) 
3 - Large (+$1.0)
> 3

Add milk? (yes/no)
> yes

Pay with cash (1) or card (2)?
> 2
Enter card number:
> 1234-5678-9876-5432
```

---
