package com.fintech.tauma.finsoko;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

public class ItemDesc extends AppCompatActivity {
    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_desc);

        toolbar = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        toolbar.setTitle("Finsoko" +" Product itself");
        toolbar.setHomeButtonEnabled(true);
        toolbar.setDisplayHomeAsUpEnabled(true);
        toolbar.setHomeAsUpIndicator(R.drawable.arrow_white);

    }

  /*  public boolean onOptionsItemSelected(MenuItem item){
        if(item.){
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);

        }
        return super.onOptionsItemSelected(item);
    }*/

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {



        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.merchantmap:
                    MerchantLocation merchantLocation=new MerchantLocation();
                    Intent intent=new Intent(getApplicationContext(),MerchantLocation.class);
                    startActivity(intent);
                case R.id.buynow:
                    //will add item to cart here

            }
            return false;
        }
    };
}

