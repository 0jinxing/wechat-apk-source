package com.tencent.mm.plugin.appbrand.m.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.m.a.e.a;
import com.tencent.mm.plugin.appbrand.permission.e.c;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

public final class b extends com.tencent.mm.plugin.appbrand.m.a.e
{
  private e.c iql;

  public b(e.a parama, q paramq)
  {
    super(parama, paramq);
  }

  public final void aIV()
  {
    AppMethodBeat.i(102208);
    com.tencent.mm.plugin.appbrand.permission.e locale = ((com.tencent.luggage.sdk.b.b)this.gMN.getRuntime()).xY();
    if (locale == null)
    {
      ab.e("MicroMsg.ProxyOnPermissionUpdateListener", "AppRuntimeApiPermissionController null");
      AppMethodBeat.o(102208);
    }
    while (true)
    {
      return;
      this.iql = new b.1(this);
      e.c localc = this.iql;
      synchronized (locale.iwO)
      {
        locale.iwQ.add(localc);
        AppMethodBeat.o(102208);
      }
    }
  }

  public final int getType()
  {
    return 3;
  }

  public final void removeListener()
  {
    AppMethodBeat.i(102209);
    if (this.iql == null)
      AppMethodBeat.o(102209);
    while (true)
    {
      return;
      if (this.gMN.getRuntime() == null)
      {
        AppMethodBeat.o(102209);
        continue;
      }
      com.tencent.mm.plugin.appbrand.permission.e locale = ((com.tencent.luggage.sdk.b.b)this.gMN.getRuntime()).xY();
      if (locale == null)
      {
        AppMethodBeat.o(102209);
        continue;
      }
      e.c localc = this.iql;
      synchronized (locale.iwO)
      {
        locale.iwQ.remove(localc);
        AppMethodBeat.o(102209);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.d.b
 * JD-Core Version:    0.6.2
 */