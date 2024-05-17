package com.example.prm392_slot4;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.prm392_slot4.Adapter.ProductAdapter;
import com.example.prm392_slot4.Models.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Product> products = new ArrayList<>();
        // Add sample data to products list
        products.add(new Product("Item 1", "Category 1", 10.0, "https://cdn.discordapp.com/attachments/909042920324202496/1222781867007283210/book-1-done.png?ex=66483edb&is=6646ed5b&hm=5788847ab43a8ca4dea3c7b39c4c55f81b87b3758c3a79e60784ccf88409a495&"));
        products.add(new Product("Item 2", "Category 1", 10.0, "https://cdn.discordapp.com/attachments/909042920324202496/1222781867007283210/book-1-done.png?ex=66483edb&is=6646ed5b&hm=5788847ab43a8ca4dea3c7b39c4c55f81b87b3758c3a79e60784ccf88409a495&"));
        products.add(new Product("Item 3", "Category 1", 10.0, "https://cdn.discordapp.com/attachments/909042920324202496/1222781867007283210/book-1-done.png?ex=66483edb&is=6646ed5b&hm=5788847ab43a8ca4dea3c7b39c4c55f81b87b3758c3a79e60784ccf88409a495&"));
        products.add(new Product("Item 4", "Category 1", 10.0, "https://cdn.discordapp.com/attachments/909042920324202496/1222781867007283210/book-1-done.png?ex=66483edb&is=6646ed5b&hm=5788847ab43a8ca4dea3c7b39c4c55f81b87b3758c3a79e60784ccf88409a495&"));
        products.add(new Product("Item 5", "Category 1", 10.0, "https://cdn.discordapp.com/attachments/909042920324202496/1222781867007283210/book-1-done.png?ex=66483edb&is=6646ed5b&hm=5788847ab43a8ca4dea3c7b39c4c55f81b87b3758c3a79e60784ccf88409a495&"));
        products.add(new Product("Item 6", "Category 1", 10.0, "https://cdn.discordapp.com/attachments/909042920324202496/1222781867007283210/book-1-done.png?ex=66483edb&is=6646ed5b&hm=5788847ab43a8ca4dea3c7b39c4c55f81b87b3758c3a79e60784ccf88409a495&"));
        products.add(new Product("Item 7", "Category 1", 10.0, "https://cdn.discordapp.com/attachments/909042920324202496/1222781867007283210/book-1-done.png?ex=66483edb&is=6646ed5b&hm=5788847ab43a8ca4dea3c7b39c4c55f81b87b3758c3a79e60784ccf88409a495&"));




        ProductAdapter adapter = new ProductAdapter(MainActivity.this, products);
        GridView listView = findViewById(R.id.gridView);
        listView.setAdapter(adapter);
    }
}
