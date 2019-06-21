package com.tencent.mm.plugin.wepkg.downloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.vv;
import com.tencent.mm.kernel.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class i$a extends BroadcastReceiver
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(63453);
    if ((!com.tencent.mm.kernel.g.RK()) || (com.tencent.mm.kernel.a.QT()))
    {
      ab.e("MicroMsg.Wepkg.WepkgAutoDownloader", "acc has not ready");
      AppMethodBeat.o(63453);
    }
    while (true)
    {
      return;
      i = at.getNetType(ah.getContext());
      if (i != i.access$100())
        break;
      AppMethodBeat.o(63453);
    }
    i.tO(i);
    ab.i("MicroMsg.Wepkg.WepkgAutoDownloader", "onNetStateChange, netState = ".concat(String.valueOf(i)));
    boolean bool;
    if (i == 0)
    {
      bool = com.tencent.mm.m.g.Nv().Ni();
      if (bo.fp(bo.c((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xSx, Long.valueOf(0L)))) <= 1800L)
        break label344;
    }
    label344: for (int i = 1; ; i = 0)
    {
      if (i == 0)
        ab.i("MicroMsg.Wepkg.WepkgAutoDownloader", "dont auto download in wifi, because from the last time is not enough for %s s", new Object[] { Long.valueOf(1800L) });
      if ((!bool) && (i != 0))
      {
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xSx, Long.valueOf(bo.anT()));
        paramContext = new vv();
        paramContext.cSX.cuy = 0;
        com.tencent.mm.sdk.b.a.xxA.m(paramContext);
      }
      AppMethodBeat.o(63453);
      break;
      paramContext = d.dgw();
      if ((paramContext.uVY == null) || (paramContext.uVY.size() == 0))
      {
        AppMethodBeat.o(63453);
        break;
      }
      Object localObject = paramContext.uVY.values();
      paramIntent = new ArrayList();
      localObject = ((Collection)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        paramIntent.add((c)((Iterator)localObject).next());
      Iterator localIterator = paramIntent.iterator();
      while (localIterator.hasNext())
      {
        localObject = (c)localIterator.next();
        if (((c)localObject).uVO.uWt)
          paramContext.a((c)localObject);
      }
      paramIntent.clear();
      AppMethodBeat.o(63453);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.downloader.i.a
 * JD-Core Version:    0.6.2
 */