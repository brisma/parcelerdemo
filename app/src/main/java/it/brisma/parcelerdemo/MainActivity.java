package it.brisma.parcelerdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import org.parceler.Parcels;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button openActivityButton = (Button) findViewById(R.id.open_activity);

        if(openActivityButton != null) {
            openActivityButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Example example = new Example("Mario", "Rossi", 27, 1.82f);
                    Intent intent = new Intent(getBaseContext(), TargetActivity.class);
                    intent.putExtra(TargetActivity.EXAMPLE, Parcels.wrap(example));
                    startActivity(intent);
                }
            });
        }
    }
}
