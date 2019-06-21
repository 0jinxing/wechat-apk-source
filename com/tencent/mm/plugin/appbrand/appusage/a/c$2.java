package com.tencent.mm.plugin.appbrand.appusage.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class c$2
  implements b.a
{
  private int gZI = 0;

  c$2(c paramc, PBool paramPBool1, PBool paramPBool2)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    boolean bool = false;
    AppMethodBeat.i(129739);
    e.at(this);
    d.agz().c(this);
    paramInt = this.gZI + 1;
    this.gZI = paramInt;
    if ((paramInt > 1) || (this.gZH.value))
    {
      AppMethodBeat.o(129739);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      this.gZG.value = true;
      c.a(this.hbf);
      if (!paramBoolean)
      {
        ab.i("MicroMsg.Recommend.AppBrandRecommendLocationGet", "onGetLocation, fail");
        if (c.b(this.hbf) != null)
          c.b(this.hbf).G(paramFloat1, paramFloat2);
        AppMethodBeat.o(129739);
        paramBoolean = bool;
      }
      else
      {
        ab.i("MicroMsg.Recommend.AppBrandRecommendLocationGet", "onGetLocation, success");
        c.ag(paramFloat2);
        c.ah(paramFloat1);
        c.gj(bo.anU());
        if (c.b(this.hbf) != null)
          c.b(this.hbf).G(paramFloat1, paramFloat2);
        AppMethodBeat.o(129739);
        paramBoolean = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.c.2
 * JD-Core Version:    0.6.2
 */