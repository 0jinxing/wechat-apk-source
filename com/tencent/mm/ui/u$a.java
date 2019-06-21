package com.tencent.mm.ui;

import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.h.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.ui.tools.h;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

public final class u$a
{
  public static boolean a(Context paramContext, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    AppMethodBeat.i(29608);
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    label332: 
    while (true)
    {
      AppMethodBeat.o(29608);
      boolean bool = false;
      while (true)
      {
        return bool;
        if (((paramInt3 & 0x2) != 0) && (aw.Rg().acT()))
        {
          aw.Rg().getNetworkServerIp();
          new StringBuilder().append(paramInt2);
        }
        while (true)
        {
          AppMethodBeat.o(29608);
          bool = true;
          break;
          if ((((paramInt3 & 0x1) == 0) || (!com.tencent.mm.network.ab.ch(paramContext)) || (!h.fR(paramContext))) && (((paramInt3 & 0x4) == 0) || (!at.isWap(paramContext)) || (!MMAppMgr.hr(paramContext))))
            Toast.makeText(paramContext, paramContext.getString(2131299945, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2) }), 1).show();
        }
        Toast.makeText(paramContext, paramContext.getString(2131299946, new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt2) }), 1).show();
        AppMethodBeat.o(29608);
        bool = true;
        continue;
        AppMethodBeat.o(29608);
        bool = true;
      }
      a locala = a.jY(paramString);
      if (locala != null)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MMErrorProcessor", "summertips errCode[%d], showType[%d], url[%s], desc[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(locala.showType), locala.url, locala.desc });
        if (!bo.isNullOrNil(locala.url));
        for (paramString = new u.a.1(locala, paramContext); ; paramString = null)
        {
          if (!locala.a(paramContext, paramString, null))
            break label332;
          AppMethodBeat.o(29608);
          bool = true;
          break;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.u.a
 * JD-Core Version:    0.6.2
 */