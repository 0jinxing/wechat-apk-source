package com.tencent.mm.plugin.welab;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cq;
import com.tencent.mm.plugin.welab.a.a.b;
import com.tencent.mm.plugin.welab.a.a.d;
import java.util.Map;

public final class c
  implements d
{
  public final void a(b paramb)
  {
    AppMethodBeat.i(80538);
    a.ddj().uLS = paramb;
    AppMethodBeat.o(80538);
  }

  public final void a(String paramString, b paramb)
  {
    AppMethodBeat.i(80537);
    a.ddj().uLR.put(paramString, paramb);
    AppMethodBeat.o(80537);
  }

  public final cq agJ(String paramString)
  {
    AppMethodBeat.i(80539);
    paramString = a.ddj().agI(paramString);
    AppMethodBeat.o(80539);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.c
 * JD-Core Version:    0.6.2
 */