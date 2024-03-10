package com.sposs;

public class InvoiceItem extends Item {

    private Storage storage = new Storage();
    private float total = 0;

    public InvoiceItem(String code, int quantity) {
        try {
            storage.starter();
            Item item = storage.findByCode(code);
            this.setCode(code);
            this.setDescription(item.getDescription());
            this.setUPrice((int) (quantity * item.getUPrice()));
            this.setQuantity(quantity);
            this.total += this.getUPrice();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "InvoiceItem [" + ", storage=" + storage + "]" + super.toString();
    }

    public float getTotal() {
        return total;
    }

}
