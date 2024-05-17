package com.example.prm392_slot4.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.prm392_slot4.Models.Product;
import com.example.prm392_slot4.R;

import java.util.List;

public class ProductAdapter extends BaseAdapter {

    private Context context;
    private List<Product> productList;
    private LayoutInflater inflater;


    public ProductAdapter(Context context, List<Product> productList) {
        this.context = context;
        this.productList = productList;
        this.inflater = LayoutInflater.from(context); // Khởi tạo inflater ở đây
    }

    @Override
    public int getCount() {
        return productList.size();
    }

    @Override
    public Object getItem(int position) {
        return productList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        ImageView productImage = convertView.findViewById(R.id.product_image);
        TextView productCategory = convertView.findViewById(R.id.product_category);
        TextView productName = convertView.findViewById(R.id.product_name);
        TextView productPrice = convertView.findViewById(R.id.product_price);
        Button buyButton = convertView.findViewById(R.id.buy_button);

        Product product = productList.get(position);


        productImage.setImageResource(R.drawable.android); // Sử dụng hình ảnh mặc định


        //load information
        productCategory.setText(product.getCategory());
        productName.setText(product.getName());
        productPrice.setText(String.format("$%.2f", product.getPrice()));

        // Set click listener for the button
        buyButton.setOnClickListener(v -> {
            // Handle buy button click
        });

        return convertView;
    }
}
