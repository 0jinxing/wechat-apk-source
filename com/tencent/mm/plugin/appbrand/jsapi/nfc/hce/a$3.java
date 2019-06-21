package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$3
  implements DialogInterface.OnClickListener
{
  a$3(a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(137887);
    ab.i("MicroMsg.HCEActivityMgr", "alvinluo user click cancel button of NFC tips dialog.");
    a.a(this.hSu, "system NFC switch not opened");
    AppMethodBeat.o(137887);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.3
 * JD-Core Version:    0.6.2
 */