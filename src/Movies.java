/**
 * Created by vanessamnoble on 1/17/17.
 */

public class Movies {

    private String title = "";
    private String category = "";

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public Movies(String title, String category) {
        //super();
        this.title = title;
        this.category = category;
    }

    public static void add(String title, String category) {

    }
}

