# Encapsulation
> Binding the data members & methods into a single unit is called `Encapsulation`.
> It is used to hide the implementation part and show the functionality for better readability and usability.



## Key points -
- The internal data of an object is hidden from the outside world, preventing direct access. `Data Hiding`
- Only validated or safe values can be assigned to an object's attributes using `setter` method. `Data Integrity`
- Encapsulated code is more flexible & reusable for future modifications or requirements. `Reusability`
- Sensitive data is protected as it cannot be accessed directly. `Security`
- Easy to change the data representation & implementation any time without changing other part of code. `Better code management`
- When one pass an object to a method, everything associated data members & methods are passed along. No need to pass individual
  members. `Simple parameter passing`
- Getter is to display the data & setter is to modify or set the data to provide the functionality to outside world but not to expose
  the implementation to outside. `Getter & Setter`
- Encapsulation can be achieved by declaring all the data members / fields as `private` and writing `public` methods to set & get values of those
  fields.


## Advantages -
- Data Hiding
- Data Integrity
- Code reusability
- Unit testing is very easy for the encapsulated code



## Disadvantages -
- Sometimes, `encapsulation` can make code more complex and hard to understand if it is not used in right way.
- Also, it can make more difficult for programmer to understand the code as most of it is completely hidden and not exposed outside.


## Common practices -
- Keep the class variables as `private` so that, no one outside the class can change them directly. `Use private fields`
- Always use `getter` and `setter` to set and get the values. `Use getter & setter methods`
- Always check the data inside setter methods before saving it to make sure it is correct. `Validate Data Before Modifying`
- Use access modifiers the right way to hide what should be hidden and show what is needed. `Control access with modifiers`


## Real world analogy -
```
   public class BankAccount {
    // 🛡️ Private fields (Encapsulation: Hide internal data)
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // ✅ Constructor to initialize a valid account
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }

    // ✅ Public getter - controlled read access (no setter for accountNumber or balance)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // ✅ Setter for name (optional - we assume name can be changed)
    public void setAccountHolderName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            this.accountHolderName = newName;
        } else {
            System.out.println("Name cannot be empty.");
        }
    }

    // ✅ Encapsulated logic to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // ✅ Encapsulated logic to withdraw money safely
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " successfully.");
        } else {
            System.out.println("Invalid withdrawal: Insufficient balance or invalid amount.");
        }
    }
}

public class BankAccountUseCase {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("SBIN12345678", "Abinash", 5000);

        // ✅ Encapsulated Access
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: ₹" + account.getBalance());

        // Trying to deposit money
        account.deposit(1000);  // ✅ Valid

        // Trying invalid deposit
        account.deposit(-500);  // ❌ Will be rejected

        // Withdraw valid amount
        account.withdraw(2000); // ✅

        // Withdraw more than balance
        account.withdraw(10000); // ❌ Insufficient funds

        System.out.println("Final Balance: ₹" + account.getBalance());
    }
}
```