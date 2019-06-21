package com.tencent.mm.plugin.appbrand.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;

final class f$31
  implements k.a
{
  f$31(f paramf)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(129284);
    if ((paramString != null) && (paramString.length() > 0) && ("event_updated".equals(paramString)))
    {
      f.avf();
      f.avg();
      f.avh();
      f.avi();
      f.avj();
    }
    AppMethodBeat.o(129284);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.f.31
 * JD-Core Version:    0.6.2
 */