package com.fintech.tauma.finsoko;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProductListing extends Fragment {
    GridView gridView;
    String[] fruitNames = {"Gas","Tv","Lady Shoes","Wine","Man Shoe","Food","Cooking Oil","Phone","Salon","Perfume","Butchery","Gym"};
    int[] fruitImages = {R.drawable.cylinder,R.drawable.tv,R.drawable.ladyshoe,R.drawable.wine,R.drawable.manshoe,R.drawable.food,R.drawable.cooking,R.drawable.phone,R.drawable.hairstule,R.drawable.perfume,R.drawable.nyama,R.drawable.gymm};

    public ProductListing() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = getLayoutInflater().inflate(R.layout.fragment_product_listing,container,false);
        //finding listview
        gridView = (GridView) view.findViewById(R.id.gridview);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getContext(),ItemDesc.class);
                startActivity(intent);

            }
        });
        return view;
       // return inflater.inflate(R.layout.fragment_product_listing, container, false);
    }
    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return fruitImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.fruits);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(fruitNames[i]);
            image.setImageResource(fruitImages[i]);
            return view1;



        }
    }
}
