package com.androidhuman.example.simplegithub.extensions

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import com.androidhuman.example.simplegithub.rx.AutoClearedDisposable

operator fun CompositeDisposable.plusAssign(disposable: Disposable) {
    this.add(disposable)
}

operator fun AutoClearedDisposable.plusAssign(disposable: Disposable) {
    this.add(disposable)
}

operator fun Lifecycle.plusAssign(observer: LifecycleObserver) = this.addObserver(observer)