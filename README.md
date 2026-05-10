# PulseMQ ⚡

A lightweight Kafka-inspired event streaming engine built using Java multithreading and asynchronous queues.

## Features

- Topic-based messaging
- Producer-Consumer architecture
- Multithreading
- BlockingQueue
- ConcurrentHashMap
- Asynchronous message processing
- Interactive console interface

## Tech Stack

- Java
- Multithreading
- Concurrency Utilities
- BlockingQueue
- Executor Pattern

## Project Structure

```bash
src/
│
├── Broker.java
├── Producer.java
├── Consumer.java
├── Message.java
└── Main.java
```

## How It Works

```text
Producer ---> Broker ---> Topic Queue ---> Consumer
```

## Sample Output

```text
[TOPIC CREATED] orders

[PUBLISHED] [ORDERS] Pizza Ordered

[CONSUMED BY Order-Service]
[ORDERS] Pizza Ordered
```

## Concepts Used

- Event-Driven Architecture
- Asynchronous Processing
- Producer Consumer Pattern
- Thread-safe Systems
- Queue-based Messaging
- Concurrent Programming

## Future Improvements

- Retry Queue
- Dead Letter Queue
- Message Persistence
- REST APIs using Spring Boot
- Web Dashboard
- Distributed Consumers

---

Built with Java ☕
