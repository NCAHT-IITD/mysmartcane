
package com.example.smartcanedebug;

        import android.content.Context;
        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;
        import android.webkit.WebSettings;
        import android.webkit.WebView;
        import android.widget.Button;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;

        import java.io.IOException;

public class GuideActivity extends AppCompatActivity {

   // private int mCounter = 0;
    //Button btn;
   // TextView txv;
    //private WebView webView;
    //private String doc;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_activity);
        // Intent intentNavi = new Intent(new NavigationActivity(), getAssets().getClass());
//                intentNA.putExtra("Type", NAV_TYPE_LOAD_ROUTE);

            Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://smartcane.saksham.org/?page_id=33"));
             Intent chooseIntent = Intent.createChooser(intent1, "Choose from below");
            startActivity(chooseIntent);


        }





    //TextView select = findViewById(R.id.select);

    // getting data from intent.
    //  String name = getIntent().getStringExtra("key");

    // setting data to our text view.
    //  select.setText(name);

      /*  btn = (Button) findViewById(R.id.bt);
        txv = (TextView) findViewById(R.id.tx);

    }

            public void count(View view) {
                mCounter++;
                txv.setText(Integer.toString(mCounter));

            }
    public void count1(View view) {
        mCounter--;
        txv.setText(Integer.toString(mCounter));

    }


    }

//    @Override
//    public void onBackPressed() {
//        Intent intentMain = new Intent(this, MainActivity.class);
//        startActivity(intentMain);
//        finish();
//    }



*/

    public void goBackPressed(View view) {
        onBackPressed();
    }
}



