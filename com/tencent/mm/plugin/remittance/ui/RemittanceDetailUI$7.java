package com.tencent.mm.plugin.remittance.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class RemittanceDetailUI$7
  implements Runnable
{
  boolean ftW = false;

  RemittanceDetailUI$7(RemittanceDetailUI paramRemittanceDetailUI, Dialog paramDialog)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(45002);
    ab.i("MicroMsg.RemittanceDetailUI", "WalletGetUserInfoEvent callback() hasCallback:%s", new Object[] { Boolean.valueOf(this.ftW) });
    if (!this.ftW)
      RemittanceDetailUI.a(this.pVw, this.mhZ);
    this.ftW = true;
    AppMethodBeat.o(45002);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI.7
 * JD-Core Version:    0.6.2
 */