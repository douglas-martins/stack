package br.univali.kob.model;

import java.util.Arrays;
import java.util.Objects;

/**
 * A class that wil represent a Stack.
 */
public class Stack {
    private Object[] elements;
    private int size;
    private int cardinality;

    /**
     * Default class constructor.
     * @param size: int with the max size the stack will can handle.
     */
    public Stack(int size) {
        this.size = size;
        this.elements = new Object[this.size];
        this.cardinality = -1;
    }

    /**
     * Get the stack elements (all in one array).
     * @return Object[] with the elements omn the stack.
     */
    public Object[] getElements() {
        return this.elements;
    }

    /**
     * Get stack max size.
     * @return int with the stack max size.
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Get the stack total of elements.
     * @return int with the total of elements on the stack.
     */
    public int stackTotal() {
        return this.cardinality;
    }

    /**
     * Check if the stack is empty (without elements).
     * @return boolean with true if the stack is empty and false if not.
     */
    public boolean isEmpty() {
        return this.cardinality <= 0;
    }

    /**
     * Check if the stack has space for one more element.
     * @return boolean with true if the stack has space to insert a element and false if not.
     */
    public boolean hasSpace() {
        return (this.cardinality < this.size);
    }

    /**
     * Check if a element given is on that stack or not.
     * @param obj: Object that will be searched on the stack.
     * @return boolean with true if the object is on the stack and false if not.
     */
    public boolean isOnStack(Object obj) {
        for (int i = 0; i < this.cardinality; i++) {
            if (this.elements[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check if the position is valid to insert on the stack or not.
     * @param position: int with the position that will be checked.
     * @return boolean with true if the position is valid and false if not.
     */
    public boolean isValidPosition(int position) {
        return (position < this.size);
    }

    /**
     * Get one element on the stack, based on the position given.
     * @param position: int with the position of object that will be returned.
     * @return Object reference for the element on stack (null if the position not valid).
     */
    public Object getStackElement(int position) {
        if (isValidPosition(position)) {
            return this.elements[position];
        } else {
            return null;
        }
    }

    /**
     * Get the element on the top of stack.
     * @return Object reference for the element on the top of stack
     */
    public Object getTop() {
        return this.elements[this.cardinality];
    }

    /**
     * Insert a object on the stack.
     * @param obj: Object that will be inserted on the stack.
     */
    public void insert(Object obj) {
        if (!hasSpace()) {
            System.out.println("Overflow!");
        } else {
            this.cardinality++;
            this.elements[this.cardinality] = obj;
        }
    }

    /**
     * Remove a element on the stack.
     */
    public void remove() {
        if (isEmpty()) {
            System.out.println("Underflow!");
        } else {
            this.elements[this.cardinality] = null;
            this.cardinality--;
        }
    }

    /**
     * Display on console the current stack (from top to end).
     */
    public void print() {
        System.out.print("Stack: { ");
        for (int i = this.cardinality; i >= 0;) {
            System.out.print(this.elements[i]);
            i--;
            if (i >= 0) { System.out.print(" --> "); }
        }
        System.out.println(" }");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stack stack = (Stack) o;
        return size == stack.size &&
                cardinality == stack.cardinality &&
                Arrays.equals(elements, stack.elements);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size, cardinality);
        result = 31 * result + Arrays.hashCode(elements);
        return result;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                ", cardinality=" + cardinality +
                '}';
    }
}
