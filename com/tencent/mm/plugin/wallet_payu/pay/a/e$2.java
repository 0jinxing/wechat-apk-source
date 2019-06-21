package com.tencent.mm.plugin.wallet_payu.pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class e$2 extends g
{
  e$2(e parame, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final CharSequence Au(int paramInt)
  {
    AppMethodBeat.i(48448);
    Object localObject;
    switch (paramInt)
    {
    default:
      localObject = super.Au(paramInt);
      AppMethodBeat.o(48448);
    case 0:
    case 1:
    }
    while (true)
    {
      return localObject;
      localObject = this.hwd.getString(2131304568);
      AppMethodBeat.o(48448);
      continue;
      localObject = this.hwd.getString(2131304567);
      AppMethodBeat.o(48448);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48447);
    paramArrayOfObject = (Orders)paramArrayOfObject[0];
    s.cNC();
    Bankcard localBankcard = s.cND().thy;
    localBankcard.twS += paramArrayOfObject.pTN;
    AppMethodBeat.o(48447);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.a.e.2
 * JD-Core Version:    0.6.2
 */