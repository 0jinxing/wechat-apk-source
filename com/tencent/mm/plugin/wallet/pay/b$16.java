package com.tencent.mm.plugin.wallet.pay;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class b$16 extends b.a
{
  b$16(b paramb, WalletBaseUI paramWalletBaseUI, i parami)
  {
    super(paramb, paramWalletBaseUI, parami);
  }

  public final CharSequence Au(int paramInt)
  {
    AppMethodBeat.i(45887);
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.Au(paramInt);
      AppMethodBeat.o(45887);
    case 0:
    case 1:
    }
    while (true)
    {
      return localObject;
      localObject = this.hwd.getString(2131304568);
      AppMethodBeat.o(45887);
      continue;
      localObject = this.hwd.getString(2131304567);
      AppMethodBeat.o(45887);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(45885);
    boolean bool;
    if (!super.c(paramInt1, paramInt2, paramString, paramm))
    {
      bool = false;
      AppMethodBeat.o(45885);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(45885);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(45886);
    Orders localOrders = (Orders)paramArrayOfObject[0];
    s.cNC();
    paramArrayOfObject = s.cND().thy;
    paramArrayOfObject.twS += localOrders.pTN;
    AppMethodBeat.o(45886);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.b.16
 * JD-Core Version:    0.6.2
 */