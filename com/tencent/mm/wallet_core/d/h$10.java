package com.tencent.mm.wallet_core.d;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class h$10
  implements DialogInterface.OnClickListener
{
  h$10(WalletBaseUI paramWalletBaseUI, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(49134);
    a.b(this.tnX, this.tnX.mBundle, this.crd);
    if (this.tnX.bwP())
      this.tnX.finish();
    AppMethodBeat.o(49134);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.d.h.10
 * JD-Core Version:    0.6.2
 */