package com.tencent.mm.plugin.wallet.balance;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class b$3 extends g
{
  b$3(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(45203);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramm instanceof com.tencent.mm.plugin.wallet.pay.a.a.b))
      {
        paramString = (com.tencent.mm.plugin.wallet.pay.a.a.b)paramm;
        b.m(this.teV).putString("kreq_token", paramString.token);
        if (paramString.tpw)
          b.n(this.teV).putParcelable("key_orders", paramString.tog);
      }
      if (this.teV.c(this.hwd, null))
      {
        this.Agm.a(new y(b.o(this.teV), 13), true, 1);
        AppMethodBeat.o(45203);
      }
    }
    while (true)
    {
      return bool;
      this.teV.a(this.hwd, 0, b.p(this.teV));
      AppMethodBeat.o(45203);
      continue;
      AppMethodBeat.o(45203);
      bool = false;
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(45204);
    Authen localAuthen = (Authen)paramArrayOfObject[0];
    paramArrayOfObject = (Orders)paramArrayOfObject[1];
    boolean bool;
    switch (b.q(this.teV).getInt("key_pay_flag", 0))
    {
    default:
      AppMethodBeat.o(45204);
      bool = false;
      return bool;
    case 1:
      if (!this.teV.cRY())
        localAuthen.bJt = 1;
      break;
    case 2:
    case 3:
    }
    while (true)
    {
      b.r(this.teV).putParcelable("key_authen", localAuthen);
      this.Agm.a(new com.tencent.mm.plugin.wallet.pay.a.a.b(localAuthen, paramArrayOfObject), true, 1);
      AppMethodBeat.o(45204);
      bool = true;
      break;
      localAuthen.bJt = 4;
      continue;
      if (!this.teV.cRY())
      {
        localAuthen.bJt = 2;
      }
      else
      {
        localAuthen.bJt = 5;
        continue;
        if (!this.teV.cRY())
          localAuthen.bJt = 3;
        else
          localAuthen.bJt = 6;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.b.3
 * JD-Core Version:    0.6.2
 */