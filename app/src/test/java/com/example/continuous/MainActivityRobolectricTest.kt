package com.example.continuous

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityRobolectricTest{

    @get:Rule
    val rule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun textStartsWithHi(){
        Espresso.onView(ViewMatchers.withId(R.id.textView)).check(ViewAssertions.matches(ViewMatchers.withText("Hi")))
    }

    @Test
    fun textChangesTo_Clicked_whenFabClicked(){
        Espresso.onView(ViewMatchers.withId(R.id.fab)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.textView))
            .check(ViewAssertions.matches(ViewMatchers.withText("Clicked")))
    }

    @Test
    fun textChangesTo_LongClicked_whenFabLongClicked() {
        Espresso.onView(ViewMatchers.withId(R.id.fab)).perform(ViewActions.longClick())
        Espresso.onView(ViewMatchers.withId(R.id.textView))
            .check(ViewAssertions.matches(ViewMatchers.withText("LongClicked")))

    }
}
