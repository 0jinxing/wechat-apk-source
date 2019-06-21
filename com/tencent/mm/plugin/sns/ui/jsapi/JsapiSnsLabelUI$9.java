package com.tencent.mm.plugin.sns.ui.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.label.a.a;
import com.tencent.mm.plugin.label.a.b;
import com.tencent.mm.ui.base.h;

final class JsapiSnsLabelUI$9
  implements DialogInterface.OnClickListener
{
  JsapiSnsLabelUI$9(JsapiSnsLabelUI paramJsapiSnsLabelUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(40180);
    JsapiSnsLabelUI.i(this.rJs);
    a.bJa().ce(JsapiSnsLabelUI.b(this.rJs));
    JsapiSnsLabelUI.a(this.rJs, h.b(this.rJs, this.rJs.getString(2131303676), false, null));
    AppMethodBeat.o(40180);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.9
 * JD-Core Version:    0.6.2
 */