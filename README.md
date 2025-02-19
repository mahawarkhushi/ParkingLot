# ParkingLot

#Parking Lot System Design
Design Approach:
1>    Class Design and SOLID Principles:


The system is designed to follow SOLID principles:  click
Single Responsibility Principle (SRP): 
Each class has a single responsibility. For example, the ParkingLot class handles the parking logic, while the Vehicle class stores vehicle details.
    

Open/Closed Principle (OCP): 
The design allows for easy extension of functionality (e.g., new vehicle types or parking strategies) without modifying existing code.

Liskov Substitution Principle (LSP):
The system allows for the substitution of different vehicle types (Car, Bike, Truck) without affecting the integrity of the system.
     
Interface Segregation Principle (ISP): 
High-level modules (like the ParkingLot class) do not depend on low-level details, keeping the system decoupled and easy to maintain.

2>    Factory Design Pattern:
        To handle the creation of different vehicle types, a Factory Design Pattern is implemented. The VehicleFactory class dynamically creates the appropriate vehicle type (Car, Bike, Truck) based on user input, encapsulating the instantiation logic and promoting flexibility for future vehicle types.


3>    Strategy Design Pattern (Optional for Spot Allocation):
Though not currently implemented, the Strategy Design Pattern can be used for optimizing the assignment of the nearest available parking spots. Different strategies (such as first available spot, nearest spot, or random allocation) can be implemented and applied based on specific criteria.


4>    Concurrency Considerations: 
  While the system is not intended for extremely large-scale use, concurrency could still arise, especially when two or more users attempt to park vehicles at the same time. To address potential race conditions:

Synchronization Mechanisms:  The use of Java's synchronized keyword or concurrency data structures (like ReentrantLock) can ensure thread-safety during concurrent access to shared resources, such as the parking spots.
These mechanisms would prevent multiple threads from accessing or modifying the parking spots concurrently, ensuring consistency and avoiding race conditions.

System Flow:

The command-line interface (CLI) system provides the following options:

1> Park Vehicle:

The user provides the vehicle number and type. The system checks for     available spots and parks the vehicle accordingly. If no spots are available, the system displays "Cannot park the vehicle."

2> Remove Vehicle:

The user inputs the vehicle number to remove. If the vehicle is found, it is removed, and the corresponding parking spot(s) are freed up. If the vehicle is not found, the system displays "Vehicle not found."

3> Display Available Spots:

The user can view the number of available spots on each floor of the parking lot.

4> Exit:

The user can exit the system, and the program terminates with a confirmation message.

If an invalid option is entered, the system displays "Invalid choice."



Implementation in Java:

The system is implemented in Java, utilizing core object-oriented principles and patterns. The ParkingLot class manages the parking logic, while the Vehicle class stores vehicle details such as type and parking spot. A sample command-line interface allows users to interact with the system for parking and removing vehicles, displaying available spots, and querying the status of the parking lot.


Future Enhancements:

1>   Dynamic Spot Allocation:
 
The strategy for parking spot assignment can be further optimized by implementing the Strategy Design Pattern, allowing users to choose or automatically apply different parking strategies (e.g., prioritizing compact cars or trucks).



2> Scaling for Larger Use Cases:

The system can be further optimized to handle more complex use cases, such as real-time tracking of vehicle locations or integration with IoT devices for automated parking.


Conclusion:

This parking lot system has been designed with simplicity, scalability, and extensibility in mind. By following solid object-oriented design principles and leveraging design patterns like Factory and Strategy, the system is modular and flexible. Concurrency is handled with appropriate synchronization mechanisms to ensure safe multi-user operations. The design allows for easy future enhancements, making it adaptable to evolving requirements.

