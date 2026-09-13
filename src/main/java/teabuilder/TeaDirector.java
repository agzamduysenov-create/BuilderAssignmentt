package teabuilder;

public class TeaDirector {

    public void makeClassicBubbleTea(TeaBuilder builder) {
        builder.setTeaType("Black Tea")
                .setSize("Large")
                .setSugar(50)
                .setMilk("Oat Milk")
                .setTopping("Tapioca")
                .setHot(false);
    }
}