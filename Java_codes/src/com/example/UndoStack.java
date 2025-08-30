package com.example;

import java.util.Stack;

public class UndoStack {
    public static void main(String[] args) {
        Stack<String> commandStack = new Stack<>();

        // Step 1: Add 3 commands
        commandStack.push("Open File");
        commandStack.push("Edit Line");
        commandStack.push("Save File");

        System.out.println("Initial stack: " + commandStack);

        // Step 2: Undo (pop)
        String undone = commandStack.pop();
        System.out.println("After undo: " + commandStack);

        // Step 3: Redo (add it back)
        commandStack.push(undone);
        System.out.println("After redo: " + commandStack);
    }
}
