package com.tencent.mm.pluginsdk.g.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.y;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class p
{
  public static void dix()
  {
    AppMethodBeat.i(79611);
    if (g.RN().QY())
    {
      g.RN();
      if (!a.QT());
    }
    else
    {
      AppMethodBeat.o(79611);
    }
    while (true)
    {
      return;
      if (getNetworkType() == 0)
      {
        AppMethodBeat.o(79611);
      }
      else
      {
        long l = bo.anT();
        if (bo.a((Long)g.RP().Ry().get(ac.a.xMf, null), 0L) < l)
        {
          g.RP().Ry().set(ac.a.xMf, Long.valueOf(7200L + l));
          ab.i("MicroMsg.PostTaskCheckResume", "doCheckResume");
          q.a.diy().aNS().aa(new p.1());
        }
        AppMethodBeat.o(79611);
      }
    }
  }

  static int getNetworkType()
  {
    AppMethodBeat.i(79612);
    int i;
    switch (y.Me())
    {
    default:
      i = 2;
      AppMethodBeat.o(79612);
    case 0:
    case 1:
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(79612);
      continue;
      i = 1;
      AppMethodBeat.o(79612);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.p
 * JD-Core Version:    0.6.2
 */