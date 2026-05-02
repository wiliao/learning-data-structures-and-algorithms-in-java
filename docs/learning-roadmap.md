# 🗺️ Learning Roadmap — Data Structures & Algorithms in Java

> A structured, chapter-by-chapter learning path based on **"Data Structures and Algorithms in Java, 6th Edition"** by Goodrich, Tamassia & Goldwasser.

---

## 📈 Roadmap Overview

```
Phase 1 ──▶ Phase 2 ──▶ Phase 3 ──▶ Phase 4 ──▶ Phase 5
Foundation    Core DSA     Advanced       Sorting &     Advanced
(Ch 1-2)     (Ch 3-5)     Structures       Selection      Topics
                          (Ch 6-11)       (Ch 12)       (Ch 13-15)
```

| Phase | Chapters | Focus | Estimated Time |
|-------|----------|-------|----------------|
| **1** | 1 – 2 | Java Primer & OOP Design | 1 – 2 weeks |
| **2** | 3 – 5 | Fundamental Data Structures, Analysis & Recursion | 3 – 4 weeks |
| **3** | 6 – 11 | Stacks, Queues, Lists, Trees, Priority Queues, Maps & Search Trees | 5 – 7 weeks |
| **4** | 12 | Sorting & Selection | 1 – 2 weeks |
| **5** | 13 – 15 | Text Processing, Graph Algorithms & Memory Management | 3 – 5 weeks |

**Total estimated time: 13 – 20 weeks** (assuming ~5–10 hours/week)

---

## 🔰 Phase 1: Java & OOP Foundations

### 📖 Chapter 1 — Java Primer
**Goal**: Get comfortable with Java syntax and core language features.

- [ ] Variables, data types, and operators
- [ ] Control flow: conditionals and loops
- [ ] Arrays and command-line arguments
- [ ] String APIs and `StringBuilder`
- [ ] Input/output basics
- [ ] Methods and parameter passing
- [ ] Exception handling (`try`/`catch`/`finally`)
- [ ] Java's primitive vs. reference types

**✅ Milestone**: Write a small Java program that uses arrays, loops, and exception handling.

### 📖 Chapter 2 — Object-Oriented Design
**Goal**: Understand Java's OOP model — the foundation for ADT-based design.

- [ ] Classes, objects, and constructors
- [ ] Inheritance and polymorphism
- [ ] Abstract classes and interfaces
- [ ] Method overriding and `super`
- [ ] Generic types and type parameters
- [ ] Nested and inner classes
- [ ] Java packages and `import`
- [ ] Key OOP design patterns for DSA

**✅ Milestone**: Implement a small generic class hierarchy (e.g., `Shape` → `Circle`, `Rectangle`).

---

## 🧱 Phase 2: Fundamental Data Structures, Analysis & Recursion

### 📖 Chapter 3 — Fundamental Data Structures
**Goal**: Master the building blocks — arrays and linked structures.

- [ ] Array-based storage and operations
- [ ] Singly linked lists
- [ ] Doubly linked lists
- [ ] Circularly linked lists
- [ ] Equality testing and `equals()`/`hashCode()`
- [ ] Cloning and copy semantics
- [ ] 🧪 **Exercise**: Implement a singly linked list from scratch
- [ ] 🧪 **Exercise**: Implement a doubly linked list with insert/delete

**✅ Milestone**: Implement and test a linked list without using `java.util`.

### 📖 Chapter 4 — Algorithm Analysis
**Goal**: Learn to analyze algorithm efficiency rigorously.

- [ ] The seven fundamental functions (constant, log, linear, n-log-n, quadratic, cubic, exponential)
- [ ] Big-Oh notation (`O`)
- [ ] Big-Omega (`Ω`) and Big-Theta (`Θ`)
- [ ] Asymptotic analysis of simple algorithms
- [ ] Best-case, worst-case, and average-case analysis
- [ ] Amortized analysis (introduction)
- [ ] Empirical performance measurement

**✅ Milestone**: Analyze and compare the running times of 2–3 algorithms on real data.

### 📖 Chapter 5 — Recursion
**Goal**: Develop recursive thinking — essential for tree/graph algorithms.

- [ ] Linear recursion (factorial, sum)
- [ ] Binary recursion (Fibonacci)
- [ ] Multiple recursion (file system traversal)
- [ ] Tail recursion and its elimination
- [ ] Recursion traces and stack frames
- [ ] Designing recursive algorithms
- [ ] 🧪 **Exercise**: Implement binary search recursively
- [ ] 🧪 **Exercise**: Traverse a directory tree recursively

**✅ Milestone**: Solve 3–4 classic recursion problems (factorial, binary search, file system traversal, permutations).

---

## 🏗️ Phase 3: Core Abstract Data Types & Tree Structures

