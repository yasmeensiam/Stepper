package Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.yasmeen.stepper.R;
import java.util.List;
import Model.Post;

/**
 * Created by yasmeen on 3/24/2016.
 */
public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.ViewHolders> {

    private List<Post> postList;
    Context context;
    boolean status = true;


    public PostsAdapter(Context context, List<Post> postList) {
        this.postList = postList;
        this.context = context;
    }

    @Override
    public ViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post, parent, false);

        return new ViewHolders(itemView);
    }

    @Override
    public void onBindViewHolder(PostsAdapter.ViewHolders holder, int position) {
        Post post = postList.get(position);
        holder.comment.setImageResource(post.getComment_Icon());
        holder.date.setImageResource(post.getDate_Icon());
        holder.location.setImageResource(post.getImage_State());
        holder.more.setImageResource(post.getMore_Icon());
        holder.person.setImageResource(post.getPerson_Image());
        holder.recipe.setImageResource(post.getFood_Image());
        holder.recipe_icon.setImageResource(post.getRecipe_Icon());
        holder.star1.setImageResource(post.getRating_Icon());
        holder.star2.setImageResource(post.getRating_Icon());
        holder.star3.setImageResource(post.getRating_Icon());
        holder.star4.setImageResource(post.getRating_Icon());
        holder.share.setImageResource(post.getShare_Icon());
        holder.comment_num.setText(String.valueOf(post.getComment_Number()));
        holder.date_text.setText(post.getDate_text());
        holder.person_name.setText(post.getPerson_Image());
        holder.location_name.setText(post.getUser_State());
        holder.share_num.setText(String.valueOf(post.getShare_Number()));
        holder.recipe_name.setText(post.getRecipe_Name());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }


    public class ViewHolders extends RecyclerView.ViewHolder {
        ImageView more;
        ImageView person;
        ImageView recipe;
        ImageView date;
        ImageView star1, star2, star3, star4;
        ImageView comment;
        ImageView share;
        ImageView location;
        ImageView recipe_icon;
        TextView person_name;
        TextView location_name;
        TextView recipe_name;
        TextView comment_num;
        TextView share_num;
        TextView date_text;

        public ViewHolders(View itemView) {
            super(itemView);
            more = (ImageView) itemView.findViewById(R.id.more);
            person = (ImageView) itemView.findViewById(R.id.profile_image);
            recipe = (ImageView) itemView.findViewById(R.id.recype_image);
            date = (ImageView) itemView.findViewById(R.id.date_icon);
            star1 = (ImageView) itemView.findViewById(R.id.star1);
            star2 = (ImageView) itemView.findViewById(R.id.star2);
            star3 = (ImageView) itemView.findViewById(R.id.star3);
            star4 = (ImageView) itemView.findViewById(R.id.star4);
            comment = (ImageView) itemView.findViewById(R.id.comment_icon);
            share = (ImageView) itemView.findViewById(R.id.share_icon);
            location = (ImageView) itemView.findViewById(R.id.state_icon);
            recipe_icon = (ImageView) itemView.findViewById(R.id.Recype_icon);
            person_name = (TextView) itemView.findViewById(R.id.person_name);
            location_name = (TextView) itemView.findViewById(R.id.state_name);
            recipe_name = (TextView) itemView.findViewById(R.id.Reciype_text);
            comment_num = (TextView) itemView.findViewById(R.id.comment_num);
            share_num = (TextView) itemView.findViewById(R.id.share_num);
            date_text = (TextView) itemView.findViewById(R.id.date_text);

        }
    }
}
