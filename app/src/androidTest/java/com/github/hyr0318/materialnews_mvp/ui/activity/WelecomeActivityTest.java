package com.github.hyr0318.materialnews_mvp.ui.activity;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.github.hyr0318.materialnews_mvp.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class WelecomeActivityTest {

    @Rule
    public ActivityTestRule<WelecomeActivity> mActivityTestRule = new ActivityTestRule<>(WelecomeActivity.class);

    @Test
    public void welecomeActivityTest() {
        ViewInteraction textView = onView(
                allOf(withText("逗比剧"), isDisplayed()));
        textView.perform(click());

        ViewInteraction textView2 = onView(
                allOf(withText("逗比剧"), isDisplayed()));
        textView2.perform(click());

        ViewInteraction appCompatImageButton = onView(
                allOf(withContentDescription("drawer_open"),
                        withParent(withId(R.id.common_toolbar)),
                        isDisplayed()));
        appCompatImageButton.perform(click());

        ViewInteraction appCompatImageButton2 = onView(
                allOf(withContentDescription("drawer_open"),
                        withParent(withId(R.id.common_toolbar)),
                        isDisplayed()));
        appCompatImageButton2.perform(click());

    }

}
