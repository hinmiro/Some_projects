package Controller;

import Model.VirtualWalletModel;
import View.VirtualWalletLogGui;

public class Controller {
    private VirtualWalletModel engine;
    static private VirtualWalletLogGui gui;

    public Controller(VirtualWalletLogGui g) {
        gui = g;
        engine = new VirtualWalletModel();
    }

    public double getAmount() {
        return engine.getFunds();
    }

    public Controller getController(){return this;}

    public static void main(String[] args) {
        VirtualWalletLogGui.launch(VirtualWalletLogGui.class);
    }
}
