package com.tencent.mm.plugin.base.stub;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.e;
import com.tencent.mm.sdk.platformtools.ab;

final class WXCommProvider$6$1
  implements bk.a
{
  WXCommProvider$6$1(WXCommProvider.6 param6)
  {
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(18167);
    ab.i("MicroMsg.WXCommProvider", "checkIsLogin onSceneEnd() hasLogin:%s", new Object[] { Boolean.valueOf(WXCommProvider.jDQ) });
    this.jDW.cC(Boolean.TRUE);
    AppMethodBeat.o(18167);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXCommProvider.6.1
 * JD-Core Version:    0.6.2
 */