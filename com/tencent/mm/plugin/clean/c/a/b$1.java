package com.tencent.mm.plugin.clean.c.a;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashMap;

final class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18726);
    Looper.prepare();
    ak localak = new ak(Looper.myLooper());
    this.kwO.kwM.put(Long.valueOf(Thread.currentThread().getId()), localak);
    Looper.loop();
    AppMethodBeat.o(18726);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.c.a.b.1
 * JD-Core Version:    0.6.2
 */