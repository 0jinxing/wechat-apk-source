package com.facebook.appevents;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppEventQueue$2
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(71885);
    AppEventStore.persistEvents(AppEventQueue.access$100());
    AppEventQueue.access$102(new AppEventCollection());
    AppMethodBeat.o(71885);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEventQueue.2
 * JD-Core Version:    0.6.2
 */