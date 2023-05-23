package com.example.livestudiprojetrestaurant.business;

public class Table {

    private int numeroTable;
    private int nombreCouverts;

    public Table() {
    }

    public Table(int numeroTable, int nombreCouverts) {
        this.numeroTable = numeroTable;
        this.nombreCouverts = nombreCouverts;
    }

    public int getNumeroTable() {
        return numeroTable;
    }

    public void setNumeroTable(int numeroTable) {
        this.numeroTable = numeroTable;
    }

    public int getNombreCouverts() {
        return nombreCouverts;
    }

    public void setNombreCouverts(int nombreCouverts) {
        this.nombreCouverts = nombreCouverts;
    }

    @Override
    public String toString() {
        return "Table{" +
                "numeroTable=" + numeroTable +
                ", nombreCouverts=" + nombreCouverts +
                '}';
    }
}
