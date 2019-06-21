package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.sortview.a;
import com.tencent.mm.ui.base.sortview.a.a;
import com.tencent.mm.ui.base.sortview.a.b;

public final class d extends a
{
  private static a.b jKQ;
  String jKR;

  public d(Object paramObject)
  {
    super(1, paramObject);
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    if ((this.data instanceof String))
      this.jKR = ((String)this.data);
  }

  public final a.b aVY()
  {
    AppMethodBeat.i(13940);
    if (jKQ == null)
      jKQ = new d.1(this);
    a.b localb = jKQ;
    AppMethodBeat.o(13940);
    return localb;
  }

  public final a.a aVZ()
  {
    AppMethodBeat.i(13941);
    d.a locala = new d.a();
    AppMethodBeat.o(13941);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.d
 * JD-Core Version:    0.6.2
 */