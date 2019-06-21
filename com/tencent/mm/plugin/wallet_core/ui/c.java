package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum c
{
  private Map<String, WeakReference<b>> tDV;

  static
  {
    AppMethodBeat.i(47124);
    tDU = new c("INSTANCE");
    tDW = new c[] { tDU };
    AppMethodBeat.o(47124);
  }

  private c()
  {
    AppMethodBeat.i(47121);
    this.tDV = new HashMap();
    AppMethodBeat.o(47121);
  }

  private static String b(Orders paramOrders)
  {
    AppMethodBeat.i(47123);
    if ((paramOrders != null) && (paramOrders.tAq != null))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i = 0; i < paramOrders.tAq.size(); i++)
        localStringBuilder.append(((Orders.Commodity)paramOrders.tAq.get(i)).cAa);
      localStringBuilder.append("@");
      localStringBuilder.append(paramOrders.tzZ);
      paramOrders = localStringBuilder.toString();
      AppMethodBeat.o(47123);
    }
    while (true)
    {
      return paramOrders;
      paramOrders = null;
      AppMethodBeat.o(47123);
    }
  }

  public final b a(Orders paramOrders)
  {
    AppMethodBeat.i(47122);
    String str = b(paramOrders);
    if (bo.isNullOrNil(str))
    {
      ab.w("MicroMsg.FavorLogicHelperPool", "get key null");
      AppMethodBeat.o(47122);
      paramOrders = null;
    }
    while (true)
    {
      return paramOrders;
      Object localObject;
      if (this.tDV.containsKey(str))
      {
        ab.i("MicroMsg.FavorLogicHelperPool", "hit cache, key:".concat(String.valueOf(str)));
        localObject = (WeakReference)this.tDV.get(str);
        if (localObject != null)
        {
          localObject = (b)((WeakReference)localObject).get();
          if (localObject != null)
          {
            AppMethodBeat.o(47122);
            paramOrders = (Orders)localObject;
            continue;
          }
          ab.i("MicroMsg.FavorLogicHelperPool", "helper null");
        }
      }
      else
      {
        while (true)
        {
          if ((paramOrders == null) || (paramOrders.tAr == null))
            break label169;
          paramOrders = new b(paramOrders.tAr);
          localObject = new WeakReference(paramOrders);
          this.tDV.put(str, localObject);
          AppMethodBeat.o(47122);
          break;
          ab.i("MicroMsg.FavorLogicHelperPool", "weakHelper null");
        }
        label169: AppMethodBeat.o(47122);
        paramOrders = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.c
 * JD-Core Version:    0.6.2
 */