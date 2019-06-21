package com.tencent.mm.plugin.u.a;

import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$5 extends SparseIntArray
{
  c$5()
  {
    AppMethodBeat.i(80761);
    put(2, 1012);
    put(1, 1013);
    AppMethodBeat.o(80761);
  }

  public final int get(int paramInt)
  {
    AppMethodBeat.i(80762);
    paramInt = super.get(paramInt, 1011);
    AppMethodBeat.o(80762);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.u.a.c.5
 * JD-Core Version:    0.6.2
 */