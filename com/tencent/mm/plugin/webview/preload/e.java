package com.tencent.mm.plugin.webview.preload;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.h;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.e.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
{
  private static List<String> upZ;
  private static List<String> uqa;

  static
  {
    AppMethodBeat.i(7056);
    ArrayList localArrayList = new ArrayList();
    upZ = localArrayList;
    localArrayList.add("request");
    upZ.add("updatePageAuth");
    upZ.add("notifyPageInfo");
    uqa = new ArrayList();
    AppMethodBeat.o(7056);
  }

  private static boolean a(final i parami, final e.a parama)
  {
    AppMethodBeat.i(7051);
    a.kT(70);
    String str1 = bo.bc((String)parami.puc.get("key_request_full_url_query"), "");
    String str2 = str1;
    if (!bo.isNullOrNil(str1))
      str2 = String.format("&wx_header=1&pass_ticket=%s", new Object[] { str1 });
    final String str3 = parami.puc.get("url") + str2;
    str1 = bo.bc((String)parami.puc.get("method"), "GET");
    str2 = bo.bc((String)parami.puc.get("header"), "");
    final String str4 = (String)parami.puc.get("data");
    ab.i("MicroMsg.TmplWebViewJsAPi", "[doRequest]url:%s", new Object[] { str3 });
    Object localObject1 = bo.bc((String)parami.puc.get("key_request_header"), "");
    final HashMap localHashMap = new HashMap();
    Object localObject2;
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>((String)localObject1);
      localObject2 = localJSONObject.keys();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (String)((Iterator)localObject2).next();
        localHashMap.put(localObject1, localJSONObject.optString((String)localObject1));
      }
    }
    catch (JSONException localJSONException)
    {
      ab.c("MicroMsg.TmplWebViewJsAPi", "", new Object[] { localJSONException });
    }
    while (true)
    {
      ab.d("MicroMsg.TmplWebViewJsAPi", "[doRequest]url:%s, method:%s, header:%s, data:%s", new Object[] { str3, str1, str2, str4 });
      com.tencent.mm.plugin.webview.a.a.R(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(7047);
          d.a locala;
          int j;
          if (this.uqb.toUpperCase().equals("POST"))
          {
            locala = d.a(str3, localHashMap, str4);
            if (locala == null)
              break label298;
            int i = locala.statusCode;
            if (locala.ipC == null)
              break label293;
            j = locala.ipC.size();
            label63: ab.i("MicroMsg.TmplWebViewJsAPi", "[doRequest]resonse stats:%d, header.size:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            ab.v("MicroMsg.TmplWebViewJsAPi", "[doRequest]resonse header:%s data:%s", new Object[] { locala.ipC, locala.data });
            a.kT(71);
            HashMap localHashMap = new HashMap();
            localHashMap.put("statusCode", Integer.valueOf(locala.statusCode));
            localHashMap.put("data", locala.data);
            if ((locala.ipC != null) && (locala.ipC.size() > 0))
            {
              e.aH(locala.ipC);
              localHashMap.put("header", new JSONObject(locala.ipC).toString());
            }
            ab.i("MicroMsg.TmplWebViewJsAPi", "[doRequest]values success");
            ab.d("MicroMsg.TmplWebViewJsAPi", "[doRequest]values:%s", new Object[] { localHashMap });
            parama.a(parami, parami.uIJ + ":ok", localHashMap);
            AppMethodBeat.o(7047);
          }
          while (true)
          {
            return;
            locala = d.w(str3, localHashMap);
            break;
            label293: j = 0;
            break label63;
            label298: a.kT(72);
            ab.i("MicroMsg.TmplWebViewJsAPi", "[doRequest]resonse is null, return");
            parama.a(parami, parami.uIJ + ":fail", null);
            AppMethodBeat.o(7047);
          }
        }
      });
      AppMethodBeat.o(7051);
      return true;
      localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>(str2);
      localObject1 = ((JSONObject)localObject2).keys();
      while (((Iterator)localObject1).hasNext())
      {
        String str5 = (String)((Iterator)localObject1).next();
        localHashMap.put(str5, ((JSONObject)localObject2).optString(str5));
      }
    }
  }

  public static boolean a(i parami, com.tencent.mm.plugin.webview.stub.e parame, e.a parama)
  {
    AppMethodBeat.i(7050);
    boolean bool;
    if (parami.uIJ.equals("request"))
    {
      bool = a(parami, parama);
      AppMethodBeat.o(7050);
    }
    while (true)
    {
      return bool;
      if (parami.uIJ.equals("updatePageAuth"))
      {
        bool = b(parami, parame, parama);
        AppMethodBeat.o(7050);
      }
      else if (parami.uIJ.equals("notifyPageInfo"))
      {
        bool = c(parami, parame, parama);
        AppMethodBeat.o(7050);
      }
      else
      {
        parama.a(parami, parami.uIJ + ":fail", null);
        bool = true;
        AppMethodBeat.o(7050);
      }
    }
  }

  public static boolean afb(String paramString)
  {
    AppMethodBeat.i(7049);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.TmplWebViewJsAPi", "[needProcess]function is null, err");
      bool = false;
      AppMethodBeat.o(7049);
    }
    while (true)
    {
      return bool;
      bool = upZ.contains(paramString);
      AppMethodBeat.o(7049);
    }
  }

  private static boolean b(i parami, com.tencent.mm.plugin.webview.stub.e parame, e.a parama)
  {
    AppMethodBeat.i(7053);
    a.kT(80);
    boolean bool;
    if (parame == null)
    {
      ab.e("MicroMsg.TmplWebViewJsAPi", "[updatePageAuth] callbacker is null, err");
      a.kT(82);
      parama.a(parami, "updatePageAuth:fail", null);
      bool = false;
      AppMethodBeat.o(7053);
    }
    while (true)
    {
      return bool;
      try
      {
        Object localObject = parame.g(90003, null);
        if (localObject != null)
        {
          String str = ((Bundle)localObject).getString("geta8key_data_req_url");
          if (uqa.contains(str))
          {
            ab.e("MicroMsg.TmplWebViewJsAPi", "[updatePageAuth] updatePageAuth fail, url:%s already run");
            parama.a(parami, "updatePageAuth:fail updating", null);
            a.kT(82);
            bool = false;
            AppMethodBeat.o(7053);
            continue;
          }
          uqa.add(str);
          h localh = new com/tencent/mm/modelsimple/h;
          localh.<init>(str, ((Bundle)localObject).getString("geta8key_data_username"), ((Bundle)localObject).getInt("geta8key_data_scene"), ((Bundle)localObject).getInt("geta8key_data_reason"), ((Bundle)localObject).getInt("geta8key_data_flag"), ((Bundle)localObject).getString("geta8key_data_net_type"), ((Bundle)localObject).getInt("geta8key_session_id", 0), ((Bundle)localObject).getString("geta8key_data_appid"), ((Bundle)localObject).getString("key_function_id"), ((Bundle)localObject).getInt("key_wallet_region", 0), ((Bundle)localObject).getByteArray("k_a8key_cookie"));
          localObject = new com/tencent/mm/plugin/webview/preload/e$2;
          ((e.2)localObject).<init>(str, localh, parama, parami, parame);
          g.Rg().a(233, (f)localObject);
          g.Rg().a(localh, 0);
          bool = true;
          AppMethodBeat.o(7053);
        }
      }
      catch (RemoteException parame)
      {
        ab.printErrStackTrace("MicroMsg.TmplWebViewJsAPi", parame, "", new Object[0]);
        a.kT(82);
        parama.a(parami, "updatePageAuth:fail", null);
        bool = false;
        AppMethodBeat.o(7053);
      }
    }
  }

  private static boolean c(i parami, com.tencent.mm.plugin.webview.stub.e parame, e.a parama)
  {
    AppMethodBeat.i(7054);
    if (parame == null)
    {
      ab.e("MicroMsg.TmplWebViewJsAPi", "[notifyPageInfo] callbacker is null, err");
      parama.a(parami, "notifyPageInfo:fail", null);
      a.kT(91);
      AppMethodBeat.o(7054);
    }
    while (true)
    {
      return false;
      try
      {
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("performance", (String)parami.puc.get("performance"));
        localJSONObject.put("injectPageDataResult", (String)parami.puc.get("injectPageDataResult"));
        localBundle.putString(e.m.ygh, localJSONObject.toString());
        parame.g(90005, localBundle);
        parama.a(parami, "notifyPageInfo:ok", null);
        a.kT(90);
        AppMethodBeat.o(7054);
      }
      catch (JSONException parame)
      {
        ab.printErrStackTrace("MicroMsg.TmplWebViewJsAPi", parame, "", new Object[0]);
        parama.a(parami, "notifyPageInfo:fail", null);
        a.kT(91);
        AppMethodBeat.o(7054);
      }
      catch (RemoteException parame)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.TmplWebViewJsAPi", parame, "", new Object[0]);
      }
    }
  }

  private static void d(Map paramMap)
  {
    AppMethodBeat.i(7052);
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = ((Map.Entry)localObject1).getKey();
      localObject1 = ((Map.Entry)localObject1).getValue();
      if (((localObject2 instanceof String)) && ((localObject1 instanceof Map)))
      {
        d((Map)localObject1);
        paramMap.put(localObject2, new JSONObject((Map)localObject1));
      }
    }
    AppMethodBeat.o(7052);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.preload.e
 * JD-Core Version:    0.6.2
 */