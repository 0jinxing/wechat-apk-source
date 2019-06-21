package com.tencent.mm.plugin.expt.hellhound.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.a.c.a;
import com.tencent.mm.plugin.expt.c.d;
import com.tencent.mm.plugin.expt.hellhound.core.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class c
{
  public static void a(String paramString, int paramInt, c.a parama)
  {
    AppMethodBeat.i(73458);
    int i = -1;
    if (parama == c.a.lMc)
    {
      i = 7;
      if ((b.bqo()) && (!d.brc()))
      {
        if (parama != c.a.lMc)
          break label143;
        h.pYm.a(932L, 91L, 1L, false);
      }
    }
    while (true)
    {
      ab.i("HellFrontBackReport", "habbyge-mali, 切换-前后台(3): " + i + " / " + paramString + " 未登录");
      ab.i("HellFrontBackReport", "habbyge-mali, 切换-前后台(3): " + i + " / " + paramString);
      d.brb().a(paramString, parama, paramInt);
      AppMethodBeat.o(73458);
      return;
      if (parama != c.a.lMd)
        break;
      i = 8;
      break;
      label143: if (parama == c.a.lMd)
        h.pYm.a(932L, 92L, 1L, false);
    }
  }

  static void a(String paramString, c.a parama, int paramInt, long paramLong)
  {
    AppMethodBeat.i(73459);
    d.brb().a(paramString, parama, paramInt, paramLong);
    AppMethodBeat.o(73459);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.a.a.c
 * JD-Core Version:    0.6.2
 */