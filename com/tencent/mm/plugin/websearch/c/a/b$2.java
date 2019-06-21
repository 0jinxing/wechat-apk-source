package com.tencent.mm.plugin.websearch.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class b$2
  implements l
{
  b$2(b paramb)
  {
  }

  public final void b(j paramj)
  {
    AppMethodBeat.i(91369);
    a locala = (a)paramj.mEx.mDs;
    if (locala == null)
      AppMethodBeat.o(91369);
    c.a locala1;
    while (true)
    {
      return;
      locala1 = (c.a)this.uch.jxd.remove(locala);
      if (locala1 != null)
        break;
      AppMethodBeat.o(91369);
    }
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
      locala1.cVJ();
      AppMethodBeat.o(91369);
      break;
      if ((paramj.mEy == null) || (paramj.mEy.size() == 0))
      {
        ab.i("FTSMatchContact", "local contact search size 0");
        locala1.cVJ();
        AppMethodBeat.o(91369);
        break;
      }
      locala.dZ(paramj.mEy);
      continue;
      locala.dZ(Collections.emptyList());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.c.a.b.2
 * JD-Core Version:    0.6.2
 */