package com.tencent.mm.plugin.ext.provider;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bk;
import com.tencent.mm.pluginsdk.d.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class ExtContentProviderBase$1
  implements Runnable
{
  ExtContentProviderBase$1(ExtContentProviderBase paramExtContentProviderBase, b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20325);
    try
    {
      boolean bool = aw.RK();
      if (!bool)
        AppMethodBeat.o(20325);
      while (true)
      {
        return;
        p localp = aw.Rg();
        bk localbk = new com/tencent/mm/model/bk;
        ExtContentProviderBase.1.1 local1 = new com/tencent/mm/plugin/ext/provider/ExtContentProviderBase$1$1;
        local1.<init>(this);
        localbk.<init>(local1);
        localp.a(localbk, 0);
        AppMethodBeat.o(20325);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.ExtContentProviderBase", "exception in NetSceneLocalProxy");
        this.jDX.countDown();
        AppMethodBeat.o(20325);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.ExtContentProviderBase.1
 * JD-Core Version:    0.6.2
 */