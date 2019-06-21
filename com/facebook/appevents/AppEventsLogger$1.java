package com.facebook.appevents;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppEventsLogger$1
  implements Runnable
{
  AppEventsLogger$1(AppEventsLogger paramAppEventsLogger, long paramLong, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(71906);
    AppEventsLogger.access$000(this.val$logger, this.val$eventTime, this.val$sourceApplicationInfo);
    AppMethodBeat.o(71906);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEventsLogger.1
 * JD-Core Version:    0.6.2
 */