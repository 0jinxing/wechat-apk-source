package com.tencent.mm.plugin.u.a;

import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$7 extends SparseIntArray
{
  c$7()
  {
    AppMethodBeat.i(80765);
    put(2, 1125);
    put(1, 1126);
    AppMethodBeat.o(80765);
  }

  public final int get(int paramInt)
  {
    AppMethodBeat.i(80766);
    paramInt = super.get(paramInt, 1124);
    AppMethodBeat.o(80766);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.u.a.c.7
 * JD-Core Version:    0.6.2
 */