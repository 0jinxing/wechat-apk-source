package com.tencent.mm.plugin.wallet_ecard.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$c$2
  implements DialogInterface.OnClickListener
{
  b$c$2(b.c paramc)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48081);
    this.tQr.tQp.b(this.tQr.hwd, null);
    AppMethodBeat.o(48081);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.b.b.c.2
 * JD-Core Version:    0.6.2
 */