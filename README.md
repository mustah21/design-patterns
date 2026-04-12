# 🧩 Design Patterns

> Dipping my toes in the pros and cons of different design patterns.

A personal exploration of software design patterns — what they solve, when to use them, and the trade-offs they come with. Each pattern includes working code examples and notes on real-world applicability.

---

## 📚 Table of Contents

- [What Are Design Patterns?](#what-are-design-patterns)
- [Pattern Categories](#pattern-categories)
  - [Creational](#creational)
  - [Structural](#structural)
  - [Behavioral](#behavioral)
- [Getting Started](#getting-started)

---

## What Are Design Patterns?

Design patterns are reusable solutions to commonly occurring problems in software design. They're not finished code you can copy-paste, but rather templates and mental models for solving recurring design challenges.

They're typically split into three categories, as defined by the Gang of Four (GoF):

| Category | Focus |
|---|---|
| **Creational** | How objects are created |
| **Structural** | How objects are composed and related |
| **Behavioral** | How objects communicate and delegate responsibility |

---

## Pattern Categories

### Creational

> Patterns that deal with object creation mechanisms.

| Pattern | Description | Status |
|---|---|---|
| Singleton | Ensure a class has only one instance | ✅ |
| Factory Method | Let subclasses decide which class to instantiate | ✅ |
| Abstract Factory | Create families of related objects | ✅ |
| Builder | Construct complex objects step by step | ✅ |
| Prototype | Clone existing objects | 🔜 |

---

### Structural

> Patterns that deal with object composition and structure.

| Pattern | Description | Status |
|---|---|---|
| Adapter | Make incompatible interfaces work together | ✅ |
| Bridge | Decouple abstraction from implementation | 🔜 |
| Composite | Treat individual objects and groups uniformly | ✅ |
| Decorator | Add responsibilities to objects dynamically | ✅ |
| Facade | Provide a simplified interface to a subsystem | 🔜 |
| Flyweight | Share state to support large numbers of objects | 🔜 |
| Proxy | Control access to another object | ✅ |

---

### Behavioral

> Patterns that deal with communication between objects.

| Pattern | Description | Status |
|---|---|---|
| Observer | Notify dependents when state changes | ✅ |
| Strategy | Define a family of interchangeable algorithms | ✅ |
| Command | Encapsulate requests as objects | 🔜 |
| Iterator | Traverse elements without exposing structure | 🔜 |
| Template Method | Define skeleton of algorithm in a base class | ✅ |
| Chain of Responsibility | Pass requests along a chain of handlers | ✅ |
| Mediator | Reduce dependencies between objects | 🔜 |
| Memento | Capture and restore object state | ✅ |
| State | Change behavior when internal state changes | ✅ |
| Visitor | Separate algorithms from the objects they operate on | ✅ |

---


## Getting Started

Browse any pattern folder that interests you.
```bash
git clone https://github.com/mustah21/design-patterns.git
cd design-patterns
```

---

**Legend:**
- ✅ Done
- 🚧 In progress
- 🔜 Planned
