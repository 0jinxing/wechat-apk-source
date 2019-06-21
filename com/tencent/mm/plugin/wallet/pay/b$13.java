package com.tencent.mm.plugin.wallet.pay;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class b$13 extends b.a
{
  b$13(b paramb, WalletBaseUI paramWalletBaseUI, i parami)
  {
    super(paramb, paramWalletBaseUI, parami);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(45880);
    boolean bool;
    if (!super.c(paramInt1, paramInt2, paramString, paramm))
    {
      bool = false;
      AppMethodBeat.o(45880);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(45880);
    }
  }

  public final boolean p(Object[] paramArrayOfObject)
  {
    return false;
  }

  public final boolean w(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(45879);
    if (b.b(this.tnW).getInt("key_pay_scene", 0) == 11)
    {
      Bundle localBundle = b.c(this.tnW);
      s.cNC();
      localBundle.putParcelable("key_history_bankcard", s.cND().tCU);
    }
    boolean bool = super.w(paramArrayOfObject);
    AppMethodBeat.o(45879);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.b.13
 * JD-Core Version:    0.6.2
 */