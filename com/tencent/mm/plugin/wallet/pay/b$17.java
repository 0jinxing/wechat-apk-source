package com.tencent.mm.plugin.wallet.pay;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.pay.a.e.a;
import com.tencent.mm.plugin.wallet.pay.a.e.d;
import com.tencent.mm.plugin.wallet.pay.a.e.e;
import com.tencent.mm.plugin.wallet.pay.a.e.f;
import com.tencent.mm.plugin.wallet.pay.a.e.g;
import com.tencent.mm.plugin.wallet.pay.a.e.h;
import com.tencent.mm.plugin.wallet.pay.a.e.j;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.tenpay.model.n;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class b$17 extends b.a
{
  b$17(b paramb, WalletBaseUI paramWalletBaseUI, com.tencent.mm.wallet_core.d.i parami)
  {
    super(paramb, paramWalletBaseUI, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(45888);
    if (!super.c(paramInt1, paramInt2, paramString, paramm))
      if (((paramm instanceof j)) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (j)paramm;
        if (paramString.tpw)
          b.n(this.tnW).putParcelable("key_orders", paramString.tog);
        paramString = paramString.oYc;
        if (paramString != null)
          b.o(this.tnW).putParcelable("key_realname_guide_helper", paramString);
        this.tnW.a(this.hwd, 0, b.p(this.tnW));
        AppMethodBeat.o(45888);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(45888);
      bool = false;
      continue;
      AppMethodBeat.o(45888);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(45889);
    s locals = (s)paramArrayOfObject[0];
    Orders localOrders = (Orders)b.q(this.tnW).getParcelable("key_orders");
    if ((locals == null) || (localOrders == null))
    {
      ab.e("MicroMsg.CgiManager", "empty verify or orders");
      paramArrayOfObject = null;
    }
    while (true)
    {
      if (paramArrayOfObject != null)
        this.Agm.a(paramArrayOfObject, true, 1);
      AppMethodBeat.o(45889);
      return true;
      PayInfo localPayInfo = locals.pGr;
      paramArrayOfObject = "";
      if (localPayInfo != null)
      {
        ab.i("MicroMsg.CgiManager", "get reqKey from payInfo");
        paramArrayOfObject = localPayInfo.czZ;
      }
      Object localObject = paramArrayOfObject;
      if (bo.isNullOrNil(paramArrayOfObject))
      {
        ab.i("MicroMsg.CgiManager", "get reqKey from orders");
        localObject = localOrders.czZ;
      }
      if (bo.isNullOrNil((String)localObject))
      {
        ab.i("MicroMsg.CgiManager", "empty reqKey!");
        paramArrayOfObject = new j(locals, localOrders);
      }
      else
      {
        if (localPayInfo != null)
          ab.d("MicroMsg.CgiManager", "reqKey: %s, %s", new Object[] { localPayInfo.czZ, localOrders.czZ });
        ab.i("MicroMsg.CgiManager", "verifyreg reqKey: %s", new Object[] { localObject });
        ab.i("MicroMsg.CgiManager", "verifyreg go new split cgi");
        if (((String)localObject).startsWith("sns_aa_"))
          paramArrayOfObject = new a(locals, localOrders);
        else if (((String)localObject).startsWith("sns_tf_"))
          paramArrayOfObject = new h(locals, localOrders);
        else if (((String)localObject).startsWith("sns_ff_"))
          paramArrayOfObject = new com.tencent.mm.plugin.wallet.pay.a.e.c(locals, localOrders);
        else if (((String)localObject).startsWith("ts_"))
          paramArrayOfObject = new d(locals, localOrders);
        else if (((String)localObject).startsWith("sns_"))
          paramArrayOfObject = new f(locals, localOrders);
        else if (((String)localObject).startsWith("up_"))
          paramArrayOfObject = new com.tencent.mm.plugin.wallet.pay.a.e.i(locals, localOrders);
        else if (((String)localObject).startsWith("seb_ff_"))
          paramArrayOfObject = new e(locals, localOrders);
        else if (((String)localObject).startsWith("tax_"))
          paramArrayOfObject = new g(locals, localOrders);
        else if (((String)localObject).startsWith("dc_"))
          paramArrayOfObject = new com.tencent.mm.plugin.wallet.pay.a.e.b(locals, localOrders);
        else
          paramArrayOfObject = new j(locals, localOrders);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.b.17
 * JD-Core Version:    0.6.2
 */