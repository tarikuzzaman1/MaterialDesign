package bd.dev.tarik.materialdesign.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import bd.dev.tarik.materialdesign.R;

public class NavigationDrawerItem {

    private String title;
    private int imageId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public static List<NavigationDrawerItem> getData(){
        List<NavigationDrawerItem> dataList = new ArrayList<>();
        int[] imageIds = getImages();
        String[] titles = getTitles();
        for (int i = 0; i < titles.length; i++) {
            NavigationDrawerItem navItem = new NavigationDrawerItem();
            navItem.setTitle(titles[i]);
            navItem.setImageId(imageIds[i]);
            dataList.add(navItem);
        }
        return dataList;
    }

    private static int[] getImages() {
        return new int[]{
                R.drawable.icon_1, R.drawable.icon_2, R.drawable.icon_3, R.drawable.icon_4
        };
    }

    private static String[] getTitles(){
        return new String[] {
                "Birds", "Animals", "Forest", "Ocean"
        };
    }
}
