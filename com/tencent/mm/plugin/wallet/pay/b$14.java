package com.tencent.mm.plugin.wallet.pay;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.pay.a.a;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.tenpay.model.n;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class b$14 extends b.a
{
  b$14(b paramb, WalletBaseUI paramWalletBaseUI, i parami)
  {
    super(paramb, paramWalletBaseUI, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(45881);
    if (!super.c(paramInt1, paramInt2, paramString, paramm))
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if ((paramm instanceof com.tencent.mm.plugin.wallet.pay.a.a.b))
        {
          paramString = (com.tencent.mm.plugin.wallet.pay.a.a.b)paramm;
          b.d(this.tnW).putString("kreq_token", paramString.token);
          if (paramString.tpw)
            b.e(this.tnW).putParcelable("key_orders", paramString.tog);
          paramString = paramString.oYc;
          if (paramString != null)
            b.f(this.tnW).putParcelable("key_realname_guide_helper", paramString);
          if (!this.tnW.c(this.hwd, null))
            break label207;
          this.Agm.a(new y(b.i(this.tnW), 13), true, 1);
          AppMethodBeat.o(45881);
        }
    while (true)
    {
      return bool;
      if (!(paramm instanceof com.tencent.mm.plugin.wallet.pay.a.a.c))
        break;
      paramString = (com.tencent.mm.plugin.wallet.pay.a.a.c)paramm;
      b.g(this.tnW).putString("kreq_token", paramString.token);
      if (!paramString.tpw)
        break;
      b.h(this.tnW).putParcelable("key_orders", paramString.tog);
      break;
      label207: this.tnW.a(this.hwd, 0, b.j(this.tnW));
      AppMethodBeat.o(45881);
      continue;
      AppMethodBeat.o(45881);
      bool = false;
      continue;
      AppMethodBeat.o(45881);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(45882);
    Authen localAuthen = (Authen)paramArrayOfObject[0];
    paramArrayOfObject = (Orders)paramArrayOfObject[1];
    ab.i("MicroMsg.PayProcess", "WalletCardElementUI onNext pay_flag : " + this.tnW.mqu.getInt("key_pay_flag", 0));
    boolean bool;
    switch (this.tnW.mqu.getInt("key_pay_flag", 0))
    {
    default:
      AppMethodBeat.o(45882);
      bool = false;
      return bool;
    case 1:
      if (!this.tnW.cRY());
      for (localAuthen.bJt = 1; ; localAuthen.bJt = 4)
      {
        this.Agm.a(new com.tencent.mm.plugin.wallet.pay.a.a.b(localAuthen, paramArrayOfObject), true, 1);
        AppMethodBeat.o(45882);
        bool = true;
        break;
      }
    case 2:
      if (!this.tnW.cRY())
      {
        localAuthen.bJt = 2;
        label167: if (!this.tnW.mqu.getBoolean("key_is_changing_balance_phone_num", false))
          break label228;
        this.Agm.a(a.b(localAuthen, paramArrayOfObject, this.tnW.mqu.getBoolean("key_isbalance", false)), true, 1);
      }
      while (true)
      {
        AppMethodBeat.o(45882);
        bool = true;
        break;
        localAuthen.bJt = 5;
        break label167;
        label228: this.Agm.a(new com.tencent.mm.plugin.wallet.pay.a.a.b(localAuthen, paramArrayOfObject), true, 1);
      }
    case 3:
    }
    if (!this.tnW.cRY());
    for (localAuthen.bJt = 3; ; localAuthen.bJt = 6)
    {
      this.Agm.a(new com.tencent.mm.plugin.wallet.pay.a.a.b(localAuthen, paramArrayOfObject), true, 1);
      AppMethodBeat.o(45882);
      bool = true;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.b.14
 * JD-Core Version:    0.6.2
 */