package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.wallet_core.ui.e.a;
import com.tencent.mm.wallet_core.ui.e.c;
import java.util.Map;

final class af$1
  implements e.a
{
  af$1(long paramLong1, long paramLong2, int paramInt, Bankcard paramBankcard)
  {
  }

  public final void ak(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(46926);
    if (paramMap != null)
    {
      long l1 = bo.a((Long)paramMap.get("wallet_balance_version"), -1L);
      long l2 = bo.a((Long)paramMap.get("wallet_balance_last_update_time"), -1L);
      if ((l2 < 0L) || (l1 < 0L) || (l2 + this.tCC > bo.yz()) || (this.tCD >= l1))
      {
        e.a(new e.c[] { new e.c("wallet_balance_version", Long.valueOf(this.tCD)), new e.c("wallet_balance_last_update_time", Long.valueOf(bo.yz())), new e.c("wallet_balance", Double.valueOf(this.tCA / 100.0D)) });
        this.tCE.twS = (this.tCA / 100.0D);
        AppMethodBeat.o(46926);
      }
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.WalletQueryBankcardParser", "hy: new balance comes but last msg is not timeout and balance version is smaller than before");
      AppMethodBeat.o(46926);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.af.1
 * JD-Core Version:    0.6.2
 */