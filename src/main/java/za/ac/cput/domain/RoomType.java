package za.ac.cput.domain;

public class RoomType {
    private double length;
    private double width;
    private double height;
    private double capacity;
    private double price;

    public RoomType() {

    }

    public RoomType(RoomType.Builder builder) {
        this.length = builder.length;
        this.width = builder.width;
        this.height = builder.height;
        this.capacity = builder.capacity;
        this.price = builder.price;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }



    @Override
    public String toString() {
        return "RoomType{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

    public static class Builder {
        private double length;
        private double width;
        private double height;
        private double capacity;
        private double price;

        public RoomType.Builder setLength(double length) {
            this.length = length;
            return this;
        }

        public RoomType.Builder setWidth(double width) {
            this.width = width;
            return this;
        }

        public RoomType.Builder setHeight(double height) {
            this.height = height;
            return this;
        }

        public RoomType.Builder setCapacity(double capacity) {
            this.capacity = capacity;
            return this;
        }

        public RoomType.Builder setPrice(double price) {
            this.price = price;
            return this;
        }
        public Builder copy(RoomType roomType) {
            this.length = roomType.length;
            this.width = roomType.width;
            this.height = roomType.height;
            this.capacity = roomType.capacity;
            this.price = roomType.price;
        }

        public RoomType build() {
            return new Address(this);
        }
    }
    }
}
