package com.tencent.mm.plugin.appbrand.f;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.a;
import com.tencent.mm.plugin.fts.a.d.e;
import com.tencent.mm.plugin.fts.a.d.e.b;

public final class g extends a
{
  public final e a(Context paramContext, e.b paramb, int paramInt)
  {
    AppMethodBeat.i(129979);
    paramContext = new h(paramContext, paramb, paramInt);
    AppMethodBeat.o(129979);
    return paramContext;
  }

  public final int getPriority()
  {
    return 89;
  }

  public final int getType()
  {
    return 144;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.g
 * JD-Core Version:    0.6.2
 */