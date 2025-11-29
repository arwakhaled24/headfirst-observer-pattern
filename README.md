# Observer Pattern (Java)
This repository contains a simple implementation of the **Observer Design Pattern**, based on the example from *Head First Design Patterns*.

## Overview
The Observer Pattern defines a one‑to‑many relationship between objects. When the subject updates its data, it automatically notifies all registered observers.

## How It Works
* `Subject` (Observable) exposes methods to register, remove, and notify observers.
* `Observer` defines the update method that receives new data from the subject.
* The concrete subject holds the internal state of the system (whatever data your implementation provides).
* Any concrete observer reacts when the subject notifies it of changes.

## Purpose
This example demonstrates:
* Loose coupling between objects
* Automatic updates to multiple observers
* A clean and extensible design

<img width="836" height="421" alt="ObserverPatternSet-2" src="https://github.com/user-attachments/assets/bb2ea482-706c-4a2f-981a-fd8eda2f4699" />

