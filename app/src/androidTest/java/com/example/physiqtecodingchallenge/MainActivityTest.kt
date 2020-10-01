package com.example.physiqtecodingchallenge

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.hamcrest.CoreMatchers.notNullValue
import org.junit.Test

import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{


    @Test
    fun test_visibility_title_of_Btn_textBox(){
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.toolbar))
            .check(matches(isDisplayed()))

        onView(withId(R.id.fab))
            .check(matches(isDisplayed()))

        onView(withId(R.id.edittext_numerator))
            .check(matches(isDisplayed()))

        onView(withId(R.id.button_divide))
            .check(matches(isClickable()))

        onView(withId(R.id.textview_result))
            .check(matches(isDisplayed()))

        onView(withId(R.id.edittext_divisor))
            .check(matches(isDisplayed()))

        onView(withId(R.id.button_clear))
            .check(matches(isClickable()))



    }

    @Test
    fun test_isTitleDisplayed(){
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.imgviewLogo)).check(matches(isDisplayed()))
    }

    @Test
    fun test_check_enterValue(){
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        val firstValue =23;
        val secondValue = 23;
        onView(withId(R.id.edittext_numerator))
           // .perform(typeText(DataReader.getProperty("firstValue")))
            .perform(typeText(""+firstValue))
        onView(withId(R.id.edittext_divisor))
            .perform(typeText(""+secondValue))
            //.perform(typeText(DataReader.getProperty("secondValue")))
                onView(withId(R.id.button_divide))
            .perform(click())

        onView(withId(R.id.textview_result)).check(matches(notNullValue()))







    }

}