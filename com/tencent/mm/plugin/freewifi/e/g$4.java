package com.tencent.mm.plugin.freewifi.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.b;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.d;
import com.tencent.mm.protocal.protobuf.gj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class g$4
  implements Runnable
{
  g$4(g paramg, String paramString, gj paramgj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20816);
    Object localObject1 = g.MH(this.mwO);
    ab.i("MicroMsg.FreeWifi.ProtocolOne", "get redirect location from loginurl : %s, %s", new Object[] { localObject1, this.mwO });
    if (!bo.isNullOrNil((String)localObject1))
    {
      Object localObject2 = g.es((String)localObject1, "res=");
      ab.i("MicroMsg.FreeWifi.ProtocolOne", "get connect result from location : %s, %s", new Object[] { localObject2, localObject1 });
      if ((!bo.isNullOrNil((String)localObject2)) && ((((String)localObject2).startsWith("success")) || (((String)localObject2).startsWith("already"))))
      {
        localObject2 = this.mwN.mwF;
        localObject1 = FreeWifiFrontPageUI.d.mzl;
        FreeWifiFrontPageUI.b localb = new FreeWifiFrontPageUI.b();
        localb.mzh = this.mwP;
        ((FreeWifiFrontPageUI)localObject2).a((FreeWifiFrontPageUI.d)localObject1, localb);
        AppMethodBeat.o(20816);
      }
    }
    while (true)
    {
      return;
      g.c(this.mwN);
      AppMethodBeat.o(20816);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.g.4
 * JD-Core Version:    0.6.2
 */