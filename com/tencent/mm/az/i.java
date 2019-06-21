package com.tencent.mm.az;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.sdk.e.k;

public final class i extends k
  implements j
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS oplog2 ( id INTEGER PRIMARY KEY , inserTime long , cmdId int , buffer blob , reserved1 int , reserved2 long , reserved3 text , reserved4 text ) " };
  h fni;

  public i(h paramh)
  {
    this.fni = paramh;
  }

  public final boolean b(j.b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(990);
    if (paramb == null)
      AppMethodBeat.o(990);
    while (true)
    {
      return bool;
      if (this.fni.delete("oplog2", "id= ? AND inserTime= ?", new String[] { paramb.id, paramb.fCv }) >= 0)
      {
        AppMethodBeat.o(990);
      }
      else
      {
        AppMethodBeat.o(990);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.i
 * JD-Core Version:    0.6.2
 */