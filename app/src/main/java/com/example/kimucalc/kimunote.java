package com.example.kimucalc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

public class kimunote extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton fab;
    Adapter adapter;
    List<Model> notesList;
    DatabaseClass databaseClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kimunote);

        recyclerView=findViewById(R.id.recycler_view);
        fab=findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(kimunote.this,AddNotesActivity.class);
                startActivity(intent);
            }
        });



        notesList=new ArrayList<>();

        databaseClass=new DatabaseClass(this);
        fetchAllNotesFromDatabase();


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new Adapter(this,kimunote.this,notesList);
        recyclerView.setAdapter(adapter);
    }

    void fetchAllNotesFromDatabase()
    {
       Cursor cursor= databaseClass.readAllData();
       if(cursor.getCount()==0)
       {
           Toast.makeText(this,"No data to show", Toast.LENGTH_SHORT).show();
       }
       else
       {
           while(cursor.moveToNext())
           {
               notesList.add(new Model(cursor.getString(0),cursor.getString(1),cursor.getString(2)));
           }
       }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);

        MenuItem searchItem=menu.findItem(R.id.searchbar);
        SearchView searchView=(SearchView)searchItem.getActionView();
        searchView.setQueryHint("Search Notes Here");

        SearchView.OnQueryTextListener listener=new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return true;
            }
        };

        searchView.setOnQueryTextListener(listener);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.delete_all_notes)
        {
            deleteAllNotes();
        }
        return super.onOptionsItemSelected(item);
    }

    private void deleteAllNotes()
    {
        DatabaseClass db =new DatabaseClass(kimunote.this);
        db.deleteAllNotes();
        recreate();
    }
}



