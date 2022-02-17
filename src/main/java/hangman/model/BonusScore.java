package hangman.model;

import hangman.exceptions.*;

public class BonusScore implements GameScore{
    private final int puntaje = 100;

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
        if(correctCount<0 || incorrectCount<0){
            throw new ExcepcionParametrosInvalidos(ExcepcionParametrosInvalidos.PARAMETRO_NEGATIVO);
        }
        else{
            if(puntaje<0){
                return 0;
            }

            return puntaje+(correctCount*10)-(incorrectCount*5);
        }
    }

    public int getScore(){
        return puntaje;
    }
}