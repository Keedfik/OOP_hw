package Models.Operations;

import Logger.Log;
import Models.Interfaces.iCalculator;

public class ComCal implements iCalculator {
    private Log log;

    public ComCal(Log log){
        this.log = log;
    }

    @Override
    public ComplexNumbers add(ComplexNumbers n1, ComplexNumbers n2) {
        ComplexNumbers result = n1.add(n2);
        log.log("Cложение: " + n1 + " + " + n2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumbers multiply(ComplexNumbers n1, ComplexNumbers n2) {
        ComplexNumbers result = n1.multiplication(n2);
        log.log("Умножение: " + n1 + " * " + n2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumbers divide(ComplexNumbers n1, ComplexNumbers n2) {
        ComplexNumbers result = n1.divide(n2);
        log.log("Деление: " + n1 + " / " + n2 + " = " + result);
        return result;
    }



}