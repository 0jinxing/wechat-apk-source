package com.tencent.mm.plugin.emojicapture.model.b;

import a.l;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class c$c
  implements Runnable
{
  c$c(c paramc, a.f.a.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(2666);
    long l = bo.yz();
    boolean bool = c.a(this.liu).bFM();
    ab.i(c.b(this.liu), "finishEncode used " + bo.az(l) + ", ret:" + bool + ", totally used " + bo.az(c.c(this.liu)) + "ms");
    c.d(this.liu).quit();
    a.f.a.a locala = this.lix;
    if (locala != null)
    {
      locala.invoke();
      AppMethodBeat.o(2666);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2666);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.b.c.c
 * JD-Core Version:    0.6.2
 */