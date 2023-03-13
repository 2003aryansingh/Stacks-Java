public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(new Employee("aryan","singh", 88));
        stack.push(new Employee("samiya", "singh", 99));
        stack.push(new Employee("saumya", "vartak", 123));
        stack.push(new Employee("ganesh", "gajelly", 887));
        stack.push(new Employee("Arya", "shah", 898));

        stack.pop();
        stack.pop();
        stack.printStack();
    }
}