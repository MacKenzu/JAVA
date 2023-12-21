package task_1.OOP_1.domen.service;

import java.util.List;

import task_1.OOP_1.domen.product;

public class VendingMachine {
    private Holder holder;
    private CoinDispenser coinDispenser;
    private Display display;
    private List <product> assort;
    public VendingMachine(Holder holder, CoinDispenser coinDispenser, Display display, List<product> assort) {
        this.holder = holder;
        this.coinDispenser = coinDispenser;
        this.display = display;
        this.assort = assort;
    }
    public Holder getHolder() {
        return holder;
    }
    public CoinDispenser getCoinDispenser() {
        return coinDispenser;
    }
    public Display getDisplay() {
        return display;
    }
    public List<product> getAssort() {
        return assort;
    }
    public void setHolder(Holder holder) {
        this.holder = holder;
    }
    public void setCoinDispenser(CoinDispenser coinDispenser) {
        this.coinDispenser = coinDispenser;
    }
    public void setDisplay(Display display) {
        this.display = display;
    }
    public void setAssort(List<product> assort) {
        this.assort = assort;
    }
    

    
}
