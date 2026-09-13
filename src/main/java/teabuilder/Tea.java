package teabuilder;

public class Tea {
    private String teaType;
    private String size;
    private int sugar;
    private String milk;
    private String topping;
    private boolean isHot;

    public Tea(TeaBuilder builder) {
        this.teaType = builder.getTeaType();
        this.size = builder.getSize();
        this.sugar = builder.getSugar();
        this.milk = builder.getMilk();
        this.topping = builder.getTopping();
        this.isHot = builder.isHot();
    }

    @Override
    public String toString() {
        return "Tea {" +
                "type='" + teaType + '\'' +
                ", size='" + size + '\'' +
                ", sugar=" + sugar + "%" +
                ", milk='" + milk + '\'' +
                ", topping='" + topping + '\'' +
                ", isHot=" + isHot +
                '}';
    }
}