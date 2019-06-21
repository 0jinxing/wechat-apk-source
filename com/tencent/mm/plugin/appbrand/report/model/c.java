package com.tencent.mm.plugin.appbrand.report.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class c
{
  public final l iAS;
  private volatile String iAT;
  volatile long iAU;
  private volatile long iAV;
  private final LinkedList<Runnable> iAW;
  public volatile String mAppId;

  public c(int paramInt)
  {
    AppMethodBeat.i(114413);
    this.iAU = 0L;
    this.iAV = 0L;
    this.iAW = new LinkedList();
    this.iAS = new l("MicroMsg.AppBrandPageViewStatistics[" + paramInt + "]");
    AppMethodBeat.o(114413);
  }

  public final void DB(String paramString)
  {
    AppMethodBeat.i(114415);
    this.iAU = bo.anU();
    this.iAT = paramString;
    AppMethodBeat.o(114415);
  }

  public final void M(Runnable paramRunnable)
  {
    AppMethodBeat.i(114420);
    if (this.iAS.aLf())
    {
      paramRunnable.run();
      AppMethodBeat.o(114420);
    }
    while (true)
    {
      return;
      this.iAW.addLast(paramRunnable);
      AppMethodBeat.o(114420);
    }
  }

  public final long aLi()
  {
    AppMethodBeat.i(114414);
    long l = Math.max(0L, this.iAV);
    AppMethodBeat.o(114414);
    return l;
  }

  public final void aLj()
  {
    AppMethodBeat.i(114416);
    this.iAV = (bo.anU() - this.iAU);
    AppMethodBeat.o(114416);
  }

  public final long aLk()
  {
    AppMethodBeat.i(114417);
    long l1 = this.iAS.iAx;
    long l2 = this.iAU;
    long l3 = this.iAV;
    if (l1 <= 0L)
    {
      ab.i("MicroMsg.AppBrandPageViewStatistics", "foregroundMs invalid(%d), loadStart %d, loadCost %d, [%s/%s]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), this.mAppId, this.iAT });
      if ((l2 > 0L) && (l3 > 0L) && (l1 == 0L))
      {
        l3 = bo.anU() - l2;
        AppMethodBeat.o(114417);
      }
    }
    while (true)
    {
      return l3;
      l3 = Math.max(0L, l1);
      AppMethodBeat.o(114417);
    }
  }

  final void aLl()
  {
    AppMethodBeat.i(114421);
    while (!this.iAW.isEmpty())
      ((Runnable)this.iAW.pollFirst()).run();
    AppMethodBeat.o(114421);
  }

  public final boolean isLoading()
  {
    if ((this.iAU > 0L) && (this.iAV <= 0L));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void wU()
  {
    AppMethodBeat.i(114419);
    if (this.iAU <= 0L)
      AppMethodBeat.o(114419);
    while (true)
    {
      return;
      this.iAS.aLg();
      this.iAW.clear();
      AppMethodBeat.o(114419);
    }
  }

  public final void wW()
  {
    AppMethodBeat.i(114418);
    this.iAS.aLh();
    if (this.iAS.aLf())
    {
      aLl();
      AppMethodBeat.o(114418);
    }
    while (true)
    {
      return;
      al.d(new c.1(this));
      AppMethodBeat.o(114418);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.c
 * JD-Core Version:    0.6.2
 */