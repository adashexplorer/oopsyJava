# Access Modifiers

> Access modifiers as the name suggests defines how data members, member functions and classes can be accessed from other parts of our program

## Key points -
- Important part of building secure & modular code when designing large applications.
- Four access modifiers -
   - `private`
   - `public`
   - `protected`
   - `default` - No keyword required `Also called as package-private`
- Access modifiers are applied to `data members`, `member functions`, `classes`


## `default` keyword 
- When no access modifier is specified for a `class`, `method`, `data member`, it is believed to be of `default` access modifier.
- Also known as `package-private`
- Only classes within same package can access it.

```java
   /*
       Place this code inside a different package under defaultdemo pkg to test it.
   */
   package com.adash.explorer.oopsyjava.encapsulation.accessmodifiers.defaultdemo.outsidepkg;

   import com.adash.explorer.oopsyjava.encapsulation.accessmodifiers.defaultdemo.DefaultUseCase;

   public class DefaultUseCaseRunnerOutsidePkg {

        public static void main(String[] args) {
            DefaultUseCase defaultUseCase = new DefaultUseCase("Avinash");
            defaultUseCase.myName();
        }
    }
    /*
    Console O/P -
     /Users/adash/Hustle/oopsyJava/coreprinciples/src/com/adash/explorer/oopsyjava/encapsulation/accessmodifiers/defaultdemo/outsidepkg/DefaultUseCaseRunnerOutsidePkg.java:3:78
     java: com.adash.explorer.oopsyjava.encapsulation.accessmodifiers.defaultdemo.DefaultUseCase is not public in com.adash.explorer.oopsyjava.encapsulation.accessmodifiers.defaultdemo; cannot be accessed from outside package
     */
```


## `private` keyword
- The private access modifier is specified using the keyword `private`.
- The data members, methods declared as `private` can only be accessed with in the same class in which they are declared.
- Any other classes within the same package or different package will not have access to the private data members or member functions.
```java
   package com.adash.explorer.oopsyjava.encapsulation.accessmodifiers.privatedemo;
   
   class privateUseCaseOutsideClassRunner {
       public static void main(String[] args) {
           PrivateUseCase useCase = new PrivateUseCase();
           useCase.details(); // This throws compilation error as details() is private
       }
   }
```


## `public` keyword


## `protected` keyword