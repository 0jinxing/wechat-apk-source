package com.tencent.mm.w.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.e;
import com.tencent.mm.plugin.fts.a.d.e.b;

public final class a extends com.tencent.mm.plugin.fts.a.d.a
{
  public final e a(Context paramContext, e.b paramb, int paramInt)
  {
    AppMethodBeat.i(124492);
    paramContext = new b(paramContext, paramb, paramInt);
    AppMethodBeat.o(124492);
    return paramContext;
  }

  public final int getPriority()
  {
    return 33;
  }

  public final int getType()
  {
    return 33;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.w.a.a
 * JD-Core Version:    0.6.2
 */