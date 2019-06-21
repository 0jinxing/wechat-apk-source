package com.tencent.mm.plugin.wallet_core.ui.view;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.a.b;

final class WalletPhoneInputView$3
  implements b
{
  WalletPhoneInputView$3(WalletPhoneInputView paramWalletPhoneInputView)
  {
  }

  public final boolean a(WalletFormView paramWalletFormView)
  {
    AppMethodBeat.i(47910);
    boolean bool;
    if (this.tNV.cSA())
    {
      bool = paramWalletFormView.isPhoneNum();
      AppMethodBeat.o(47910);
    }
    while (true)
    {
      return bool;
      if ((!bo.isNullOrNil(WalletPhoneInputView.a(this.tNV))) && (!bo.isNullOrNil(WalletPhoneInputView.b(this.tNV))) && (!bo.isNullOrNil(WalletPhoneInputView.c(this.tNV).getText())))
      {
        bool = true;
        AppMethodBeat.o(47910);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(47910);
      }
    }
  }

  public final boolean c(WalletFormView paramWalletFormView, String paramString)
  {
    return false;
  }

  public final boolean cev()
  {
    return false;
  }

  public final boolean d(WalletFormView paramWalletFormView, String paramString)
  {
    return false;
  }

  public final String e(WalletFormView paramWalletFormView, String paramString)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView.3
 * JD-Core Version:    0.6.2
 */