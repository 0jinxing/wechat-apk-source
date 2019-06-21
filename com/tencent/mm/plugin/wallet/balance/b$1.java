package com.tencent.mm.plugin.wallet.balance;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.c.v;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

final class b$1 extends g
{
  b$1(b paramb, MMActivity paramMMActivity, i parami)
  {
    super(paramMMActivity, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(45200);
    this.teV.a(this.hwd, 0, this.teV.mqu);
    AppMethodBeat.o(45200);
    return true;
  }

  public final boolean w(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(45199);
    paramArrayOfObject = b.a(this.teV);
    s.cNC();
    paramArrayOfObject.putParcelable("key_history_bankcard", s.cND().tCU);
    paramArrayOfObject = (PayInfo)this.teV.mqu.get("key_pay_info");
    i locali = this.Agm;
    if (paramArrayOfObject == null);
    for (paramArrayOfObject = null; ; paramArrayOfObject = paramArrayOfObject.czZ)
    {
      locali.a(new v(paramArrayOfObject), true);
      AppMethodBeat.o(45199);
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.b.1
 * JD-Core Version:    0.6.2
 */