package com.rathana.android_menu;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_option, menu);

        //implement search view
        MenuItem searchItem= menu.findItem(R.id.search);
        SearchView searchView = (SearchView)  searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Log.e("search" ,query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.e("search" ,newText);
                return false;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share:
                showMessage("Share click");
                return true;
            case R.id.favorite:
                showMessage("favorite click");
                return true;
            case R.id.theme:
                showMessage("change theme click");
                return true;
            case R.id.setting:
                showMessage("setting click");
                return true;
        }

        return  false;
    }


    private void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}
