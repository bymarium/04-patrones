package com.example.chainofresponsability;

public class Director extends Approver {
    @Override
    public void approveRequest(double amount) {
        System.out.println("Director aprobó la solicitud de $" + amount);
    }
}