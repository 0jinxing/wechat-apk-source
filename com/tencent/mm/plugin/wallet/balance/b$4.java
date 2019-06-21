package com.tencent.mm.plugin.wallet.balance;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.pay.a.d.f;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.tenpay.model.n;

final class b$4 extends g
{
  b$4(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(45205);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof f))
      {
        paramString = (f)paramm;
        if (paramString.tpw)
          b.s(this.teV).putParcelable("key_orders", paramString.tog);
        a.j(this.hwd, b.t(this.teV));
        AppMethodBeat.o(45205);
      }
    while (true)
    {
      return bool;
      if ((paramm instanceof com.tencent.mm.plugin.wallet.pay.a.a.b))
      {
        paramString = (com.tencent.mm.plugin.wallet.pay.a.a.b)paramm;
        paramm = paramString.oYc;
        if (paramm != null)
          b.u(this.teV).putParcelable("key_realname_guide_helper", paramm);
        b.v(this.teV).putString("kreq_token", paramString.token);
        AppMethodBeat.o(45205);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(45205);
      }
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(45206);
    s locals = (s)paramArrayOfObject[1];
    if ((locals != null) && (locals.pGr != null))
      locals.pGr.cIf = 21;
    paramArrayOfObject = (Orders)b.w(this.teV).getParcelable("key_orders");
    boolean bool;
    switch (this.teV.mqu.getInt("key_pay_flag", 0))
    {
    default:
      AppMethodBeat.o(45206);
      bool = false;
      return bool;
    case 1:
      locals.flag = "1";
    case 2:
    case 3:
    }
    while (true)
    {
      this.Agm.a(new f(locals, paramArrayOfObject), true, 1);
      AppMethodBeat.o(45206);
      bool = true;
      break;
      if (!this.teV.cRY())
      {
        locals.flag = "2";
      }
      else
      {
        locals.flag = "5";
        continue;
        if (!this.teV.cRY())
          locals.flag = "3";
        else
          locals.flag = "6";
      }
    }
  }

  public final boolean x(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(45207);
    Orders localOrders = (Orders)b.x(this.teV).getParcelable("key_orders");
    paramArrayOfObject = (Authen)b.y(this.teV).getParcelable("key_authen");
    this.Agm.a(new com.tencent.mm.plugin.wallet.pay.a.a.b(paramArrayOfObject, localOrders), true, 1);
    AppMethodBeat.o(45207);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.b.4
 * JD-Core Version:    0.6.2
 */