package com.tencent.mm.plugin.base.stub;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bj;

final class WXCommProvider$6 extends bj<Boolean>
{
  WXCommProvider$6(WXCommProvider paramWXCommProvider, Boolean paramBoolean)
  {
    super(4000L, paramBoolean);
  }

  private Boolean aKg()
  {
    AppMethodBeat.i(18168);
    try
    {
      ab.i("MicroMsg.WXCommProvider", "checkIsLogin run");
      Object localObject;
      if (!aw.RK())
      {
        localObject = Boolean.FALSE;
        AppMethodBeat.o(18168);
      }
      while (true)
      {
        return localObject;
        ab.i("MicroMsg.WXCommProvider", "checkIsLogin doScene");
        localObject = aw.Rg();
        bk localbk = new com/tencent/mm/model/bk;
        WXCommProvider.6.1 local1 = new com/tencent/mm/plugin/base/stub/WXCommProvider$6$1;
        local1.<init>(this);
        localbk.<init>(local1);
        boolean bool = ((p)localObject).a(localbk, 0);
        localObject = Boolean.valueOf(bool);
        AppMethodBeat.o(18168);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WXCommProvider", "exception in NetSceneLocalProxy.");
        cC(Boolean.FALSE);
        Boolean localBoolean = Boolean.FALSE;
        AppMethodBeat.o(18168);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXCommProvider.6
 * JD-Core Version:    0.6.2
 */