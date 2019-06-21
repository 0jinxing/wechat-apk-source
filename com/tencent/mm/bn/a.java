package com.tencent.mm.bn;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.e;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  public static boolean dgL()
  {
    AppMethodBeat.i(55524);
    String str1 = ((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("EnableStrangerChat");
    String str2 = str1;
    if (bo.isNullOrNil(str1))
      str2 = "0";
    boolean bool = "1".equals(str2);
    AppMethodBeat.o(55524);
    return bool;
  }

  public static void fy(Context paramContext)
  {
    AppMethodBeat.i(55525);
    if (!dgL())
    {
      g.RN().QU();
      if (((j)g.K(j.class)).bOo().baS() > 0)
      {
        d.H(paramContext, "nearby", ".ui.NearbyFriendShowSayHiUI");
        AppMethodBeat.o(55525);
      }
    }
    while (true)
    {
      return;
      d.H(paramContext, "nearby", ".ui.NearbyFriendsUI");
      AppMethodBeat.o(55525);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bn.a
 * JD-Core Version:    0.6.2
 */