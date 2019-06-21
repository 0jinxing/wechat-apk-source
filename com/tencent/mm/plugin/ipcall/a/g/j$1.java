package com.tencent.mm.plugin.ipcall.a.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.platformtools.ab;

final class j$1 extends n
{
  j$1(j paramj)
  {
  }

  public final boolean apK()
  {
    boolean bool = true;
    AppMethodBeat.i(21937);
    Object localObject;
    if ((j.a(this.nzE) == null) || (j.a(this.nzE).dpU()))
      if (j.a(this.nzE) == null)
      {
        localObject = "null";
        ab.w("MicroMsg.IPCallPopularCountryStorage", "shouldProcessEvent db is close :%s", new Object[] { localObject });
        AppMethodBeat.o(21937);
        bool = false;
      }
    while (true)
    {
      return bool;
      localObject = Boolean.valueOf(j.a(this.nzE).dpU());
      break;
      AppMethodBeat.o(21937);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.g.j.1
 * JD-Core Version:    0.6.2
 */