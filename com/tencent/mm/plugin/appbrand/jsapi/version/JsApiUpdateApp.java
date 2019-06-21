package com.tencent.mm.plugin.appbrand.jsapi.version;

import android.os.Parcelable.Creator;
import com.tencent.luggage.sdk.b.b;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.s;

public final class JsApiUpdateApp extends a<s>
{
  private static final int CTRL_INDEX = 359;
  private static final String NAME = "updateApp";

  public final void a(s params, int paramInt)
  {
    AppMethodBeat.i(138134);
    XIPCInvoker.a("com.tencent.mm", new JsApiUpdateApp.SyncRequest(params.getRuntime().atI(), params.getRuntime().ya().bQn), JsApiUpdateApp.a.class, new JsApiUpdateApp.1(this, params, paramInt));
    AppMethodBeat.o(138134);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.version.JsApiUpdateApp
 * JD-Core Version:    0.6.2
 */