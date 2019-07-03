package yinghsuenlin.quizapp;

public class FillTheBlankQuestion extends Question
{
    private String[] mFillAnswers;

    public FillTheBlankQuestion(int textResId, int hintTextResId, String[] fillAnswers)
    {
        super(textResId, hintTextResId);
        mFillAnswers = fillAnswers;
    }

    @Override
    public boolean checkAnswer(String userAnswer)
    {
        for (String ans : mFillAnswers)
        {
            if (ans.equalsIgnoreCase(userAnswer))
            {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean isFillTheBlankQuestion()
    {
        return true;
    }
}
