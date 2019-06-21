package com.tencent.mm.plugin.websearch.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.cn;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.WidgetData.Info;
import com.tencent.mm.plugin.websearch.api.n;

public final class f
{
  public static void a(int paramInt, WidgetData paramWidgetData1, WidgetData paramWidgetData2)
  {
    AppMethodBeat.i(91450);
    Object localObject = "";
    switch (paramInt)
    {
    default:
      paramWidgetData2 = (WidgetData)localObject;
    case 1:
    case 3:
    case 2:
    }
    while (true)
    {
      localObject = new cn();
      paramWidgetData2 = ((cn)localObject).hr(paramWidgetData2);
      paramWidgetData2.dha = paramInt;
      paramWidgetData2.dhb = (System.currentTimeMillis() / 1000L);
      paramWidgetData2.dhd = paramWidgetData1.ubs.fmr;
      paramWidgetData2.hs(paramWidgetData1.ubs.ubB).ht(String.format("%s-%s-%s", new Object[] { paramWidgetData1.ubs.hlm, Integer.valueOf(paramWidgetData1.ubs.fmr), Long.valueOf(System.currentTimeMillis() / 1000L) }));
      paramWidgetData1 = ((cn)localObject).Fj();
      ((n)g.K(n.class)).bw(14688, paramWidgetData1);
      AppMethodBeat.o(91450);
      return;
      paramWidgetData2 = paramWidgetData1.ubs.fpS;
      continue;
      paramWidgetData2 = paramWidgetData2.ubs.fpS;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.f
 * JD-Core Version:    0.6.2
 */