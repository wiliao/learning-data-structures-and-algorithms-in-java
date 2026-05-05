# GitHub Copilot Custom Instructions

## Project Overview

This repository follows **"Data Structures and Algorithms in Java, 6th Edition"** by Goodrich, Tamassia & Goldwasser. It contains implementations, exercises, and study notes for core DSA concepts in Java.

## Language & Java Conventions

- **Language**: Java 8+ (leverage type inference, generics, and diamond operator `<>`)
- **Package**: All code belongs under the `net.datastructures` package
- **Naming**: Follow standard Java conventions — `camelCase` for methods/variables, `PascalCase` for classes/interfaces, `UPPER_SNAKE_CASE` for constants
- **Generics**: Use generic types with meaningful type parameters (e.g., `E` for element, `K`/`V` for key/value)
- **Exceptions**: Prefer custom checked exceptions for ADT operations (e.g., `EmptyStackException`, `InvalidPositionException`)
- **Documentation**: Use Javadoc (`/** */`) for all public methods and classes; include `@param`, `@return`, and `@throws` tags

## Data Structure Patterns

- **ADT-first approach**: Define a Java **interface** for each Abstract Data Type before implementing concrete classes
- **Abstract base classes**: Use abstract classes to share common logic across implementations (e.g., `AbstractHashMap` base for chaining and probing variants)
- **Nested classes**: Use private inner/nested classes for implementation details (e.g., `Node` class inside a linked list)
- **Encapsulation**: Keep fields `private` or `protected`; expose behavior through interface methods
- **Immutability**: Defensive copying where appropriate; prefer immutable keys in hash-based structures
- **Iterators**: Implement `Iterable<E>` and provide `Iterator<E>` via `iterator()`; support both fail-fast and snapshot patterns
- **Comparable**: Implement `Comparable<T>` for elements that have a natural ordering
- **equals/hashCode**: Always override `equals()` and `hashCode()` together; follow the contract

## Code Style

- **Indentation**: 4 spaces (no tabs)
- **Braces**: Egyptian style (opening brace on same line) for methods, classes, control flow
- **Line length**: Prefer under 120 characters
- **Visibility**: Default to `private`; escalate to `protected` or `public` only when necessary
- **Immutability**: Prefer `final` for local variables and fields that should not be reassigned
- **Streams/lambdas**: Use when they improve readability, but prefer traditional loops for performance-critical DSA code

## Algorithm Implementation Guidelines

- Prefer **recursive** implementations for tree/graph algorithms (but note tail recursion elimination)
- Include **Big-Oh complexity** analysis in comments for every method
- Support both **array-based** and **linked** implementations where relevant
- When implementing sorting, include both **in-place** and **auxiliary-space** variants

## Testing

- Use JUnit 4/5 for unit tests
- Test classes follow the naming pattern `<ClassName>Test.java` (e.g., `ArrayListTest.java`)
- Include tests for:
  - Edge cases (empty structures, single element, null)
  - Expected exceptions via `@Test(expected = ...)`
  - Performance characteristics with `@Test(timeout = ...)`

## Documentation Style

- Use **Mermaid diagrams** in Markdown for visualizing data structures and algorithms
- Include **ASCII art** diagrams in code comments for complex pointer-based operations
- Reference chapters from the book by number (e.g., `// See Ch. 9: Priority Queues`)

## Learning Path

This repo follows a phased learning roadmap:
1. **Phase 1**: Java Primer & OOP Design (Ch. 1–2)
2. **Phase 2**: Fundamental Data Structures, Analysis & Recursion (Ch. 3–5)
3. **Phase 3**: Core ADTs & Tree Structures (Ch. 6–11)
4. **Phase 4**: Sorting & Selection (Ch. 12)
5. **Phase 5**: Advanced Topics — Text Processing, Graphs, Memory Management (Ch. 13–15)
