package com.example.androidlayoutexamples;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.androidlayoutexamples.RecyclerViewExample.ItemAdapter;
import com.example.androidlayoutexamples.RecyclerViewExample.ItemModel;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Escolha qual layout usar:
    private static final String LAYOUT_USADO = "RECYCLER"; // FRAME, LINEAR, RELATIVE, CONSTRAINT, RECYCLER

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (LAYOUT_USADO){
            case "FRAME":
                setContentView(R.layout.activity_frame);
                break;
            case "LINEAR":
                setContentView(R.layout.activity_linear);
                break;
            case "RELATIVE":
                setContentView(R.layout.activity_relative);
                break;
            case "CONSTRAINT":
                setContentView(R.layout.activity_constraint);
                break;
            case "RECYCLER":
                setContentView(R.layout.activity_recyclerview);
                setupRecyclerView();
                break;
        }
    }

    private void setupRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ItemModel> items = new ArrayList<>();
        items.add(new ItemModel("Item 1"));
        items.add(new ItemModel("Item 2"));
        items.add(new ItemModel("Item 3"));

        ItemAdapter adapter = new ItemAdapter(items);
        recyclerView.setAdapter(adapter);
    }
}
