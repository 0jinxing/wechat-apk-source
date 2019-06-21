package com.tencent.mm.plugin.gwallet.a;

import android.content.Context;
import android.os.RemoteException;
import com.android.vending.billing.IInAppBillingService;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.Iterator;
import java.util.List;

public final class b$2
  implements Runnable
{
  public b$2(b paramb, List paramList, b.b paramb1, ak paramak)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(41694);
    Object localObject1 = this.npR.iterator();
    int i = 0;
    while (((Iterator)localObject1).hasNext())
    {
      String str = (String)((Iterator)localObject1).next();
      int j;
      try
      {
        localObject2 = this.npQ;
        ((b)localObject2).Oz("consume");
        if (str != null);
        try
        {
          if (str.equals(""))
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("Can't consume ");
            b.OA(str + ". No token.");
          }
          j = ((b)localObject2).npJ.c(3, ((b)localObject2).mContext.getPackageName(), str);
          if (j != 0)
            break label178;
          ab.d("MicroMsg.IabHelper", "Successfully consumed token: ".concat(String.valueOf(str)));
        }
        catch (RemoteException localRemoteException)
        {
          localObject2 = new com/tencent/mm/plugin/gwallet/a/a;
          ((a)localObject2).<init>("Remote exception while consuming. token: ".concat(String.valueOf(str)), localRemoteException);
          AppMethodBeat.o(41694);
          throw ((Throwable)localObject2);
        }
      }
      catch (a locala)
      {
        i = locala.npI.bFQ();
      }
      continue;
      label178: ab.d("MicroMsg.IabHelper", "Error consuming consuming token ".concat(String.valueOf(locala)));
      Object localObject2 = new com/tencent/mm/plugin/gwallet/a/a;
      ((a)localObject2).<init>(j, "Error consuming token ".concat(String.valueOf(locala)));
      AppMethodBeat.o(41694);
      throw ((Throwable)localObject2);
    }
    if (this.npS != null)
    {
      localObject1 = new c(i, "");
      this.mrz.post(new b.2.1(this, (c)localObject1));
    }
    AppMethodBeat.o(41694);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.a.b.2
 * JD-Core Version:    0.6.2
 */