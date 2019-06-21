package com.tencent.mm.plugin.record;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;

public final class b
{
  public static String XZ()
  {
    AppMethodBeat.i(111119);
    Object localObject = new StringBuilder();
    g.RQ();
    localObject = g.RP().eJM + "recbiz/";
    AppMethodBeat.o(111119);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b
 * JD-Core Version:    0.6.2
 */