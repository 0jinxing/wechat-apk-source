package com.tencent.mm.plugin.expt.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.w;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.expt.a.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;

public final class e
{
  private static e lOg;

  private void KZ(String paramString)
  {
    AppMethodBeat.i(73559);
    d.post(new e.1(this, paramString), "report_weixin_app_time");
    AppMethodBeat.o(73559);
  }

  private void a(a.a parama, w paramw)
  {
    AppMethodBeat.i(73557);
    if (!ah.bqo())
      AppMethodBeat.o(73557);
    long l1;
    int i;
    as localas;
    while (true)
    {
      return;
      l1 = bo.yz();
      i = a.b(parama);
      if (i <= 0)
      {
        AppMethodBeat.o(73557);
      }
      else
      {
        localas = bra();
        if (localas != null)
          break;
        AppMethodBeat.o(73557);
      }
    }
    String str = localas.getString(parama.name(), "");
    str = str + "|" + paramw.eU(";");
    long l2 = localas.getLong(parama.name() + "_rpttime", 0L);
    if (((str.length() >= i) || (bo.fp(l2) > 3600L)) && (paramw.cWS % 2L == 0L))
    {
      localas.putLong(parama.name() + "_rpttime", bo.anT());
      localas.putString(parama.name(), "");
      h.pYm.X(16562, str);
      if (parama == a.a.lIl)
        KZ(str);
    }
    while (true)
    {
      ab.v("MicroMsg.MMPageReporter", "handle merge cost[%d]", new Object[] { Long.valueOf(bo.az(l1)) });
      AppMethodBeat.o(73557);
      break;
      localas.putString(parama.name(), str);
    }
  }

  private static as bra()
  {
    AppMethodBeat.i(73558);
    int i = com.tencent.mm.kernel.a.Ra();
    as localas;
    if (i == 0)
    {
      localas = null;
      AppMethodBeat.o(73558);
    }
    while (true)
    {
      return localas;
      localas = as.amF(i + "_WxPageFlowMerge");
      AppMethodBeat.o(73558);
    }
  }

  public static e brf()
  {
    AppMethodBeat.i(73555);
    if (lOg == null)
      lOg = new e();
    e locale = lOg;
    AppMethodBeat.o(73555);
    return locale;
  }

  public final void a(w paramw)
  {
    AppMethodBeat.i(73556);
    if (paramw == null)
      AppMethodBeat.o(73556);
    while (true)
    {
      return;
      int i = (int)paramw.cWS;
      if ((i == c.a.lLW.value) || (i == c.a.lLX.value))
      {
        a(a.a.lIj, paramw);
        if (a.bqW())
          paramw.ajK();
      }
      if ((i == c.a.lLY.value) || (i == c.a.lLZ.value))
      {
        a(a.a.lIk, paramw);
        if (a.bqX())
          paramw.ajK();
      }
      if (((i == c.a.lMc.value) || (i == c.a.lMd.value)) && (com.tencent.mm.plugin.expt.hellhound.a.bqj()) && (com.tencent.mm.plugin.expt.hellhound.a.bqk()))
      {
        a(a.a.lIl, paramw);
        if (a.bqY())
          paramw.ajK();
      }
      AppMethodBeat.o(73556);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.c.e
 * JD-Core Version:    0.6.2
 */