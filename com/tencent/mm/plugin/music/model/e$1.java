package com.tencent.mm.plugin.music.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.c.db;
import com.tencent.mm.sdk.e.j;

final class e$1
  implements h.d
{
  e$1(e parame)
  {
  }

  public final String[] Af()
  {
    AppMethodBeat.i(104892);
    String str = j.a(db.Hm(), "Music");
    AppMethodBeat.o(104892);
    return new String[] { str };
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.e.1
 * JD-Core Version:    0.6.2
 */