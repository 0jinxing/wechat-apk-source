package com.tencent.mm.plugin.appbrand.backgroundfetch;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.appusage.af.a;
import com.tencent.mm.plugin.appbrand.appusage.w;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class b$1
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(129759);
    Object localObject1 = ((af)com.tencent.mm.kernel.g.K(af.class)).a(2147483647, af.a.haM);
    if ((localObject1 == null) || (((List)localObject1).isEmpty()))
    {
      ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "worker:peroidFetchDataWhenAppEnterForground, no star apps");
      AppMethodBeat.o(129759);
      return;
    }
    ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "worker:peroidFetchDataWhenAppEnterForground, star list size:%d", new Object[] { Integer.valueOf(((List)localObject1).size()) });
    HashMap localHashMap = new HashMap();
    localObject1 = ((List)localObject1).iterator();
    label88: LocalUsageInfo localLocalUsageInfo;
    String str1;
    int i;
    Object localObject2;
    int j;
    while (((Iterator)localObject1).hasNext())
    {
      localLocalUsageInfo = (LocalUsageInfo)((Iterator)localObject1).next();
      if (!localHashMap.containsKey(localLocalUsageInfo.username))
      {
        str1 = localLocalUsageInfo.username;
        i = localLocalUsageInfo.har;
        localObject2 = p.zi(str1);
        if ((localObject2 != null) && (((a)localObject2).hbW))
          break label245;
        ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "canPeriodFetchData, app(%s_v%d) can not period fetch data", new Object[] { str1, Integer.valueOf(i) });
        j = 0;
      }
    }
    label401: label419: 
    while (true)
      label179: label446: if (j != 0)
      {
        localHashMap.put(localLocalUsageInfo.username, localLocalUsageInfo.appId);
        if (localHashMap.size() < 10)
          break label88;
        ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "worker:peroidFetchDataWhenAppEnterForground, batch list full");
        if (localHashMap.isEmpty())
          break label661;
        b.a(localHashMap, new g());
        AppMethodBeat.o(129759);
        break;
        label245: if (!b.aO(str1, i))
        {
          ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "canPeriodFetchData, app(%s_v%d) is not star app", new Object[] { str1, Integer.valueOf(i) });
          j = 0;
        }
        else
        {
          j = ((a)localObject2).hbX;
          if (j >= 2)
          {
            l = ((h)com.tencent.mm.kernel.g.K(h.class)).aQ(str1, 1);
            if (l <= 0L)
              j = 1;
          }
          while (true)
          {
            if (j != 0)
              break label401;
            ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "canPeriodFetchData, app(%s_v%d) interval(%d) not ok", new Object[] { str1, Integer.valueOf(i), Integer.valueOf(((a)localObject2).hbX) });
            j = 0;
            break;
            if (bo.anU() - l >= j * 3600000L)
              j = 1;
            else
              j = 0;
          }
          localObject2 = f.auT();
          if (bo.isNullOrNil(str1))
            l = -1L;
          while (true)
            if ((l > 0L) && (bo.anU() - l * 1000L <= 604800000L))
            {
              j = 1;
              if (j != 0)
                break label631;
              ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "canPeriodFetchData, app(%s_v%d) recently not used", new Object[] { str1, Integer.valueOf(i) });
              j = 0;
              break;
              com.tencent.mm.cd.h localh = ((w)localObject2).hae;
              String str2 = String.format(Locale.US, "%s=? and %s=? and %s=?", new Object[] { "brandId", "versionType", "scene" });
              localObject2 = String.format(Locale.US, " %s desc ", new Object[] { "updateTime" });
              localObject2 = localh.query("AppBrandLauncherLayoutItem", new String[] { "updateTime" }, str2, new String[] { str1, String.valueOf(i), "2" }, null, null, (String)localObject2);
              if (localObject2 == null)
                l = -1L;
              else
                if (!((Cursor)localObject2).moveToFirst())
                  break label676;
            }
        }
      }
    label661: label676: for (long l = ((Cursor)localObject2).getLong(0); ; l = -1L)
    {
      ((Cursor)localObject2).close();
      break label419;
      j = 0;
      break label446;
      label631: ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "canPeriodFetchData, app(%s_v%d) can period fetch data", new Object[] { str1, Integer.valueOf(i) });
      j = 1;
      break label179;
      break label88;
      ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "worker:peroidFetchDataWhenAppEnterForground, currently no app needs to update period data");
      AppMethodBeat.o(129759);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.backgroundfetch.b.1
 * JD-Core Version:    0.6.2
 */