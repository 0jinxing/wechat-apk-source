package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.k;
import com.tencent.mm.g.a.ag;
import com.tencent.mm.g.a.ag.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

public final class c extends com.tencent.mm.sdk.b.c<ag>
{
  public c()
  {
    AppMethodBeat.i(108323);
    this.xxI = ag.class.getName().hashCode();
    AppMethodBeat.o(108323);
  }

  private static boolean a(ag paramag)
  {
    AppMethodBeat.i(108324);
    if (paramag.ctc.cte == 0);
    try
    {
      int i = r.YK() | 0x1000;
      g.RP().Ry().set(34, Integer.valueOf(i));
      paramag = ((j)g.K(j.class)).XL();
      k localk = new com/tencent/mm/az/k;
      localk.<init>("", "", "", "", "", "", "", "", i, "", "");
      paramag.c(localk);
      ab.d("MicroMsg.FriendBindQQ.EventListener", "doClearQQFriendHelper succ ");
      AppMethodBeat.o(108324);
      return false;
    }
    catch (Exception paramag)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.FriendBindQQ.EventListener", paramag, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.c
 * JD-Core Version:    0.6.2
 */