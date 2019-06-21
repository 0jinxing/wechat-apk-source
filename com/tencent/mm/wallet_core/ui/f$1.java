package com.tencent.mm.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.un;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.b.a;

final class f$1
  implements DialogInterface.OnClickListener
{
  f$1(WalletBaseUI paramWalletBaseUI, m paramm)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(49329);
    f.e(this.AhM);
    if ((this.crb != null) && (this.crb.ftl != null))
    {
      paramDialogInterface = new un();
      paramDialogInterface.cQI.uri = this.crb.ftl.getUri();
      a.xxA.m(paramDialogInterface);
    }
    AppMethodBeat.o(49329);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.f.1
 * JD-Core Version:    0.6.2
 */