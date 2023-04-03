package com.example.gopal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<User> usersList;
    private RecyclerView recyclerView;
    private recyclerAdapter.RecyclerViewClickListener listener;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        usersList = new ArrayList<>();
        
        setUserInfo();
        setAdapter();
    }

    private void setAdapter() {
        setOnClickListener();
        recyclerAdapter adapter = new recyclerAdapter(usersList, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        listener = new recyclerAdapter.RecyclerViewClickListener() {
            @Override
            public void onCLick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                intent.putExtra("username", usersList.get(position).getUsername());
                intent.putExtra("power", usersList.get(position).getPowerrr());
                intent.putExtra("image", usersList.get(position).getImage());
                startActivity(intent);
            }
        };
    }

    private void setUserInfo() {
        usersList.add(new User("Boboiboy", "Elemental", R.drawable.boboiboy));
        usersList.add(new User("Gopal", "Tukaran makanan", R.drawable.gopal));
        usersList.add(new User("Ying", "Lari laju", R.drawable.ying));
        usersList.add(new User("Yaya", "Bisa terbang dan kuat", R.drawable.yaya));
        usersList.add(new User("Fang", "Bayangan", R.drawable.fang));
        usersList.add(new User("Boboiboy", "Elemental", R.drawable.boboiboy));
        usersList.add(new User("Gopal", "Tukaran makanan", R.drawable.gopal));
        usersList.add(new User("Ying", "Lari laju", R.drawable.ying));
        usersList.add(new User("Yaya", "Bisa terbang dan kuat", R.drawable.yaya));
        usersList.add(new User("Fang", "Bayangan", R.drawable.fang));
        usersList.add(new User("Boboiboy", "Elemental", R.drawable.boboiboy));
        usersList.add(new User("Gopal", "Tukaran makanan", R.drawable.gopal));
        usersList.add(new User("Ying", "Lari laju", R.drawable.ying));
        usersList.add(new User("Yaya", "Bisa terbang dan kuat", R.drawable.yaya));
        usersList.add(new User("Fang", "Bayangan", R.drawable.fang));
    }
}