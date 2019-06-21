package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class JsApiChooseVideo$a$1
  implements DialogInterface.OnCancelListener
{
  JsApiChooseVideo$a$1(JsApiChooseVideo.a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(131282);
    JsApiChooseVideo.a.a(this.hPV).bFZ = 0;
    JsApiChooseVideo.a.a(this.hPV, JsApiChooseVideo.a.a(this.hPV));
    AppMethodBeat.o(131282);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo.a.1
 * JD-Core Version:    0.6.2
 */