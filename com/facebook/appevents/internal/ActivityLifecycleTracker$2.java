package com.facebook.appevents.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ActivityLifecycleTracker$2
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(72140);
    if (ActivityLifecycleTracker.access$200() == null)
      ActivityLifecycleTracker.access$202(SessionInfo.getStoredSessionInfo());
    AppMethodBeat.o(72140);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.internal.ActivityLifecycleTracker.2
 * JD-Core Version:    0.6.2
 */