package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class JsApiChooseImage$a$1
  implements DialogInterface.OnCancelListener
{
  JsApiChooseImage$a$1(JsApiChooseImage.a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(131135);
    this.hPb.hOY.bFZ = 0;
    JsApiChooseImage.a.a(this.hPb, this.hPb.hOY);
    AppMethodBeat.o(131135);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage.a.1
 * JD-Core Version:    0.6.2
 */