package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.sortview.a;
import com.tencent.mm.ui.base.sortview.a.a;
import com.tencent.mm.ui.base.sortview.a.b;

public final class g extends a
{
  private static a.b jKQ;

  public g(Object paramObject)
  {
    super(0, paramObject);
    this.yDq = true;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
  }

  public final a.b aVY()
  {
    AppMethodBeat.i(14056);
    if (jKQ == null)
      jKQ = new g.1(this);
    a.b localb = jKQ;
    AppMethodBeat.o(14056);
    return localb;
  }

  public final a.a aVZ()
  {
    AppMethodBeat.i(14057);
    g.a locala = new g.a();
    AppMethodBeat.o(14057);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.g
 * JD-Core Version:    0.6.2
 */