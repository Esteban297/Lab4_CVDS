package hangman.model;

import hangman.exceptions.*;

public class BonusScore implements GameScore{

    /**
     * @pre Entra el numero de aciertos y el numero de letras incorrectas
     * @pos Devuelve el puntaje final teniendo en cuenta las condiciones dadas
     * 
     * @param correctCount int Numero de letras correctas
     * @param incorrectCount int Numero de letras incorrectas
     * 
     * @throws ExcepcionParametrosInvalidos Ingresa parametros diferentes a los esperados 
     */
    public int calculateScore(int correctCount,int incorrectCount) throws ExcepcionParametrosInvalidos{
        return 0;
    }

}