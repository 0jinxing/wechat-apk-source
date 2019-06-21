package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiChooseMedia$a$3
  implements DialogInterface.OnCancelListener
{
  JsApiChooseMedia$a$3(JsApiChooseMedia.a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(131170);
    ab.e("MicroMsg.JsApiChooseMedia", "cancel chooseMedia, and finish process!");
    JsApiChooseMedia.a.e(this.hPt).bFZ = 0;
    JsApiChooseMedia.a.a(this.hPt, JsApiChooseMedia.a.e(this.hPt));
    AppMethodBeat.o(131170);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.a.3
 * JD-Core Version:    0.6.2
 */