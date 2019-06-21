package com.tencent.mm.plugin.appbrand.jsapi.t;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.modeltools.h;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;

final class e$2
  implements DialogInterface.OnCancelListener
{
  e$2(e parame)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(17028);
    if ((this.icM.icE != null) && (e.i(this.icM) != null));
    while (true)
    {
      try
      {
        e.i(this.icM).afo(this.icM.icE.upr);
        this.icM.icE.cYK();
        AppMethodBeat.o(17028);
        return;
      }
      catch (Exception paramDialogInterface)
      {
        ab.e("MicroMsg.AppBrand.HTMLWebViewLogicDelegate", "cancel capture failed");
      }
      AppMethodBeat.o(17028);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.e.2
 * JD-Core Version:    0.6.2
 */