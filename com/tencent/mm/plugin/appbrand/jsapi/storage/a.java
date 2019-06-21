package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.sdk.g.d;

public final class a extends com.tencent.mm.plugin.appbrand.jsapi.a<h>
{
  public static final int CTRL_INDEX = 18;
  public static final String NAME = "clearStorage";

  private void a(h paramh, int paramInt)
  {
    AppMethodBeat.i(102023);
    d.post(new a.1(this, paramInt, paramh), "JsApiClearStorage");
    AppMethodBeat.o(102023);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.a
 * JD-Core Version:    0.6.2
 */