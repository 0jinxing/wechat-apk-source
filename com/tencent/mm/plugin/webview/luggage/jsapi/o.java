package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class o extends bc<n>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<n>.a parama)
  {
    AppMethodBeat.i(6310);
    ab.i("Micromsg.JsApiGetInstallState", "invokeInOwn");
    Object localObject1 = parama.bPa.bOf;
    Object localObject3 = ((n)parama.bOZ).mContext;
    JSONArray localJSONArray = ((JSONObject)localObject1).optJSONArray("packageName");
    Object localObject4;
    int i;
    label118: label254: Object localObject2;
    if (localJSONArray != null)
    {
      JSONObject localJSONObject = new JSONObject();
      localObject4 = new JSONObject();
      i = 0;
      int j = 0;
      while (true)
      {
        int k = i;
        int m = i;
        try
        {
          if (j < localJSONArray.length())
          {
            k = i;
            String str = localJSONArray.optString(j);
            k = i;
            localObject1 = b.getPackageInfo((Context)localObject3, str);
            int n;
            if (localObject1 == null)
            {
              n = 0;
              if (localObject1 != null)
                break label254;
            }
            for (localObject1 = "null"; ; localObject1 = ((PackageInfo)localObject1).versionName)
            {
              k = i;
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              k = i;
              localStringBuilder.<init>("getInstallState, packageName = ");
              k = i;
              ab.i("Micromsg.JsApiGetInstallState", str + ", version = " + n + ", versionName = " + (String)localObject1);
              m = i;
              if (i == 0)
              {
                m = i;
                if (n > 0)
                  m = 1;
              }
              k = m;
              localJSONObject.put(str, n);
              k = m;
              ((JSONObject)localObject4).put(str, localObject1);
              j++;
              i = m;
              break;
              k = i;
              n = ((PackageInfo)localObject1).versionCode;
              break label118;
              k = i;
            }
          }
        }
        catch (Exception localException)
        {
          m = k;
          localObject2 = new HashMap();
          ((HashMap)localObject2).put("result", localJSONObject.toString());
          ((HashMap)localObject2).put("versionName", ((JSONObject)localObject4).toString());
          if (m == 0)
            break label322;
        }
      }
      parama.c("get_install_state:yes", (Map)localObject2);
      AppMethodBeat.o(6310);
    }
    while (true)
    {
      return;
      label322: parama.a("get_install_state:no", null);
      AppMethodBeat.o(6310);
      continue;
      localObject4 = ((JSONObject)localObject2).optString("packageName");
      if (bo.isNullOrNil((String)localObject4))
      {
        ab.i("Micromsg.JsApiGetInstallState", "packageName is null or nil");
        parama.a("get_install_state:no_null_packageName", null);
        AppMethodBeat.o(6310);
      }
      else
      {
        localObject3 = b.getPackageInfo((Context)localObject3, (String)localObject4);
        if (localObject3 == null)
        {
          i = 0;
          label391: if (localObject3 != null)
            break label468;
        }
        label468: for (localObject2 = "null"; ; localObject2 = ((PackageInfo)localObject3).versionName)
        {
          ab.i("Micromsg.JsApiGetInstallState", "doGetInstallState, packageName = " + (String)localObject4 + ", version = " + i + ", versionName = " + (String)localObject2);
          if (localObject3 != null)
            break label476;
          parama.a("get_install_state:no", null);
          AppMethodBeat.o(6310);
          break;
          i = ((PackageInfo)localObject3).versionCode;
          break label391;
        }
        label476: localObject4 = new HashMap();
        ((Map)localObject4).put("versionName", localObject2);
        parama.c("get_install_state:yes_".concat(String.valueOf(i)), (Map)localObject4);
        AppMethodBeat.o(6310);
      }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "getInstallState";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.o
 * JD-Core Version:    0.6.2
 */