package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a;

import android.annotation.TargetApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;

@TargetApi(18)
public final class a extends com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a
{
  public final void aCR()
  {
    AppMethodBeat.i(94258);
    if (this.hEt.hEl == null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "connection is not open.", new Object[0]);
      a(j.hET);
      done();
      AppMethodBeat.o(94258);
    }
    while (true)
    {
      return;
      this.hEt.dW(true);
      a(j.hEL);
      done();
      AppMethodBeat.o(94258);
    }
  }

  public final String getName()
  {
    return "CloseAction";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a.a
 * JD-Core Version:    0.6.2
 */