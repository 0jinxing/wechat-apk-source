package com.tencent.mm.plugin.mall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.a.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.d.j;
import com.tencent.mm.plugin.wallet_core.model.aj;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.protocal.protobuf.bol;
import com.tencent.mm.protocal.protobuf.cge;
import com.tencent.mm.protocal.protobuf.ctd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.IOException;

final class i$1$2
  implements com.tencent.mm.vending.c.a<bol, a.a<bol>>
{
  i$1$2(i.1 param1)
  {
  }

  private static bol g(a.a<bol> parama)
  {
    AppMethodBeat.i(43109);
    ab.i("MicroMsg.QueryWeChatWalletManager", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(parama.errType), Integer.valueOf(parama.errCode), parama.aIm });
    bol localbol;
    if ((parama.errType == 0) && (parama.errCode == 0))
    {
      localbol = (bol)parama.fsy;
      if (localbol.wRp == null);
    }
    try
    {
      Object localObject = new java/lang/String;
      ((String)localObject).<init>(localbol.wRp.toByteArray(), org.apache.commons.a.a.ISO_8859_1);
      g.RP().Ry().set(ac.a.xWr, localObject);
      if (localbol.wRq != null)
      {
        ab.i("MicroMsg.QueryWeChatWalletManager", "wallet balance: %s", new Object[] { Long.valueOf(localbol.wRq.xqj) });
        localObject = r.cPI();
        if (((ak)localObject).tCT == null)
          ((ak)localObject).tCT = r.cPE().cRh();
        localObject = ((ak)localObject).tCT;
        ((aj)localObject).field_wallet_balance = localbol.wRq.xqj;
        r.cPI().a((aj)localObject);
      }
      parama = (bol)parama.fsy;
      AppMethodBeat.o(43109);
      return parama;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.QueryWeChatWalletManager", localIOException, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.a.i.1.2
 * JD-Core Version:    0.6.2
 */