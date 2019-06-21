package com.tencent.mm.wallet_core.ui.formview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class a$6 extends a.b
{
  a$6()
  {
    super((byte)0);
  }

  public final boolean a(WalletFormView paramWalletFormView)
  {
    AppMethodBeat.i(49361);
    boolean bool = bo.amW(paramWalletFormView.getText());
    AppMethodBeat.o(49361);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.a.6
 * JD-Core Version:    0.6.2
 */