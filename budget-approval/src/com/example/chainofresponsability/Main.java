package com.example.chainofresponsability;

public class Main {
  public static void main(String[] args) {
    Approver supervisor = new Supervisor();
    Approver manager = new Manager();
    Approver director = new Director();

    supervisor.setNextApprover(manager);
    manager.setNextApprover(director);

    supervisor.approveRequest(500);    // Supervisor
    supervisor.approveRequest(5000);   // Gerente
    supervisor.approveRequest(20000);  // Director
  }
}