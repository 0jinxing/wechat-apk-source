package com.tencent.mm.plugin.appbrand.jsapi.version;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.s;

final class JsApiUpdateApp$1$1$2
  implements DialogInterface.OnClickListener
{
  JsApiUpdateApp$1$1$2(JsApiUpdateApp.1.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(131487);
    this.hXY.hXX.hsj.M(this.hXY.hXX.eIl, this.hXY.hXX.hXW.j("fail user canceled updateApp", null));
    AppMethodBeat.o(131487);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.version.JsApiUpdateApp.1.1.2
 * JD-Core Version:    0.6.2
 */