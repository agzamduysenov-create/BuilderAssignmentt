package teabuilder;

public class BubbleTeaBuilder implements TeaBuilder {
    public String teaType;
    public String size;
    public int sugar;
    public String milk;
    public String topping;
    public boolean isHot;

    @Override
    public TeaBuilder setTeaType(String teaType) {
        this.teaType = teaType;
        return this;
    }

    @Override
    public TeaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public TeaBuilder setSugar(int sugar) {
        this.sugar = sugar;
        return this;
    }

    @Override
    public TeaBuilder setMilk(String milk) {
        this.milk = milk;
        return this;
    }

    @Override
    public TeaBuilder setTopping(String topping) {
        this.topping = topping;
        return this;
    }

    @Override
    public TeaBuilder setHot(boolean hot) {
        this.isHot = hot;
        return this;
    }

    @Override public String getTeaType() { return teaType; }
    @Override public String getSize() { return size; }
    @Override public int getSugar() { return sugar; }
    @Override public String getMilk() { return milk; }
    @Override public String getTopping() { return topping; }
    @Override public boolean isHot() { return isHot; }

    @Override
    public Tea build() {
        if (topping == null) {
            throw new IllegalStateException("Bubble tea must have a topping!");
        }
        return new Tea(this);
    }
}