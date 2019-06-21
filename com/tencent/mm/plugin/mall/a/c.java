package com.tencent.mm.plugin.mall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.bt.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.protobuf.aw;
import com.tencent.mm.protocal.protobuf.bok;
import com.tencent.mm.protocal.protobuf.bol;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class c extends a<bol>
{
  public c(long paramLong)
  {
    AppMethodBeat.i(43094);
    bok localbok = new bok();
    localbok.wRk = ((int)paramLong);
    localbok.wRl = b.akB("all_type");
    Object localObject = k.cPy();
    if (localObject != null)
    {
      if (!bo.isNullOrNil(((aw)localObject).duc))
        localbok.wRm = b.akB(((aw)localObject).duc);
      if (!bo.isNullOrNil(((aw)localObject).dud))
        localbok.wRn = b.akB(((aw)localObject).dud);
    }
    localObject = (l)g.K(l.class);
    localbok.vZt = 0;
    if (localObject != null);
    for (localbok.vZu = 1; ; localbok.vZu = 0)
    {
      localbok.wRo = 1;
      localbok.timestamp = System.currentTimeMillis();
      localObject = new b.a();
      ((b.a)localObject).fsJ = localbok;
      ((b.a)localObject).fsK = new bol();
      ((b.a)localObject).fsI = 2672;
      ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/tenpay/querywechatwallet";
      ((b.a)localObject).fsL = 0;
      ((b.a)localObject).fsM = 0;
      this.ehh = ((b.a)localObject).acD();
      ab.i("MicroMsg.CgiQueryWeChatWallet", "balanceVersion: %s, isRoot: %s, openTouch: %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(localbok.vZt), Integer.valueOf(localbok.vZu) });
      AppMethodBeat.o(43094);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.a.c
 * JD-Core Version:    0.6.2
 */