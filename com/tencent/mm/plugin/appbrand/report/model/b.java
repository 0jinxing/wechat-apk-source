package com.tencent.mm.plugin.appbrand.report.model;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.aq;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class b
  implements g
{
  private final o gOq;
  private Intent iAH;
  private boolean iAI;
  k iAJ;
  private m iAK;
  p iAL;
  private volatile i iAM;
  private boolean irv;
  private final String mAppId;

  public b(o paramo)
  {
    AppMethodBeat.i(132582);
    this.irv = false;
    this.iAI = false;
    this.iAJ = null;
    this.iAK = null;
    this.iAL = null;
    this.iAM = null;
    this.mAppId = paramo.mAppId;
    this.gOq = paramo;
    resetSession();
    AppMethodBeat.o(132582);
  }

  private void h(long paramLong, int paramInt)
  {
    AppMethodBeat.i(132591);
    int i = this.gOq.atH().hhd.gVu;
    h.pYm.e(13543, new Object[] { this.mAppId, Integer.valueOf(i), Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    AppMethodBeat.o(132591);
  }

  public final void F(Intent paramIntent)
  {
    this.iAH = paramIntent;
  }

  public final void a(long paramLong, aq paramaq)
  {
    AppMethodBeat.i(132590);
    int i;
    switch (b.3.iAR[paramaq.ordinal()])
    {
    default:
      i = 2;
      h(paramLong, i);
      h.pYm.a(390L, 0L, 1L, false);
      switch ((int)paramLong / 250)
      {
      default:
        i = 7;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
      break;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      h.pYm.a(390L, i, 1L, false);
      AppMethodBeat.o(132590);
      return;
      i = 1;
      break;
      i = 3;
      break;
      i = 1;
      continue;
      i = 2;
      continue;
      i = 3;
      continue;
      i = 4;
      continue;
      i = 5;
      continue;
      i = 6;
    }
  }

  public final void a(w paramw)
  {
    AppMethodBeat.i(132588);
    if ((paramw == null) || (this.irv))
      AppMethodBeat.o(132588);
    while (true)
    {
      return;
      b(paramw);
      AppMethodBeat.o(132588);
    }
  }

  final void a(w paramw1, w paramw2)
  {
    AppMethodBeat.i(132585);
    if (paramw2 != null)
    {
      this.iAJ.n(paramw2);
      this.iAL.a(paramw2, paramw1.aBm());
    }
    this.iAK.p(paramw1);
    AppMethodBeat.o(132585);
  }

  public final void a(w paramw1, w paramw2, aq paramaq)
  {
    AppMethodBeat.i(132584);
    if (aq.ivd == paramaq)
      resetSession();
    int i;
    w localw;
    if ((aq.ivd == paramaq) || (paramw2 == null) || (bo.isNullOrNil(paramw2.aBm())) || (paramw2 == paramw1))
    {
      i = 1;
      i locali = this.iAM;
      if (i == 0)
        break label104;
      localw = null;
      label59: locali.a(paramw1, localw, paramaq);
      if (i != 0)
        break label110;
      paramw2.ito.M(new b.1(this, paramw1, paramw2));
      AppMethodBeat.o(132584);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label104: localw = paramw2;
      break label59;
      label110: a(paramw1, null);
      AppMethodBeat.o(132584);
    }
  }

  public final void aHW()
  {
    AppMethodBeat.i(132587);
    h(0L, 4);
    AppMethodBeat.o(132587);
  }

  public final i aHX()
  {
    return this.iAM;
  }

  public final Intent aHY()
  {
    return this.iAH;
  }

  public final p aHZ()
  {
    return this.iAL;
  }

  public final void aIa()
  {
    this.iAI = true;
  }

  public final void b(w paramw)
  {
    AppMethodBeat.i(132586);
    this.irv = true;
    this.iAM.b(paramw);
    paramw.ito.M(new b.2(this, paramw));
    AppMethodBeat.o(132586);
  }

  public final void c(w paramw)
  {
    AppMethodBeat.i(132589);
    this.iAH = null;
    if (this.iAI)
    {
      this.iAI = false;
      AppMethodBeat.o(132589);
    }
    while (true)
    {
      return;
      this.iAM.c(paramw);
      this.iAK.p(paramw);
      AppMethodBeat.o(132589);
    }
  }

  public final void resetSession()
  {
    AppMethodBeat.i(132583);
    if (bo.isNullOrNil(this.mAppId))
    {
      ab.e("MicroMsg.AppBrandPageContainerReporter", "resetSession with dummy model, stack %s", new Object[] { bo.l(new Throwable()) });
      this.iAM = i.iBj;
      this.iAK = m.aLw();
      this.iAJ = k.aLv();
      this.iAL = p.aLy();
      AppMethodBeat.o(132583);
    }
    while (true)
    {
      return;
      String str1 = this.gOq.atI().xz();
      String str2 = a.d(this.gOq.atI().hgF);
      this.iAM = new d(str2);
      this.iAJ = k.a(this.gOq, str1, this.iAM);
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.push(bo.nullAsNil(str2));
      this.iAL = p.a(this.gOq, str1, localLinkedList);
      this.iAK = m.b(this.gOq, str1, this.iAM);
      AppMethodBeat.o(132583);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.b
 * JD-Core Version:    0.6.2
 */