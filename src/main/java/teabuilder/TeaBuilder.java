package teabuilder;

public interface TeaBuilder {
    TeaBuilder setTeaType(String teaType);
    TeaBuilder setSize(String size);
    TeaBuilder setSugar(int sugar);
    TeaBuilder setMilk(String milk);
    TeaBuilder setTopping(String topping);
    TeaBuilder setHot(boolean hot);

    // Геттеры, чтобы продукт мог забрать данные из строителя
    String getTeaType();
    String getSize();
    int getSugar();
    String getMilk();
    String getTopping();
    boolean isHot();

    Tea build();
}