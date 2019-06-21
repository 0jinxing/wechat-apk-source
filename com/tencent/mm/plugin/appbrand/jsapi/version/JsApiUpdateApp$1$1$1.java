package com.tencent.mm.plugin.appbrand.jsapi.version;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ad.1;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.sdk.platformtools.ab;

final class JsApiUpdateApp$1$1$1
  implements DialogInterface.OnClickListener
{
  JsApiUpdateApp$1$1$1(JsApiUpdateApp.1.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(131486);
    o localo = this.hXY.hXX.hsj.getRuntime();
    paramDialogInterface = this.hXY.gQx;
    if ((localo == null) || (paramDialogInterface == null))
    {
      ab.e("MicroMsg.AppBrand.RuntimeRestartHelper", "restart skip with Null runtime");
      AppMethodBeat.o(131486);
    }
    while (true)
    {
      return;
      if (!localo.eMP)
      {
        ab.e("MicroMsg.AppBrand.RuntimeRestartHelper", "restart %s, not initialized", new Object[] { localo.mAppId });
        AppMethodBeat.o(131486);
      }
      else
      {
        localo.B(new ad.1(localo, paramDialogInterface));
        AppMethodBeat.o(131486);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.version.JsApiUpdateApp.1.1.1
 * JD-Core Version:    0.6.2
 */