package ru.rsue.myapplication;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

       Drawer result =  new DrawerBuilder(this)
                .withActivity(this)
                .withRootView(R.id.drawer_container)
                .withToolbar(toolbar)
                .addDrawerItems(

                ).withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
            @Override
            public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {


                if (drawerItem != null) {
                    if (drawerItem.getIdentifier() == 1) {
                    //    Fragment f = new FirstFragment();
                     //   getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, f).commit();
                    } else if (drawerItem.getIdentifier() == 2) {

                    }
                }

                return false;
            }
        })
                .build();

        // get input stream
        InputStream ims = null;
        try {
            ims = getAssets().open("error.png");
            Drawable d = Drawable.createFromStream(ims, null);
            result.addItem(new ProfileDrawerItem().withName("Fragment 1").withIcon(d));
            result.addItem(new ProfileDrawerItem().withName("Fragment 1").withIcon(d));
            result.addItem(new ProfileDrawerItem().withName("Fragment 1").withIcon(d));result.addItem(new ProfileDrawerItem().withName("Fragment 1").withIcon(d));
            result.addItem(new ProfileDrawerItem().withName("Fragment 1").withIcon(d));
            result.addItem(new ProfileDrawerItem().withName("Fragment 1").withIcon(d));
            result.addItem(new ProfileDrawerItem().withName("Fragment 1").withIcon(d));
            result.addItem(new ProfileDrawerItem().withName("Fragment 1").withIcon(d));
            result.addItem(new ProfileDrawerItem().withName("Fragment 1").withIcon(d));
            result.addItem(new ProfileDrawerItem().withName("Fragment 1").withIcon(d));
            result.addItem(new ProfileDrawerItem().withName("Fragment 1").withIcon(d));
            result.addItem(new ProfileDrawerItem().withName("Fragment 1").withIcon(d));

        } catch (IOException e) {
            e.printStackTrace();
        }
        // load image as Drawable





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
