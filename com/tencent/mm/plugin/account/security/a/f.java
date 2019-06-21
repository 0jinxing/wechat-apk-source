package com.tencent.mm.plugin.account.security.a;

import android.content.Context;
import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.protobuf.act;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.z;

public final class f
{
  public static String aqE()
  {
    AppMethodBeat.i(69844);
    String str = Build.MANUFACTURER + "-" + Build.MODEL;
    AppMethodBeat.o(69844);
    return str;
  }

  public static String cz(Context paramContext)
  {
    AppMethodBeat.i(69843);
    if (paramContext == null)
      if (com.tencent.mm.sdk.platformtools.g.xyg)
      {
        paramContext = ah.getContext().getString(2131302677);
        AppMethodBeat.o(69843);
      }
    while (true)
    {
      return paramContext;
      paramContext = ah.getContext().getString(2131302676);
      AppMethodBeat.o(69843);
      continue;
      if (com.tencent.mm.sdk.platformtools.g.xyg)
      {
        paramContext = paramContext.getString(2131302677);
        AppMethodBeat.o(69843);
      }
      else
      {
        paramContext = paramContext.getString(2131302676);
        AppMethodBeat.o(69843);
      }
    }
  }

  public static void n(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(69842);
    if (!com.tencent.mm.kernel.g.RK())
    {
      AppMethodBeat.o(69842);
      return;
    }
    int i = r.YF();
    label31: act localact;
    if (paramBoolean1)
    {
      i |= 16384;
      com.tencent.mm.kernel.g.RP().Ry().set(40, Integer.valueOf(i));
      if (paramBoolean2)
      {
        localact = new act();
        localact.wkw = 28;
        if (!paramBoolean1)
          break label128;
      }
    }
    label128: for (i = 1; ; i = 2)
    {
      localact.pvD = i;
      ((j)com.tencent.mm.kernel.g.K(j.class)).XL().c(new j.a(23, localact));
      a.gkF.BS();
      AppMethodBeat.o(69842);
      break;
      i &= -16385;
      break label31;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.a.f
 * JD-Core Version:    0.6.2
 */