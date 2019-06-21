package com.tencent.mm.plugin.fingerprint.faceid.auth;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WalletFaceIdAuthUI$1
  implements View.OnClickListener
{
  WalletFaceIdAuthUI$1(WalletFaceIdAuthUI paramWalletFaceIdAuthUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41366);
    WalletFaceIdAuthUI.a(this.mqX).bwT();
    AppMethodBeat.o(41366);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI.1
 * JD-Core Version:    0.6.2
 */