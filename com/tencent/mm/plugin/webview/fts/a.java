package com.tencent.mm.plugin.webview.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.g.a.gb;
import com.tencent.mm.g.a.gb.a;
import com.tencent.mm.g.a.gb.b;
import com.tencent.mm.g.a.rj;
import com.tencent.mm.g.a.rj.a;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.i.a;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map<Ljava.lang.String;Ljava.lang.Object;>;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  implements k.a
{
  public c qGl;
  private volatile HashMap<String, HashSet<String>> ueY;
  volatile HashMap<String, HashSet<String>> ueZ;
  volatile HashMap<String, HashSet<String>> ufa;
  private volatile HashMap<String, Integer> ufb;
  volatile HashMap<String, Integer> ufc;
  volatile HashMap<String, Integer> ufd;
  public c<gb> ufe;

  public a()
  {
    AppMethodBeat.i(5667);
    this.ufe = new a.1(this);
    this.qGl = new a.2(this);
    this.ueY = new HashMap();
    this.ueZ = new HashMap();
    this.ufb = new HashMap();
    this.ufc = new HashMap();
    this.ufa = new HashMap();
    this.ufd = new HashMap();
    this.qGl.dnU();
    this.ufe.dnU();
    o.act().c(this);
    AppMethodBeat.o(5667);
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(5671);
    if ((paramm == null) || (paramm.obj == null))
      AppMethodBeat.o(5671);
    while (true)
    {
      return;
      int i;
      Object localObject;
      label152: String str1;
      String str2;
      synchronized (this.ueY)
      {
        ab.i("MicroMsg.FTS.FTSWebViewImageLogic", "event %s，eventData %s", new Object[] { paramString, paramm.toString() });
        paramString = paramm.obj.toString();
        if ((this.ueY.containsKey(paramString)) && (this.ufb.containsKey(paramString)))
        {
          ab.i("MicroMsg.FTS.FTSWebViewImageLogic", "notify avatar changed %s", new Object[] { paramString });
          i = ((Integer)this.ufb.get(paramString)).intValue();
          paramm = (HashSet)this.ueY.get(paramString);
          localObject = new java/util/HashSet;
          ((HashSet)localObject).<init>(paramm);
          paramm = new org/json/JSONArray;
          paramm.<init>();
          Iterator localIterator = ((HashSet)localObject).iterator();
          if (localIterator.hasNext())
          {
            str1 = (String)localIterator.next();
            o.acd();
            str2 = "weixin://fts/avatar?path=".concat(String.valueOf(d.D(paramString, false)));
            localObject = new org/json/JSONObject;
            ((JSONObject)localObject).<init>();
          }
        }
      }
      try
      {
        ((JSONObject)localObject).put("id", str1);
        ((JSONObject)localObject).put("src", str2);
        label223: paramm.put(localObject);
        break label152;
        paramString = finally;
        AppMethodBeat.o(5671);
        throw paramString;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(i).bH(0, paramm.toString());
        this.ueY.remove(paramString);
        this.ufb.remove(paramString);
        AppMethodBeat.o(5671);
      }
      catch (JSONException localJSONException)
      {
        break label223;
      }
    }
  }

  public final boolean as(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(5668);
    ab.i("MicroMsg.FTS.FTSWebViewImageLogic", "getSearchAvatarList");
    Object localObject1 = aa.t(paramMap, "data");
    int i = bo.g(paramMap.get("webview_instance_id"), -1);
    JSONArray localJSONArray2;
    String str1;
    String str2;
    Object localObject2;
    try
    {
      JSONArray localJSONArray1 = new org/json/JSONArray;
      localJSONArray1.<init>((String)localObject1);
      localJSONArray2 = new org/json/JSONArray;
      localJSONArray2.<init>();
      localObject1 = null;
      int j = 0;
      if (j < localJSONArray1.length())
      {
        paramMap = localJSONArray1.getJSONObject(j);
        str1 = paramMap.optString("id");
        str2 = paramMap.optString("userName");
        int k = paramMap.optInt("type");
        localObject2 = paramMap.optString("imageUrl");
        String str3 = paramMap.optString("bigImageUrl");
        paramMap = (Map<String, Object>)localObject2;
        switch (k)
        {
        default:
        case 1:
        case 4:
        case 64:
        case 32:
        }
        while (true)
        {
          o.acd();
          paramMap = d.D(str2, false);
          if (!e.ct(paramMap))
            break label338;
          ab.i("MicroMsg.FTS.FTSWebViewImageLogic", "avatar file exist %s", new Object[] { paramMap });
          paramMap = "weixin://fts/avatar?path=".concat(String.valueOf(paramMap));
          localObject1 = paramMap;
          if (paramMap != null)
          {
            localObject1 = new org/json/JSONObject;
            ((JSONObject)localObject1).<init>();
            ((JSONObject)localObject1).put("id", str1);
            ((JSONObject)localObject1).put("src", paramMap);
            localJSONArray2.put(localObject1);
            localObject1 = null;
          }
          j++;
          break;
          paramMap = new com/tencent/mm/ah/h;
          paramMap.<init>();
          paramMap.username = str2;
          paramMap.frW = str3;
          paramMap.frV = ((String)localObject2);
          paramMap.bJt = -1;
          paramMap.dtR = 3;
          paramMap.cB(true);
          o.act().b(paramMap);
        }
      }
    }
    catch (JSONException paramMap)
    {
      ab.printErrStackTrace("MicroMsg.FTS.FTSWebViewImageLogic", paramMap, "", new Object[0]);
      com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(i).bH(-1, "");
    }
    while (true)
    {
      AppMethodBeat.o(5668);
      return false;
      label338: ab.i("MicroMsg.FTS.FTSWebViewImageLogic", "avatar file not exist %s", new Object[] { paramMap });
      this.ufb.put(str2, Integer.valueOf(i));
      localObject2 = (HashSet)this.ueY.get(str2);
      paramMap = (Map<String, Object>)localObject2;
      if (localObject2 == null)
      {
        paramMap = new java/util/HashSet;
        paramMap.<init>();
      }
      paramMap.add(str1);
      this.ueY.put(str2, paramMap);
      a.b.diS().cQ(str2);
      paramMap = (Map<String, Object>)localObject1;
      break;
      if (localJSONArray2.length() > 0)
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(i).bH(0, localJSONArray2.toString());
    }
  }

  public final boolean at(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(5669);
    ab.i("MicroMsg.FTS.FTSWebViewImageLogic", "getSearchSnsImageList");
    Object localObject1 = aa.t(paramMap, "data");
    int i = bo.g(paramMap.get("webview_instance_id"), -1);
    label473: 
    while (true)
    {
      JSONArray localJSONArray2;
      try
      {
        JSONArray localJSONArray1 = new org/json/JSONArray;
        localJSONArray1.<init>((String)localObject1);
        localJSONArray2 = new org/json/JSONArray;
        localJSONArray2.<init>();
        paramMap = null;
        int j = 0;
        if (j < localJSONArray1.length())
        {
          Object localObject2 = localJSONArray1.getJSONObject(j);
          String str = ((JSONObject)localObject2).getString("id");
          localObject1 = ((JSONObject)localObject2).getString("objectXmlDesc");
          int k = ((JSONObject)localObject2).getInt("index");
          localObject1 = ((com.tencent.mm.plugin.sns.b.m)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.sns.b.m.class)).tC((String)localObject1);
          if (((TimeLineObject)localObject1).xfI.wbK.size() <= k)
            break label473;
          localObject2 = (bau)((TimeLineObject)localObject1).xfI.wbK.get(k);
          localObject1 = new com/tencent/mm/g/a/rj;
          ((rj)localObject1).<init>();
          ((rj)localObject1).cNq.cuy = 3;
          ((rj)localObject1).cNq.cHr = ((bau)localObject2).Id;
          com.tencent.mm.sdk.b.a.xxA.m((b)localObject1);
          ab.i("MicroMsg.FTS.FTSWebViewImageLogic", "generatePath: %s", new Object[] { ((rj)localObject1).cNq.path });
          if (e.ct(((rj)localObject1).cNq.path))
          {
            paramMap = new java/lang/StringBuilder;
            paramMap.<init>("weixin://fts/sns?path=");
            localObject1 = ((rj)localObject1).cNq.path;
            paramMap = (Map<String, Object>)localObject1;
            if (localObject1 != null)
            {
              paramMap = new org/json/JSONObject;
              paramMap.<init>();
              paramMap.put("id", str);
              paramMap.put("src", localObject1);
              localJSONArray2.put(paramMap);
              paramMap = null;
            }
            j++;
            continue;
          }
          synchronized (this.ueZ)
          {
            if (this.ueZ.containsKey(((bau)localObject2).Id))
            {
              localObject1 = (HashSet)this.ueZ.get(((bau)localObject2).Id);
              ((HashSet)localObject1).add(str);
              this.ueZ.put(((bau)localObject2).Id, localObject1);
              this.ufc.put(((bau)localObject2).Id, Integer.valueOf(i));
              localObject1 = new com/tencent/mm/g/a/rj;
              ((rj)localObject1).<init>();
              ((rj)localObject1).cNq.cuy = 1;
              ((rj)localObject1).cNq.cNr = ((bau)localObject2);
              com.tencent.mm.sdk.b.a.xxA.m((b)localObject1);
              localObject1 = paramMap;
              continue;
            }
            localObject1 = new HashSet();
          }
        }
      }
      catch (JSONException paramMap)
      {
        AppMethodBeat.o(5669);
        return false;
      }
      if (localJSONArray2.length() > 0)
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(i).bH(0, localJSONArray2.toString());
    }
  }

  public final boolean au(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(5670);
    ab.i("MicroMsg.FTS.FTSWebViewImageLogic", "getSearchImageList");
    int i = aa.d(paramMap, "requestType", 0);
    Object localObject1 = aa.t(paramMap, "data");
    int j = bo.g(paramMap.get("webview_instance_id"), -1);
    boolean bool = at.isWifi(ah.getContext());
    switch (i)
    {
    default:
    case 1:
    }
    try
    {
      paramMap = new org/json/JSONArray;
      paramMap.<init>((String)localObject1);
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      i = 0;
      Object localObject2;
      int k;
      Object localObject4;
      while (true)
        if (i < paramMap.length())
        {
          localObject2 = paramMap.getJSONObject(i);
          localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>();
          Object localObject3 = ((JSONObject)localObject2).getString("id");
          localObject2 = ((JSONObject)localObject2).getString("imageUrl");
          ((JSONObject)localObject1).put("id", localObject3);
          ((JSONObject)localObject1).put("src", localObject2);
          localJSONArray.put(localObject1);
          i++;
          continue;
          try
          {
            localObject3 = new org/json/JSONArray;
            ((JSONArray)localObject3).<init>((String)localObject1);
            localJSONArray = new org/json/JSONArray;
            localJSONArray.<init>();
            paramMap = null;
            i = 0;
            if (i < ((JSONArray)localObject3).length())
            {
              localObject1 = ((JSONArray)localObject3).getJSONObject(i);
              k = ((JSONObject)localObject1).optInt("emojiType");
              localObject2 = ((JSONObject)localObject1).optString("id");
              if (k == 2)
              {
                localObject4 = new com/tencent/mm/g/a/gb;
                ((gb)localObject4).<init>();
                ((gb)localObject4).cAm.cuy = 3;
                ((gb)localObject4).cAm.cvZ = ((JSONObject)localObject1).optString("md5");
                ((gb)localObject4).cAm.cAo = ((JSONObject)localObject1).optString("designerId");
                ((gb)localObject4).cAm.aeskey = ((JSONObject)localObject1).optString("aesKey");
                ((gb)localObject4).cAm.cAp = ((JSONObject)localObject1).optString("encryptUrl");
                ((gb)localObject4).cAm.cwg = ((JSONObject)localObject1).optString("productID");
                ((gb)localObject4).cAm.name = ((JSONObject)localObject1).optString("express");
                ((gb)localObject4).cAm.thumbUrl = ((JSONObject)localObject1).optString("imageUrl");
                com.tencent.mm.sdk.b.a.xxA.m((b)localObject4);
                if (e.ct(((gb)localObject4).cAn.path))
                {
                  paramMap = new java/lang/StringBuilder;
                  paramMap.<init>("weixin://fts/emoji?path=");
                  localObject1 = ((gb)localObject4).cAn.path;
                  ab.i("MicroMsg.FTS.FTSWebViewImageLogic", "path=%s", new Object[] { ((gb)localObject4).cAn.path });
                }
                while (true)
                {
                  paramMap = (Map<String, Object>)localObject1;
                  if (localObject1 != null)
                  {
                    paramMap = new org/json/JSONObject;
                    paramMap.<init>();
                    paramMap.put("id", localObject2);
                    paramMap.put("src", localObject1);
                    localJSONArray.put(paramMap);
                    paramMap = null;
                  }
                  label465: i++;
                  break;
                  if (bool)
                    synchronized (this.ufa)
                    {
                      if (this.ufa.containsKey(((gb)localObject4).cAm.cvZ))
                      {
                        localObject1 = (HashSet)this.ufa.get(((gb)localObject4).cAm.cvZ);
                        ((HashSet)localObject1).add(localObject2);
                        this.ufa.put(((gb)localObject4).cAm.cvZ, localObject1);
                        this.ufd.put(((gb)localObject4).cAm.cvZ, Integer.valueOf(j));
                        ((gb)localObject4).cAm.cuy = 1;
                        com.tencent.mm.sdk.b.a.xxA.m((b)localObject4);
                        localObject1 = paramMap;
                      }
                      else
                      {
                        localObject1 = new HashSet();
                      }
                    }
                }
              }
            }
          }
          catch (Exception paramMap)
          {
          }
        }
      while (true)
      {
        label617: AppMethodBeat.o(5670);
        return false;
        localObject1 = ((JSONObject)localObject1).optString("imageUrl");
        break;
        if (k == 4)
        {
          localObject4 = new org/json/JSONObject;
          ((JSONObject)localObject4).<init>();
          ((JSONObject)localObject4).put("id", localObject2);
          if (bool)
            ((JSONObject)localObject4).put("src", ((JSONObject)localObject1).optString("raw"));
          while (true)
          {
            localJSONArray.put(localObject4);
            break;
            ((JSONObject)localObject4).put("src", ((JSONObject)localObject1).optString("imageUrl"));
          }
        }
        localObject4 = new org/json/JSONObject;
        ((JSONObject)localObject4).<init>();
        ((JSONObject)localObject4).put("id", localObject2);
        ((JSONObject)localObject4).put("src", ((JSONObject)localObject1).optString("imageUrl"));
        localJSONArray.put(localObject4);
        break label465;
        if (localJSONArray.length() > 0)
        {
          com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(j).bH(0, localJSONArray.toString());
          continue;
          com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(j).bH(0, localJSONArray.toString());
        }
      }
    }
    catch (JSONException paramMap)
    {
      break label617;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.a
 * JD-Core Version:    0.6.2
 */