package com.facebook.appevents;

import com.facebook.FacebookSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppEventsLogger$PersistedAppSessionInfo$1
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(71914);
    AppEventsLogger.PersistedAppSessionInfo.saveAppSessionInformation(FacebookSdk.getApplicationContext());
    AppMethodBeat.o(71914);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEventsLogger.PersistedAppSessionInfo.1
 * JD-Core Version:    0.6.2
 */