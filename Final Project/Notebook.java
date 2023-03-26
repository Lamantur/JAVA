import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private String name;
    private int amountRAM;
    private String processor;
    private int price;
    private String model;
    private String video;

    public Notebook(String name, int amountRAM, String processor, int price, String model, String video) {
        this.name = name;
        this.amountRAM = amountRAM;
        this.processor = processor;
        this.price = price;
        this.model = model;
        this.video = video;
    }

    public boolean validateObject() {
        return true;
    }

    public static List<String> propertiesForFilter() {
        List<String> list = new ArrayList<>();
        list.add("amountRAM");
        list.add("processor");
        list.add("price");
        list.add("model");
        list.add("video");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "Количество опретивной памяти:" + amountRAM +
                ", Процессор: " + processor + '\'' +
                ", Цена: " + price +
                ", Модель: " + model +
                ", Видеокарта: " + video;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

}