package com.tencent.mm.plugin.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.l;
import java.lang.ref.WeakReference;

final class b$1
  implements Runnable
{
  b$1(b paramb, j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(136517);
    l locall = (l)b.a(this.mAM).get();
    if (locall != null)
      locall.b(this.mAL);
    AppMethodBeat.o(136517);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.1
 * JD-Core Version:    0.6.2
 */