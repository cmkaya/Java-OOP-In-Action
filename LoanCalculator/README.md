## Understanding the Loan Calculation

A loan credit consists of three main pillars, which the user will enter into the console:

1. Principal
2. Annual interest
3. Duration in year

Depending on inputs, the app will display two things:

1. [Monthly payment amount](https://www.1728.org/loanform.htm)
2. [The total cost of the loan (principal + interest)](https://www.1728.org/loanfrm4.htm) 

## Design

---

> Each class should have a [single responsibility](https://www.baeldung.com/java-single-responsibility-principle).

- The first class is responsible for getting input from the user.
- When considering the calculation values, we can create a class that is responsible for the calculation.
- Another task is to report results to the console in a nice format. So, there should be a class handling it.
- The last class should perform some basic tasks like formatting currency.

## Result

---

![Result](https://github.com/cmkaya/Java-OOP-In-Action/blob/main/LoanCalculator/images/Result.png)
