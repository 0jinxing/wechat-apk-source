package com.tencent.mm.bq;

import android.accounts.Account;
import android.accounts.AccountManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.protocal.protobuf.art;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class b
{
  public static void run()
  {
    AppMethodBeat.i(28268);
    if ((!aw.RK()) || (aw.QT()))
      AppMethodBeat.o(28268);
    while (true)
    {
      return;
      long l1 = bo.anT();
      aw.ZK();
      long l2 = bo.a((Long)c.Ry().get(331797, null), 0L);
      long l3 = l2;
      if (10013 == ae.giz)
      {
        l3 = l2;
        if (ae.giA != 0)
          l3 = 0L;
      }
      if (l3 < l1)
      {
        aw.ZK();
        c.Ry().set(331797, Long.valueOf(432000L + l1));
        try
        {
          art localart = new com/tencent/mm/protocal/protobuf/art;
          localart.<init>();
          localart.wvK = "";
          j.a locala;
          for (locala : AccountManager.get(ah.getContext()).getAccountsByType("com.google"))
          {
            if (!bo.isNullOrNil(localart.wvK))
              break;
            ab.i("MicroMsg.PostTaskGoogleAcc", "google account[%s]", new Object[] { locala.name });
            localart.wvK = locala.name;
          }
          if ((10013 == ae.giz) && (ae.giA != 0))
            localart.wvK = "rssjbbk@gmail.com";
          if (!bo.isNullOrNil(localart.wvK))
          {
            aw.ZK();
            ??? = c.XL();
            locala = new com/tencent/mm/plugin/messenger/foundation/a/a/j$a;
            locala.<init>(57, localart);
            ((i)???).c(locala);
            AppMethodBeat.o(28268);
            continue;
          }
          ab.w("MicroMsg.PostTaskGoogleAcc", "Get Accounts failed , Not any info?");
          AppMethodBeat.o(28268);
        }
        catch (Exception localException)
        {
          ab.w("MicroMsg.PostTaskGoogleAcc", "Get Accounts failed :%s", new Object[] { localException.getMessage() });
        }
      }
      else
      {
        AppMethodBeat.o(28268);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bq.b
 * JD-Core Version:    0.6.2
 */