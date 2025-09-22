package library;

import java.util.Stack;
import java.util.Scanner;

public class BookStack {

   Stack<Integer> stack;
   int maxSize;

    public BookStack(int[] bookIDs) {
        this.maxSize = bookIDs.length;
        stack = new Stack<>();
        for (int id : bookIDs) {
            stack.push(id);
        }
    }

    public BookStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new Stack<>();
    }

   
    public void push(int x) {
        if (stack.size() < maxSize) {
            stack.push(x);
            System.out.println("Book ID " + x + " added to the stack.");
        } else {
            System.out.println("Stack is full");
        }
    }

    public void push(int x, int y) {
        if (stack.size() + 2 <= maxSize) {
            stack.push(x);
            stack.push(y);
            System.out.println("Book IDs " + x + " and " + y + " added to the stack.");
        } else {
            System.out.println("stack is full");
        }
    }

  
    public int pop() {
        if (!stack.isEmpty()) {
            int bookID = stack.pop();
            System.out.println("Book ID " + bookID + " removed from the stack.");
            return bookID;
        } else {
            System.out.println("Stack is empty");
            return -1; 
        }
    }

   
    public void pop(int n) {
        if (n > stack.size()) {
            System.out.println("Not enough books to pop.");
        } else {
            for (int i = 0; i < n; i++) {
                int bookID = stack.pop();
                System.out.println("Book ID " + bookID + " removed from the stack.");
            }
        }
    }

    
    public void display() {
        if (stack.isEmpty()) {
            System.out.println(" stack is empty.");
        } else {
            System.out.println("Books in the stack are: " + stack);
        }
    }

    
    public void display(int n) {
        if (n > stack.size()) {
            System.out.println("There are only " + stack.size() + " books in the stack.");
            n = stack.size();
        }

        System.out.println("Top " + n + " books in the stack: ");
        for (int i = stack.size() - 1; i >= stack.size() - n; i--) {
            System.out.println(stack.get(i));
        }
    }

    public static void main(String[] args) {
      
        BookStack bookStack = new BookStack(5);

      
        Scanner scanner = new Scanner(System.in);
        int choice;

        
        do {
            System.out.println("\nLibrary Stack Menu:");
            System.out.println("1. Push a single book ID");
            System.out.println("2. Push two book IDs");
            System.out.println("3. Pop a single book ID");
            System.out.println("4. Pop multiple book IDs");
            System.out.println("5. Display entire stack");
            System.out.println("6. Display top n books");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a book ID to push: ");
                    int bookID = scanner.nextInt();
                    bookStack.push(bookID);
                    break;

                case 2:
                    System.out.print("Enter two book IDs to push : ");
                    int bookID1 = scanner.nextInt();
                    int bookID2 = scanner.nextInt();
                    bookStack.push(bookID1, bookID2);
                    break;

                case 3:
                    bookStack.pop();
                    break;

                case 4:
                    System.out.print("Enter the number of books to be popped: ");
                    int n = scanner.nextInt();
                    bookStack.pop(n);
                    break;

                case 5:
                    bookStack.display();
                    break;

                case 6:
                    System.out.print("Enter the number of top books to display: ");
                    int topN = scanner.nextInt();
                    bookStack.display(topN);
                    break;


                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        scanner.close();
    }
}
