package com.tencent.mm.plugin.appbrand.f;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.a;
import com.tencent.mm.plugin.fts.a.d.e.b;

public final class e extends a
{
  public final com.tencent.mm.plugin.fts.a.d.e a(Context paramContext, e.b paramb, int paramInt)
  {
    AppMethodBeat.i(129975);
    paramContext = new f(paramContext, paramb, paramInt);
    AppMethodBeat.o(129975);
    return paramContext;
  }

  public final int getPriority()
  {
    return 2147483647;
  }

  public final int getType()
  {
    return 4224;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.e
 * JD-Core Version:    0.6.2
 */