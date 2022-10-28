	public abstract void withdraw(double amount) throws InsufficientFundsException;

    package edu.met.banking;
    public class InsufficientFundsException extends Exception {}


    double payment = Double.parseDouble(args[0]);