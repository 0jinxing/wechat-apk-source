package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.platformtools.ab;

final class o$1 extends n
{
  o$1(o paramo)
  {
  }

  public final boolean apK()
  {
    boolean bool = true;
    AppMethodBeat.i(108387);
    Object localObject;
    if ((o.a(this.gvD) == null) || (o.a(this.gvD).dpU()))
      if (o.a(this.gvD) == null)
      {
        localObject = "null";
        ab.w("MicroMsg.GoogleContact.GoogleFriendUI", "shouldProcessEvent db is close :%s", new Object[] { localObject });
        AppMethodBeat.o(108387);
        bool = false;
      }
    while (true)
    {
      return bool;
      localObject = Boolean.valueOf(o.a(this.gvD).dpU());
      break;
      AppMethodBeat.o(108387);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.o.1
 * JD-Core Version:    0.6.2
 */