package com.tencent.mm.plugin.wallet.balance;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.pay.a.e.j;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class b$6 extends g
{
  b$6(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(45210);
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paramm instanceof j)))
    {
      paramString = (j)paramm;
      if (paramString.tpw)
        b.D(this.teV).putParcelable("key_orders", paramString.tog);
      this.teV.a(this.hwd, 0, b.E(this.teV));
      bool = true;
      AppMethodBeat.o(45210);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(45210);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(45211);
    paramArrayOfObject = (s)paramArrayOfObject[0];
    Orders localOrders = (Orders)b.F(this.teV).getParcelable("key_orders");
    this.Agm.a(new j(paramArrayOfObject, localOrders), true, 1);
    AppMethodBeat.o(45211);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.b.6
 * JD-Core Version:    0.6.2
 */