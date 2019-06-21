package com.tencent.mm.plugin.appbrand.game.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.a;
import com.tencent.mm.plugin.fts.a.d.e;
import com.tencent.mm.plugin.fts.a.d.e.b;

public final class f extends a
{
  public final e a(Context paramContext, e.b paramb, int paramInt)
  {
    AppMethodBeat.i(130087);
    paramContext = new g(paramContext, paramb, paramInt);
    AppMethodBeat.o(130087);
    return paramContext;
  }

  public final int getPriority()
  {
    return 73;
  }

  public final int getType()
  {
    return 208;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.f
 * JD-Core Version:    0.6.2
 */