package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.sortview.a;
import com.tencent.mm.ui.base.sortview.a.a;
import com.tencent.mm.ui.base.sortview.a.b;

public final class e extends a
{
  private static a.b jKQ;
  int Lp;
  long jKV;
  String jKW;
  String jMq;

  public e(long paramLong, int paramInt, String paramString)
  {
    super(2, null);
    this.jKV = paramLong;
    this.jKW = paramString;
    this.Lp = paramInt;
  }

  public final void a(Context paramContext, a.a parama, Object[] paramArrayOfObject)
  {
    this.jMq = "";
  }

  public final a.b aVY()
  {
    AppMethodBeat.i(14019);
    if (jKQ == null)
      jKQ = new e.1(this);
    a.b localb = jKQ;
    AppMethodBeat.o(14019);
    return localb;
  }

  public final a.a aVZ()
  {
    AppMethodBeat.i(14020);
    e.a locala = new e.a();
    AppMethodBeat.o(14020);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.e
 * JD-Core Version:    0.6.2
 */