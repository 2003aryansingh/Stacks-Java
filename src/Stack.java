import java.util.EmptyStackException;

public class Stack {
    private Employee[] array;
    private int top;

    public Stack(int size) {
        this.array = new Employee[size];
    }

    public void push(Employee employee) {
        if(this.top == this.array.length) {
            Employee[] resizeArray = new Employee[2 * this.array.length];
            System.arraycopy(this.array, 0, resizeArray, 0, this.array.length);
            this.array = resizeArray;
        }

        this.array[this.top++] = employee;
    }

    public Employee pop() {
        if(this.isEmpty()) {
            throw new EmptyStackException();
        }

        Employee employee = this.array[--this.top];
        this.array[this.top] = null;
        return employee;
    }

    public boolean isEmpty() {
        return this.top == 0;
    }

    public Employee peak() {
        if(this.isEmpty()) {
            throw new EmptyStackException();
        }

        return this.array[this.top - 1];
    }

    public int size() {
        return this.top;
    }

    public void printStack() {
        for(int i = this.top - 1; i >= 0; i--) {
            System.out.println(this.array[i]);
        }
    }
}
