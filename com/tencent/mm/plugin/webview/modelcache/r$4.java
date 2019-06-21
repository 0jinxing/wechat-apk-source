package com.tencent.mm.plugin.webview.modelcache;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class r$4
  implements Runnable
{
  r$4(r paramr, al paramal)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6883);
    Looper.myQueue().addIdleHandler(new r.4.1(this));
    AppMethodBeat.o(6883);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.r.4
 * JD-Core Version:    0.6.2
 */