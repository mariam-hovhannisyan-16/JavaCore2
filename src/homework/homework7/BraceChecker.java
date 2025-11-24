package homework.homework7;

import homework.homework2.Stack;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack charStack = new Stack(text.length());
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    charStack.push(c);
                    break;
                case ')':
                case ']':
                case '}':
                    if (charStack.isEmpty) {
                        System.out.println("Error: opened " + c + "at" + i + " but nothing opened");
                    } else {
                            char last = charStack.pop();
                            if (!matches(last, c)) {
                                System.out.println("Error: opened " + last + " but closed " + c + " at" + i);
                            }

                        }
                      break;
                    }
            }
        while (!charStack.isEmpty()) {
            char last = charStack.pop();
            System.out.println("Error: opened " + last + " but not closed ");
        }
        }
        private boolean matches(char open, char close) {
        return (open == '(' && close == ')' || (open =='[' && close == ']') || (open == '{' && close == '}'));
        }
    }

