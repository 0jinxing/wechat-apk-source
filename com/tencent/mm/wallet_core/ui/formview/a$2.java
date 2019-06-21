package com.tencent.mm.wallet_core.ui.formview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tenpay.android.wechat.TenpaySecureEditText;

final class a$2 extends a.b
{
  a$2()
  {
    super((byte)0);
  }

  public final boolean a(WalletFormView paramWalletFormView)
  {
    AppMethodBeat.i(49357);
    boolean bool;
    if (paramWalletFormView.Aih == null)
    {
      bool = false;
      AppMethodBeat.o(49357);
    }
    while (true)
    {
      return bool;
      bool = paramWalletFormView.Aih.isMoneyAmount();
      AppMethodBeat.o(49357);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.a.2
 * JD-Core Version:    0.6.2
 */