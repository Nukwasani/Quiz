package com.example.thandiwe.quiz;

/**
 * Created by Thandiwe on 2017/06/12.
 */

public class Animals {

    private int Qa;
    private int Qb;
    private int Qc;

    private final int CORRECT =1;
    private final int INCORRECT =0;



    public Animals() {
    }

    public Animals(int qa, int qb, int qc) {
        Qa = qa;
        Qb = qb;
        Qc = qc;
    }

    public int getQa() {
        return Qa;
    }

    public void setQa(int qa) {
        Qa = qa;
    }

    public int getQb() {
        return Qb;
    }

    public void setQb(int qb) {
        Qb = qb;
    }

    public int getQc() {
        return Qc;
    }

    public void setQc(int qc) {
        Qc = qc;
    }

    public int getCORRECT() {
        return CORRECT;
    }

    public int getINCORRECT() {
        return INCORRECT;
    }
}
