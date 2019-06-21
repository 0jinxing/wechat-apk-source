package com.tencent.mm.z.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.z.b.e;
import java.util.HashMap;
import java.util.Map;

public final class g
{
  private final Map<String, e> eIx;

  public g()
  {
    AppMethodBeat.i(115319);
    this.eIx = new HashMap();
    AppMethodBeat.o(115319);
  }

  public final void a(e parame)
  {
    AppMethodBeat.i(115320);
    this.eIx.put(parame.getName(), parame);
    AppMethodBeat.o(115320);
  }

  public final e lq(String paramString)
  {
    AppMethodBeat.i(115321);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(115321);
    }
    while (true)
    {
      return paramString;
      paramString = (e)this.eIx.get(paramString);
      AppMethodBeat.o(115321);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.z.c.g
 * JD-Core Version:    0.6.2
 */