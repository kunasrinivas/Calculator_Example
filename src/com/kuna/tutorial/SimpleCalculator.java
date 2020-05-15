package com.kuna.tutorial;

public class SimpleCalculator {
    double firstNumber;
    double secondNumber;
    double additionResult;
    double subtractionResult;
    double multiplicationResult;
    double divisionResult;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        this.additionResult = this.firstNumber + this.secondNumber;
        return additionResult;
    }

    public double getSubtractionResult() {
        this.subtractionResult = this.firstNumber - this.secondNumber;
        return subtractionResult;
    }

    public double getMultiplicationResult() {
        this.multiplicationResult = this.firstNumber * this.secondNumber;
        return multiplicationResult;
    }

    public double getDivisionResult() {
        if (this.secondNumber == 0) {
            return divisionResult = 0.0;
        }
        this.divisionResult = this.firstNumber / this.secondNumber;
        return divisionResult;
    }


}
