package com.tencent.mm.plugin.wepkg.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.b.f;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessTask;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.Iterator;
import java.util.List;

final class b$1
  implements Runnable
{
  b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63501);
    Object localObject1 = ah.getContext().getSharedPreferences("we_pkg_sp", 0);
    long l1 = ((SharedPreferences)localObject1).getLong("clean_wepkg_time", 0L);
    Object localObject2;
    if (System.currentTimeMillis() - l1 > 86400000L)
    {
      i = 1;
      if (i == 0)
        break label211;
      ab.i("MicroMsg.Wepkg.CleanWepkgMgr", "clean wepkg in one day");
      ((SharedPreferences)localObject1).edit().putLong("clean_wepkg_time", System.currentTimeMillis()).commit();
      localObject2 = new WepkgCrossProcessTask();
      ((WepkgCrossProcessTask)localObject2).Cn = 2005;
      if (!ah.bqo())
        break label195;
      ((WepkgCrossProcessTask)localObject2).asP();
    }
    while (true)
    {
      localObject2 = ((WepkgCrossProcessTask)localObject2).uWZ;
      if (bo.ek((List)localObject2))
        break label204;
      ab.i("MicroMsg.Wepkg.CleanWepkgMgr", "need to clean list.size:%s", new Object[] { Integer.valueOf(((List)localObject2).size()) });
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        WepkgVersion localWepkgVersion = (WepkgVersion)((Iterator)localObject2).next();
        if (localWepkgVersion != null)
          b.dQ(localWepkgVersion.eBS, 2);
      }
      i = 0;
      break;
      label195: WepkgMainProcessService.b((WepkgMainProcessTask)localObject2);
    }
    label204: ab.i("MicroMsg.Wepkg.CleanWepkgMgr", "no need to clean wepkg");
    label211: l1 = ((SharedPreferences)localObject1).getLong("clean_dirty_wepkg_time", 0L);
    if (System.currentTimeMillis() - l1 > 172800000L)
    {
      i = 1;
      if (i != 0)
      {
        ab.i("MicroMsg.Wepkg.CleanWepkgMgr", "start clean dirty wepkg");
        ((SharedPreferences)localObject1).edit().putLong("clean_dirty_wepkg_time", System.currentTimeMillis()).commit();
        b.dgB();
      }
      l1 = ((SharedPreferences)localObject1).getLong("clean_extra_wepkg_time", 0L);
      if (System.currentTimeMillis() - l1 <= 3600000L)
        break label406;
    }
    label406: for (int i = 1; ; i = 0)
    {
      if (i == 0)
        break label475;
      ((SharedPreferences)localObject1).edit().putLong("clean_extra_wepkg_time", System.currentTimeMillis()).commit();
      long l2 = System.currentTimeMillis();
      l1 = b.a(this.uWK, new File(c.uWL));
      ab.i("MicroMsg.Wepkg.CleanWepkgMgr", "local wepkg size: %d, cost time: %d", new Object[] { Long.valueOf(l1), Long.valueOf(System.currentTimeMillis() - l2) });
      localObject2 = f.dgp().dgr();
      if (!bo.ek((List)localObject2))
        break label490;
      AppMethodBeat.o(63501);
      return;
      i = 0;
      break;
    }
    label475: label490: 
    while (true)
      if ((l1 > 104857600L) && (((List)localObject2).size() > 0))
      {
        localObject1 = (String)((List)localObject2).remove(0);
        if (!bo.isNullOrNil((String)localObject1))
        {
          b.dQ((String)localObject1, 2);
          l1 = b.a(this.uWK, new File(c.uWL));
        }
      }
      else
      {
        ab.i("MicroMsg.Wepkg.CleanWepkgMgr", "clean wepkg finish!");
        AppMethodBeat.o(63501);
        break;
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.model.b.1
 * JD-Core Version:    0.6.2
 */