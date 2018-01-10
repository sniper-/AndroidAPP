package com.kevin.tech.bottomnavigationbarforandroid;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.kevin.tech.bottomnavigationbarforandroid.fragment.TextTabFragment;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextTabFragment mTextTabFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setCurrentFragment();

    }

    private void setCurrentFragment() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        mTextTabFragment = mTextTabFragment.newInstance(getString(R.string.navigation_text_tab));
        transaction.replace(R.id.frame_content, mTextTabFragment).commit();
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return true;

    }

}
