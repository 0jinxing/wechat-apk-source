package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import java.util.HashMap;

final class a$2
  implements n.b
{
  a$2(a parama)
  {
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(136651);
    paramn = (String)paramObject;
    if (!a.Nk(paramn))
    {
      ab.i("MicroMsg.FTS.FTS5SearchContactLogic", "onContactChangedListener filterByUsername %s", new Object[] { paramn });
      AppMethodBeat.o(136651);
    }
    while (true)
    {
      return;
      paramObject = ((j)g.K(j.class)).XM().aoI(paramn);
      if ((paramObject == null) || (a.G(paramObject)))
        break;
      ab.i("MicroMsg.FTS.FTS5SearchContactLogic", "onContactChangedListener hit cache and filter contact %s", new Object[] { paramn });
      AppMethodBeat.o(136651);
    }
    switch (paramInt)
    {
    default:
    case 3:
    case 4:
    case 2:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(136651);
      break;
      if (!a.b(this.mFK).containsKey(paramn))
      {
        a.e(this.mFK).a(65556, new a.h(this.mFK, paramn));
        AppMethodBeat.o(136651);
        break;
        a.e(this.mFK).a(65556, new a.e(this.mFK, paramn));
        AppMethodBeat.o(136651);
        break;
        a.e(this.mFK).a(65556, new a.d(this.mFK, paramn));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.2
 * JD-Core Version:    0.6.2
 */