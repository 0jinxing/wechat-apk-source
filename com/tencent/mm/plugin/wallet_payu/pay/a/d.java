package com.tencent.mm.plugin.wallet_payu.pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;

public final class d
{
  public static Orders a(Orders paramOrders, String paramString1, String paramString2, int paramInt, String paramString3)
  {
    AppMethodBeat.i(48445);
    if ((paramOrders == null) || (paramOrders.tAq == null) || (paramOrders.tAq.size() <= 0))
    {
      ab.d("MicroMsg.OrdersWrapper", "hy: params error");
      AppMethodBeat.o(48445);
    }
    while (true)
    {
      return paramOrders;
      Iterator localIterator = paramOrders.tAq.iterator();
      if (localIterator.hasNext())
      {
        Orders.Commodity localCommodity = (Orders.Commodity)localIterator.next();
        localCommodity.pch = paramInt;
        if (paramString1.equals("1"));
        for (String str = "2"; ; str = "1")
        {
          localCommodity.pce = str;
          localCommodity.pcf = paramString2;
          localCommodity.pcj = paramString3;
          break;
        }
      }
      AppMethodBeat.o(48445);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.a.d
 * JD-Core Version:    0.6.2
 */