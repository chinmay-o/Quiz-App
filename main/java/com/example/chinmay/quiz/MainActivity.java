package com.example.chinmay.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String SELECTED_ITEM =  "ITEMS";
    private int mPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Global Variable which represents the word answers on view which display answers
    String ans = "Answer: ";

    //Submit button which checks print score and right answers
    public void submit(View view) {

        score(0);
        answers("");

    }

    //Reset button for resetting entered values
    public void reset(View view) {

        TextView LiveScore  = (TextView) findViewById(R.id.liveScore);
        LiveScore.setText("0");

        RadioButton a1o1 = (RadioButton) findViewById(R.id.q1o1);
        RadioButton a1o2 = (RadioButton) findViewById(R.id.q1o2);
        RadioButton a1o3 = (RadioButton) findViewById(R.id.q1o3);
        RadioButton a1o4 = (RadioButton) findViewById(R.id.q1o4);
        RadioButton a2o1 = (RadioButton) findViewById(R.id.q2o1);
        RadioButton a2o2 = (RadioButton) findViewById(R.id.q2o2);
        RadioButton a2o3 = (RadioButton) findViewById(R.id.q2o3);
        RadioButton a2o4 = (RadioButton) findViewById(R.id.q2o4);
        RadioButton a3o1 = (RadioButton) findViewById(R.id.q3o1);
        RadioButton a3o2 = (RadioButton) findViewById(R.id.q3o2);
        RadioButton a3o3 = (RadioButton) findViewById(R.id.q3o3);
        RadioButton a3o4 = (RadioButton) findViewById(R.id.q3o4);
        RadioButton a4o1 = (RadioButton) findViewById(R.id.q4o1);
        RadioButton a4o2 = (RadioButton) findViewById(R.id.q4o2);
        RadioButton a4o3 = (RadioButton) findViewById(R.id.q4o3);
        RadioButton a4o4 = (RadioButton) findViewById(R.id.q4o4);
        RadioButton a5o1 = (RadioButton) findViewById(R.id.q5o1);
        RadioButton a5o2 = (RadioButton) findViewById(R.id.q5o2);
        RadioButton a5o3 = (RadioButton) findViewById(R.id.q5o3);
        RadioButton a5o4 = (RadioButton) findViewById(R.id.q5o4);

        CheckBox a6o1 = (CheckBox) findViewById(R.id.q6o1);
        CheckBox a6o2 = (CheckBox) findViewById(R.id.q6o2);
        CheckBox a6o3 = (CheckBox) findViewById(R.id.q6o3);
        CheckBox a6o4 = (CheckBox) findViewById(R.id.q6o4);
        CheckBox a7o1 = (CheckBox) findViewById(R.id.q7o1);
        CheckBox a7o2 = (CheckBox) findViewById(R.id.q7o2);
        CheckBox a7o3 = (CheckBox) findViewById(R.id.q7o3);
        CheckBox a7o4 = (CheckBox) findViewById(R.id.q7o4);

        EditText textAns = (EditText) findViewById(R.id.q8ans);

        TextView ans1 = (TextView) findViewById(R.id.ans1);
        TextView ans2 = (TextView) findViewById(R.id.ans2);
        TextView ans3 = (TextView) findViewById(R.id.ans3);
        TextView ans4 = (TextView) findViewById(R.id.ans4);
        TextView ans5 = (TextView) findViewById(R.id.ans5);
        TextView ans6 = (TextView) findViewById(R.id.ans6);
        TextView ans7 = (TextView) findViewById(R.id.ans7);
        TextView ans8 = (TextView) findViewById(R.id.ans8);

        a1o1.setChecked(false);
        a1o2.setChecked(false);
        a1o3.setChecked(false);
        a1o4.setChecked(false);
        a2o1.setChecked(false);
        a2o2.setChecked(false);
        a2o3.setChecked(false);
        a2o4.setChecked(false);
        a3o1.setChecked(false);
        a3o2.setChecked(false);
        a3o3.setChecked(false);
        a3o4.setChecked(false);
        a4o1.setChecked(false);
        a4o2.setChecked(false);
        a4o3.setChecked(false);
        a4o4.setChecked(false);
        a5o1.setChecked(false);
        a5o2.setChecked(false);
        a5o3.setChecked(false);
        a5o4.setChecked(false);
        a6o1.setChecked(false);
        a6o2.setChecked(false);
        a6o3.setChecked(false);
        a6o4.setChecked(false);
        a7o1.setChecked(false);
        a7o2.setChecked(false);
        a7o3.setChecked(false);
        a7o4.setChecked(false);

        Editable a8 = textAns.getText();
        a8.clear();

        ans1.setText("");
        ans2.setText("");
        ans3.setText("");
        ans4.setText("");
        ans5.setText("");
        ans6.setText("");
        ans7.setText("");
        ans8.setText("");

    }

    //Method for score
    private void score(int number) {

        //Local variable for score
        int score = 0;

        //Every RadioButton gives 1 score
        RadioButton ans1 = (RadioButton) findViewById(R.id.q1o3);

        if (ans1.isChecked()){

            score = score + 1;

        }

        RadioButton ans2 = (RadioButton) findViewById(R.id.q2o2);

        if (ans2.isChecked()){

            score = score + 1;

        }

        RadioButton ans3 = (RadioButton) findViewById(R.id.q3o1);

        if (ans3.isChecked()){

            score = score + 1;

        }

        RadioButton ans4 = (RadioButton) findViewById(R.id.q4o3);

        if (ans4.isChecked()){

            score = score + 1;

        }

        RadioButton ans5 = (RadioButton) findViewById(R.id.q5o4);

        if (ans5.isChecked()){

            score = score + 1;

        }

        //Every Checkbox with all 3 answers gives 2 score
        CheckBox ans6A = (CheckBox) findViewById(R.id.q6o2);
        CheckBox ans6B = (CheckBox) findViewById(R.id.q6o3);
        CheckBox ans6C = (CheckBox) findViewById(R.id.q6o4);
        CheckBox ans6W = (CheckBox) findViewById(R.id.q6o1);

        int partialScoreA = 0;


        //If wrong answer is included 0 score is gained
        if (ans6W.isChecked()) {

            score = score +  0;

        }


        //else 2 or 1 score for answering atleast 2 answer
        else {

            if (ans6A.isChecked()){

                partialScoreA += 1;

            }

            if (ans6B.isChecked()){

                partialScoreA +=  1;

            }
            if (ans6C.isChecked()){

                partialScoreA += 1;

            }

            if (partialScoreA == 3) {

                score = score + 2;

            }

            if (partialScoreA == 2) {

                score = score +  1;

            }

        }

        CheckBox ans7A = (CheckBox) findViewById(R.id.q7o1);
        CheckBox ans7B = (CheckBox) findViewById(R.id.q7o2);
        CheckBox ans7C = (CheckBox) findViewById(R.id.q7o4);
        CheckBox ans7W = (CheckBox) findViewById(R.id.q7o3);

        int partialScoreB = 0;

        if (ans7W.isChecked()) {

            score = score + 0;

        }

        else {

            if (ans7A.isChecked()){

                partialScoreB += 1;

            }

            if (ans7B.isChecked()){

                partialScoreB +=  1;

            }
            if (ans7C.isChecked()){

                partialScoreB += 1;

            }

            if (partialScoreB == 3) {

                score = score + 2;

            }

            if (partialScoreB == 2) {

                score = score +  1;

            }

        }

        //Checks the entered text is right answer
        EditText textAns = (EditText) findViewById(R.id.q8ans);
        Editable TextAnswer = textAns.getText();
        String answer8 = TextAnswer.toString().toLowerCase();
        String answer = "charles babage";

        if (answer8.equals(answer)){

            score = score + 1;

        }

        TextView LiveScore  = (TextView) findViewById(R.id.liveScore);
        LiveScore.setText("" + score);

    }

    //Method for answers
    private void answers(String answer) {

        TextView ans1 = (TextView) findViewById(R.id.ans1);
        ans1.setText(ans  + getString(R.string.ans1));

        TextView ans2 = (TextView) findViewById(R.id.ans2);
        ans2.setText(ans  + getString(R.string.ans2));

        TextView ans3 = (TextView) findViewById(R.id.ans3);
        ans3.setText(ans  + getString(R.string.ans3));

        TextView ans4 = (TextView) findViewById(R.id.ans4);
        ans4.setText(ans  + getString(R.string.ans4));

        TextView ans5 = (TextView) findViewById(R.id.ans5);
        ans5.setText(ans  + getString(R.string.ans5));

        TextView ans6 = (TextView) findViewById(R.id.ans6);
        ans6.setText(ans  + getString(R.string.ans6));

        TextView ans7 = (TextView) findViewById(R.id.ans7);
        ans7.setText(ans  + getString(R.string.ans7));

        TextView ans8 = (TextView) findViewById(R.id.ans8);
        ans8.setText(ans  + getString(R.string.ans8));

    }


    //Methods for Radio buttons, had to code this way because RadioGroup doesn't support our layout
    public void question1o1(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q1o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q1o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q1o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q1o4);

        o1.isChecked();
        o2.setChecked(false);
        o3.setChecked(false);
        o4.setChecked(false);

    }

    public void question1o2(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q1o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q1o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q1o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q1o4);

        o1.setChecked(false);
        o2.isChecked();
        o3.setChecked(false);
        o4.setChecked(false);

    }

    public void question1o3(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q1o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q1o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q1o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q1o4);

        o1.setChecked(false);
        o2.setChecked(false);
        o3.isChecked();
        o4.setChecked(false);

    }

    public void question1o4(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q1o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q1o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q1o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q1o4);

        o1.setChecked(false);
        o2.setChecked(false);
        o3.setChecked(false);
        o4.isChecked();

    }

    public void question2o1(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q2o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q2o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q2o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q2o4);

        o1.isChecked();
        o2.setChecked(false);
        o3.setChecked(false);
        o4.setChecked(false);

    }

    public void question2o2(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q2o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q2o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q2o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q2o4);

        o1.setChecked(false);
        o2.isChecked();
        o3.setChecked(false);
        o4.setChecked(false);

    }

    public void question2o3(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q2o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q2o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q2o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q2o4);

        o1.setChecked(false);
        o2.setChecked(false);
        o3.isChecked();
        o4.setChecked(false);

    }

    public void question2o4(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q2o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q2o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q2o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q2o4);

        o1.setChecked(false);
        o2.setChecked(false);
        o3.setChecked(false);
        o4.isChecked();

    }

    public void question3o1(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q3o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q3o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q3o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q3o4);

        o1.isChecked();
        o2.setChecked(false);
        o3.setChecked(false);
        o4.setChecked(false);

    }

    public void question3o2(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q3o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q3o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q3o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q3o4);

        o1.setChecked(false);
        o2.isChecked();
        o3.setChecked(false);
        o4.setChecked(false);

    }

    public void question3o3(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q3o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q3o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q3o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q3o4);

        o1.setChecked(false);
        o2.setChecked(false);
        o3.isChecked();
        o4.setChecked(false);

    }

    public void question3o4(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q3o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q3o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q3o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q3o4);

        o1.setChecked(false);
        o2.setChecked(false);
        o3.setChecked(false);
        o4.isChecked();

    }

    public void question4o1(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q4o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q4o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q4o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q4o4);

        o1.isChecked();
        o2.setChecked(false);
        o3.setChecked(false);
        o4.setChecked(false);

    }

    public void question4o2(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q4o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q4o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q4o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q4o4);

        o1.setChecked(false);
        o2.isChecked();
        o3.setChecked(false);
        o4.setChecked(false);

    }

    public void question4o3(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q4o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q4o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q4o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q4o4);

        o1.setChecked(false);
        o2.setChecked(false);
        o3.isChecked();
        o4.setChecked(false);

    }

    public void question4o4(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q4o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q4o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q4o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q4o4);

        o1.setChecked(false);
        o2.setChecked(false);
        o3.setChecked(false);
        o4.isChecked();

    }

    public void question5o1(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q5o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q5o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q5o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q5o4);

        o1.isChecked();
        o2.setChecked(false);
        o3.setChecked(false);
        o4.setChecked(false);

    }

    public void question5o2(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q5o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q5o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q5o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q5o4);

        o1.setChecked(false);
        o2.isChecked();
        o3.setChecked(false);
        o4.setChecked(false);

    }

    public void question5o3(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q5o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q5o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q5o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q5o4);

        o1.setChecked(false);
        o2.setChecked(false);
        o3.isChecked();
        o4.setChecked(false);

    }

    public void question5o4(View view) {

        RadioButton o1 = (RadioButton) findViewById(R.id.q5o1);
        RadioButton o2 = (RadioButton) findViewById(R.id.q5o2);
        RadioButton o3 = (RadioButton) findViewById(R.id.q5o3);
        RadioButton o4 = (RadioButton) findViewById(R.id.q5o4);

        o1.setChecked(false);
        o2.setChecked(false);
        o3.setChecked(false);
        o4.isChecked();

    }


    //Restore data while Screen Orientation
    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SELECTED_ITEM, mPosition);
    }

    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mPosition = savedInstanceState.getInt(SELECTED_ITEM);
    }

}
