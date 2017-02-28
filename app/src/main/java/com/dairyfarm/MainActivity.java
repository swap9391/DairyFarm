package com.dairyfarm;

import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dairyfarm.fragment.AccountBookFragment;
import com.dairyfarm.fragment.AccountMasterFragment;
import com.dairyfarm.fragment.CustomerAccountFragment;
import com.dairyfarm.fragment.DairyRegFragment;
import com.dairyfarm.fragment.DeductionMasterFragment;
import com.dairyfarm.fragment.DeviceMasterFragment;
import com.dairyfarm.fragment.MilkCollectionFragment;
import com.dairyfarm.fragment.MilkRetailFragment;
import com.dairyfarm.fragment.ProductPurchaseFragment;
import com.dairyfarm.fragment.ProductRetailFragment;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    //Drawer
    private NavigationView navigationView;
    private DrawerLayout drawer;
    private View navHeader;
    private ImageView imgNavHeaderBg, imgProfile;
    private TextView txtName, txtWebsite;
    // index to identify current nav menu item
    public static int navItemIndex = 0;

    // tags used to attach the fragments
    private static final String TAG_ACCOUNT = "Account";
    private static final String TAG_ACCOUNT_MASTER = "acc_master";
    private static final String TAG_MEMBER_ACC = "member_acc";
    private static final String TAG_DAIRY_REG = "dairy_reg";
    private static final String TAG_DEDUCTION = "deduction";
    private static final String TAG_DEVICE = "device";
    private static final String TAG_MILK_COLLECT = "milk_collect";
    private static final String TAG_MILK_RETAIL = "milk_retail";
    private static final String TAG_PROD_PUR = "prod_purc";
    private static final String TAG_PROD_RETAIL = "prod_retail";


    public static String CURRENT_TAG = TAG_ACCOUNT;

    // toolbar titles respected to selected nav menu item
    private String[] activityTitles;

    // flag to load home fragment when user presses back key
    private boolean shouldLoadHomeFragOnBackPress = true;
    private Handler mHandler;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String languageToLoad = "ta"; // your language
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.WHITE);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        // Navigation view header
        navHeader = navigationView.getHeaderView(0);
        txtName = (TextView) navHeader.findViewById(R.id.name);
        txtWebsite = (TextView) navHeader.findViewById(R.id.website);
        imgNavHeaderBg = (ImageView) navHeader.findViewById(R.id.img_header_bg);
        imgProfile = (ImageView) navHeader.findViewById(R.id.img_profile);
        mHandler = new Handler();
        // load nav menu header data
        loadNavHeader();

        // initializing navigation menu
        setUpNavigationView();

        if (savedInstanceState == null) {
            navItemIndex = 0;
            CURRENT_TAG = TAG_ACCOUNT;
            loadHomeFragment();
        }


    }


    private void loadNavHeader() {
        // name, website
        txtName.setText("Digital Dairy");
        txtWebsite.setText("Mobile Number");

        // loading header background image

        // showing dot next to notifications label
        // navigationView.getMenu().getItem(3).setActionView(R.layout.menu_dot);
    }


    /***
     * Returns respected fragment that user
     * selected from navigation menu
     */
    private void loadHomeFragment() {
        // selecting appropriate nav menu item
        selectNavMenu();


        // if user select the current navigation menu again, don't do anything
        // just close the navigation drawer
        if (getSupportFragmentManager().findFragmentByTag(CURRENT_TAG) != null) {
            drawer.closeDrawers();
            // show or hide the fab button
            return;
        }

        // Sometimes, when fragment has huge data, screen seems hanging
        // when switching between navigation menus
        // So using runnable, the fragment is loaded with cross fade effect
        // This effect can be seen in GMail app
        Runnable mPendingRunnable = new Runnable() {
            @Override
            public void run() {
                // update the main content by replacing fragments
                Fragment fragment = getHomeFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in,
                        android.R.anim.fade_out);
                fragmentTransaction.replace(R.id.frame, fragment, CURRENT_TAG);
                fragmentTransaction.commitAllowingStateLoss();
            }
        };

        // If mPendingRunnable is not null, then add to the message queue
        if (mPendingRunnable != null) {
            mHandler.post(mPendingRunnable);
        }

        //Closing drawer on item click
        drawer.closeDrawers();

        // refresh toolbar menu
        invalidateOptionsMenu();
    }

    private Fragment getHomeFragment() {
        switch (navItemIndex) {
            case 0:
                AccountBookFragment accountBookFragment = new AccountBookFragment();
                return accountBookFragment;
            case 1:
                AccountMasterFragment accountMasterFragment = new AccountMasterFragment();
                return accountMasterFragment;
            case 2:
                CustomerAccountFragment customerAccountFragment = new CustomerAccountFragment();
                return customerAccountFragment;
            case 3:
                DairyRegFragment dairyRegFragment = new DairyRegFragment();
                return dairyRegFragment;

            case 4:
                DeductionMasterFragment deductionMasterFragment = new DeductionMasterFragment();
                return deductionMasterFragment;

            case 5:
                DeviceMasterFragment deviceMasterFragment = new DeviceMasterFragment();
                return deviceMasterFragment;

            case 6:
                MilkCollectionFragment milkCollectionFragment = new MilkCollectionFragment();
                return milkCollectionFragment;

            case 7:
                MilkRetailFragment milkRetailFragment = new MilkRetailFragment();
                return milkRetailFragment;

            case 8:
                ProductPurchaseFragment productPurchaseFragment = new ProductPurchaseFragment();
                return productPurchaseFragment;

            case 9:
                ProductRetailFragment productRetailFragment = new ProductRetailFragment();
                return productRetailFragment;
            default:
                return new AccountBookFragment();

        }
    }


    private void selectNavMenu() {
        navigationView.getMenu().getItem(navItemIndex).setChecked(true);
    }

    private void setUpNavigationView() {
        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()) {
                    //Replacing the main content with ContentFragment Which is our Inbox View;
                    case R.id.nav_account:
                        navItemIndex = 0;
                        CURRENT_TAG = TAG_ACCOUNT;
                        break;
                    case R.id.nav_account_master:
                        navItemIndex = 1;
                        CURRENT_TAG = TAG_ACCOUNT_MASTER;
                        break;
                    case R.id.nav_member_account:
                        navItemIndex = 2;
                        CURRENT_TAG = TAG_MEMBER_ACC;
                        break;
                    case R.id.nav_dairy_reg:
                        navItemIndex = 3;
                        CURRENT_TAG = TAG_DAIRY_REG;
                        break;
                    case R.id.nav_deduction:
                        navItemIndex = 4;
                        CURRENT_TAG = TAG_DEDUCTION;
                        break;

                    case R.id.nav_device:
                        navItemIndex = 5;
                        CURRENT_TAG = TAG_DEVICE;
                        break;

                    case R.id.nav_milk_collect:
                        navItemIndex = 6;
                        CURRENT_TAG = TAG_MILK_COLLECT;
                        break;
                    case R.id.nav_milk_retail:
                        navItemIndex = 7;
                        CURRENT_TAG = TAG_MILK_RETAIL;
                        break;
                    case R.id.nav_prod_pur:
                        navItemIndex = 8;
                        CURRENT_TAG = TAG_PROD_PUR;
                        break;
                    case R.id.nav_product_sale:
                        navItemIndex = 9;
                        CURRENT_TAG = TAG_PROD_RETAIL;
                        break;


                    case R.id.nav_about_us:
                        Toast.makeText(MainActivity.this,"About Us",Toast.LENGTH_SHORT).show();
                        //   CommonUtils.showToast(MainActivity.this, "About Us");
                        // launch new intent instead of loading fragment
                        // startActivity(new Intent(MainActivity.this, AboutUsActivity.class));
                        //drawer.closeDrawers();
                        return true;
                    case R.id.nav_privacy_policy:
                        Toast.makeText(MainActivity.this,"Privecy Policy",Toast.LENGTH_SHORT).show();
                        // CommonUtils.showToast(MainActivity.this, "Policy");
                        // launch new intent instead of loading fragment
                        //startActivity(new Intent(MainActivity.this, PrivacyPolicyActivity.class));
                        //drawer.closeDrawers();
                        return true;
                    default:
                        navItemIndex = 0;
                }

                //Checking if the item is in checked state or not, if not make it in checked state
                if (menuItem.isChecked()) {
                    menuItem.setChecked(false);
                } else {
                    menuItem.setChecked(true);
                }
                menuItem.setChecked(true);

                loadHomeFragment();

                return true;
            }
        });


        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.openDrawer, R.string.closeDrawer) {

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank
                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawer.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessary or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();
    }


    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawers();
            return;
        }

        // This code loads home fragment when back key is pressed
        // when user is in other fragment than home
        if (shouldLoadHomeFragOnBackPress) {
            // checking if user is on other navigation menu
            // rather than home
            if (navItemIndex != 0) {
                navItemIndex = 0;
                CURRENT_TAG = TAG_ACCOUNT;
                loadHomeFragment();
                return;
            }
        }

        super.onBackPressed();
    }

    /*// show or hide the fab
    private void toggleFab() {
        if (navItemIndex == 0)
            fab.show();
        else
            fab.hide();
    }
*/


    public void setTitle(String title) {
        toolbar.setTitle(title);
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

    public void setToolbar(Toolbar toolbar) {
        this.toolbar = toolbar;
    }

    public void showFragment(Class<? extends Fragment> fragmentClass) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, Fragment.instantiate(this, fragmentClass.getCanonicalName()));
        fragmentTransaction.commit();
    }
}
