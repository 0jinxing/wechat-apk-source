package com.tencent.mm.plugin.w;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum c
{
  public final SparseArray<b> qwT;

  static
  {
    AppMethodBeat.i(79173);
    qwS = new c("INSTANCE");
    qwU = new c[] { qwS };
    AppMethodBeat.o(79173);
  }

  private c()
  {
    AppMethodBeat.i(79171);
    this.qwT = new SparseArray();
    AppMethodBeat.o(79171);
  }

  public final boolean a(b paramb)
  {
    AppMethodBeat.i(79172);
    this.qwT.put(paramb.getType(), paramb);
    AppMethodBeat.o(79172);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.w.c
 * JD-Core Version:    0.6.2
 */