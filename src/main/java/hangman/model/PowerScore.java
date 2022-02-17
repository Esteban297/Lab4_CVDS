package hangman.model;

import hangman.exceptions.*;
import static com.google.common.math.IntMath.pow;

public class PowerScore implements GameScore{
    public final int puntaje = 0;
    /**
     * @pre Entra el numero de aciertos y el numero de letras incorrectas
     * @pos Devuelve el puntaje final teniendo en cuenta las condiciones
     * 
     * @param correctCount int Numero de letras correctas
     * @param incorrectCount int Numero de letras incorrectas
     * 
     * @throws ExcepcionParametrosInvalidos Ingresa parametros diferentes a los esperados
     */
    public int calculateScore(int correctCount,int incorrectCount) throws ExcepcionParametrosInvalidos{
        int puntaje = 0;
        
        if(correctCount<0 || incorrectCount<0){
            throw new ExcepcionParametrosInvalidos(ExcepcionParametrosInvalidos.PARAMETRO_NEGATIVO);
        }
        else{
            puntaje = pow(5,puntaje)-(8*incorrectCount);

            if(puntaje<0){
                return 0;
            }
            else if(puntaje>500){
                return 500;
            }
    
            return puntaje;
        }
    }

    public int getScore(){
        return puntaje;
    }
}