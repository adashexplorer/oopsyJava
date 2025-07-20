# Abstraction

## What is an Abstraction ?
> Process of hiding implementation details & only showing the essential details to the end user is called `Abstraction`.
> Focus is always on `What the object/feature does ?` instead of `How the object/feature does ?`

## Key features of Abstraction ?
 - It hides the underlying implementation and only shows what the feature does
 - It can contain both `abstract` and `concrete` methods.
 - The abstract methods in Abstract class has to be implemented in child / subclasses by `extending` it.
 - By abstracting functionality, changes in the implementation do not affect the code that depends on the abstraction as implementation
   is personal to the subclasses that is extending the Abstract classes.
 - In Java, Abstraction can be achieved by following two ways.
     - Abstract classes (Partial Abstraction)
     - Interface (`100%` Abstraction up-to `Java 7`.)
         - **Interfaces represents behavioural abstraction, but are no longer `100%` abstract after `Java 8`.**