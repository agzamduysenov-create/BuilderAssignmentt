package teabuilder;

public class Main {
    public static void main(String[] args) {
        TeaDirector director = new TeaDirector();

        // Создаем через директора
        BubbleTeaBuilder bubbleBuilder = new BubbleTeaBuilder();
        director.makeClassicBubbleTea(bubbleBuilder);
        Tea order1 = bubbleBuilder.build();
        System.out.println("Order 1: " + order1);

        // Создаем свой вариант через цепочку методов (Fluent API)
        Tea order2 = new GreenTeaBuilder()
                .setTeaType("Green Jasmine")
                .setSize("Medium")
                .setSugar(0)
                .setMilk("No milk")
                .setTopping("Lemon")
                .setHot(true)
                .build();

        System.out.println("Order 2: " + order2);
    }
}