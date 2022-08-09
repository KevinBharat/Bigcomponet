package bigcomponet.hwork.bigcomponet.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import bigcomponet.hwork.bigcomponet.BaseAdapter.VPAdapater;
import bigcomponet.hwork.bigcomponet.Fragment.CallsFragment;
import bigcomponet.hwork.bigcomponet.Fragment.ChatsFragment;
import bigcomponet.hwork.bigcomponet.Fragment.StatusFragment;
import bigcomponet.hwork.bigcomponet.R;

public class CustomTabActivity extends AppCompatActivity {
private TabLayout tabLayout;
private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tab);
        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.ViewPager);
        tabLayout.setupWithViewPager(viewPager);
        VPAdapater vpAdapater=new VPAdapater(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapater.addfragment(new ChatsFragment(),"CHATE");
        vpAdapater.addfragment(new StatusFragment(),"Status");
        vpAdapater.addfragment(new CallsFragment(),"Calls");
        viewPager.setAdapter(vpAdapater);
    }
}