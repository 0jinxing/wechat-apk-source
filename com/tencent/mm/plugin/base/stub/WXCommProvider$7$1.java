package com.tencent.mm.plugin.base.stub;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.e;
import com.tencent.mm.pluginsdk.d.a.b;
import com.tencent.mm.sdk.platformtools.ab;

final class WXCommProvider$7$1
  implements bk.a
{
  WXCommProvider$7$1(WXCommProvider.7 param7)
  {
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(18170);
    ab.i("MicroMsg.WXCommProvider", "checkIsLogin() onSceneEnd()");
    this.jDY.jDX.countDown();
    AppMethodBeat.o(18170);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXCommProvider.7.1
 * JD-Core Version:    0.6.2
 */