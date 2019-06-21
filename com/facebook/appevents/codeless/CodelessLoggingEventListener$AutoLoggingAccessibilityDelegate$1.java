package com.facebook.appevents.codeless;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.tencent.matrix.trace.core.AppMethodBeat;

class CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate$1
  implements Runnable
{
  CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate$1(CodelessLoggingEventListener.AutoLoggingAccessibilityDelegate paramAutoLoggingAccessibilityDelegate, String paramString, Bundle paramBundle)
  {
  }

  public void run()
  {
    AppMethodBeat.i(72041);
    AppEventsLogger.newLogger(FacebookSdk.getApplicationContext()).logEvent(this.val$eventName, this.val$params);
    AppMethodBeat.o(72041);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingAccessibilityDelegate.1
 * JD-Core Version:    0.6.2
 */