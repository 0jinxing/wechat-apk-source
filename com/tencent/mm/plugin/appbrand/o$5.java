package com.tencent.mm.plugin.appbrand;

import com.tencent.magicbrush.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.game.preload.d;
import com.tencent.mm.plugin.appbrand.game.preload.d.2;
import com.tencent.mm.plugin.appbrand.game.preload.e;
import com.tencent.mm.plugin.appbrand.l.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class o$5
  implements Runnable
{
  o$5(o paramo)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(128982);
    d locald = d.aBz();
    JSONArray localJSONArray;
    int i;
    if (locald.htt)
    {
      if (!locald.hasInit)
      {
        ab.e("MicroMsg.WAGamePreloadManager", "hasn't init!");
        AppMethodBeat.o(128982);
      }
      while (true)
      {
        return;
        if (locald.htn == null)
          break label281;
        if (locald.htn.getAppConfig() != null)
          break;
        ab.e("MicroMsg.WAGamePreloadManager", "downloadPreloadFiles getAppConfig null!");
        AppMethodBeat.o(128982);
      }
      localJSONArray = locald.htn.getAppConfig().hfc;
      if (localJSONArray != null)
      {
        e.aBD().cY(3000, localJSONArray.length());
        i = 0;
      }
    }
    while (true)
    {
      JSONObject localJSONObject;
      String str;
      Object localObject;
      d.2 local2;
      try
      {
        if (i < localJSONArray.length())
        {
          localJSONObject = localJSONArray.getJSONObject(i);
          if (localJSONObject != null)
          {
            str = localJSONObject.optString("url");
            localObject = localJSONObject.optString("path");
            if ((!c.isNullOrNil(str)) && (!c.isNullOrNil((String)localObject)))
            {
              if (locald.htq.yd((String)localObject) != j.gXA)
                continue;
              ab.i("MicroMsg.WAGamePreloadManager", "predownload path %s has exists!", new Object[] { localObject });
            }
          }
          i++;
          continue;
          locald.hts.add(str);
          local2 = new com/tencent/mm/plugin/appbrand/game/preload/d$2;
          local2.<init>(locald, str, (String)localObject);
          if (locald.htp.bQy > 0)
            break label289;
          ab.i("MicroMsg.WAGamePreloadManager", "maxDownloadConcurrent <= 0 ");
          continue;
        }
      }
      catch (JSONException localJSONException)
      {
        ab.printErrStackTrace("MicroMsg.WAGamePreloadManager", localJSONException, "", new Object[0]);
      }
      ArrayList localArrayList = locald.htn.getAppConfig().hfd;
      if (localArrayList != null)
        e.aBD().cY(4000, localArrayList.size());
      locald.aBB();
      label281: AppMethodBeat.o(128982);
      break;
      label289: if (!d.a(locald.htp, str))
      {
        ab.e("MicroMsg.WAGamePreloadManager", "checkDomains error,url:%s", new Object[] { str });
      }
      else
      {
        localObject = new java/util/HashMap;
        ((HashMap)localObject).<init>();
        int j = locald.htp.hfK;
        locald.hto.a(localJSONObject, 60000, (Map)localObject, null, j, local2, d.aBA(), "test");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o.5
 * JD-Core Version:    0.6.2
 */