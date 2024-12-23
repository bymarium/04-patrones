package com.example.chainofresponsability;

public class Manager extends Approver {
    @Override
    public void approveRequest(double amount) {
        if (amount <= 10000) {
            System.out.println("Gerente aprobó la solicitud de $" + amount);
        } else if (nextApprover != null) {
            nextApprover.approveRequest(amount);
        }
    }
}