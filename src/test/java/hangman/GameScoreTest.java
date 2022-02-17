package hangman;

import hangman.model.OriginalScore;
import hangman.model.BonusScore;
import hangman.model.PowerScore;
import hangman.exceptions.ExcepcionParametrosInvalidos;

import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest {
    @Test
    public void ParametrosInvalidosEnOriginalScoreBefore(){
        int correctCount = -1; 
        int incorrectCount = -1; 
        int ans;

        OriginalScore score = new OriginalScore();

        try {
            ans = score.calculateScore(correctCount,incorrectCount);

            Assert.fail();
        } 
        catch (ExcepcionParametrosInvalidos e) {
            Assert.assertEquals(ExcepcionParametrosInvalidos.PARAMETRO_NEGATIVO,e.getMessage());
        }
    }

    @Test
    public void ParametrosInvalidosEnOriginalScoreDuring(){
        int correctCount = 0; 
        int incorrectCount = 0; 
        int ans,value;

        OriginalScore score = new OriginalScore();

        try{
            ans = score.calculateScore(correctCount,incorrectCount);

            value = 100;

            Assert.assertEquals(ans,value);
        } 
        catch(ExcepcionParametrosInvalidos e){
            //None
        }
    }

    @Test
    public void ParametrosInvalidosEnOriginalScoreAfter(){
        int correctCount01 = 1; int incorrectCount01 = 0; int correctCount02 = 1; int incorrectCount02 = 2;
        int ans01,ans02,value01,value02;

        OriginalScore score = new OriginalScore();

        try{
            ans01 = score.calculateScore(correctCount01,incorrectCount01);
            ans02 = score.calculateScore(correctCount02,incorrectCount02);

            value01 = 100;
            value02 = 80;

            Assert.assertEquals(ans01,value01);
            Assert.assertEquals(ans02,value02);
        } 
        catch(ExcepcionParametrosInvalidos e){
            //None
        }
    }

    @Test
    public void ParametroMayorTenOriginalScoreBefore(){
        int correctCount = 5; int incorrectCount = 11;
        int ans,value;

        OriginalScore score = new OriginalScore();

        try{
            ans = score.calculateScore(correctCount,incorrectCount);

            value = 0;

            Assert.assertEquals(ans,value);
        } 
        catch(ExcepcionParametrosInvalidos e){
            //None
        }
    }

    @Test
    public void ParametrosInvalidosEnBonusScoreBefore(){
        int correctCount = -1; 
        int incorrectCount = -1; 
        int ans;

        BonusScore score = new BonusScore();

        try {
            ans = score.calculateScore(correctCount,incorrectCount);

            Assert.fail();
        } 
        catch (ExcepcionParametrosInvalidos e) {
            Assert.assertEquals(ExcepcionParametrosInvalidos.PARAMETRO_NEGATIVO,e.getMessage());
        }
    }

    @Test
    public void ParametrosInvalidosEnBonusScoreDuring(){
        int correctCount = 0; 
        int incorrectCount = 0; 
        int ans,value;

        BonusScore score = new BonusScore();

        try{
            ans = score.calculateScore(correctCount,incorrectCount);

            value = 0;

            Assert.assertEquals(ans,value);
        } 
        catch(ExcepcionParametrosInvalidos e){
            //None
        }
    }

    @Test
    public void ParametrosInvalidosEnBonusScoreAfter(){
        int correctCount01 = 1; int incorrectCount01 = 0; int correctCount02 = 1; int incorrectCount02 = 2;
        int ans01,ans02,value01,value02;

        BonusScore score = new BonusScore();

        try{
            ans01 = score.calculateScore(correctCount01,incorrectCount01);
            ans02 = score.calculateScore(correctCount02,incorrectCount02);

            value01 = 10;
            value02 = 0;

            Assert.assertEquals(ans01,value01);
            Assert.assertEquals(ans02,value02);
        } 
        catch(ExcepcionParametrosInvalidos e){
            //None
        }
    }

    @Test
    public void PuntajeMenorCeroEnBonusScore(){
        int correctCount = 0; 
        int incorrectCount = 3; 
        int ans,value;

        BonusScore score = new BonusScore();

        try{
            ans = score.calculateScore(correctCount,incorrectCount);

            value = 0;

            Assert.assertEquals(ans,value);
        } 
        catch(ExcepcionParametrosInvalidos e){
            //None
        }
    }


@Test
    public void ParametrosInvalidosEnPowerScoreBefore(){
        int correctCount = -1; 
        int incorrectCount = 0; 
        int ans;

        PowerScore score = new PowerScore();

        try {
            ans = score.calculateScore(correctCount,incorrectCount);

            Assert.fail();
        } 
        catch (ExcepcionParametrosInvalidos e) {
            Assert.assertEquals(ExcepcionParametrosInvalidos.PARAMETRO_NEGATIVO,e.getMessage());
        }
    }

    @Test
    public void ParametrosInvalidosEnPowerScoreDuring(){
        int correctCount = 0; 
        int incorrectCount = 0; 
        int ans,value;

        PowerScore score = new PowerScore();

        try{
            ans = score.calculateScore(correctCount,incorrectCount);

            value = 0;

            Assert.assertEquals(ans,value);
        } 
        catch(ExcepcionParametrosInvalidos e){
            //None
        }
    }

    @Test
    public void ParametrosInvalidosEnPowerScoreAfter(){
        int correctCount01 = 1; int incorrectCount01 = 0; int correctCount02 = 1; int incorrectCount02 = 2;
        int ans01,ans02,value01,value02;

        PowerScore score = new PowerScore();

        try{
            ans01 = score.calculateScore(correctCount01,incorrectCount01);
            ans02 = score.calculateScore(correctCount02,incorrectCount02);

            value01 = 5;
            value02 = 0;

            Assert.assertEquals(ans01,value01);
            Assert.assertEquals(ans02,value02);
        } 
        catch(ExcepcionParametrosInvalidos e){
            //None
        }
    }

    @Test
    public void PuntajeExcedeElLimiteEnPowerScore(){
        int correctCount = 4; 
        int incorrectCount = 0; 
        int ans,value;

        PowerScore score = new PowerScore();

        try{
            ans = score.calculateScore(correctCount,incorrectCount);

            value = 500;

            Assert.assertEquals(ans,value);
        } 
        catch(ExcepcionParametrosInvalidos e){
            //None
        }
    }
}