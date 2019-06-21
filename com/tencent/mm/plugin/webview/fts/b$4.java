package com.tencent.mm.plugin.webview.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.sdk.platformtools.al;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class b$4
  implements com.tencent.mm.plugin.fts.a.l
{
  b$4(b paramb)
  {
  }

  public final void b(j paramj)
  {
    AppMethodBeat.i(5679);
    if (paramj.bFZ == 0)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramj.mEy.iterator();
      while (localIterator.hasNext())
        localArrayList.add(((com.tencent.mm.plugin.fts.a.a.l)localIterator.next()).content);
      al.d(new b.4.1(this, paramj, localArrayList));
    }
    AppMethodBeat.o(5679);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.b.4
 * JD-Core Version:    0.6.2
 */