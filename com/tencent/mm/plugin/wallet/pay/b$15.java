package com.tencent.mm.plugin.wallet.pay;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet.pay.a.a;
import com.tencent.mm.plugin.wallet.pay.a.d.f;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.utils.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.tenpay.model.n;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class b$15 extends b.a
{
  b$15(b paramb, WalletBaseUI paramWalletBaseUI, i parami)
  {
    super(paramb, paramWalletBaseUI, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(45883);
    if (!super.c(paramInt1, paramInt2, paramString, paramm))
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if (((paramm instanceof f)) || ((paramm instanceof com.tencent.mm.plugin.wallet.pay.a.d.b)))
        {
          paramString = (f)paramm;
          if (paramString.tpw)
            b.k(this.tnW).putParcelable("key_orders", paramString.tog);
          paramString = paramString.oYc;
          if (paramString != null)
            b.l(this.tnW).putParcelable("key_realname_guide_helper", paramString);
          h.pYm.e(10707, new Object[] { Integer.valueOf(1), Integer.valueOf(d.cSQ()) });
          AppMethodBeat.o(45883);
          bool = false;
        }
    while (true)
    {
      return bool;
      if ((paramm instanceof com.tencent.mm.plugin.wallet.pay.a.a.b))
      {
        AppMethodBeat.o(45883);
      }
      else
      {
        AppMethodBeat.o(45883);
        bool = false;
        continue;
        AppMethodBeat.o(45883);
      }
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(45884);
    paramArrayOfObject = (com.tencent.mm.plugin.wallet_core.model.s)paramArrayOfObject[1];
    Orders localOrders = (Orders)b.m(this.tnW).getParcelable("key_orders");
    ab.i("MicroMsg.PayProcess", "WalletVerifyCodeUI onNext pay_flag : " + this.tnW.mqu.getInt("key_pay_flag", 0));
    boolean bool = this.tnW.mqu.getBoolean("key_is_changing_balance_phone_num");
    String str;
    switch (this.tnW.mqu.getInt("key_pay_flag", 0))
    {
    default:
      AppMethodBeat.o(45884);
      bool = false;
      return bool;
    case 1:
      paramArrayOfObject.flag = "1";
      if (!bool)
      {
        if (!bo.isNullOrNil(paramArrayOfObject.pbn))
        {
          com.tencent.mm.plugin.wallet.a.s.cNC();
          if (com.tencent.mm.plugin.wallet.a.s.cND().tCZ != null)
          {
            str = paramArrayOfObject.pbn;
            com.tencent.mm.plugin.wallet.a.s.cNC();
            if (!str.equals(com.tencent.mm.plugin.wallet.a.s.cND().tCZ.field_bankcardType));
          }
        }
      }
      else
        this.Agm.a(new com.tencent.mm.plugin.wallet.pay.a.d.b(paramArrayOfObject, localOrders), true, 1);
      while (true)
      {
        AppMethodBeat.o(45884);
        bool = true;
        break;
        paramArrayOfObject = a.a(paramArrayOfObject, localOrders);
        if (paramArrayOfObject != null)
          this.Agm.a(paramArrayOfObject, true, 1);
      }
    case 2:
      if (!this.tnW.cRY())
      {
        paramArrayOfObject.flag = "2";
        label248: if (!bool)
        {
          if (bo.isNullOrNil(paramArrayOfObject.pbn))
            break label339;
          com.tencent.mm.plugin.wallet.a.s.cNC();
          if (com.tencent.mm.plugin.wallet.a.s.cND().tCZ == null)
            break label339;
          str = paramArrayOfObject.pbn;
          com.tencent.mm.plugin.wallet.a.s.cNC();
          if (!str.equals(com.tencent.mm.plugin.wallet.a.s.cND().tCZ.field_bankcardType))
            break label339;
        }
        this.Agm.a(new com.tencent.mm.plugin.wallet.pay.a.d.b(paramArrayOfObject, localOrders), true, 1);
      }
      while (true)
      {
        AppMethodBeat.o(45884);
        bool = true;
        break;
        paramArrayOfObject.flag = "5";
        break label248;
        label339: paramArrayOfObject = a.a(paramArrayOfObject, localOrders);
        if (paramArrayOfObject != null)
          this.Agm.a(paramArrayOfObject, true, 1);
      }
    case 3:
    }
    if (!this.tnW.cRY())
    {
      paramArrayOfObject.flag = "3";
      label378: if (!bool)
      {
        if (bo.isNullOrNil(paramArrayOfObject.pbn))
          break label469;
        com.tencent.mm.plugin.wallet.a.s.cNC();
        if (com.tencent.mm.plugin.wallet.a.s.cND().tCZ == null)
          break label469;
        str = paramArrayOfObject.pbn;
        com.tencent.mm.plugin.wallet.a.s.cNC();
        if (!str.equals(com.tencent.mm.plugin.wallet.a.s.cND().tCZ.field_bankcardType))
          break label469;
      }
      this.Agm.a(new com.tencent.mm.plugin.wallet.pay.a.d.b(paramArrayOfObject, localOrders), true, 1);
    }
    while (true)
    {
      AppMethodBeat.o(45884);
      bool = true;
      break;
      paramArrayOfObject.flag = "6";
      break label378;
      label469: paramArrayOfObject = a.a(paramArrayOfObject, localOrders);
      if (paramArrayOfObject != null)
        this.Agm.a(paramArrayOfObject, true, 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.b.15
 * JD-Core Version:    0.6.2
 */