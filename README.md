# Створення класів

## Завдання 1. Створення класу з атрибутами
``` java
package domain;

public class Сustomer {
    private int ID;
    private boolean isNew;
    private double total;

    public Сustomer() {
        this.ID = 1;
        this.isNew = true;
        this.total = 1000;
    }
}
```

## Завдання 2. Додавання в клас методів
``` java
package domain;

public class Сustomer {
    private int ID;
    private boolean isNew;
    private double total;

    public Сustomer() {
        this.ID = 1;
        this.isNew = true;
        this.total = 1000;
    }
    
    public void displayCustomerInfo(){
        System.out.println("Customer ID: " + ID);
        System.out.println("Is new Customer: " + isNew);
        System.out.println("Total purchases are: " + total);
    }

}
```

## Перевірка працездатності створеного класу
``` java
package test;

import domain.Сustomer;

public class CustomerTest {

    public static void main(String[] args) {
        Сustomer customer = new Сustomer();
        customer.displayCustomerInfo();
    }
}
```
![](https://github.com/ppc-ntu-khpi/java-classes-NeonDragonNight/blob/main/Solution/done.png)
