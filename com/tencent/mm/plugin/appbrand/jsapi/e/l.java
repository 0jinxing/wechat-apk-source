package com.tencent.mm.plugin.appbrand.jsapi.e;

import android.os.Bundle;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.d.d;

final class l extends d
{
  Bundle fPq;
  final b hKU;
  public l.a hKV;
  final com.tencent.mm.sdk.d.c hKW;
  final com.tencent.mm.sdk.d.c hKX;
  final com.tencent.mm.sdk.d.c hKY;

  l(com.tencent.mm.plugin.appbrand.jsapi.c paramc)
  {
    super("RuntimeLocationUpdateStateManager[" + paramc.getAppId() + "]", Looper.getMainLooper());
    AppMethodBeat.i(93837);
    this.hKW = new l.1(this);
    this.hKX = new l.2(this);
    this.hKY = new l.3(this);
    this.hKU = new b(paramc);
    a(this.hKW);
    a(this.hKX);
    a(this.hKY);
    b(this.hKW);
    AppMethodBeat.o(93837);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.l
 * JD-Core Version:    0.6.2
 */