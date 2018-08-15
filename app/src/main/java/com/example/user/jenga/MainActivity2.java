package com.example.user.jenga;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageView fb,tweet,ig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fb = findViewById(R.id.imageViewfb);
        ig = findViewById(R.id.imageViewig);
        tweet = findViewById(R.id.imageViewtweet);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent face = new Intent(getApplicationContext(),facebook.class);
                startActivity(face);
                finish();
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



/*//        code for viewpager below
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);*/


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
/*            Intent home = new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(home);
            finish();*/
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {

            return true;
        }else if (id == R.id.action_help){

            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_contractors) {
            // Handle the actions
            Intent cont = new Intent(getApplicationContext(),Drawer.class);
            startActivity(cont);
            finish();
        } else if (id == R.id.nav_gallery) {
//            Handle transport
            Intent drive = new Intent(getApplicationContext(),Drawer3.class);
            startActivity(drive);
            finish();
        } else if (id == R.id.nav_slideshow) {
            Intent labour = new Intent(getApplicationContext(),Drawer4.class);
            startActivity(labour);
            finish();
        } else if (id == R.id.nav_manage) {
            Intent supply = new Intent(getApplicationContext(),Drawer2.class);
            startActivity(supply);
            finish();
        } else if (id == R.id.nav_share) {
            Intent sendit=new Intent();
//                assign intent action to perform
            sendit.setAction(Intent.ACTION_SEND);
//                set the text that is to be sent
            sendit.putExtra(Intent.EXTRA_TEXT,"Try the new Jenga app.Build your new home with us.Download the app from the playstore and build your future.");
//                define the type
            sendit.setType("text/plain");
//                specify package to be used
            sendit.setPackage("com.whatsapp");
            startActivity(sendit);
        }else if (id == R.id.nav_camera) {
            Intent buy = new Intent(getApplicationContext(),Drawer5.class);
            startActivity(buy);
            finish();
        } else if (id == R.id.nav_faqs) {
            Intent faq = new Intent(getApplicationContext(),Drawer6.class);
            startActivity(faq);
            finish();
        } else if (id == R.id.nav_phone) {
            String phonenumber="0700216997";
//                intent allows you to perform an activity
            Intent callit=new Intent(
                    Intent.ACTION_DIAL, Uri.fromParts("tel",
                    phonenumber,null));
            startActivity(callit);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
