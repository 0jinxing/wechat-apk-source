package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiChooseMultiMedia$a$4
  implements DialogInterface.OnCancelListener
{
  JsApiChooseMultiMedia$a$4(JsApiChooseMultiMedia.a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(131233);
    ab.e("MicroMsg.JsApiChooseMultiMedia", "cancel show the progress dialog and finish progress");
    this.hPN.hPK.bFZ = 0;
    JsApiChooseMultiMedia.a.h(this.hPN, this.hPN.hPK);
    AppMethodBeat.o(131233);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia.a.4
 * JD-Core Version:    0.6.2
 */