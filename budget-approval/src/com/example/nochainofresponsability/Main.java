package com.example.nochainofresponsability;

public class Main {
  public static void main(String[] args) {
    approveRequest(500);    // Supervisor
    approveRequest(5000);   // Gerente
    approveRequest(20000);  // Director
  }

  public static void approveRequest(int amount) {
    if (amount <= 1000) {
      System.out.println("Supervisor aprobó la solicitud de $" + amount);
    } else if (amount <= 10000) {
      System.out.println("Gerente aprobó la solicitud de $" + amount);
    } else {
      System.out.println("Director aprobó la solicitud de $" + amount);
    }
  }
}