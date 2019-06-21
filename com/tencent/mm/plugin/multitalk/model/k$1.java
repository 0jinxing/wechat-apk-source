package com.tencent.mm.plugin.multitalk.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class k$1
  implements Runnable
{
  k$1(k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(54060);
    Looper.prepare();
    ab.i("MicroMsg.MT.MultiTalkVideoNativeReceiver", "start native drawer handler");
    this.oGZ.oGX = new ak();
    Looper.loop();
    AppMethodBeat.o(54060);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.k.1
 * JD-Core Version:    0.6.2
 */