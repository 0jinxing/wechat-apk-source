package com.tencent.mm.plugin.hp.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.sdk.platformtools.ab;

final class d$1
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(90686);
    ab.i("MicroMsg.UpdateUtil", "delete apk file. on worker thread");
    e.cu(d.bGC());
    AppMethodBeat.o(90686);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.d.d.1
 * JD-Core Version:    0.6.2
 */