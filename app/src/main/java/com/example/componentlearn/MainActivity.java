package com.example.componentlearn;

import com.example.componentlearn.fragment.FragmentActivity;

public class MainActivity extends BaseActivity {
  private static final String TAG = "MainActivity";

  {
    mTitle = new String[]{
        "Fragment",
    };
    mClasses = new Class[]{
        FragmentActivity.class,
    };
  }
}