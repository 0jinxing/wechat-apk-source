package com.facebook.appevents;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppEventQueue$6
  implements Runnable
{
  AppEventQueue$6(AccessTokenAppIdPair paramAccessTokenAppIdPair, SessionEventsState paramSessionEventsState)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(71889);
    AppEventStore.persistEvents(this.val$accessTokenAppId, this.val$appEvents);
    AppMethodBeat.o(71889);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEventQueue.6
 * JD-Core Version:    0.6.2
 */