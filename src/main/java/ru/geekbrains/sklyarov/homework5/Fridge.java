package ru.geekbrains.sklyarov.homework5;

public class Fridge {
    private String model, manufacturer;
    private float width, height, depth, volume, volumeOfFreezer;

    public float getVolume() {
        return volume;
    }

    public float getVolumeOfFreezer() {
        return volumeOfFreezer;
    }

    public void setVolume(float volume){
        this.volume = volume;
    }

    public Fridge(String manufacturer, String model, float width, float height, float depth, float volume, float volumeOfFreezer) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.volume = volume;
        this.volumeOfFreezer = volumeOfFreezer;
    }

    public void printInfo(){
        System.out.printf("Производитель: %s; Модель: %s; Ширина: %f; Высота: %f; Глубина: %f; Объем холодильной камеры: %f;" +
                " Объем морозильной камеры: %f",manufacturer,model,width,height,depth,volume,volumeOfFreezer);
    }

    public float getVolumeOfDimension(){
        return width * height * depth;
    }
}
