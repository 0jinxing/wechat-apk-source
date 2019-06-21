package com.tencent.mm.plugin.topstory.a;

import android.content.Context;
import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.misc.a.a;
import com.tencent.mm.plugin.websearch.api.ao;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.abz;
import com.tencent.mm.protocal.protobuf.bzs;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.protocal.protobuf.chy;
import com.tencent.mm.protocal.protobuf.cvi;
import com.tencent.mm.protocal.protobuf.tn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
{
  public static boolean T(File paramFile)
  {
    boolean bool1 = false;
    AppMethodBeat.i(96364);
    if (paramFile.exists());
    while (true)
    {
      try
      {
        paramFile = FileOp.cy(paramFile.getAbsolutePath());
        if (!bo.isNullOrNil(paramFile))
        {
          boolean bool2 = paramFile.contains("default#default");
          if (bool2)
          {
            AppMethodBeat.o(96364);
            return bool1;
          }
          bool1 = true;
          AppMethodBeat.o(96364);
          continue;
        }
        AppMethodBeat.o(96364);
        continue;
      }
      catch (Exception paramFile)
      {
        AppMethodBeat.o(96364);
        continue;
      }
      AppMethodBeat.o(96364);
    }
  }

  public static final chv a(chv paramchv)
  {
    AppMethodBeat.i(96355);
    chv localchv = new chv();
    localchv.xgj = paramchv.xgj;
    localchv.scene = paramchv.scene;
    localchv.ctj = paramchv.ctj;
    localchv.hlm = paramchv.hlm;
    localchv.xgH = paramchv.xgH;
    localchv.xgG = paramchv.xgG;
    localchv.xgD = paramchv.xgD;
    localchv.xgE = paramchv.xgE;
    localchv.xgF = paramchv.xgF;
    localchv.xgC = paramchv.xgC;
    localchv.tZG.addAll(paramchv.tZG);
    localchv.eif = paramchv.eif;
    localchv.xgN = paramchv.xgN;
    localchv.xgO = paramchv.xgO;
    AppMethodBeat.o(96355);
    return localchv;
  }

  public static final chv a(cvi paramcvi, int paramInt, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(96352);
    chv localchv = new chv();
    localchv.xgj = UUID.randomUUID().toString();
    localchv.xgH = new chw();
    localchv.xgH.title = paramcvi.lvA;
    localchv.xgH.ubA = ("video-" + paramcvi.uaa);
    localchv.xgH.xgS = paramcvi.uaa;
    localchv.xgH.xgQ = paramcvi.thumbUrl;
    if (bo.isNullOrNil(localchv.xgH.xgQ))
      localchv.xgH.xgQ = ("http://shp.qpic.cn/qqvideo_ori/0/" + paramcvi.uaa + String.format("_%s_%s/0", new Object[] { Integer.valueOf(496), Integer.valueOf(280) }));
    localchv.xgH.uai = paramcvi.uai;
    localchv.xgH.source = paramcvi.source;
    localchv.xgH.phw = paramcvi.phw;
    localchv.xgH.xgV = paramcvi.uab;
    localchv.xgH.xgX = paramcvi.uab;
    localchv.xgH.uag = paramcvi.uag;
    localchv.xgH.fgJ = 496;
    localchv.xgH.fgI = 280;
    localchv.xgH.timestamp = System.currentTimeMillis();
    Object localObject;
    int j;
    JSONObject localJSONObject;
    if (!bo.isNullOrNil(paramcvi.ual))
      try
      {
        localObject = new org/json/JSONArray;
        ((JSONArray)localObject).<init>(paramcvi.ual);
        for (j = 0; j < ((JSONArray)localObject).length(); j++)
        {
          localJSONObject = ((JSONArray)localObject).getJSONObject(j);
          bzs localbzs = new com/tencent/mm/protocal/protobuf/bzs;
          localbzs.<init>();
          localbzs.id = localJSONObject.optString("id");
          localbzs.cEh = localJSONObject.optString("wording");
          localbzs.wYN = localJSONObject.optLong("category");
          localbzs.actionType = localJSONObject.optInt("actionType");
          localbzs.url = localJSONObject.optString("url");
          localbzs.title = localJSONObject.optString("title");
          localbzs.jcF = localJSONObject.optString("subTitle");
          localbzs.cIY = localJSONObject.optString("icon");
          localchv.xgH.wiH.add(localbzs);
        }
      }
      catch (Exception localException1)
      {
      }
    localchv.xgC = paramcvi.uaa;
    localchv.xgD = paramcvi.uab;
    localchv.xgE = paramcvi.uac;
    localchv.xgF = paramcvi.uad;
    localchv.xgG = paramcvi.uam;
    if (localchv.xgG <= 0L)
      localchv.xgG = 100201L;
    localchv.xgJ = false;
    if (!bo.isNullOrNil(paramcvi.uak))
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramcvi.uak);
        for (j = i; j < localJSONArray.length(); j++)
        {
          localJSONObject = localJSONArray.getJSONObject(j);
          localObject = new com/tencent/mm/protocal/protobuf/tn;
          ((tn)localObject).<init>();
          ((tn)localObject).key = localJSONObject.optString("key", "");
          ((tn)localObject).waD = localJSONObject.optInt("uintValue", 0);
          ((tn)localObject).waE = localJSONObject.optString("textValue", "");
          localchv.tZG.add(localObject);
        }
      }
      catch (Exception localException2)
      {
      }
    localchv.hlm = "";
    localchv.scene = paramInt;
    localchv.ctj = paramString;
    if (!bo.isNullOrNil(paramcvi.uan))
    {
      localchv.xgI = new bzs();
      localchv.xgI.title = paramcvi.uan;
    }
    AppMethodBeat.o(96352);
    return localchv;
  }

  public static String a(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(96361);
    HashMap localHashMap = new HashMap();
    if (!bo.isNullOrNil(paramString4))
      localHashMap.put("redPointMsgId", paramString4);
    if (!bo.isNullOrNil(paramString1))
      localHashMap.put("sessionId", paramString1);
    if (!bo.isNullOrNil(paramString2))
      localHashMap.put("query", paramString2);
    if (!bo.isNullOrNil(paramString3))
    {
      localHashMap.put("requestId", paramString3);
      localHashMap.put("pRequestId", paramString3);
      localHashMap.put("seq", paramString3);
    }
    localHashMap.put("scene", String.valueOf(paramInt1));
    if (!bo.isNullOrNil(paramString5))
      localHashMap.put("tabInfo", paramString5);
    if (paramInt2 > 0)
      localHashMap.put("contentReddot", String.valueOf(paramInt2));
    if (paramInt3 > 0)
      localHashMap.put("numberReddot", String.valueOf(paramInt3));
    try
    {
      localHashMap.put("deviceName", URLEncoder.encode(d.DEVICE_NAME, "utf8"));
      localHashMap.put("deviceBrand", URLEncoder.encode(Build.BRAND, "utf8"));
      localHashMap.put("deviceModel", URLEncoder.encode(Build.MODEL, "utf8"));
      localHashMap.put("ostype", d.vxk);
      paramString1 = o(localHashMap);
      AppMethodBeat.o(96361);
      return paramString1;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryApiLogic", paramString1, "", new Object[0]);
    }
  }

  public static String abz(String paramString)
  {
    AppMethodBeat.i(96357);
    paramString = ah.getContext().getCacheDir() + "topstory/" + paramString + "/";
    AppMethodBeat.o(96357);
    return paramString;
  }

  public static final chv ag(Map<String, Object> paramMap)
  {
    int i = 0;
    AppMethodBeat.i(96354);
    chv localchv = new chv();
    localchv.ctj = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "query");
    localchv.scene = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "scene", 21);
    localchv.xgj = UUID.randomUUID().toString();
    localchv.hlm = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "searchId");
    if ((at.isConnected(ah.getContext())) && (!at.isWifi(ah.getContext())))
      localchv.xgJ = true;
    Object localObject1 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "videoId");
    Object localObject2 = new ArrayList();
    int j;
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "videoUrls"));
      if (localJSONArray.length() > 0)
        for (j = 0; j < localJSONArray.length(); j++)
        {
          chy localchy = new com/tencent/mm/protocal/protobuf/chy;
          localchy.<init>();
          localchy.url = localJSONArray.getString(j);
          ((ArrayList)localObject2).add(localchy);
        }
    }
    catch (JSONException localJSONException3)
    {
    }
    if (!bo.isNullOrNil((String)localObject1))
    {
      localchv.xgH = new chw();
      localchv.xgH.title = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "title");
      localchv.xgH.xgQ = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "thumbUrl");
      localchv.xgH.xgR = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "mediaDuration", 0);
      localchv.xgH.xgS = ((String)localObject1);
      localchv.xgH.fgJ = 496;
      localchv.xgH.fgI = 280;
      localchv.xgH.uai = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "strPlayCount");
      localchv.xgH.lvz = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "shareUrl");
      localchv.xgH.lvA = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "shareTitle");
      localchv.xgH.uaj = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "titleUrl");
      localchv.xgH.qVw = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "shareDesc");
      localchv.xgH.uaf = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "shareImgUrl");
      localchv.xgH.uag = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "shareString");
      localchv.xgH.uah = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "shareStringUrl");
      localchv.xgH.source = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "source");
      localchv.xgH.phw = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "sourceUrl");
      localchv.xgH.xgT = com.tencent.mm.plugin.websearch.api.aa.a(paramMap, "relevant_category", -1L);
      localchv.xgH.xgU = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "shareOpenId");
      localchv.xgH.ubA = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "docID");
      localchv.xgH.xha = com.tencent.mm.plugin.websearch.api.aa.a(paramMap, "videoSize", 0L);
      localchv.xgH.timestamp = bo.yz();
      localchv.xgH.xgW = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "itemType", 0);
      localchv.xgH.xhd = com.tencent.mm.plugin.websearch.api.aa.d(paramMap, "switchFlag", 0);
      if (bo.isNullOrNil(localchv.xgH.xgQ))
        localchv.xgH.xgQ = ("http://shp.qpic.cn/qqvideo_ori/0/" + localchv.xgH.xgS + String.format("_%s_%s/0", new Object[] { Integer.valueOf(496), Integer.valueOf(280) }));
    }
    try
    {
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "block"));
      localchv.xgH.xgZ = ((JSONObject)localObject1).optLong("resultType");
      localchv.xgH.ctk = ((JSONObject)localObject1).optLong("type");
      label621: localchv.xgH.xgV = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "expand");
      localchv.xgH.xhb.addAll((Collection)localObject2);
      localObject2 = dM((List)localObject2);
      if (localObject2 != null)
      {
        localchv.xgH.videoUrl = ((chy)localObject2).url;
        localchv.xgH.xhg = ((chy)localObject2).xhg;
      }
      localObject2 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "show_tag_list");
      if (!bo.isNullOrNil((String)localObject2));
      try
      {
        localObject1 = new org/json/JSONArray;
        ((JSONArray)localObject1).<init>((String)localObject2);
        localchv.xgH.wiH.addAll(y((JSONArray)localObject1));
        label726: localchv.xgG = localchv.xgH.xgT;
        localchv.xgD = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "expand");
        localchv.xgE = localchv.hlm;
        localchv.xgC = localchv.xgH.xgS;
        localObject2 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "videoChannelTitle");
        if ((!bo.isNullOrNil(localchv.xgH.uag)) && ((localchv.xgG == 100202L) || (localchv.xgG == 100204L) || (localchv.xgG == 100205L)))
        {
          localchv.xgI = new bzs();
          localchv.xgI.title = ((String)localObject2);
        }
        localObject2 = com.tencent.mm.plugin.websearch.api.aa.t(paramMap, "extReqParams");
        if (!bo.isNullOrNil((String)localObject2))
          try
          {
            paramMap = new org/json/JSONArray;
            paramMap.<init>((String)localObject2);
            for (j = i; j < paramMap.length(); j++)
            {
              localObject1 = paramMap.getJSONObject(j);
              localObject2 = new com/tencent/mm/protocal/protobuf/tn;
              ((tn)localObject2).<init>();
              ((tn)localObject2).key = ((JSONObject)localObject1).optString("key", "");
              ((tn)localObject2).waD = ((JSONObject)localObject1).optInt("uintValue", 0);
              ((tn)localObject2).waE = ((JSONObject)localObject1).optString("textValue", "");
              localchv.tZG.add(localObject2);
            }
          }
          catch (Exception paramMap)
          {
          }
        AppMethodBeat.o(96354);
        return localchv;
      }
      catch (JSONException localJSONException2)
      {
        break label726;
      }
    }
    catch (JSONException localJSONException1)
    {
      break label621;
    }
  }

  public static final chv am(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96353);
    chv localchv = new chv();
    localchv.ctj = paramJSONObject.optString("query", "");
    localchv.scene = paramJSONObject.optInt("scene", 21);
    localchv.xgj = UUID.randomUUID().toString();
    localchv.xgE = paramJSONObject.optString("searchId", "");
    if ((at.isConnected(ah.getContext())) && (!at.isWifi(ah.getContext())))
      localchv.xgJ = true;
    Object localObject1 = paramJSONObject.optString("videoId", "");
    Object localObject2 = new ArrayList();
    int i;
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(paramJSONObject.optString("videoUrls", ""));
      if (localJSONArray.length() > 0)
        for (i = 0; i < localJSONArray.length(); i++)
        {
          chy localchy = new com/tencent/mm/protocal/protobuf/chy;
          localchy.<init>();
          localchy.url = localJSONArray.getString(i);
          ((ArrayList)localObject2).add(localchy);
        }
    }
    catch (JSONException localJSONException3)
    {
    }
    if (!bo.isNullOrNil((String)localObject1))
    {
      localchv.xgH = new chw();
      localchv.xgH.title = paramJSONObject.optString("title", "");
      localchv.xgH.xgQ = paramJSONObject.optString("thumbUrl", "");
      localchv.xgH.xgR = paramJSONObject.optInt("mediaDuration", 0);
      localchv.xgH.xgS = ((String)localObject1);
      localchv.xgH.fgJ = 496;
      localchv.xgH.fgI = 280;
      localchv.xgH.uai = paramJSONObject.optString("strPlayCount", "");
      localchv.xgH.lvz = paramJSONObject.optString("shareUrl", "");
      localchv.xgH.lvA = paramJSONObject.optString("shareTitle", "");
      localchv.xgH.uaj = paramJSONObject.optString("titleUrl", "");
      localchv.xgH.qVw = paramJSONObject.optString("shareDesc", "");
      localchv.xgH.uaf = paramJSONObject.optString("shareImgUrl", "");
      localchv.xgH.uag = paramJSONObject.optString("shareString", "");
      localchv.xgH.uah = paramJSONObject.optString("shareStringUrl", "");
      localchv.xgH.source = paramJSONObject.optString("source", "");
      localchv.xgH.phw = paramJSONObject.optString("sourceUrl", "");
      localchv.xgH.xgT = paramJSONObject.optInt("relevant_category", -1);
      localchv.xgH.xgU = paramJSONObject.optString("shareOpenId", "");
      localchv.xgH.ubA = paramJSONObject.optString("docID", "");
      localchv.xgH.xha = paramJSONObject.optInt("videoSize", 0);
      localchv.xgH.timestamp = bo.yz();
      localchv.xgH.xgW = paramJSONObject.optInt("itemType", 0);
    }
    try
    {
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>(paramJSONObject.optString("block", ""));
      localchv.xgH.xgZ = ((JSONObject)localObject1).optLong("resultType");
      localchv.xgH.ctk = ((JSONObject)localObject1).optLong("type");
      label587: localchv.xgH.xgV = paramJSONObject.optString("expand", "");
      localchv.xgH.xhb.addAll((Collection)localObject2);
      localObject2 = dM((List)localObject2);
      if (localObject2 != null)
      {
        localchv.xgH.videoUrl = ((chy)localObject2).url;
        localchv.xgH.xhg = ((chy)localObject2).xhg;
      }
      if (bo.isNullOrNil(localchv.xgH.xgQ))
        localchv.xgH.xgQ = ("http://shp.qpic.cn/qqvideo_ori/0/" + localchv.xgH.xgS + String.format("_%s_%s/0", new Object[] { Integer.valueOf(496), Integer.valueOf(280) }));
      localObject2 = paramJSONObject.optString("tagList", "");
      if (!bo.isNullOrNil((String)localObject2));
      try
      {
        localObject1 = new org/json/JSONArray;
        ((JSONArray)localObject1).<init>((String)localObject2);
        localchv.xgH.wiH.addAll(y((JSONArray)localObject1));
        label761: if (!paramJSONObject.optBoolean("not_show_feedback", false))
        {
          localObject2 = paramJSONObject.optJSONObject("feedbackObj");
          if (localObject2 != null)
          {
            localObject2 = ((JSONObject)localObject2).optJSONArray("feedbackData");
            if (localObject2 != null)
              for (i = 0; i < ((JSONArray)localObject2).length(); i++)
              {
                localObject1 = new abz();
                ((abz)localObject1).id = ((JSONArray)localObject2).optJSONObject(i).optString("id", "");
                ((abz)localObject1).cEh = ((JSONArray)localObject2).optJSONObject(i).optString("wording", "");
                localchv.xgH.xhc.add(localObject1);
              }
          }
        }
        localObject1 = paramJSONObject.optString("show_tag_list", "");
        if (!bo.isNullOrNil((String)localObject1));
        try
        {
          localObject2 = new org/json/JSONArray;
          ((JSONArray)localObject2).<init>((String)localObject1);
          localchv.xgH.wiH.addAll(y((JSONArray)localObject2));
          label912: localchv.xgG = localchv.xgH.xgT;
          localchv.xgD = paramJSONObject.optString("expand", "");
          localchv.hlm = "";
          localchv.xgC = localchv.xgH.xgS;
          localchv.xgH.xhd = paramJSONObject.optInt("switchFlag", 0);
          localObject2 = localchv.xgH;
          boolean bool;
          if ((paramJSONObject.optJSONObject("colikeInfo") != null) && (paramJSONObject.optJSONObject("colikeInfo").optBoolean("isSelfThumb")))
            bool = true;
          while (true)
          {
            ((chw)localObject2).xhh = bool;
            localObject1 = localchv.xgH;
            if (paramJSONObject.optJSONObject("colikeInfo") != null)
            {
              localObject2 = paramJSONObject.optJSONObject("colikeInfo").optString("byPass", "");
              ((chw)localObject1).xhi = ((String)localObject2);
              localObject2 = paramJSONObject.optString("videoChannelTitle", "");
              if ((!bo.isNullOrNil((String)localObject2)) && ((localchv.xgG == 100202L) || (localchv.xgG == 100204L) || (localchv.xgG == 100205L)))
              {
                localchv.xgI = new bzs();
                localchv.xgI.title = ((String)localObject2);
              }
              localObject1 = paramJSONObject.optString("extReqParams", "");
              if (bo.isNullOrNil((String)localObject1))
                break;
            }
            else
            {
              try
              {
                localObject2 = new org/json/JSONArray;
                ((JSONArray)localObject2).<init>((String)localObject1);
                i = 0;
                while (true)
                  if (i < ((JSONArray)localObject2).length())
                  {
                    JSONObject localJSONObject = ((JSONArray)localObject2).getJSONObject(i);
                    localObject1 = new com/tencent/mm/protocal/protobuf/tn;
                    ((tn)localObject1).<init>();
                    ((tn)localObject1).key = localJSONObject.optString("key", "");
                    ((tn)localObject1).waD = localJSONObject.optInt("uintValue", 0);
                    ((tn)localObject1).waE = localJSONObject.optString("textValue", "");
                    localchv.tZG.add(localObject1);
                    i++;
                    continue;
                    bool = false;
                    break;
                    localObject2 = "";
                  }
              }
              catch (Exception localException1)
              {
              }
            }
          }
          localchv.xgN = paramJSONObject.optString("preNetType", "");
          if (localchv.xgN.equals("wangka"))
            localchv.xgO = 1;
          while (true)
          {
            AppMethodBeat.o(96353);
            return localchv;
            if ((localchv.xgN.equals("2g")) || (localchv.xgN.equals("3g")) || (localchv.xgN.equals("4g")))
              localchv.xgO = 2;
            else
              localchv.xgO = 0;
          }
        }
        catch (JSONException localJSONException2)
        {
          break label912;
        }
      }
      catch (Exception localException2)
      {
        break label761;
      }
    }
    catch (JSONException localJSONException1)
    {
      break label587;
    }
  }

  public static String cFl()
  {
    AppMethodBeat.i(96356);
    String str = ah.getContext().getCacheDir() + "topstory/";
    AppMethodBeat.o(96356);
    return str;
  }

  public static boolean cFm()
  {
    boolean bool = true;
    AppMethodBeat.i(96358);
    if (1 >= ab.getLogLevel())
      AppMethodBeat.o(96358);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(96358);
    }
  }

  public static String cFn()
  {
    AppMethodBeat.i(96365);
    String str = e.eSk.replace("/data/user/0", "/data/data") + "topstory/homecache/";
    AppMethodBeat.o(96365);
    return str;
  }

  public static String cFo()
  {
    AppMethodBeat.i(96366);
    String str = e.eSk.replace("/data/user/0", "/data/data") + "topstory/negcache/";
    AppMethodBeat.o(96366);
    return str;
  }

  public static boolean cFp()
  {
    AppMethodBeat.i(96367);
    int i = ((a)com.tencent.mm.kernel.g.K(a.class)).bOL();
    switch (i)
    {
    default:
    case 3:
    case 4:
    case 5:
    }
    for (boolean bool = false; ; bool = true)
    {
      ab.i("MicroMsg.TopStory.TopStoryApiLogic", "isFreeSimCard result :%b simType: %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i) });
      AppMethodBeat.o(96367);
      return bool;
    }
  }

  public static String cFq()
  {
    AppMethodBeat.i(96368);
    String str;
    if (at.isWifi(ah.getContext()))
    {
      str = "wifi";
      AppMethodBeat.o(96368);
    }
    while (true)
    {
      return str;
      if (cFp())
      {
        str = "wangka";
        AppMethodBeat.o(96368);
      }
      else if (at.is4G(ah.getContext()))
      {
        str = "4g";
        AppMethodBeat.o(96368);
      }
      else if (at.is3G(ah.getContext()))
      {
        str = "3g";
        AppMethodBeat.o(96368);
      }
      else if (at.is2G(ah.getContext()))
      {
        str = "2g";
        AppMethodBeat.o(96368);
      }
      else if (!at.isConnected(ah.getContext()))
      {
        str = "fail";
        AppMethodBeat.o(96368);
      }
      else
      {
        str = "";
        AppMethodBeat.o(96368);
      }
    }
  }

  public static final chy dM(List<chy> paramList)
  {
    AppMethodBeat.i(96351);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (chy)localIterator.next();
      if ((paramList != null) && (!bo.isNullOrNil(paramList.url)))
        AppMethodBeat.o(96351);
    }
    while (true)
    {
      return paramList;
      paramList = null;
      AppMethodBeat.o(96351);
    }
  }

  public static JSONArray dN(List<bzs> paramList)
  {
    AppMethodBeat.i(96359);
    JSONArray localJSONArray = new JSONArray();
    int i = 0;
    while (true)
    {
      if (i < paramList.size());
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        bzs localbzs = (bzs)paramList.get(i);
        localJSONObject.put("id", localbzs.id);
        localJSONObject.put("wording", localbzs.cEh);
        localJSONObject.put("category", localbzs.wYN);
        localJSONObject.put("actionType", localbzs.actionType);
        localJSONObject.put("url", localbzs.url);
        localJSONObject.put("title", localbzs.title);
        localJSONObject.put("subTitle", localbzs.jcF);
        localJSONObject.put("icon", localbzs.cIY);
        localJSONArray.put(localJSONObject);
        label153: i++;
        continue;
        AppMethodBeat.o(96359);
        return localJSONArray;
      }
      catch (Exception localException)
      {
        break label153;
      }
    }
  }

  public static String o(HashMap<String, String> paramHashMap)
  {
    AppMethodBeat.i(96362);
    p(paramHashMap);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("file://");
    localStringBuffer.append(com.tencent.mm.plugin.websearch.api.aa.HQ(1).aLD());
    localStringBuffer.append("/");
    localStringBuffer.append("app.html");
    localStringBuffer.append("?");
    localStringBuffer.append(com.tencent.mm.plugin.websearch.api.aa.an(paramHashMap));
    paramHashMap = localStringBuffer.toString();
    AppMethodBeat.o(96362);
    return paramHashMap;
  }

  private static void p(HashMap<String, String> paramHashMap)
  {
    AppMethodBeat.i(96363);
    paramHashMap.put("lang", com.tencent.mm.sdk.platformtools.aa.gw(ah.getContext()));
    paramHashMap.put("platform", "android");
    paramHashMap.put("version", String.valueOf(com.tencent.mm.plugin.websearch.api.aa.HQ(1).afW()));
    paramHashMap.put("netType", com.tencent.mm.plugin.websearch.api.aa.bVP());
    paramHashMap.put("isClientLoading", "1");
    paramHashMap.put("wechatVersion", f.CLIENT_VERSION);
    AppMethodBeat.o(96363);
  }

  private static List<bzs> y(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(96360);
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramJSONArray.length(); i++)
    {
      JSONObject localJSONObject = paramJSONArray.optJSONObject(i);
      bzs localbzs = new bzs();
      localbzs.id = localJSONObject.optString("id", "");
      localbzs.cEh = localJSONObject.optString("wording", "");
      localbzs.wYN = localJSONObject.optLong("category", 0L);
      localbzs.actionType = localJSONObject.optInt("actionType", 0);
      localbzs.url = localJSONObject.optString("url", "");
      localbzs.title = localJSONObject.optString("title", "");
      localbzs.jcF = localJSONObject.optString("subTitle", "");
      localbzs.cIY = localJSONObject.optString("icon", "");
      localArrayList.add(localbzs);
    }
    AppMethodBeat.o(96360);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.g
 * JD-Core Version:    0.6.2
 */