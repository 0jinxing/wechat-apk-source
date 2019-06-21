package com.tencent.mm.sandbox.updater;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cj.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.xweb.b.d;
import java.util.HashMap;

public final class k
  implements a
{
  private k()
  {
    AppMethodBeat.i(28999);
    c.iw(ah.getContext());
    d.a(com.tencent.mm.plugin.cdndownloader.i.a.bfd());
    AppMethodBeat.o(28999);
  }

  public final boolean aJ(Intent paramIntent)
  {
    boolean bool = false;
    AppMethodBeat.i(28997);
    if (paramIntent == null)
    {
      AppMethodBeat.o(28997);
      return bool;
    }
    int i = paramIntent.getIntExtra("intent_extra_download_type", 4);
    ab.i("MicroMsg.WCWebDownloadMgr", "WCWebDownloadMgr  downloadType = %d", new Object[] { Integer.valueOf(i) });
    paramIntent = new HashMap();
    if (i == 5)
      paramIntent.put("UpdaterCheckType", "1");
    while (true)
    {
      com.tencent.xweb.k.a(ah.getContext(), paramIntent);
      AppMethodBeat.o(28997);
      bool = true;
      break;
      paramIntent.put("UpdaterCheckType", "0");
    }
  }

  public final boolean isBusy()
  {
    AppMethodBeat.i(28998);
    boolean bool = com.tencent.xweb.k.isBusy();
    ab.i("MicroMsg.WCWebDownloadMgr", "bIsBusy = ".concat(String.valueOf(bool)));
    AppMethodBeat.o(28998);
    return bool;
  }

  public final void onDestroy()
  {
  }

  public final void pc(boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.k
 * JD-Core Version:    0.6.2
 */