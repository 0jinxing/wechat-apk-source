package com.tencent.mm.wallet_core.d;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

final class h$3
  implements DialogInterface.OnClickListener
{
  h$3(WalletBaseUI paramWalletBaseUI, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(49127);
    a.b(this.tnX, this.tnX.mBundle, this.crd);
    if ((this.tnX.bwP()) || (this.tnX.mController.contentView.getVisibility() != 0))
      this.tnX.finish();
    AppMethodBeat.o(49127);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.d.h.3
 * JD-Core Version:    0.6.2
 */