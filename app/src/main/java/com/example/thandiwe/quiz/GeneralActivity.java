package com.example.thandiwe.quiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.example.thandiwe.quiz.R.id.rbChs1a;
import static com.example.thandiwe.quiz.R.id.rbChs1b;
import static com.example.thandiwe.quiz.R.id.rbChs1c;
import static com.example.thandiwe.quiz.R.id.rbChs1d;
import static com.example.thandiwe.quiz.R.id.rbChs2b;
import static com.example.thandiwe.quiz.R.id.rbChs2c;
import static com.example.thandiwe.quiz.R.id.rbChs2d;
import static com.example.thandiwe.quiz.R.id.rbChs7b;
import static com.example.thandiwe.quiz.R.id.rbchs2a;

public class GeneralActivity extends AppCompatActivity {

    RadioButton rb_chs1a, rb_chs1b, rb_chs1c, rb_chs1d,
            rb_chs2a, rb_chs2b, rb_chs2c, rb_chs2d;
    RadioGroup group;

    Button btn_fb, btn_Answers2;
    TextView tv_fb;

    int total = 0;
    int score = 0;
    // boolean scre1;


    Knowladge know = new Knowladge();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        btn_fb = (Button) findViewById(R.id.btFeedback);
        btn_Answers2 = (Button) findViewById(R.id.btnAnswers2);

        tv_fb = (TextView) findViewById(R.id.tvFeedback);

        rb_chs1a = (RadioButton) findViewById(rbChs1a);
        rb_chs1b = (RadioButton) findViewById(rbChs1a);
        rb_chs1c = (RadioButton) findViewById(rbChs1a);
        rb_chs1d = (RadioButton) findViewById(rbChs1a);

        rb_chs2a = (RadioButton) findViewById(rbchs2a);
        rb_chs2b = (RadioButton) findViewById(rbChs2b);
        rb_chs2c = (RadioButton) findViewById(rbChs2c);
        rb_chs2d = (RadioButton) findViewById(rbChs2d);


        know.setQa(know.getCORRECT());
        know.setQb(know.getINCORRECT());
        know.setQc(know.getINCORRECT());
        know.setQd(know.getINCORRECT());

        group = (RadioGroup) findViewById(R.id.myGroup);

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {


                int selectedId = group.getCheckedRadioButtonId();


                //if statement for the first question

                if (selectedId == R.id.rbChs1a) {
                    total += 1;
                    score = know.getQa();
                    //Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_LONG).show();

                } else if (selectedId == rbChs1b) {
                    score = know.getQb();

                } else if (selectedId == rbChs1c) {
                    score = know.getQc();

                } else if (selectedId == rbChs1d) {
                    score = know.getQd();

                }


                //if statement for the second question

                else if (selectedId == R.id.rbchs2a) {
                    score = know.getQb();
                } else if (selectedId == R.id.rbChs2b) {
                    total += 1;
                    score = know.getQa();
                    //Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_LONG).show();

                } else if (selectedId == R.id.rbChs2c) {
                    score = know.getQc();
                } else if (selectedId == R.id.rbChs2d) {
                    score = know.getQd();
                }


                //if statement for the third question


                else if (selectedId == R.id.rbChs3a) {
                    score = know.getQb();
                } else if (selectedId == R.id.rbChs3b) {
                    total += 1;
                    score = know.getQa();
                   // Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_LONG).show();


                } else if (selectedId == R.id.rbChs3c) {
                    score = know.getQc();
                } else if (selectedId == R.id.rbChs3d) {
                    score = know.getQd();
                }


                //if statement for the fourth questions


                else if (selectedId == R.id.rbChs4a) {
                    total += 1;
                    score = know.getQa();
                   // Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_LONG).show();

                } else if (selectedId == R.id.rbChs4b) {
                    score = know.getQb();

                } else if (selectedId == R.id.rbChs4c) {
                    score = know.getQc();
                } else if (selectedId == R.id.rbChs4d) {
                    score = know.getQd();
                }


                //if statement for the fifth questions


                else if (selectedId == R.id.rbChs5a) {
                    score = know.getQb();

                } else if (selectedId == R.id.rbChs5b) {
                    score = know.getQc();

                } else if (selectedId == R.id.rbChs5c) {
                    score = know.getQd();
                } else if (selectedId == R.id.rbChs5d) {
                    total += 1;
                    score = know.getQa();

                }


                //if statement for the sixth questions


                else if (selectedId == R.id.rbChs6a) {

                    score = know.getQb();
                } else if (selectedId == R.id.rbChs6b) {
                    score = know.getQc();

                } else if (selectedId == R.id.rbChs6c) {
                    total += 1;
                    score = know.getQa();
                   // Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_LONG).show();

                } else if (selectedId == R.id.rbChs6d) {
                    score = know.getQd();

                }


                //if statement for the last questions


                else if (selectedId == R.id.rbChs7a) {

                    score = know.getQb();
                    btn_fb.setVisibility(View.VISIBLE);

                } else if (selectedId == R.id.rbChs7b) {
                    total += 1;
                    score = know.getQa();
                    //Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_LONG).show();
                    btn_fb.setVisibility(View.VISIBLE);


                } else if (selectedId == R.id.rbChs7c) {
                    score = know.getQc();
                    btn_fb.setVisibility(View.VISIBLE);
                } else if (selectedId == R.id.rbChs7d) {

                    score = know.getQd();

                    btn_fb.setVisibility(View.VISIBLE);

                }
            }
        });
    }


    public void Feedback(View view) {

        if (total <= 3) {
            tv_fb.setText("Your total score is :" + total + "out of 7" + "\nEISH!! you need to improve on your general knowledge");
        } else {
            tv_fb.setText("Your total score is :" + total + "out of 7" + "\nExcellent!! you know general knowledge");
        }


        btn_Answers2.setVisibility(View.VISIBLE);

    }

    public void Answer2(View view) {
        Intent intent = new Intent(this, Answers2Activity.class);
       startActivity(intent);

        btn_Answers2.setVisibility(View.INVISIBLE);
    }

    public void Choose(View v) {
        AlertDialog.Builder build = new AlertDialog.Builder(this);

        build.setTitle("NEXT QUIZ");
        build.setMessage("Would you like to try the animal quiz?");

        build.setCancelable(false);

        build.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent inten = new Intent(GeneralActivity.this, MainActivity.class);
                startActivity(inten);
                finish();

            }
        });

        build.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent inten = new Intent(GeneralActivity.this, AnimalActivity.class);
                startActivity(inten);

            }
        });
        AlertDialog alert = build.create();

        alert.show();

    }
}