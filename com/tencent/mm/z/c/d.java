package com.tencent.mm.z.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.z.b.b;
import java.util.HashMap;
import java.util.Map;

public final class d
{
  final Map<String, b> eIp;

  public d()
  {
    AppMethodBeat.i(115306);
    this.eIp = new HashMap();
    AppMethodBeat.o(115306);
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(115307);
    this.eIp.put(paramb.name, paramb);
    AppMethodBeat.o(115307);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.z.c.d
 * JD-Core Version:    0.6.2
 */