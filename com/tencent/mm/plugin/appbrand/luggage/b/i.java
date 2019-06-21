package com.tencent.mm.plugin.appbrand.luggage.b;

import android.content.Context;
import com.tencent.luggage.c.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.b.b;
import com.tencent.mm.plugin.appbrand.widget.b.d;
import com.tencent.mm.plugin.appbrand.widget.b.j;

public final class i
  implements a
{
  public final void a(j paramj)
  {
    AppMethodBeat.i(132103);
    if ((paramj instanceof b))
      ((b)paramj).dismiss();
    AppMethodBeat.o(132103);
  }

  public final j av(Context paramContext)
  {
    AppMethodBeat.i(132102);
    paramContext = new d(paramContext);
    paramContext.setCancelable(false);
    AppMethodBeat.o(132102);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.b.i
 * JD-Core Version:    0.6.2
 */