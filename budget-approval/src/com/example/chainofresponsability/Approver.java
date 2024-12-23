package com.example.chainofresponsability;

public abstract class Approver {
  protected Approver nextApprover;

  public void setNextApprover(Approver nextApprover) {
    this.nextApprover = nextApprover;
  }

  public abstract void approveRequest(double amount);
}