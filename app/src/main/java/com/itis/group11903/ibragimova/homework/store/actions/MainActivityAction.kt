package com.itis.group11903.ibragimova.homework.store.actions

import com.itis.group11903.ibragimova.homework.store.state.MathData

sealed class MainActivityAction {

    object MathStarted : MainActivityAction()

    class MathError(val message: String?) : MainActivityAction()

    class MathSuccess(val mathData: MathData) : MainActivityAction()

    sealed class MathDataInput(val number: Int) : MainActivityAction() {

        class First(firstNumber: Int): MathDataInput(firstNumber)

        class Second(secondNumber: Int): MathDataInput(secondNumber)

        class Result(resultNumber: Int): MathDataInput(resultNumber)
    }
}