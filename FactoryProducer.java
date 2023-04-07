/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abfa;

/**
 *
 * @author student
 */
public class FactoryProducer {
    public static AbstractFactory provideFactory(boolean edgy){
        if (edgy)
            return new EdgyFactory();
        else
            return new RoundFactory();
    }
}
