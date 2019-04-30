package com.example.continuous

class UIActionsInfo {
    var lastAction: String = "clean"
        private set

    fun click(): UIActionsInfo {
        lastAction = "Clicked"
        return this
    }

    fun longClick(): UIActionsInfo {
        lastAction = "LongClicked"
        return this
    }

    fun doubleClick(): UIActionsInfo {
        lastAction = "DoubleClicked"
        return this
    }

}