### 📖 Chapter 6 — Stacks, Queues, and Deques
**Goal**: Implement and apply linear ADTs.

- [ ] Stack ADT: array and linked-list implementations
- [ ] Queue ADT: array (circular) and linked-list implementations
- [ ] Deque ADT
- [ ] Real-world applications:
  - HTML tag matching (stack)
  - Round-robin scheduling (queue)
- [ ] 🧪 **Exercise**: Implement a stack that supports `min()` in O(1)
- [ ] 🧪 **Exercise**: Implement a queue using two stacks

**✅ Milestone**: Use a stack to solve a bracket-matching problem; use a queue to simulate a printer queue.

### 📖 Chapter 7 — List and Iterator ADTs
**Goal**: Understand dynamic arrays, positional lists, and the Java Collections Framework.

- [ ] List ADT and dynamic arrays
- [ ] Positional list ADT (cursor-based access)
- [ ] Implementing positional lists with a doubly linked list
- [ ] Iterators: lazy vs. snapshot
- [ ] Fail-fast vs. snapshot iterators
- [ ] Java Collections Framework overview (`List`, `ArrayList`, `LinkedList`)
- [ ] 🧪 **Exercise**: Implement a dynamic array with amortized resizing

**✅ Milestone**: Compare performance of `ArrayList` vs. custom linked-list for insert/delete at different positions.

### 📖 Chapter 8 — Trees
**Goal**: Master tree data structures and traversal algorithms.

- [ ] General tree definitions and terminology
- [ ] Binary trees — properties and implementations
- [ ] Tree traversal algorithms:
  - Preorder, inorder, postorder (recursive)
  - Breadth-first (level-order)
- [ ] Expression trees (evaluate arithmetic expressions)
- [ ] Linked vs. array-based tree representations
- [ ] 🧪 **Exercise**: Build an expression tree from a postfix expression
- [ ] 🧪 **Exercise**: Implement all four traversal orders

**✅ Milestone**: Implement a binary tree class and print nodes in all traversal orders.

### 📖 Chapter 9 — Priority Queues
**Goal**: Understand priority-based data structures and heaps.

- [ ] Priority Queue ADT
- [ ] Unsorted/sorted list implementations
- [ ] Heap data structure (binary heap)
- [ ] `heapify` (bottom-up construction)
- [ ] Heap-sort algorithm
- [ ] Adaptable priority queues with locators
- [ ] Java's `PriorityQueue` class
- [ ] 🧪 **Exercise**: Implement a binary heap with `insert()` and `removeMin()`

**✅ Milestone**: Implement heap-sort and compare its performance against other sorting approaches.

### 📖 Chapter 10 — Maps, Hash Tables, and Skip Lists
**Goal**: Understand key-value stores and hashing.

- [ ] Map ADT
- [ ] Hash tables:
  - Hash functions (hash codes + compression)
  - Collision handling: separate chaining
  - Collision handling: open addressing (linear probing, quadratic probing, double hashing)
  - Load factor and rehashing
- [ ] Sorted map ADT
- [ ] Skip lists (probabilistic data structure)
- [ ] Java `HashMap`, `TreeMap`, `HashSet`, `TreeSet`
- [ ] 🧪 **Exercise**: Implement a hash table with chaining
- [ ] 🧪 **Exercise**: Implement a simple skip list

**✅ Milestone**: Build a phone-book application using a hash table; analyze its collision behavior.

### 📖 Chapter 11 — Search Trees
**Goal**: Master balanced search trees.

- [ ] Binary Search Trees (BST): search, insert, delete
- [ ] AVL Trees: balance factor, rotations (single & double), rebalancing
- [ ] Splay Trees: splaying operations, amortized analysis
- [ ] (2,4) Trees: multi-way search trees
- [ ] Red-Black Trees: properties, insertions, deletions
- [ ] Java's `TreeMap` (Red-Black Tree internally)
- [ ] 🧪 **Exercise**: Implement a BST with insert/search/delete
- [ ] 🧪 **Exercise**: Implement AVL rotations

**✅ Milestone**: Compare insertion/deletion performance of BST vs. AVL vs. Red-Black Tree on random and sorted data.

---

## 📊 Phase 4: Sorting & Selection

### 📖 Chapter 12 — Sorting and Selection
**Goal**: Understand O(n log n) sorting and linear-time selection.

- [ ] Merge-sort: divide-and-conquer, top-down & bottom-up
- [ ] Quick-sort: pivot selection, partitioning, worst-case analysis
- [ ] Sorting lower bound (Ω(n log n))
- [ ] Bucket-sort and radix-sort (linear-time sorting)
- [ ] Quick-select: linear-time expected selection
- [ ] Empirical comparison of sorting algorithms
- [ ] 🧪 **Exercise**: Implement merge-sort and quick-sort
- [ ] 🧪 **Exercise**: Implement radix-sort for integers

