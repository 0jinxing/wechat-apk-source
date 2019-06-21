package com.tencent.mm.z;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.z.b.d;

public final class a
{
  public static void a(d paramd, String paramString, a.a parama)
  {
    AppMethodBeat.i(115298);
    if (bo.isNullOrNil(paramString))
    {
      parama.lo("");
      AppMethodBeat.o(115298);
    }
    while (true)
    {
      return;
      paramd.evaluateJavascript(paramString + String.format(";var ___result_return = function(){return %d;};___result_return();", new Object[] { Integer.valueOf(11111) }), new a.1(parama));
      AppMethodBeat.o(115298);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.z.a
 * JD-Core Version:    0.6.2
 */