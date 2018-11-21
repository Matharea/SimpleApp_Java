package fr.wildcodeschool.simple_app_java;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.constraint.Guideline;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout mainLayout = this.findViewById(R.id.main);
        TextView title = new TextView(this);
        final CheckBox isWilder = new CheckBox(this);
        final EditText firstname = new EditText(this);
        final EditText lastname = new EditText(this);
        final Button button = new Button(this);
        final TextView validation = new TextView(this);
        final Guideline guideline = new Guideline(this);
        title.setId(R.id.title);
        ConstraintSet set = new ConstraintSet();
        set.clone(mainLayout);

        mainLayout.addView(title);
        mainLayout.addView(isWilder);
        mainLayout.addView(guideline);
        mainLayout.addView(firstname);
        mainLayout.addView(lastname);
        mainLayout.addView(button);
        mainLayout.addView(validation);

        // Title
        ConstraintLayout.LayoutParams titleParams = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            title.setBackgroundColor(getColor(R.color.title));
        title.setText(R.string.welcome);
        set.connect(R.id.title, ConstraintSet.TOP, mainLayout.getId(), ConstraintSet.TOP, 8);
        set.connect(R.id.title, ConstraintSet.LEFT, mainLayout.getId(), ConstraintSet.LEFT, 8);
        set.connect(R.id.title, ConstraintSet.RIGHT, mainLayout.getId(), ConstraintSet.RIGHT, 8);
        set.applyTo(mainLayout);
        // Checkbox
        ConstraintLayout.LayoutParams isWilderLayoutParams = (ConstraintLayout.LayoutParams) isWilder.getLayoutParams();
        isWilder.setText(R.string.isWilder);

        // Firstname
        ConstraintLayout.LayoutParams firstnameLayoutParams = (ConstraintLayout.LayoutParams) firstname.getLayoutParams();
        firstname.setHint(R.string.firstname);
        // Lastname
        ConstraintLayout.LayoutParams lastnameLayoutParams = (ConstraintLayout.LayoutParams) lastname.getLayoutParams();
        lastname.setHint(R.string.lastname);
        // Button
        ConstraintLayout.LayoutParams buttonLayoutParams = (ConstraintLayout.LayoutParams) button.getLayoutParams();
        button.setText(R.string.button);
        // Validation
        ConstraintLayout.LayoutParams validationLayoutParams = (ConstraintLayout.LayoutParams) validation.getLayoutParams();
        validation.setText(R.string.congratulation);
        // Guideline
        ConstraintLayout.LayoutParams guidelineLayoutParams = (ConstraintLayout.LayoutParams) guideline.getLayoutParams();
        //guidelineLayoutParams.guidePercent = 0.5f;
        //guideline.setLayoutParams(guidelineLayoutParams);


        // Affichage
  /*      mainLayout.addView(isWilder);
        mainLayout.addView(guideline);
        mainLayout.addView(firstname);
        mainLayout.addView(lastname);
        mainLayout.addView(button);
        mainLayout.addView(validation);*/
    }
}
