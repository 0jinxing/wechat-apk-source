package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.model.gdpr.a;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;

public class k extends h
{
  public static final k hRd;

  static
  {
    AppMethodBeat.i(131360);
    hRd = new k();
    AppMethodBeat.o(131360);
  }

  public final com.tencent.mm.vending.g.c<AppBrandInitConfigLU> a(d paramd, LaunchParcel paramLaunchParcel)
  {
    AppMethodBeat.i(131359);
    String str = com.tencent.mm.plugin.appbrand.report.quality.g.b(paramd, paramLaunchParcel);
    paramd = com.tencent.mm.ci.g.dOW().b(new k.2(this, paramd, paramLaunchParcel, str));
    AppMethodBeat.o(131359);
    return paramd;
  }

  public boolean a(d paramd, LaunchParcel paramLaunchParcel, c.b paramb)
  {
    AppMethodBeat.i(131358);
    boolean bool;
    if (com.tencent.mm.model.gdpr.c.aaZ())
    {
      com.tencent.mm.model.gdpr.c.a(paramd.getContext(), a.fok, paramLaunchParcel.appId, new k.1(this, paramb, paramd));
      bool = true;
      AppMethodBeat.o(131358);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(131358);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.k
 * JD-Core Version:    0.6.2
 */