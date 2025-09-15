package com.jarviswiz;

import android.content.Context;

public class AIProcessor {
    public static void processInput(Context context, String input) {
        String response = "You said: " + input;
        new SpeechHelper(context).speak(response);
    }
}
