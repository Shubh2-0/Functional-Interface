<div align="center">

# ⚡ Functional Interface

[![GitHub stars](https://img.shields.io/github/stars/Shubh2-0/Functional-Interface?style=for-the-badge&logo=github&color=yellow)](https://github.com/Shubh2-0/Functional-Interface/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/Shubh2-0/Functional-Interface?style=for-the-badge&logo=github&color=blue)](https://github.com/Shubh2-0/Functional-Interface/network/members)

### Single Abstract Method Interfaces

*Foundation for lambda expressions in Java*

</div>

---

## 🎯 About

A **Functional Interface** has exactly one abstract method. Marked with @FunctionalInterface, these are the foundation for lambda expressions in Java 8+.

## 📚 Built-in Functional Interfaces

| Interface | Method | Use Case |
|-----------|--------|----------|
| Consumer<T> | accept(T) | Process input, no return |
| Supplier<T> | get() | Provide values |
| Function<T,R> | apply(T) | Transform data |
| Predicate<T> | test(T) | Boolean test |
| BiFunction<T,U,R> | apply(T,U) | Two inputs |

## 💻 Example

```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

// Lambda implementation
Calculator add = (a, b) -> a + b;
Calculator multiply = (a, b) -> a * b;

System.out.println(add.calculate(5, 3));      // 8
System.out.println(multiply.calculate(5, 3)); // 15
```

## 🛠️ Technologies

Java 8+ | Lambda | Stream API

## 📬 Contact

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/shubham-bhati-787319213/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:shubhambhati226@gmail.com)

---

**Keywords:** Java Functional-Interface Lambda SAM Consumer Predicate Function Supplier


