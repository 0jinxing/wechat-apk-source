package com.tencent.mm.plugin.fts;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class c$2
  implements Runnable
{
  c$2(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(136522);
    Looper.prepare();
    c.a(this.mAW, new ak());
    Looper.loop();
    AppMethodBeat.o(136522);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.c.2
 * JD-Core Version:    0.6.2
 */