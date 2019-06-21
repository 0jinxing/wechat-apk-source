package com.tencent.luggage.sdk.b;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;

public class a extends k
{
  public a(com.tencent.mm.plugin.appbrand.task.i parami, Class<? extends com.tencent.mm.plugin.appbrand.i> paramClass)
  {
    super(parami, paramClass);
  }

  public final void a(com.tencent.mm.plugin.appbrand.i parami, AppBrandInitConfigLU paramAppBrandInitConfigLU, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(101684);
    if ((paramAppBrandInitConfigLU == null) || (paramAppBrandStatObject == null))
      AppMethodBeat.o(101684);
    while (true)
    {
      return;
      m.runOnUiThread(new a.1(this, parami, paramAppBrandInitConfigLU, paramAppBrandStatObject));
      AppMethodBeat.o(101684);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.b.a
 * JD-Core Version:    0.6.2
 */