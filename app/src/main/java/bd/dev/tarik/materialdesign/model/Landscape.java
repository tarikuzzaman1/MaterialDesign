package bd.dev.tarik.materialdesign.model;

import java.util.ArrayList;

import bd.dev.tarik.materialdesign.R;

public class Landscape {

    private int imageID;
    private String title;
    private String description;

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageID() {
        return imageID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public static ArrayList<Landscape> getData() {
        ArrayList<Landscape> dataList = new ArrayList<>();
        int[] images = getImages();
        for (int i = 0; i < images.length; i++) {
            Landscape landscape = new Landscape();
            landscape.setImageID(images[i]);
            landscape.setTitle("Landscape " + i);
            dataList.add(landscape);
        }
        return dataList;
    }

    private static int[] getImages() {

        int[] images = {
                R.drawable.thumb_1_0, R.drawable.thumb_1_1, R.drawable.thumb_1_2, R.drawable.thumb_1_3, R.drawable.thumb_1_4
        };

        return images;
    }
}
