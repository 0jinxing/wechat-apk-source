package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1 extends b
{
  b$1(Context paramContext, b.a parama)
  {
    super(paramContext);
  }

  public final int btU()
  {
    AppMethodBeat.i(48496);
    int i = 3;
    int j = i;
    if (this.tUj.tUl != null)
    {
      j = i;
      if (this.tUj.tUl.field_bankcardClientType == 1)
      {
        ab.d("MicroMsg.WalletPayUPwdDialog", "hy: the bankcard can be assembled to BankcardPayU");
        j = new com.tencent.mm.plugin.wallet_core.model.a.b(this.tUj.tUl).tDL;
      }
    }
    if (j == 4)
    {
      ab.d("MicroMsg.WalletPayUPwdDialog", "hy: is 4 digits cvv");
      j = 2130970348;
      AppMethodBeat.o(48496);
    }
    while (true)
    {
      return j;
      j = 2130970349;
      AppMethodBeat.o(48496);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.ui.b.1
 * JD-Core Version:    0.6.2
 */