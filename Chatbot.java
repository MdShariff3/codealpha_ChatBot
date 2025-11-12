package codeAlpha;

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🤖 Hello! I’m ChatBot — your virtual assistant.");
        System.out.println("Type 'bye' anytime to end the chat.\n");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.contains("hi") || userInput.contains("hello")) {
                System.out.println("ChatBot: Hi there! How can I help you today?");
            } 
            else if (userInput.contains("how are you")) {
                System.out.println("ChatBot: I’m just a program, but I’m feeling helpful today!");
            } 
            else if (userInput.contains("your name")) {
                System.out.println("ChatBot: I’m ChatBot, created using Java by Muhamed Shariff!");
            } 
            else if (userInput.contains("time")) {
                java.time.LocalTime time = java.time.LocalTime.now();
                System.out.println("ChatBot: The current time is " + time);
            } 
            else if (userInput.contains("weather")) {
                System.out.println("ChatBot: I can’t check the weather yet, but it’s always sunny in the code world ☀️");
            } 
            else if (userInput.contains("bye")) {
                System.out.println("ChatBot: Goodbye! Have a great day ahead 👋");
                break;
            } 
            else {
                System.out.println("ChatBot: Hmm, I’m not sure about that. Can you rephrase?");
            }
        }

        scanner.close();
    }
}
