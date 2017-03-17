package com.example.rauan.weatherapp.controllers.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.rauan.weatherapp.R;
import com.example.rauan.weatherapp.controllers.Fragments.CityFragment;
import com.example.rauan.weatherapp.utils.Constants;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class MainActivity extends AppCompatActivity {
    private Drawer drawer;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.getBackground().setAlpha(0);
        createDrawer();


    }
    private void createDrawer(){
        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("Almaty");
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(2).withName("Astana");
        PrimaryDrawerItem item3 = new PrimaryDrawerItem().withIdentifier(3).withName("Kyzylorda");
        PrimaryDrawerItem item4 = new PrimaryDrawerItem().withIdentifier(4).withName("Taldykorgan");
        PrimaryDrawerItem item5 = new PrimaryDrawerItem().withIdentifier(5).withName("Kostanay");
        PrimaryDrawerItem item6 = new PrimaryDrawerItem().withIdentifier(6).withName("Aktobe");
;

        drawer = new DrawerBuilder().withActivity(this).withToolbar(toolbar).withHeader(R.layout.drawer_header).
                addDrawerItems(item1,item2, item3,item4, item5,item6)
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
            @Override
            public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                if(drawerItem.getIdentifier()==1){
                    toolbar.setTitle("Almaty");
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragmentContainer, CityFragment.newInstance(Constants.ALMATY_ID))
                            .commit();
                }else if(drawerItem.getIdentifier()==2){
                    toolbar.setTitle("Astana");
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragmentContainer, CityFragment.newInstance(Constants.ASTANA_ID))
                            .commit();
                }else if(drawerItem.getIdentifier()==3) {
                    toolbar.setTitle("Kyzylorda");
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragmentContainer, CityFragment.newInstance(Constants.KYZYLORDA_ID))
                            .commit();
                }else if(drawerItem.getIdentifier()==4) {
                    toolbar.setTitle("Taldykorgan");
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragmentContainer, CityFragment.newInstance(Constants.TALDYKORGAN_ID))
                            .commit();
                }else if(drawerItem.getIdentifier()==5) {
                    toolbar.setTitle("Kostanay");
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragmentContainer, CityFragment.newInstance(Constants.KOSTANAI_ID))
                            .commit();
                }else if(drawerItem.getIdentifier()==6) {
                    toolbar.setTitle("Aktobe");
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragmentContainer, CityFragment.newInstance(Constants.AKTOBE_ID))
                            .commit();
                }

                return false;
            }
        }).build();
        drawer.setSelection(item1);
    }
}
