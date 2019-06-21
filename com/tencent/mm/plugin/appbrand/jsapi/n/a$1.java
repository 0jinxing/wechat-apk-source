package com.tencent.mm.plugin.appbrand.jsapi.n;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;

final class a$1
  implements Runnable
{
  a$1(a parama, q paramq, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74779);
    a locala = this.hUS;
    q localq = this.hsD;
    int i = this.eIl;
    Object localObject = v.Zp().nV(localq.hashCode() + "toast_name");
    if (localObject != null)
    {
      localObject = (View)((v.b)localObject).get("toast_view", null);
      if (localObject != null)
      {
        ((View)localObject).setVisibility(8);
        localq.M(i, locala.j("ok", null));
        AppMethodBeat.o(74779);
      }
    }
    while (true)
    {
      return;
      localq.M(i, locala.j("fail:toast can't be found", null));
      AppMethodBeat.o(74779);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.n.a.1
 * JD-Core Version:    0.6.2
 */