package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import java.util.HashMap;

final class a$3
  implements k.a
{
  a$3(a parama)
  {
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(136652);
    if ((paramString.equals("*")) || (paramString.equals("chatroomname")))
      AppMethodBeat.o(136652);
    while (true)
    {
      return;
      if (!a.b(this.mFK).containsKey(paramString))
        a.e(this.mFK).a(65556, new a.h(this.mFK, paramString));
      AppMethodBeat.o(136652);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.3
 * JD-Core Version:    0.6.2
 */