package com.tencent.mm.plugin.fts.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.l;
import java.lang.ref.WeakReference;

final class h$1
  implements Runnable
{
  h$1(h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(114266);
    l locall = (l)h.a(this.mEn).get();
    if (locall != null)
      locall.b(h.b(this.mEn));
    AppMethodBeat.o(114266);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.a.h.1
 * JD-Core Version:    0.6.2
 */