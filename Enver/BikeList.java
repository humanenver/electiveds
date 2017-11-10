package Enver;



public class BikeList {

    private String model;
    private int vinnum;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVinNum() {
        return vinnum;
    }

    public void setVinNum(int vinnum) {
        this.vinnum = vinnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BikeList bikelist = (BikeList) o;

        return vinnum == bikelist.vinnum;
    }

    @Override
    public int hashCode() {
        return vinnum;
    }
}
