package com.tencent.mm.plugin.wallet_core.ui;

import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.ui.a;

final class WalletCheckPwdUI$5
  implements a
{
  WalletCheckPwdUI$5(WalletCheckPwdUI paramWalletCheckPwdUI)
  {
  }

  public final void ic(boolean paramBoolean)
  {
    AppMethodBeat.i(47337);
    ab.d("Micromsg.WalletCheckPwdUI", "kb visibility: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    WalletCheckPwdUI.h(this.tHs).post(new WalletCheckPwdUI.5.1(this, paramBoolean));
    AppMethodBeat.o(47337);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.5
 * JD-Core Version:    0.6.2
 */