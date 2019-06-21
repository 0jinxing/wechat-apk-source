package com.tencent.mm.plugin.appbrand.m.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.i;
import com.tencent.mm.plugin.appbrand.m.a.b;
import com.tencent.mm.plugin.appbrand.m.a.c;
import com.tencent.mm.plugin.appbrand.permission.f;
import com.tencent.mm.plugin.appbrand.q;

public final class h extends b
{
  public final void a(i parami, c paramc)
  {
    AppMethodBeat.i(102203);
    parami = parami.optString("apiName");
    ((f)paramc.gMN.B(f.class)).Dq(parami);
    AppMethodBeat.o(102203);
  }

  public final int aIT()
  {
    return 5;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.m.c.h
 * JD-Core Version:    0.6.2
 */