package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.task.e.a;
import com.tencent.mm.plugin.appbrand.task.e.b;
import com.tencent.mm.plugin.appbrand.widget.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.e.a;
import java.util.Set;

final class j extends i.b
{
  private final o gOq;
  volatile boolean gOr = false;
  private volatile e.b gOs;

  j(o paramo)
  {
    this.gOq = paramo;
  }

  final void a(e.b paramb)
  {
    AppMethodBeat.i(128958);
    if (this.gOr)
    {
      ab.i("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", "tryPreloadBeforeResourceDone hasPreload=TRUE, preloadReasonBefore[%s], preloadReasonNow[%s]", new Object[] { this.gOs, paramb });
      AppMethodBeat.o(128958);
    }
    while (true)
    {
      return;
      this.gOr = true;
      this.gOs = paramb;
      o localo = this.gOq;
      c localc = localo.gNE;
      paramb = new j.1(this, localo, this, paramb);
      if (localc.getAnimation() == null)
      {
        paramb.run();
        AppMethodBeat.o(128958);
      }
      else
      {
        localc.iTV.add(paramb);
        AppMethodBeat.o(128958);
      }
    }
  }

  public final void prepare()
  {
  }

  static final class a
    implements e.a, a
  {
    private final e.b gOx;
    private o gOy;
    private i.b gOz;

    a(e.b paramb, o paramo, i.b paramb1)
    {
      AppMethodBeat.i(128956);
      this.gOx = paramb;
      this.gOy = paramo;
      this.gOz = paramb1;
      paramo.keep(this);
      AppMethodBeat.o(128956);
    }

    public final void dead()
    {
      this.gOy = null;
      this.gOz = null;
    }

    public final void onReady()
    {
      AppMethodBeat.i(128957);
      if ((this.gOy == null) || (this.gOz == null))
        AppMethodBeat.o(128957);
      while (true)
      {
        return;
        ab.i("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", "tryPreloadBeforeResourceDone, READY!!! reason[%s], appId[%s]", new Object[] { this.gOx.name(), this.gOy.mAppId });
        this.gOz.wL();
        AppMethodBeat.o(128957);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.j
 * JD-Core Version:    0.6.2
 */