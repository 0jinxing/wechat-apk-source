package com.tencent.mm.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c;

final class WalletBaseUI$7
  implements DialogInterface.OnClickListener
{
  WalletBaseUI$7(WalletBaseUI paramWalletBaseUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(49245);
    this.AhA.dOy();
    paramDialogInterface = a.aE(this.AhA);
    this.AhA.Ahw = 4;
    if (paramDialogInterface != null)
    {
      if (paramDialogInterface.h(this.AhA, this.AhA.mBundle))
        break label78;
      paramDialogInterface.b(this.AhA, this.AhA.mBundle);
      AppMethodBeat.o(49245);
    }
    while (true)
    {
      return;
      this.AhA.finish();
      label78: AppMethodBeat.o(49245);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.WalletBaseUI.7
 * JD-Core Version:    0.6.2
 */