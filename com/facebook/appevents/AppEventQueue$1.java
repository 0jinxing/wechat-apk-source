package com.facebook.appevents;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppEventQueue$1
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(71884);
    AppEventQueue.access$002(null);
    if (AppEventsLogger.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY)
      AppEventQueue.flushAndWait(FlushReason.TIMER);
    AppMethodBeat.o(71884);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEventQueue.1
 * JD-Core Version:    0.6.2
 */