package com.tencent.mm.plugin.websearch.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.n;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.plugin.websearch.widget.c.b;
import com.tencent.mm.sdk.platformtools.ab;

final class a$7
  implements Runnable
{
  a$7(a parama, int paramInt1, int paramInt2, String paramString1, n paramn, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(91399);
    b localb = new b(this.bQW, this.bQX, this.ucW);
    n localn = this.ucX;
    boolean bool;
    if (localn == null)
    {
      ab.e("BaseJsapiEvent", "null JSBridgeAccessible ");
      bool = false;
      if (bool)
        break label129;
      ab.i("FTSSearchWidgetMgr", "onTap fail: execute js event %s ", new Object[] { this.hmM });
      a.c(this.ucJ).a(this.ucW, false, "onTap fail: execute js event  " + this.hmM, this.hmM);
      AppMethodBeat.o(91399);
    }
    while (true)
    {
      return;
      bool = localn.ap(localb.getName(), localb.cVS());
      break;
      label129: a.b(this.ucJ, this.ucW);
      com.tencent.mm.ce.a.postDelayed(new a.7.1(this), 1000L);
      AppMethodBeat.o(91399);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.7
 * JD-Core Version:    0.6.2
 */