**✅ Milestone**: Benchmark merge-sort, quick-sort, and radix-sort — explain the trade-offs.

---

## 🚀 Phase 5: Advanced Topics

### 📖 Chapter 13 — Text Processing
**Goal**: Learn pattern matching and text compression algorithms.

- [ ] String operations and character arrays
- [ ] Pattern matching algorithms:
  - Brute-force
  - Boyer-Moore (skip heuristic)
  - Knuth-Morris-Pratt (failure function)
- [ ] Tries and compressed tries
- [ ] Text compression: Huffman coding
- [ ] Dynamic programming applications:
  - Longest Common Subsequence (LCS)
- [ ] 🧪 **Exercise**: Implement the KMP algorithm
- [ ] 🧪 **Exercise**: Implement Huffman encoding/decoding

**✅ Milestone**: Implement a text search tool using Boyer-Moore or KMP and compare with naive search.

### 📖 Chapter 14 — Graph Algorithms
**Goal**: Master graph representations and fundamental graph algorithms.

- [ ] Graph definitions and terminology
- [ ] Graph representations: edge list, adjacency list, adjacency matrix
- [ ] Depth-First Search (DFS) — applications: cycle detection, connectivity
- [ ] Breadth-First Search (BFS) — applications: shortest path (unweighted)
- [ ] Transitive closure (Floyd-Warshall)
- [ ] Dijkstra's algorithm (single-source shortest paths)
- [ ] Minimum Spanning Trees: Prim-Jarník, Kruskal
- [ ] 🧪 **Exercise**: Implement DFS and BFS for a graph
- [ ] 🧪 **Exercise**: Implement Dijkstra's algorithm

**✅ Milestone**: Build a simple shortest-path finder on a real-world map (e.g., model city streets as a graph).

### 📖 Chapter 15 — Memory Management and B-Trees
**Goal**: Understand memory hierarchies and external-memory data structures.

- [ ] JVM memory model: stack vs. heap
- [ ] Garbage collection fundamentals
- [ ] Memory allocation and recycling
- [ ] Caching strategies (LRU, FIFO)
- [ ] B-trees: structure, search, insertion, deletion
- [ ] External-memory sorting and algorithms
- [ ] 🧪 **Exercise**: Implement an LRU cache

**✅ Milestone**: Implement a simple B-tree and simulate an LRU cache.

---

## 🔄 Suggested Study Routine

Each week, aim for this rhythm:

| Day | Activity | Time |
|-----|----------|------|
| **1** | Read the chapter section(s) | 1 – 1.5 hr |
| **2** | Re-read & take notes / draw diagrams | 45 min |
| **3** | Trace algorithms by hand on paper | 30 min |
| **4** | Implement the ADT or algorithm in code | 1 – 2 hr |
| **5** | Solve reinforcement & creativity exercises | 1 hr |
| **6** | Review, compare implementations, or start project problem | 45 min |
| **7** | **Rest** or catch up | — |

---

## 🧪 Exercise Progression

Within each chapter, tackle exercises in this order:

1. **Reinforcement** (R-*): Check understanding of core concepts → do all of these
2. **Creativity** (C-*): Apply concepts in new ways → pick 2–3
3. **Projects** (P-*): Build something substantial → pick 1 per chapter

---

## 📚 Additional Resources

| Resource | Purpose |
|----------|---------|
| [Visualgo.net](https://visualgo.net) | Animate DS & algorithm operations |
| [LeetCode](https://leetcode.com) | Practice DSA coding problems by topic |
| [Big-O Cheat Sheet](https://www.bigocheatsheet.com) | Quick reference for time/space complexity |
| Book companion website (Wiley) | Download all Java source code |
| Java `java.util` documentation | Study real-world implementations |
| [GeeksforGeeks](https://geeksforgeeks.org) | Additional explanations and code examples |
| [Coursera — Algorithms Part I & II (Princeton)](https://www.coursera.org/learn/algorithms-part1) | Complementary video lectures |

---

## 🎯 Final Milestone

By the end of this roadmap, you will be able to:

- ✅ Implement all major data structures from scratch in Java
- ✅ Analyze time and space complexity with asymptotic notation
- ✅ Choose the right data structure for a given problem
- ✅ Apply fundamental algorithm design strategies (divide-and-conquer, greedy, dynamic programming)
- ✅ Solve graph problems (shortest paths, MST, connectivity)
- ✅ Understand memory management and external-memory algorithms
- ✅ Confidently solve LeetCode medium/hard DSA problems
- ✅ Read and understand the Java Collections Framework source code

---

> **"Bad programmers worry about the code. Good programmers worry about data structures and their relationships."** — Linus Torvalds

Happy coding! 💻
