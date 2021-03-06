package com.itis.android.lessontwo.ui.creatorslist;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.itis.android.lessontwo.R;
import com.itis.android.lessontwo.ui.characterslist.CharactersListActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by valera071998@gmail.com on 31.03.2018.
 */
@RunWith(AndroidJUnit4.class)
public class CreatorsListEmptyActivity {

    @Rule
    public final ActivityTestRule<CreatorsListActivity> rule
            = new ActivityTestRule<>(CreatorsListActivity.class, false, false);

    @Test
    public void testErrorDisplayed() throws Exception {
        // need generate error, i haven't fantasy

        launchActivity();

        onView(withId(R.id.tv_empty)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_comics_list)).check(matches(not(isDisplayed())));

        onView(withId(R.id.tv_empty)).check(matches(withText(R.string.text_empty_content)));
    }

    private void launchActivity() {
        Context context = InstrumentationRegistry.getContext();
        Intent intent = new Intent(context, CreatorsListActivity.class);
        rule.launchActivity(intent);
    }
}