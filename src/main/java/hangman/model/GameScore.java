package hangman.model;

import hangman.exceptions.*;

public interface GameScore{
    int getScore();
    int calculateScore(int correctCount,int incorrectCount) throws ExcepcionParametrosInvalidos;
}