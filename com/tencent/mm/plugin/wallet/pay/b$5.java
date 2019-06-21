package com.tencent.mm.plugin.wallet.pay;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.pay.a.a;
import com.tencent.mm.plugin.wallet.pay.a.d.f;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.tenpay.model.n;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class b$5 extends b.a
{
  b$5(b paramb, WalletBaseUI paramWalletBaseUI, i parami)
  {
    super(paramb, paramWalletBaseUI, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(45870);
    if ((!super.c(paramInt1, paramInt2, paramString, paramm)) && ((paramm instanceof f)))
    {
      paramString = (f)paramm;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramString.tpw)
          b.s(this.tnW).putParcelable("key_orders", paramString.tog);
        paramString = paramString.oYc;
        if (paramString != null)
          b.t(this.tnW).putParcelable("key_realname_guide_helper", paramString);
        this.tnW.a(this.hwd, 0, b.u(this.tnW));
        this.hwd.finish();
        bool = true;
        AppMethodBeat.o(45870);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(45870);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(45869);
    if (paramArrayOfObject.length > 0)
    {
      paramArrayOfObject = a.a((s)paramArrayOfObject[0], (Orders)b.r(this.tnW).getParcelable("key_orders"));
      this.Agm.a(paramArrayOfObject, true, 1);
    }
    AppMethodBeat.o(45869);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.b.5
 * JD-Core Version:    0.6.2
 */