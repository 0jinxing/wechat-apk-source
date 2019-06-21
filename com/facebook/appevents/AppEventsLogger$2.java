package com.facebook.appevents;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppEventsLogger$2
  implements Runnable
{
  AppEventsLogger$2(AppEventsLogger paramAppEventsLogger, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(71907);
    AppEventsLogger.access$100(this.val$logger, this.val$eventTime);
    AppMethodBeat.o(71907);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEventsLogger.2
 * JD-Core Version:    0.6.2
 */