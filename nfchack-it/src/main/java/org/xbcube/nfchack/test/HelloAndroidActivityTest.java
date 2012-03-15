package org.xbcube.nfchack.test;

import android.test.ActivityInstrumentationTestCase2;
import org.xbcube.nfchack.*;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

    public HelloAndroidActivityTest() {
        super(HelloAndroidActivity.class); 
    }

    public void testActivity() {
        HelloAndroidActivity activity = getActivity();
        assertNotNull(activity);
    }
}

