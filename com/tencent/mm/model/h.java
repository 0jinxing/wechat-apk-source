package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.j;
import com.tencent.mm.aj.a.k;
import com.tencent.mm.aj.z;
import com.tencent.mm.api.i;

public final class h
  implements i
{
  public final j cH(String paramString)
  {
    AppMethodBeat.i(11223);
    paramString = z.aeV().cH(paramString);
    AppMethodBeat.o(11223);
    return paramString;
  }

  public final String cI(String paramString)
  {
    AppMethodBeat.i(11224);
    paramString = z.aeV().cI(paramString);
    AppMethodBeat.o(11224);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.h
 * JD-Core Version:    0.6.2
 */