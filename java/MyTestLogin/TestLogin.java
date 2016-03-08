package MyTestLogin;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

import com.borjaprieto01.yep.LoginActivity;
import com.borjaprieto01.yep.R;

/**
 * Created by Borja Prieto 01 on 08/03/2016.
 */
public class TestLogin extends ActivityInstrumentationTestCase2<LoginActivity> {
    private LoginActivity actividad;
    private EditText etext1;
    private EditText etext2;
    private Button login;

    public TestLogin(String pkg, Class<LoginActivity> activityClass) {
        super(pkg, activityClass);
    }
    public TestLogin(){
        super(LoginActivity.class);
    }
    protected void setUp() throws Exception{
        super.setUp();
        actividad = getActivity();
        login = (Button) actividad.findViewById(R.id.button);
    }
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    public void testLoginValues() {
        TouchUtils.clickView(this, login);
    }
}
