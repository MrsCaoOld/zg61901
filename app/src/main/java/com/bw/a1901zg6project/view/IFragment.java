package com.bw.a1901zg6project.view;

import android.view.View;

import androidx.annotation.IdRes;

public interface IFragment extends IActivity{
    <T extends View> T findViewById(@IdRes int id);
}
