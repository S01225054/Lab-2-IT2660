## IT-2660 - Lab 2
### Instructions: In Main.java, youll add all of the code for the following steps in the methods linkedList(), queue(), and stack(). Leave the comments in the code and add your code just after each comment.


#### In linkedList()

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        linkedList();
        queue();
        stack();
    }

    public static void linkedList() {
        // 1. Create a LinkedList<String> object called progLanguages
        LinkedList<String> progLanguages = new LinkedList<>();

        // 2. Add elements to progLanguages: "Java", "Python", "JavaScript", "C++"
        progLanguages.add("Java");
        progLanguages.add("Python");
        progLanguages.add("JavaScript");
        progLanguages.add("C++");

        // 3. Remove the element "C++" from the list using .remove()
        progLanguages.remove("C++");

        // 4. Add an element "HTML" at index 2.
        progLanguages.add(2, "HTML");

        // 5. Iterate over progLanguages and use println() to output each element
        Iterator<String> it = progLanguages.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

#### In queue()

    public static void queue() {
        // 6. Create a Queue<String> called q
        Queue<String> q = new LinkedList<>();

        // 7. Add 5 first names to q
        q.add("Bruce");
        q.add("Jason");
        q.add("Tim");
        q.add("Arthur");
        q.add("John");

        // 8. Uncomment the following line:
        System.out.println("Elements of queue: " + q);

        // 9. Remove the head of the queue and assign it to a String variable removedElement.
        String removedElement = q.remove();
        // Display the value of "Removed element: " + removedElement
        System.out.println("Removed element: " + removedElement);

        // 10. View the head of the queue using peek(). Output its value.
        System.out.println("Head of queue: " + q.peek());

        // 11. Using for(String element : q), output all of the values in the queue
        for (String element : q) {
            System.out.println(element);
        }
    }

#### In stack()

    public static void stack() {
        // 13. Create a Stack<String> called bookStack
        Stack<String> bookStack = new Stack<>();

        // 14. Push the following book titles onto bookStack: "Clean Code", "Design Patterns", "Pragmatic Programmer"
        bookStack.push("Clean Code");
        bookStack.push("Design Patterns");
        bookStack.push("Pragmatic Programmer");

        // 15. pop() 1 book off the stack. Display its value
        System.out.println("Popped book: " + bookStack.pop());

        // 16. Use the peek() method to view the top book on the stack
        System.out.println("Top book: " + bookStack.peek());

        // 17. push() "Web DB Technologies" onto the stack
        bookStack.push("Web DB Technologies");

        // 18. Use the peek() method to view the top book on the stack
        System.out.println("Top book after push: " + bookStack.peek());

        // 19. Search for "Design Patterns" in the stack. Display the results of the search.
        int position = bookStack.search("Design Patterns");
        System.out.println("\"Design Patterns\" found at position: " + position);

        // 20. Call empty(). Output the results
        System.out.println("Is the stack empty? " + bookStack.empty());

        // 21. Print the titles of all of the books on the stack
        System.out.println("Books on stack:");
        for (String book : bookStack) {
            System.out.println(book);
        }
    }
}