package com.tencent.mm.plugin.mall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.e.b;

final class i$1
  implements e.b
{
  public final void bZ(Object paramObject)
  {
    AppMethodBeat.i(43111);
    ab.i("MicroMsg.QueryWeChatWalletManager", "get from push done: %s", new Object[] { paramObject });
    long l = 0L;
    if ((paramObject instanceof Long))
      l = ((Long)paramObject).longValue();
    new c(l).acy().h(new i.1.2(this)).b(new i.1.1(this));
    AppMethodBeat.o(43111);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.a.i.1
 * JD-Core Version:    0.6.2
 */