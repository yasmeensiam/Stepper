package com.example.yasmeen.stepper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import Adapter.PostsAdapter;
import Adapter.TabsBottomAdapter;
import Adapter.TapsAdapter;
import Model.Post;
import Model.Step;

public class MainActivity extends AppCompatActivity {
    List<Step> steps;
    List<Post> posts;
    TabsBottomAdapter tabsBottomAdapter;
    RecyclerView recyclerView, recyclerViewPost;
    PostsAdapter postsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        steps = new Vector<>();
        posts = new Vector<>();
        steps.add(new Step("1", R.drawable.person_page));
        steps.add(new Step("2", R.drawable.catigory));
        steps.add(new Step("3", R.drawable.home_page));
        steps.add(new Step("4", R.drawable.add_post));
        posts.add(new Post(R.drawable.person1, R.drawable.recipe1, R.drawable.shaer_icon, R.drawable.like_icon, R.drawable.comment_icon, R.drawable.date_time, R.drawable.more, R.drawable.location_icon, R.drawable.recipe_name_icon, " ياسمين اياد صيام", "فلسطين الولايات المتحدة", "كبدة مشوحة ورقائق البطاطا", 100, 100, "منذ 10 دقيقة "));
        posts.add(new Post(R.drawable.person2, R.drawable.recipe2, R.drawable.shaer_icon, R.drawable.like_icon, R.drawable.comment_icon, R.drawable.date_time, R.drawable.more, R.drawable.location_icon, R.drawable.recipe_name_icon, "بلسم فيصل العشي", "فلسطين الولايات المتحدة", "دجاج مشوي على الفحم", 100, 100, "منذ 10 دقيقة "));
        recyclerView = (RecyclerView) findViewById(R.id.view);
        recyclerViewPost = (RecyclerView) findViewById(R.id.List_Post);
        postsAdapter=new PostsAdapter(this,posts);
        tabsBottomAdapter = new TabsBottomAdapter(this, steps);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewPost.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(tabsBottomAdapter);
        recyclerViewPost.setAdapter(postsAdapter);
    }
}
