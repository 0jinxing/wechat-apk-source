package com.tencent.mm.booter;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mw;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class KeepAliveService$2
  implements Runnable
{
  KeepAliveService$2(KeepAliveService paramKeepAliveService)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(57761);
    mw localmw = new mw();
    a.xxA.a(localmw, Looper.getMainLooper());
    ab.i("MicroMsg.KeepAliveService", "onReceive() publish PushKeepAliveEvent");
    AppMethodBeat.o(57761);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.KeepAliveService.2
 * JD-Core Version:    0.6.2
 */