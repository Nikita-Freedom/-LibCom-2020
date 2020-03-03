package net.smallacademy.tabs.Place;

public class PlaceModel {
    private String Name;
    private int Photo;
    public PlaceModel(){
    }
    public  PlaceModel(String name, int photo){
        Name = name;
        Photo = photo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
