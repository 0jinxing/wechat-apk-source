package com.tencent.mm.plugin.fav.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements k.a
{
  b$1(b paramb)
  {
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(5301);
    if (paramm == null)
      AppMethodBeat.o(5301);
    int i;
    long l;
    while (true)
    {
      return;
      i = paramm.hsh;
      if (paramm.obj == null)
      {
        AppMethodBeat.o(5301);
      }
      else
      {
        l = ((Long)paramm.obj).longValue();
        if (l >= 0L)
          break;
        AppMethodBeat.o(5301);
      }
    }
    ab.i("MicroMsg.FTS.FTS5SearchFavoriteLogic", "EventData: %s", new Object[] { paramm });
    switch (i)
    {
    case 4:
    default:
    case 2:
    case 3:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(5301);
      break;
      this.mgH.eAX.a(65576, new b.d(this.mgH, l, (byte)0));
      AppMethodBeat.o(5301);
      break;
      this.mgH.eAX.a(65576, new b.b(this.mgH, l));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.a.b.1
 * JD-Core Version:    0.6.2
 */