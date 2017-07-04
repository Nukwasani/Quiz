package com.example.thandiwe.quiz;

/**
 * Created by Thandiwe on 2017/06/13.
 */

public class Knowladge {

    private int Qa;
    private int Qb;
    private int Qc;
    private int Qd;


    private final int CORRECT =1;
    private final int INCORRECT =0;


    public Knowladge() {
    }

    public Knowladge(int qa, int qb, int qc, int qd) {
        Qa = qa;
        Qb = qb;
        Qc = qc;
        Qd = qd;
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

    public int getQd() {
        return Qd;
    }

    public void setQd(int qd) {
        Qd = qd;
    }

    public int getCORRECT() {
        return CORRECT;
    }

    public int getINCORRECT() {
        return INCORRECT;
    }
}
