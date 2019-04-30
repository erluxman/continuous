package com.example.continuous

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class MainActivityUnitTests {
private lateinit var uiActionsInfo :  UIActionsInfo
    @Before
    fun setup() {
        uiActionsInfo = UIActionsInfo()
    }

    @Test
    fun check_UIActionIsClean() {
        assertEquals("clean",uiActionsInfo.lastAction)
    }

    @Test
    fun check_clickRegisters(){
        assertEquals("Clicked",uiActionsInfo.click().lastAction)
    }

    @Test
    fun check_longClickRegisters(){
        assertEquals("LongClicked",uiActionsInfo.longClick().lastAction)
    }
    @Test
    fun check_doubleClickRegisters(){
        assertEquals("DoubleClicked ",uiActionsInfo.doubleClick().lastAction)
    }
}