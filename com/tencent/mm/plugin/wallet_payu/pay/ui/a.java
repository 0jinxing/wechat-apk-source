package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.ui.i;
import java.util.ArrayList;

public final class a extends i
{
  public a(Context paramContext, ArrayList<Bankcard> paramArrayList, int paramInt, Orders paramOrders)
  {
    super(paramContext, paramArrayList, paramInt, paramOrders);
  }

  public final Bankcard Hd(int paramInt)
  {
    AppMethodBeat.i(48459);
    Bankcard localBankcard;
    if ((this.tgB != null) && (this.tgB.size() != 0))
    {
      localBankcard = (Bankcard)this.tgB.get(paramInt);
      AppMethodBeat.o(48459);
    }
    while (true)
    {
      return localBankcard;
      if (paramInt != getCount() - 1)
      {
        localBankcard = (Bankcard)this.tgB.get(paramInt);
        AppMethodBeat.o(48459);
      }
      else
      {
        localBankcard = null;
        AppMethodBeat.o(48459);
      }
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(48458);
    int i;
    if ((this.tgB != null) && (this.tgB.size() != 0))
    {
      i = this.tgB.size();
      AppMethodBeat.o(48458);
    }
    while (true)
    {
      return i;
      i = 1;
      AppMethodBeat.o(48458);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.ui.a
 * JD-Core Version:    0.6.2
 */