Credits: https://github.com/koushikkothagal/reactive-java-workshop

# Objective

- Learn Reactive programming.
- operators and transforming reactive streams.
- Patterns, common best practices to write reactive porgramming and pitfalls
- Reactive programming + Spring boot

# Pre-requisite

1. Java 11 or above. This repo is in Java 17
2. Collections
3. Streams

## Reactive Programming

1. A way of programming associated with Data streams and propagation of change.
2. Allows expressing and usage of static and dynamic data flows easily.
3. Facilitates automatic propagation of changed data flow.

# NOTE (in big letters): REACTIVE might not be ASYNC. They are 2 different concepts.

## Use case for Reactive programming

1. Places where Data scale is high.
2. High number of users.
3. High availability.
4. Reduce cost, especially when we don't have our own infrastructures.

# 2 types of Scaling

1. Vertical scaling- Increasing the resources of a single machine/pod. Example: rocessing, memory, storage, and network
   capability.
2. Horizontal Scaling- Adding more number of machines. Example: increasing capacity horizontally by adding additional
   servers.

## Need of Recursive programming

1. Whenever a request is made by a client to a server, a **Thread** is created. This thread is used to process the
   request. Another request comes, a new **Thread** is created. If the number of request increase, more number of
   threads will be created leading to Exception at threshhold.

## Problems if we don't use Reactive programming for a large appliucation

1. Single request processed at a time.
2. Multiple simultaneous users abstracted out.
3. Delays
4. we Pay with Sequential blocking operations.
5. We pay with Idling threads