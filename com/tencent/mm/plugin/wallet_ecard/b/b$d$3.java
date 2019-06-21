package com.tencent.mm.plugin.wallet_ecard.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$d$3
  implements DialogInterface.OnDismissListener
{
  b$d$3(b.d paramd)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(48089);
    ab.i("MicroMsg.OpenECardProcess", "dismiss alert");
    this.tQs.gLj = null;
    AppMethodBeat.o(48089);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.b.b.d.3
 * JD-Core Version:    0.6.2
 */