package Model;

import Controller.Controller;
import View.VirtualWalletGui;

public class VirtualWalletModel {
    private double funds = 100;
    private Controller controller;

    public VirtualWalletModel() {
    }

    public double getFunds() {
        return funds;
    }

    public void useFunds(double amount) {
        funds -= amount;
    }

    public void addFunds(double amount) {
        funds += amount;
    }
}
