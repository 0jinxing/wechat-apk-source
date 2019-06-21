package com.tencent.mm.plugin.appbrand.debugger;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.h;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.at;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.appcache.y;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

final class d$1
  implements Runnable
{
  d$1(d paramd, String paramString1, String paramString2, int paramInt, String paramString3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(129942);
    String str1 = this.val$appId;
    Object localObject1 = this.hjg;
    int i = this.hjh;
    Object localObject2;
    int j;
    if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty((CharSequence)localObject1)))
    {
      localObject2 = this.val$appId;
      str1 = this.hji;
      j = this.hjh;
      if ((!TextUtils.isEmpty((CharSequence)localObject2)) && (!TextUtils.isEmpty(str1)))
        break label194;
      AppMethodBeat.o(129942);
    }
    while (true)
    {
      Object localObject3;
      String str2;
      Object localObject4;
      while (true)
      {
        return;
        try
        {
          localObject3 = h.lw((String)localObject1);
          localObject2 = ((JSONObject)localObject3).keys();
          while (((Iterator)localObject2).hasNext())
          {
            str2 = (String)((Iterator)localObject2).next();
            localObject4 = new com/tencent/mm/plugin/appbrand/appcache/y;
            ((y)localObject4).<init>(str1, str2);
            localObject4 = f.auV().a(((y)localObject4).toString(), 0, i, new String[0]);
            if (localObject4 != null)
            {
              ((at)localObject4).field_downloadURL = ((JSONObject)localObject3).optString(str2);
              f.auV().c((at)localObject4);
            }
          }
        }
        catch (Throwable localThrowable2)
        {
          ab.printErrStackTrace("MicroMsg.AppBrand.ForceOpenAppNotify", localThrowable2, "processSubUrlsAndSave appId[%s], json[%s]", new Object[] { str1, localObject1 });
        }
      }
      break;
      try
      {
        label194: localObject3 = new org/json/JSONArray;
        ((JSONArray)localObject3).<init>(str1);
        i = 0;
        if (i >= ((JSONArray)localObject3).length())
          break label361;
        localObject4 = ((JSONArray)localObject3).getJSONObject(i);
        int k = ((JSONObject)localObject4).optInt("pkgType");
        str2 = ((JSONObject)localObject4).optString("url");
        localObject1 = null;
        if (k == 12)
        {
          localObject1 = new com/tencent/mm/plugin/appbrand/appcache/y;
          ((y)localObject1).<init>(localThrowable2, "__WITHOUT_CODELIB__", k);
        }
        while (true)
        {
          localObject1 = f.auV().a(((y)localObject1).toString(), 0, j, new String[0]);
          if (localObject1 != null)
          {
            ((at)localObject1).field_downloadURL = str2;
            f.auV().c((at)localObject1);
          }
          i++;
          break;
          if (k == 13)
            localObject1 = new y(localThrowable2, ((JSONObject)localObject4).getString("moduleName"), k);
        }
      }
      catch (Throwable localThrowable1)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.ForceOpenAppNotify", localThrowable1, "processWithoutCodeLibUrlsAndSave withoutCodeLibUrls[%s]", new Object[] { str1 });
        AppMethodBeat.o(129942);
      }
      continue;
      label361: AppMethodBeat.o(129942);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.d.1
 * JD-Core Version:    0.6.2
 */