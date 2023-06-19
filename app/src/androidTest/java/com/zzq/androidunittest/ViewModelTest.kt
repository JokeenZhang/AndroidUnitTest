package com.zzq.androidunittest

import androidx.lifecycle.ViewModelProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.zzq.androidunittest.ui.SaveUiStateViewModel1
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ViewModelTest {

    private val context = InstrumentationRegistry.getInstrumentation().targetContext
    private val appContext = context.applicationContext
    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun createVmSuccess() {
//        val factory = ViewModelProvider.AndroidViewModelFactory(MyApp.instance)
//        val appVm = ViewModelProvider(this,factory).get(UnitAppViewModel::class.java)
//
//        val saveUiStateVm1 = ViewModelProvider(this).get(SaveUiStateViewModel1::class.java)
    }

}