package com.example.thandiwe.quiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AnimalActivity extends AppCompatActivity {


    RadioGroup rg;

    Button btn_Answers, btn_results;

    TextView tv_results;

    int total =0;
    Animals animals = new Animals();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);



        btn_Answers =(Button)findViewById(R.id.btnAnswer);
        btn_results =(Button)findViewById(R.id.btnScore);

        tv_results =(TextView)findViewById(R.id.tvResults);




        animals.setQa(animals.getCORRECT());
        animals.setQb(animals.getINCORRECT());
        animals.setQc(animals.getINCORRECT());

        rg =(RadioGroup)findViewById(R.id.myRb);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                int selectedId = rg.getCheckedRadioButtonId();

               int score1=0;

                                 //first questions


                if(selectedId ==R.id.rbQ1a)
                {
                     total = total + 1;
                     score1=animals.getQa();


                }
                else if(selectedId ==R.id.rbQ1b)
                {
                    score1= animals.getQb();

                }


                else if(selectedId ==R.id.rbQ1c)
                {
                    score1=animals.getQc();

                }




                                //second question



                else if(selectedId ==R.id.rbQ2a) {
                    total = total + 1;
                    score1 = animals.getQa();
                }

                else if(selectedId ==R.id.rbQ2b)
                {
                    score1= animals.getQb();

                }

                else if(selectedId ==R.id.rbQ2c) {
                    score1 = animals.getQb();
                }


                          //third question

               else if(selectedId ==R.id.rbQ3a)
                {
                   score1 = animals.getQb();
                }

                else if(selectedId ==R.id.rbQ3b)
                {
                   score1 =animals.getQc();
                }

                else if(selectedId ==R.id.rbQ3c)
                {
                    total = total + 1;
                   score1 = animals.getINCORRECT();
                }



                         //fourth question

                 else if(selectedId ==R.id.rbQ4a)
                {
                    score1=animals.getQb();
                }

                else if(selectedId ==R.id.rbQ4b)
                {
                    total = total+1;
                    score1=animals.getQa();
                }

                else if(selectedId ==R.id.rbQ4c)
                {

                   score1=animals.getQc();
                }


                             //fifth question

                else if(selectedId ==R.id.rbQ5a)
                {
                    total = total + 1;
                    score1=animals.getQa();
                }

                else if(selectedId ==R.id.rbQ5b) {
                    score1=animals.getQb();
                }

                else if(selectedId ==R.id.rbQ5c)
                {
                    score1=animals.getQc();
                }

                     //last question

                else if(selectedId ==R.id.rbQ6a)
                {
                    score1=animals.getQb();
                    btn_results.setVisibility(View.VISIBLE);
                }

                else if(selectedId ==R.id.rbQ6b)
                {
                    score1=animals.getQc();
                    btn_results.setVisibility(View.VISIBLE);
                }

                else if(selectedId ==R.id.rbQ6c)
                {
                    total = total + 1;
                    score1=animals.getQa();
                    btn_results.setVisibility(View.VISIBLE);

                }

            }
        });

    }



    public void Answers(View v)
    {
        Intent intent = new Intent(this,AnswersActivity.class);
        startActivity(intent);

        btn_Answers.setVisibility(View.INVISIBLE);
    }

    public void Results(View v)
    {
         if(total <=3)
         {
             tv_results.setText("your results:" + total + "out of 6" +"\nThat's bad you dnt know your animals" );
         }
         else
         {
             tv_results.setText("your results:" + total + "out of 6" +"\nExcellent you know your animals");
         }


         btn_Answers.setVisibility(View.VISIBLE);

    }

    public void GoBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void Picture(View v) {
        AlertDialog.Builder build = new AlertDialog.Builder(this);

        build.setTitle("NEXT QUIZ");
        build.setMessage("Would you like to try the General knowledge quiz?");

        build.setCancelable(false);

        build.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent inten = new Intent(AnimalActivity.this, MainActivity.class);
                startActivity(inten);
                finish();

            }
        });

        build.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent inten = new Intent(AnimalActivity.this, GeneralActivity.class);
                startActivity(inten);

            }
        });
        AlertDialog alert = build.create();

        alert.show();

    }


}
