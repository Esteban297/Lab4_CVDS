package hangman.model;

import hangman.exceptions.*;

public interface GameScore{
    int calculateScore(int correctCount,int incorrectCount) throws ExcepcionParametrosInvalidos;
}