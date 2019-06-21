package com.tencent.mm.plugin.wallet_ecard.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$c$3
  implements DialogInterface.OnClickListener
{
  b$c$3(b.c paramc)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48082);
    this.tQr.tQp.b(this.tQr.hwd, null);
    AppMethodBeat.o(48082);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_ecard.b.b.c.3
 * JD-Core Version:    0.6.2
 */