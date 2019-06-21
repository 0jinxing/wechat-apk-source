package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.protocal.protobuf.avk;

final class JsApiLaunchApplicationDirectly$1$1$2
  implements Runnable
{
  JsApiLaunchApplicationDirectly$1$1$2(JsApiLaunchApplicationDirectly.1.1 param1, Intent paramIntent, avk paramavk, JsApiLaunchApplicationDirectly.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(130453);
    boolean bool = g.a(this.hxB.hxA.hsD.getContext(), this.val$intent, null, this.hxn.wzs, this.hxC, this.hxB.hxA.hxg);
    this.hxC.dS(bool);
    AppMethodBeat.o(130453);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly.1.1.2
 * JD-Core Version:    0.6.2
 */