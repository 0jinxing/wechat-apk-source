package com.tencent.mm.plugin.appbrand.m.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.c;
import com.tencent.mm.plugin.appbrand.b.d;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.permission.e;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.r.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

final class a$1
  implements r.b
{
  a$1(a parama)
  {
  }

  public final void auh()
  {
    AppMethodBeat.i(102204);
    ab.i("MicroMsg.ProxyAppBrandServiceOnInitListener", "onRuntimeReady");
    i locali = this.iqk.gMN.getRuntime();
    if (locali == null)
    {
      localObject1 = new IllegalStateException("onRuntimeReady runtime null");
      AppMethodBeat.o(102204);
      throw ((Throwable)localObject1);
    }
    Object localObject1 = new HashMap();
    Object localObject2 = ((com.tencent.luggage.sdk.b.b)locali).xY();
    if (localObject2 == null)
      ab.w("MicroMsg.ProxyAppBrandServiceOnInitListener", "fillPermissionBytes controller null");
    while (true)
    {
      ((Map)localObject1).put("state", Integer.valueOf(locali.gNN.gWy.awz().ordinal()));
      ((Map)localObject1).put("wxaData", com.tencent.mm.plugin.appbrand.m.b.b.y(locali));
      this.iqk.D((Map)localObject1);
      AppMethodBeat.o(102204);
      return;
      localObject2 = ((e)localObject2).aKw();
      if (localObject2 == null)
      {
        ab.i("MicroMsg.ProxyAppBrandServiceOnInitListener", "fillPermissionBytes getPermissionBytes null");
      }
      else
      {
        ((Map)localObject1).put("fg", ((Vector)localObject2).elementAt(0));
        ((Map)localObject1).put("bg", ((Vector)localObject2).elementAt(1));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.d.a.1
 * JD-Core Version:    0.6.2
 */