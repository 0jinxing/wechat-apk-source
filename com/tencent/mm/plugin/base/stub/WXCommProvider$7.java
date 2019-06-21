package com.tencent.mm.plugin.base.stub;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bk;
import com.tencent.mm.pluginsdk.d.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class WXCommProvider$7
  implements Runnable
{
  WXCommProvider$7(WXCommProvider paramWXCommProvider, b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18171);
    try
    {
      boolean bool = aw.RK();
      if (!bool)
        AppMethodBeat.o(18171);
      while (true)
      {
        return;
        p localp = aw.Rg();
        bk localbk = new com/tencent/mm/model/bk;
        WXCommProvider.7.1 local1 = new com/tencent/mm/plugin/base/stub/WXCommProvider$7$1;
        local1.<init>(this);
        localbk.<init>(local1);
        localp.a(localbk, 0);
        AppMethodBeat.o(18171);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WXCommProvider", "exception in NetSceneLocalProxy");
        this.jDX.countDown();
        AppMethodBeat.o(18171);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXCommProvider.7
 * JD-Core Version:    0.6.2
 */