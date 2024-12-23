package com.example.chainofresponsability;

public class Supervisor extends Approver {
    @Override
    public void approveRequest(double amount) {
        if (amount <= 1000) {
            System.out.println("Supervisor aprobó la solicitud de $" + amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        }
    }
}