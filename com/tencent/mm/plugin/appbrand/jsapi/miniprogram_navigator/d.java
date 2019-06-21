package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.u;
import com.tencent.mm.plugin.appbrand.q;

public final class d extends u<q>
{
  static final int CTRL_INDEX = 191;
  public static final String NAME = "exitMiniProgram";

  public final String c(q paramq)
  {
    AppMethodBeat.i(101979);
    paramq.getRuntime().finish();
    paramq = j("ok", null);
    AppMethodBeat.o(101979);
    return paramq;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d
 * JD-Core Version:    0.6.2
 */