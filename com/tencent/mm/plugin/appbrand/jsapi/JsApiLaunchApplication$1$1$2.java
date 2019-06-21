package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.protocal.protobuf.avk;

final class JsApiLaunchApplication$1$1$2
  implements Runnable
{
  JsApiLaunchApplication$1$1$2(JsApiLaunchApplication.1.1 param1, Intent paramIntent, avk paramavk, JsApiLaunchApplication.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130436);
    boolean bool = g.a(this.hxm.hxl.hsD.getContext(), this.val$intent, null, this.hxn.wzs, this.hxo, this.hxm.hxl.hxg);
    this.hxo.dS(bool);
    AppMethodBeat.o(130436);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication.1.1.2
 * JD-Core Version:    0.6.2
 */