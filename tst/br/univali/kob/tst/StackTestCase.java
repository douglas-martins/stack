package br.univali.kob.tst;

import br.univali.kob.model.Stack;

public class StackTestCase {
    private static final int MAX = 10;
    private Stack stack;

    public static void main(String[] args) {
        System.out.println("########## STACK CLASS TESTS CASE ##########");
        StackTestCase stackTestCase = new StackTestCase();
        stackTestCase.stack = new Stack(MAX);

        // insert() test case
        stackTestCase.insertTestCase(MAX);
        System.out.println();
        System.out.println();

        // stackTotal() test case
        stackTestCase.stackTotalTestCase();
        System.out.println();
        System.out.println();

        // isEmpty() test case
        stackTestCase.isEmptyTestCase();
        System.out.println();
        System.out.println();

        // hasSpace() test case
        stackTestCase.hasSpaceTestCase();
        System.out.println();
        System.out.println();

        // isOnStack() test case
        stackTestCase.isOnStackTestCase(11);
        System.out.println();
        System.out.println();

        // isValidPosition() test case
        stackTestCase.isValidPosition(10);
        System.out.println();
        System.out.println();

        // getStackElement() test case
        stackTestCase.getStackElement(25);
        System.out.println();
        System.out.println();

        // getTop() test case
        stackTestCase.getTopTestCase();
        System.out.println();
        System.out.println();

        // remove() test case
        stackTestCase.removeTestCase();
        System.out.println();
        System.out.println();

        int i = 0;

        do {
            // remove() test case
            stackTestCase.removeTestCase();
            System.out.println();
            System.out.println();

            i++;
        } while (i < 5);

        System.out.println("########## STACK CLASS TESTS CASE ##########");
    }

    public void stackTotalTestCase() {
        System.out.println("========== STACK TOTAL TEST CASE ==========");
        System.out.println("Stack total is: " + this.stack.stackTotal());
        this.stack.print();
        System.out.println("========== STACK TOTAL TEST CASE ==========");
    }

    public void isEmptyTestCase() {
        System.out.println("========== IS EMPTY TEST CASE ==========");
        System.out.println("Stack is empty? " + this.stack.isEmpty());
        this.stack.print();
        System.out.println("========== IS EMPTY TEST CASE ==========");
    }

    public void hasSpaceTestCase() {
        System.out.println("========== HAS SPACE TEST CASE ==========");
        System.out.println("Stack has space? " + this.stack.hasSpace());
        System.out.println("Stack max size: " + MAX);
        System.out.println("Stack actual size: " + this.stack.stackTotal());
        this.stack.print();
        System.out.println("========== HAS SPACE TEST CASE ==========");
    }

    public void isOnStackTestCase(Object obj) {
        System.out.println("========== IS ON STACK TEST CASE ==========");
        System.out.println("Element " + obj + " is on stack? " + this.stack.isOnStack(obj));
        this.stack.print();
        System.out.println("========== IS ON STACK TEST CASE ==========");
    }

    public void isValidPosition(int position) {
        System.out.println("========== IS VALID POSITION TEST CASE ==========");
        System.out.println(position + " is a valid position on the stack? " + this.stack.isValidPosition(position));
        this.stack.print();
        System.out.println("========== IS VALID POSITION TEST CASE ==========");
    }

    public void getStackElement(int position) {
        System.out.println("========== GET STACK ELEMENT TEST CASE ==========");
        Object obj = this.stack.getStackElement(position);
        if (obj == null) {
            System.out.println("The position given is not valid!");
        } else {
            System.out.println("The element on position " + position + " in stack is: " + obj);
        }
        this.stack.print();
        System.out.println("========== GET STACK ELEMENT TEST CASE ==========");
    }

    public void getTopTestCase() {
        System.out.println("========== GET TOP TEST CASE ==========");
        System.out.println("The element on the top of stack is: " + this.stack.getTop());
        this.stack.print();
        System.out.println("========== GET TOP TEST CASE ==========");
    }

    public void insertTestCase(int quantity) {
        System.out.println("========== INSERT TEST CASE ==========");
        for (int i = 0; i < quantity; i++) {
            System.out.println("Try insert " + i + " on the stack...");
            this.stack.insert(i);
        }
        this.stack.print();
        System.out.println("========== INSERT TEST CASE ==========");
    }

    public void removeTestCase() {
        System.out.println("========== REMOVE TEST CASE ==========");
        System.out.println("Try to remove a element from stack...");
        this.stack.remove();
        this.stack.print();
        System.out.println("========== REMOVE TEST CASE ==========");
    }
}
