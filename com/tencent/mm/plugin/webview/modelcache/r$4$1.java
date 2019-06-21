package com.tencent.mm.plugin.webview.modelcache;

import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class r$4$1
  implements MessageQueue.IdleHandler
{
  r$4$1(r.4 param4)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(6882);
    if (Build.VERSION.SDK_INT >= 18)
      this.uop.uoo.oAl.getLooper().quitSafely();
    while (true)
    {
      AppMethodBeat.o(6882);
      return false;
      this.uop.uoo.oAl.getLooper().quit();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.r.4.1
 * JD-Core Version:    0.6.2
 */