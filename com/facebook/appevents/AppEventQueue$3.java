package com.facebook.appevents;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppEventQueue$3
  implements Runnable
{
  AppEventQueue$3(FlushReason paramFlushReason)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(71886);
    AppEventQueue.flushAndWait(this.val$reason);
    AppMethodBeat.o(71886);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEventQueue.3
 * JD-Core Version:    0.6.2
 */