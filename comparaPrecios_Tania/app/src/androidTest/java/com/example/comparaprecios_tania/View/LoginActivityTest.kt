package com.example.comparaprecios_tania.View


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.example.comparaprecios_tania.R
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class LoginActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(LoginActivity::class.java)

    @Test
    fun loginActivityTest() {
        val textInputEditText = onView(
allOf(withId(R.id.textInputEditText_mail)))
        textInputEditText.perform(replaceText("torres.tania89@gmail.com"), closeSoftKeyboard())
        
        val textInputEditText2 = onView(
allOf(withId(R.id.textInputEditText_password)))
        textInputEditText2.perform(replaceText("12345"), closeSoftKeyboard())
        
        val materialButton = onView(
allOf(withId(R.id.button_login), withText("Ingresar"),
childAtPosition(
childAtPosition(
withClassName(`is`("android.widget.FrameLayout")),
0),
2),
isDisplayed()))
        materialButton.perform(click())
        }
    
    private fun childAtPosition(
            parentMatcher: Matcher<View>, position: Int): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
    }
