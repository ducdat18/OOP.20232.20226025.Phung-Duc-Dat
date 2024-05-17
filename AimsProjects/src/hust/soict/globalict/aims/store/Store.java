package hust.soict.globalict.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

public class Store {
    public ArrayList<Media> itemsInStore = new ArrayList<>();
    public void addMedia(Media item){
        if (item != null){
            if(!this.itemsInStore.contains(item)){
                this.itemsInStore.add(item);
                System.out.println("***The item has been added to the store***");
            } else {
                System.out.println("***The item exists in the store***");
            }
        } else {
            System.out.println("***The given item is not available***");
        }
    }
    public void removeMedia(Media item){
        if (item != null){
            if(itemsInStore.contains(item)){
                itemsInStore.remove(item);
                System.out.println("***The item has been removed from the store***");
            } else {
                System.out.println("***The item does not exist in the store***");
            }
        } else {
            System.out.println("***The given item is not available***");
        }
    }
    public void printStore(){
        System.out.println("***********************************Store***********************************");
        System.out.println("Ordered Items:");
        for (Media item : itemsInStore) {
            System.out.println(item.toString());
        }
        System.out.println("***************************************************************************");
    }
    public Media searchTitle(String title) {
        for (Media item : this.itemsInStore) {
            if (item.isMatch(title)) {
                return item;
            }
        }
        return null;
    }
}
