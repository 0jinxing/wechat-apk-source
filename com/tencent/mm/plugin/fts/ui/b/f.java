package com.tencent.mm.plugin.fts.ui.b;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.a;
import com.tencent.mm.plugin.fts.a.d.e;
import com.tencent.mm.plugin.fts.a.d.e.b;

public final class f extends a
{
  public final e a(Context paramContext, e.b paramb, int paramInt)
  {
    AppMethodBeat.i(62045);
    paramContext = new com.tencent.mm.plugin.fts.ui.d.f(paramContext, paramb, paramInt);
    AppMethodBeat.o(62045);
    return paramContext;
  }

  public final int getPriority()
  {
    return 4096;
  }

  public final int getType()
  {
    return 160;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.b.f
 * JD-Core Version:    0.6.2
 */