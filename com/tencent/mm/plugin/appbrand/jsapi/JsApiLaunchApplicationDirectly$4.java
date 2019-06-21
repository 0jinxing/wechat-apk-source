package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiLaunchApplicationDirectly$4
  implements DialogInterface.OnClickListener
{
  JsApiLaunchApplicationDirectly$4(JsApiLaunchApplicationDirectly paramJsApiLaunchApplicationDirectly, q paramq, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(130459);
    ab.i("MicroMsg.JsApiLaunchApplicationDirectly", "fail:user canceled install");
    JsApiLaunchApplicationDirectly.a(this.hxz, this.hsD);
    this.hsD.M(this.eIl, this.hxz.j("fail:user canceled install", null));
    AppMethodBeat.o(130459);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly.4
 * JD-Core Version:    0.6.2
 */