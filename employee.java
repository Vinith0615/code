# Base class: Employee
//inheritance exercise
class Employee:
    def __init__(self, name, salary):
        self.name = name
        self.salary = salary

    def displayInfo(self):
        print(f"Name: {self.name}")
        print(f"Salary: {self.salary}")

# Derived class: Manager
class Manager(Employee):
    def __init__(self, name, salary, department):
        super().__init__(name, salary)
        self.department = department

    def displayInfo(self):
        super().displayInfo()
        print(f"Department: {self.department}")

# Create an object of Manager and print details
mgr = Manager("Alice Johnson", 85000, "Human Resources")
mgr.displayInfo()