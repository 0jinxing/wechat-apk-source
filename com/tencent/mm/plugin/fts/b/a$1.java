package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.HashMap;
import java.util.HashSet;

final class a$1
  implements n.b
{
  a$1(a parama)
  {
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(136650);
    paramn = (String)paramObject;
    if (!a.Nk(paramn))
    {
      ab.i("MicroMsg.FTS.FTS5SearchContactLogic", "onConversationChangeListener filterByUsername %s", new Object[] { paramn });
      AppMethodBeat.o(136650);
    }
    while (true)
    {
      return;
      paramObject = ((j)g.K(j.class)).XM().aoI(paramn);
      if ((paramObject == null) || ((a.G(paramObject)) && (!paramObject.dsf())))
        break;
      ab.i("MicroMsg.FTS.FTS5SearchContactLogic", "onContactChangedListener hit cache and filter contact %s", new Object[] { paramn });
      AppMethodBeat.o(136650);
    }
    switch (paramInt)
    {
    case 4:
    default:
    case 2:
    case 5:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(136650);
      break;
      if (!a.b(this.mFK).containsKey(paramn))
      {
        a.e(this.mFK).a(65556, new a.h(this.mFK, paramn));
        AppMethodBeat.o(136650);
        break;
        if ((!a.c(this.mFK).contains(paramn)) && (!a.b(this.mFK).containsKey(paramn)))
          a.e(this.mFK).a(65556, new a.i(this.mFK, paramn));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.1
 * JD-Core Version:    0.6.2
 */