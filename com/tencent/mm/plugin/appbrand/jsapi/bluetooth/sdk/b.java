package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.c;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a;

public final class b
{
  private Context context;
  public c hDY;
  public a hDZ;

  public b(Context paramContext)
  {
    AppMethodBeat.i(94219);
    this.context = paramContext;
    this.hDY = new c(paramContext);
    this.hDZ = new a(paramContext);
    AppMethodBeat.o(94219);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b
 * JD-Core Version:    0.6.2
 */