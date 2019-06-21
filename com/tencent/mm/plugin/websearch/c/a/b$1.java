package com.tencent.mm.plugin.websearch.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class b$1
  implements l
{
  b$1(b paramb)
  {
  }

  public final void b(j paramj)
  {
    AppMethodBeat.i(91368);
    a locala = (a)paramj.mEx.mDs;
    if (locala == null)
    {
      AppMethodBeat.o(91368);
      return;
    }
    CountDownLatch localCountDownLatch = (CountDownLatch)this.uch.uce.remove(locala);
    switch (paramj.bFZ)
    {
    default:
    case 0:
    case -3:
    case -2:
    case -1:
    }
    while (true)
    {
      localCountDownLatch.countDown();
      AppMethodBeat.o(91368);
      break;
      if ((paramj.mEy == null) || (paramj.mEy.size() == 0))
      {
        ab.i("FTSMatchContact", "local contact search size 0");
        locala.dZ(Collections.emptyList());
        localCountDownLatch.countDown();
        AppMethodBeat.o(91368);
        break;
      }
      locala.dZ(paramj.mEy);
      continue;
      locala.dZ(Collections.emptyList());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.c.a.b.1
 * JD-Core Version:    0.6.2
 */