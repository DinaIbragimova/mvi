package com.itis.group11903.ibragimova.homework.store.sideeffects

import com.freeletics.rxredux.SideEffect
import com.itis.group11903.ibragimova.homework.store.actions.MainActivityAction
import com.itis.group11903.ibragimova.homework.store.state.MainActivityState

typealias MainActivitySideEffect = SideEffect<MainActivityState, MainActivityAction>

