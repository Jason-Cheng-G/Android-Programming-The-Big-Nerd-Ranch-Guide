package com.bignerdranch.android.geoquiz;

/**
 * Created by gongcheng on 2018-01-15.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;


    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }
}
