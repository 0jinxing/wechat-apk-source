package com.tencent.mm.wallet_core.ui.formview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class a$3 extends a.b
{
  a$3()
  {
    super((byte)0);
  }

  public final boolean cev()
  {
    return true;
  }

  public final String e(WalletFormView paramWalletFormView, String paramString)
  {
    AppMethodBeat.i(49358);
    paramWalletFormView = bo.bc((String)paramWalletFormView.getTag(), "").replace("/", "");
    AppMethodBeat.o(49358);
    return paramWalletFormView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.a.3
 * JD-Core Version:    0.6.2
 */