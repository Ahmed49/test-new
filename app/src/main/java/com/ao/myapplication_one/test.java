package com.ao.myapplication_one;

import android.widget.Toast;

public class test {
    private static final test ourInstance = new test();

    public static test getInstance() {
        return ourInstance;



    }

    private test() {
        Toast.makeText(test.this, "jkjkjk", Toast.LENGTH_SHORT).show();
    }


}
