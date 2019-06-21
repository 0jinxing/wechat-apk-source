package com.tencent.mm.plugin.appbrand.luggage.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.a.d;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.pluginsdk.g.a.a.i;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
  implements com.tencent.luggage.sdk.customize.b
{
  public final <T> T E(Class<T> paramClass)
  {
    AppMethodBeat.i(132096);
    paramClass = f.E(paramClass);
    AppMethodBeat.o(132096);
    return paramClass;
  }

  public final ax xF()
  {
    AppMethodBeat.i(132097);
    ax localax = ((d)g.K(d.class)).xF();
    AppMethodBeat.o(132097);
    return localax;
  }

  public final com.tencent.mm.plugin.appbrand.appstorage.b xG()
  {
    AppMethodBeat.i(132098);
    com.tencent.mm.plugin.appbrand.appstorage.b localb = f.xG();
    AppMethodBeat.o(132098);
    return localb;
  }

  public final com.tencent.mm.plugin.appbrand.config.c xH()
  {
    AppMethodBeat.i(132099);
    com.tencent.mm.plugin.appbrand.config.c localc = f.xH();
    AppMethodBeat.o(132099);
    return localc;
  }

  public final void xI()
  {
    AppMethodBeat.i(132100);
    com.tencent.mm.pluginsdk.g.a.a.b localb = b.c.dif();
    b.c.dif();
    s locals = q.a.diy().ajg(i.gN(38, 1));
    if (locals == null);
    for (int i = 0; ; i = bo.getInt(locals.field_fileVersion, 0))
    {
      localb.f(38, 1, i, false);
      AppMethodBeat.o(132100);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.b.c
 * JD-Core Version:    0.6.2
 */