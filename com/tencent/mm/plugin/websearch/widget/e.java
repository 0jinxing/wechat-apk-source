package com.tencent.mm.plugin.websearch.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ad;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.modelappbrand.v;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.WidgetData.Info;
import com.tencent.mm.plugin.websearch.widget.a.a;
import com.tencent.mm.plugin.websearch.widget.a.b;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import java.util.HashSet;
import java.util.Set;

public final class e
{
  private static final e udn;
  boolean RP;
  Set<WidgetData> udo;
  b udp;

  static
  {
    AppMethodBeat.i(91449);
    udn = new e();
    AppMethodBeat.o(91449);
  }

  public e()
  {
    AppMethodBeat.i(91446);
    this.udo = new HashSet();
    g.RQ();
    this.udp = new b(g.RP().eJN);
    cVE();
    AppMethodBeat.o(91446);
  }

  public static e cVQ()
  {
    AppMethodBeat.i(91445);
    if (!ah.bqo())
    {
      localObject = new RuntimeException("can not call this out of mm process");
      AppMethodBeat.o(91445);
      throw ((Throwable)localObject);
    }
    Object localObject = udn;
    AppMethodBeat.o(91445);
    return localObject;
  }

  public final void b(WidgetData paramWidgetData, String paramString)
  {
    AppMethodBeat.i(91448);
    if (this.udo.contains(paramWidgetData))
    {
      u.i("WidgetSafeModeProxyImpl", "widget js error appid %s, err %s", new Object[] { paramWidgetData.ubs.fpS, paramString });
      v.kT(31);
      ad localad = new ad().eZ(paramWidgetData.ubs.fpS);
      localad.cYw = paramWidgetData.ubs.fmr;
      localad.cYs = 20L;
      localad.cYt = System.currentTimeMillis();
      localad.fa(at.gB(ah.getContext())).fb(paramString).ajK();
      paramString = new a();
      paramString.field_appid = paramWidgetData.ubs.fpS;
      if (this.udp.b(paramString, new String[0]))
      {
        paramString.field_pkgVersion = paramWidgetData.ubs.version;
        paramString.field_jsExceptionCount += 1;
        this.udp.c(paramString, new String[0]);
        AppMethodBeat.o(91448);
      }
    }
    while (true)
    {
      return;
      paramString.field_pkgVersion = paramWidgetData.ubs.version;
      paramString.field_jsExceptionCount = 1;
      paramString.field_beginTimestamp = System.currentTimeMillis();
      this.udp.b(paramString);
      AppMethodBeat.o(91448);
    }
  }

  final void cVE()
  {
    AppMethodBeat.i(91447);
    d.post(new e.1(this), "WidgetSafeModeProxyImpl");
    AppMethodBeat.o(91447);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.e
 * JD-Core Version:    0.6.2
 */