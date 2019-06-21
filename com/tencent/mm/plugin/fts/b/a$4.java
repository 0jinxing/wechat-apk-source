package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.bo;

final class a$4
  implements k.a
{
  a$4(a parama)
  {
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(136653);
    paramString = paramString.split(" ");
    if ((paramString == null) || (paramString.length == 0))
      AppMethodBeat.o(136653);
    while (true)
    {
      return;
      if (paramString[0].equals("update"))
      {
        for (int i = 1; i < paramString.length; i++)
        {
          long l = bo.getLong(paramString[i], 0L);
          a.e(this.mFK).a(65554, new a.v(this.mFK, l));
        }
        a.e(this.mFK).a(65556, new a.u(this.mFK, (byte)0));
      }
      AppMethodBeat.o(136653);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.4
 * JD-Core Version:    0.6.2
 */