package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.x.a;
import com.tencent.mm.x.c;
import java.util.Map;

final class s$3
  implements o
{
  s$3(s params)
  {
  }

  public final void onNewXmlReceived(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(45851);
    if (("paymsg".equals(paramString)) && ("30".equals(paramMap.get(".sysmsg.paymsg.PayMsgType"))))
    {
      int i = bo.getInt((String)paramMap.get(".sysmsg.paymsg.WalletRedDot"), 0);
      int j = bo.getInt((String)paramMap.get(".sysmsg.paymsg.BankCardRedDot"), 0);
      parama = (String)paramMap.get(".sysmsg.paymsg.NewTagBankSerial");
      paramString = (String)paramMap.get(".sysmsg.paymsg.WalletRedDotWording");
      ab.i("MicroMsg.SubCoreMMWallet", "moreTabWallet: %s, walletBankCard: %s, bankSerial: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), parama });
      if (i != 1)
        break label260;
      c.PK().b(ac.a.xSJ, true);
      if (j != 1)
        break label273;
      c.PK().b(ac.a.xSK, true);
    }
    while (true)
    {
      if (!bo.isNullOrNil(paramString))
      {
        g.RQ();
        g.RP().Ry().set(ac.a.xSM, paramString);
      }
      if (!bo.isNullOrNil(parama))
      {
        g.RQ();
        paramMap = (String)g.RP().Ry().get(ac.a.xSN, "");
        paramString = parama;
        if (!bo.isNullOrNil(paramMap))
          paramString = paramMap + "," + parama;
        g.RQ();
        g.RP().Ry().set(ac.a.xSN, paramString);
      }
      AppMethodBeat.o(45851);
      return;
      label260: c.PK().b(ac.a.xSJ, false);
      break;
      label273: c.PK().b(ac.a.xSK, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.s.3
 * JD-Core Version:    0.6.2
 */