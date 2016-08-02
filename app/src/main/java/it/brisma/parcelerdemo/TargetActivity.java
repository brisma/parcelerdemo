package it.brisma.parcelerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import org.parceler.Parcels;

public class TargetActivity extends AppCompatActivity {

    public static final String EXAMPLE = "it.brisma.parcelerdemo.example";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        final TextView exampleTextView = (TextView) findViewById(R.id.example_data);

        if(exampleTextView != null) {
            if(getIntent().getParcelableExtra(TargetActivity.EXAMPLE) != null) {
                Example example = Parcels.unwrap(getIntent().getParcelableExtra(TargetActivity.EXAMPLE));
                exampleTextView.setText(example.toString());
            }
            else {
                exampleTextView.setText(R.string.activity_target_no_parcelable);
            }
        }
    }
}
