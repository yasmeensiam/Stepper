package Model;

/**
 * Created by yasmeen on 3/24/2016.
 */
public class Post {
    private int Person_Image;
    private int Food_Image;
    private int Share_Icon;
    private int Rating_Icon;
    private int Comment_Icon;
    private int Date_Icon;
    private int More_Icon;
    private int Image_State;
    private int Recipe_Icon;
    private String User_name;
    private String User_State;
    private String Recipe_Name;
    private int Share_Number;
    private int Comment_Number;
    private String Date_text;

    public Post(int person_Image, int food_Image, int share_Icon, int rating_Icon, int comment_Icon, int date_Icon, int more_Icon, int image_State, int recipe_Icon, String user_name, String user_State, String recipe_Name, int share_Number, int comment_Number, String date_text) {
        Person_Image = person_Image;
        Food_Image = food_Image;
        Share_Icon = share_Icon;
        Rating_Icon = rating_Icon;
        Comment_Icon = comment_Icon;
        Date_Icon = date_Icon;
        More_Icon = more_Icon;
        Image_State = image_State;
        Recipe_Icon = recipe_Icon;
        User_name = user_name;
        User_State = user_State;
        Recipe_Name = recipe_Name;
        Share_Number = share_Number;
        Comment_Number = comment_Number;
        Date_text = date_text;
    }

    public int getPerson_Image() {
        return Person_Image;
    }

    public int getFood_Image() {
        return Food_Image;
    }

    public int getShare_Icon() {
        return Share_Icon;
    }

    public int getRating_Icon() {
        return Rating_Icon;
    }

    public int getComment_Icon() {
        return Comment_Icon;
    }

    public int getDate_Icon() {
        return Date_Icon;
    }

    public int getMore_Icon() {
        return More_Icon;
    }

    public int getImage_State() {
        return Image_State;
    }

    public int getRecipe_Icon() {
        return Recipe_Icon;
    }

    public String getUser_name() {
        return User_name;
    }

    public String getUser_State() {
        return User_State;
    }

    public String getRecipe_Name() {
        return Recipe_Name;
    }

    public int getShare_Number() {
        return Share_Number;
    }

    public int getComment_Number() {
        return Comment_Number;
    }

    public String getDate_text() {
        return Date_text;
    }
}
