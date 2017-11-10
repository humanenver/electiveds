package Enver;

public class Bike {

    private int bikeNumber;
    private  String name;
    private int manu;


    public Bike(Builder builder) {
        bikeNumber=builder.bikeNumber;
        name=builder.name;
        manu=builder.manu;

    }

    public static class Builder{
        private int bikeNumber;
        private  String name;
        private int manu;

        public Builder name(String value){
            this.name=value;
            return this;
        }

        public Builder manu(int value){
            this.manu=value;
            return this;
        }


        public Builder bikeNumber(int value){
            this.bikeNumber=value;
            return this;
        }

        public Bike build(){
            return new Bike(this);
        }

    }

    public int getbikeNumber() {
        return bikeNumber;
    }

    public String getName() {
        return name;
    }

    public int getManu() {
        return manu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bike)) return false;

        Bike student = (Bike) o;

        return bikeNumber == student.bikeNumber;
    }

    @Override
    public int hashCode() {
        return bikeNumber;
    }

}
