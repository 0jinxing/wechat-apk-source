package com.tencent.mm.plugin.topstory.ui.video;

import android.webkit.URLUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.network.u;
import com.tencent.mm.network.v;
import com.tencent.mm.plugin.topstory.a.c.j;
import com.tencent.mm.plugin.websearch.api.a.a;
import com.tencent.mm.protocal.protobuf.abz;
import com.tencent.mm.protocal.protobuf.bzs;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.protocal.protobuf.chy;
import com.tencent.mm.protocal.protobuf.tn;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n
{
  f fur;
  public b sDo;
  public boolean sEY;
  public int sEZ;
  j sFa;
  private int sFb;
  private int sFc;

  public n()
  {
    AppMethodBeat.i(1762);
    this.fur = new n.3(this);
    AppMethodBeat.o(1762);
  }

  public static int Me()
  {
    int i = 0;
    AppMethodBeat.i(1774);
    switch (at.getNetType(ah.getContext()))
    {
    default:
      if (at.is2G(ah.getContext()))
      {
        i = 2;
        AppMethodBeat.o(1774);
      }
      break;
    case -1:
    case 0:
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(1774);
      continue;
      i = 1;
      AppMethodBeat.o(1774);
      continue;
      if (at.is3G(ah.getContext()))
      {
        i = 3;
        AppMethodBeat.o(1774);
      }
      else if (at.is4G(ah.getContext()))
      {
        i = 4;
        AppMethodBeat.o(1774);
      }
      else
      {
        AppMethodBeat.o(1774);
      }
    }
  }

  private static List<chw> a(boolean paramBoolean, JSONArray paramJSONArray)
  {
    AppMethodBeat.i(1771);
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramJSONArray.length(); i++)
    {
      Object localObject1 = (JSONObject)paramJSONArray.get(i);
      long l1 = ((JSONObject)localObject1).optLong("resultType");
      long l2 = ((JSONObject)localObject1).optLong("type");
      String str1 = ((JSONObject)localObject1).optString("expand");
      JSONArray localJSONArray1 = ((JSONObject)localObject1).optJSONArray("items");
      if ((localJSONArray1 != null) && (localJSONArray1.length() > 0))
      {
        long l3 = bo.yz();
        int j = 0;
        if (j < localJSONArray1.length())
        {
          JSONObject localJSONObject = (JSONObject)localJSONArray1.get(j);
          String str2 = localJSONObject.optString("videoApi");
          String str3 = localJSONObject.optString("videoId");
          String str4 = localJSONObject.optString("videoPlatform");
          String str5 = localJSONObject.optString("docID");
          JSONArray localJSONArray2 = localJSONObject.optJSONArray("show_tag_list");
          boolean bool = localJSONObject.optBoolean("not_show_feedback", false);
          Object localObject2 = null;
          localObject1 = localObject2;
          if (!bool)
          {
            localObject3 = localJSONObject.optJSONObject("feedbackObj");
            localObject1 = localObject2;
            if (localObject3 != null)
              localObject1 = ((JSONObject)localObject3).optJSONArray("feedbackData");
          }
          int k = localJSONObject.optInt("mediaDuration", 0);
          Object localObject3 = localJSONObject.optJSONObject("videoInfo");
          localObject2 = null;
          if (localObject3 != null)
            localObject2 = ((JSONObject)localObject3).optJSONObject("videoCdnInfo");
          if (!bo.isNullOrNil(str3))
          {
            localObject3 = new chw();
            ((chw)localObject3).xgS = str3;
            int m = 0;
            if (localObject2 != null)
              m = ((JSONObject)localObject2).optInt("cdnScene", 0);
            int n;
            if ((m == 1) || (m == 2))
            {
              if (!a(m, (chw)localObject3, (JSONObject)localObject2))
                break label1249;
              n = 1;
              localObject2 = com.tencent.mm.plugin.topstory.a.g.dM(((chw)localObject3).xhb);
              if (localObject2 != null)
              {
                ((chw)localObject3).videoUrl = ((chy)localObject2).url;
                ((chw)localObject3).xhg = ((chy)localObject2).xhg;
              }
              if (bo.isNullOrNil(((chw)localObject3).videoUrl))
                a.kT(11);
              ((chw)localObject3).xgR = k;
              ((chw)localObject3).title = localJSONObject.optString("title");
              ((chw)localObject3).lvA = localJSONObject.optString("shareTitle");
              ((chw)localObject3).qVw = localJSONObject.optString("shareDesc");
              ((chw)localObject3).uaf = localJSONObject.optString("shareImgUrl");
              ((chw)localObject3).uag = localJSONObject.optString("shareString");
              ((chw)localObject3).uah = localJSONObject.optString("shareStringUrl");
              ((chw)localObject3).source = localJSONObject.optString("source");
              ((chw)localObject3).phw = localJSONObject.optString("sourceUrl");
              ((chw)localObject3).lvz = localJSONObject.optString("shareUrl");
              ((chw)localObject3).xgT = localJSONObject.optLong("relevant_category", -1L);
              ((chw)localObject3).xgU = localJSONObject.optString("shareOpenId");
              ((chw)localObject3).xgV = localJSONObject.optString("expand");
              ((chw)localObject3).uai = localJSONObject.optString("strPlayCount");
              ((chw)localObject3).uaj = localJSONObject.optString("titleUrl");
              ((chw)localObject3).xgW = localJSONObject.optInt("itemType");
              ((chw)localObject3).xgY = localJSONObject.optString("bizIcon");
              ((chw)localObject3).xhe = localJSONObject.optLong("shareChannelId", ((chw)localObject3).xgT);
              ((chw)localObject3).timestamp = l3;
              ((chw)localObject3).cui = false;
              ((chw)localObject3).ubA = str5;
              ((chw)localObject3).xgZ = l1;
              ((chw)localObject3).ctk = l2;
              ((chw)localObject3).xgX = str1;
              ((chw)localObject3).xhd = localJSONObject.optInt("switchFlag", 0);
              if ((localJSONObject.optJSONObject("colikeInfo") == null) || (!localJSONObject.optJSONObject("colikeInfo").optBoolean("isSelfThumb")))
                break label973;
              bool = true;
              label671: ((chw)localObject3).xhh = bool;
              if (localJSONObject.optJSONObject("colikeInfo") == null)
                break label979;
            }
            label973: label979: for (localObject2 = localJSONObject.optJSONObject("colikeInfo").optString("byPass", ""); ; localObject2 = "")
            {
              ((chw)localObject3).xhi = ((String)localObject2);
              ((chw)localObject3).voe = localJSONObject.optInt("insertPos", 0);
              if (localJSONArray2 == null)
                break label987;
              for (k = 0; k < localJSONArray2.length(); k++)
              {
                localObject2 = new bzs();
                ((bzs)localObject2).id = localJSONArray2.getJSONObject(k).optString("id");
                ((bzs)localObject2).cEh = localJSONArray2.getJSONObject(k).optString("wording");
                ((bzs)localObject2).wYN = localJSONArray2.getJSONObject(k).optLong("category");
                ((bzs)localObject2).actionType = localJSONArray2.getJSONObject(k).optInt("actionType");
                ((bzs)localObject2).url = localJSONArray2.getJSONObject(k).optString("url");
                ((bzs)localObject2).title = localJSONArray2.getJSONObject(k).optString("title");
                ((bzs)localObject2).jcF = localJSONArray2.getJSONObject(k).optString("subTitle");
                ((bzs)localObject2).cIY = localJSONArray2.getJSONObject(k).optString("icon");
                ((chw)localObject3).wiH.add(localObject2);
              }
              if (bo.isNullOrNil(str2))
                break label1249;
              a((chw)localObject3, str2, str4);
              if (bo.ek(((chw)localObject3).xhb))
              {
                a.kT(29);
                ab.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "setVideoInfoByVideoApi retry");
                a((chw)localObject3, str2, str4);
              }
              n = 0;
              break;
              bool = false;
              break label671;
            }
            label987: if (localObject1 != null)
              for (k = 0; k < ((JSONArray)localObject1).length(); k++)
              {
                localObject2 = new abz();
                ((abz)localObject2).id = ((JSONArray)localObject1).optJSONObject(k).optString("id", "");
                ((abz)localObject2).cEh = ((JSONArray)localObject1).optJSONObject(k).optString("wording", "");
                ((abz)localObject2).wjP = ((JSONArray)localObject1).optJSONObject(k).optBoolean("isUseToConfirm", false);
                ((chw)localObject3).xhc.add(localObject2);
              }
            if (!paramBoolean)
              break label1255;
            ((chw)localObject3).fgJ = 360;
            ((chw)localObject3).fgI = 640;
            if (bo.isNullOrNil(((chw)localObject3).xgQ))
              ((chw)localObject3).xgQ = localJSONObject.optString("thumbUrl");
            label1136: if (n != 0)
              ab.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "useCdnData, cdnScene:%s, vid:%s, title:%s, size:%s", new Object[] { Integer.valueOf(m), ((chw)localObject3).xgS, ((chw)localObject3).title, Long.valueOf(((chw)localObject3).xha) });
            if (bo.isNullOrNil(((chw)localObject3).videoUrl))
              break label1342;
            ab.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "videoid: %s, videoUrl: %s, videoSize: %s", new Object[] { ((chw)localObject3).xgS, ((chw)localObject3).videoUrl, Long.valueOf(((chw)localObject3).xha) });
            localArrayList.add(localObject3);
          }
          while (true)
          {
            label1249: j++;
            break;
            label1255: if (bo.isNullOrNil(((chw)localObject3).xgQ))
              ((chw)localObject3).xgQ = ("http://shp.qpic.cn/qqvideo_ori/0/" + ((chw)localObject3).xgS + String.format("_%s_%s/0", new Object[] { Integer.valueOf(496), Integer.valueOf(280) }));
            ((chw)localObject3).fgJ = 496;
            ((chw)localObject3).fgI = 280;
            break label1136;
            label1342: ab.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "Can not add video %s", new Object[] { ((chw)localObject3).xgS });
          }
        }
      }
    }
    AppMethodBeat.o(1771);
    return localArrayList;
  }

  private static void a(chw paramchw, String paramString1, String paramString2)
  {
    AppMethodBeat.i(1773);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    String str = null;
    u localu = null;
    JSONArray localJSONArray = null;
    Object localObject4 = null;
    Object localObject5 = null;
    StringBuilder localStringBuilder = new StringBuilder("");
    Object localObject6 = localJSONArray;
    Object localObject7 = localObject3;
    Object localObject8 = localObject2;
    Object localObject9 = localObject4;
    Object localObject10 = str;
    Object localObject11 = localObject1;
    while (true)
    {
      try
      {
        if (com.tencent.mm.plugin.topstory.a.g.cFp())
        {
          i = 2;
          localObject6 = localJSONArray;
          localObject7 = localObject3;
          localObject8 = localObject2;
          localObject9 = localObject4;
          localObject10 = str;
          localObject11 = localObject1;
          j = Me();
          localObject6 = localJSONArray;
          localObject7 = localObject3;
          localObject8 = localObject2;
          localObject9 = localObject4;
          localObject10 = str;
          localObject11 = localObject1;
          k = at.getISPCode(ah.getContext());
          if (k == 0)
            continue;
          localObject6 = localJSONArray;
          localObject7 = localObject3;
          localObject8 = localObject2;
          localObject9 = localObject4;
          localObject10 = str;
          localObject11 = localObject1;
          m = k / 100;
          k %= 100;
          if (m != 460)
            continue;
          if ((k != 0) && (k != 2) && (k != 7))
            continue;
          m = 3;
          localObject6 = localJSONArray;
          localObject7 = localObject3;
          localObject8 = localObject2;
          localObject9 = localObject4;
          localObject10 = str;
          localObject11 = localObject1;
          ab.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "setVideoInfoByVideoApi, videoapi: %s", new Object[] { paramString1 });
          localObject6 = localJSONArray;
          localObject7 = localObject3;
          localObject8 = localObject2;
          localObject9 = localObject4;
          localObject10 = str;
          localObject11 = localObject1;
          if (!URLUtil.isHttpsUrl(paramString1))
            continue;
          localObject6 = localJSONArray;
          localObject7 = localObject3;
          localObject8 = localObject2;
          localObject9 = localObject4;
          localObject10 = str;
          localObject11 = localObject1;
          paramString1 = com.tencent.mm.network.b.vb(paramString1);
          localObject6 = paramString1;
          localObject7 = localObject3;
          localObject8 = localObject2;
          localObject9 = paramString1;
          localObject10 = str;
          localObject11 = localObject1;
          paramString1.anb();
          localObject6 = paramString1;
          localObject7 = localObject3;
          localObject8 = localObject2;
          localObject9 = paramString1;
          localObject10 = str;
          localObject11 = localObject1;
          paramString1.amZ();
          localObject6 = paramString1;
          localObject7 = localObject3;
          localObject8 = localObject2;
          localObject9 = paramString1;
          localObject10 = str;
          localObject11 = localObject1;
          paramString1.ana();
          localObject6 = paramString1;
          localObject7 = localObject3;
          localObject8 = localObject2;
          localObject9 = paramString1;
          localObject10 = str;
          localObject11 = localObject1;
          localObject5 = paramString1.gdG.getInputStream();
          localObject6 = paramString1;
          localObject7 = localu;
          localObject8 = localObject5;
          localObject9 = paramString1;
          localObject10 = localu;
          localObject11 = localObject5;
          localObject1 = new java/io/InputStreamReader;
          localObject6 = paramString1;
          localObject7 = localu;
          localObject8 = localObject5;
          localObject9 = paramString1;
          localObject10 = localu;
          localObject11 = localObject5;
          ((InputStreamReader)localObject1).<init>((InputStream)localObject5);
          localObject6 = paramString1;
          localObject7 = localu;
          localObject8 = localObject5;
          localObject9 = paramString1;
          localObject10 = localu;
          localObject11 = localObject5;
          localObject2 = new java/io/BufferedReader;
          localObject6 = paramString1;
          localObject7 = localu;
          localObject8 = localObject5;
          localObject9 = paramString1;
          localObject10 = localu;
          localObject11 = localObject5;
          ((BufferedReader)localObject2).<init>((Reader)localObject1);
          localObject6 = paramString1;
          localObject7 = localu;
          localObject8 = localObject5;
          localObject9 = paramString1;
          localObject10 = localu;
          localObject11 = localObject5;
          localObject1 = ((BufferedReader)localObject2).readLine();
          if (localObject1 == null)
            continue;
          localObject6 = paramString1;
          localObject7 = localu;
          localObject8 = localObject5;
          localObject9 = paramString1;
          localObject10 = localu;
          localObject11 = localObject5;
          localStringBuilder.append((String)localObject1);
          continue;
        }
      }
      catch (Throwable paramchw)
      {
        int j;
        int k;
        localObject9 = localObject6;
        localObject10 = localObject7;
        localObject11 = localObject8;
        ab.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoDataMgr", paramchw, "getVideoUrlByVideoApi error: %s", new Object[] { paramchw.getMessage() });
        return;
        int i = -1;
        continue;
        if ((k == 1) || (k == 6) || (k == 9))
        {
          m = 2;
          continue;
        }
        if ((k == 3) || (k == 5) || (k == 11))
        {
          m = 1;
          continue;
        }
        int m = 0;
        continue;
        localObject6 = localJSONArray;
        localObject7 = localObject3;
        localObject8 = localObject2;
        localObject9 = localObject4;
        localObject10 = str;
        localObject11 = localObject1;
        localu = com.tencent.mm.network.b.a(paramString1, null);
        localObject6 = localJSONArray;
        localObject7 = localu;
        localObject8 = localObject2;
        localObject9 = localObject4;
        localObject10 = localu;
        localObject11 = localObject1;
        localu.setUseCaches(true);
        localObject6 = localJSONArray;
        localObject7 = localu;
        localObject8 = localObject2;
        localObject9 = localObject4;
        localObject10 = localu;
        localObject11 = localObject1;
        localu.setConnectTimeout(3000);
        localObject6 = localJSONArray;
        localObject7 = localu;
        localObject8 = localObject2;
        localObject9 = localObject4;
        localObject10 = localu;
        localObject11 = localObject1;
        localu.setReadTimeout(3000);
        localObject6 = localJSONArray;
        localObject7 = localu;
        localObject8 = localObject2;
        localObject9 = localObject4;
        localObject10 = localu;
        localObject11 = localObject1;
        localObject2 = localu.getInputStream();
        paramString1 = (String)localObject5;
        localObject5 = localObject2;
        continue;
        localObject6 = paramString1;
        localObject7 = localu;
        localObject8 = localObject5;
        localObject9 = paramString1;
        localObject10 = localu;
        localObject11 = localObject5;
        localObject2 = new org/json/JSONObject;
        localObject6 = paramString1;
        localObject7 = localu;
        localObject8 = localObject5;
        localObject9 = paramString1;
        localObject10 = localu;
        localObject11 = localObject5;
        ((JSONObject)localObject2).<init>(localStringBuilder.toString().substring(13));
        localObject6 = paramString1;
        localObject7 = localu;
        localObject8 = localObject5;
        localObject9 = paramString1;
        localObject10 = localu;
        localObject11 = localObject5;
        localObject1 = ((JSONObject)localObject2).optJSONObject("fl");
        if (localObject1 != null)
        {
          localObject6 = paramString1;
          localObject7 = localu;
          localObject8 = localObject5;
          localObject9 = paramString1;
          localObject10 = localu;
          localObject11 = localObject5;
          localObject3 = ((JSONObject)localObject1).optJSONArray("fi");
          if (localObject3 != null)
          {
            k = 0;
            localObject6 = paramString1;
            localObject7 = localu;
            localObject8 = localObject5;
            localObject9 = paramString1;
            localObject10 = localu;
            localObject11 = localObject5;
            if (k < ((JSONArray)localObject3).length())
            {
              localObject6 = paramString1;
              localObject7 = localu;
              localObject8 = localObject5;
              localObject9 = paramString1;
              localObject10 = localu;
              localObject11 = localObject5;
              localObject1 = ((JSONArray)localObject3).getJSONObject(k);
              localObject6 = paramString1;
              localObject7 = localu;
              localObject8 = localObject5;
              localObject9 = paramString1;
              localObject10 = localu;
              localObject11 = localObject5;
              if (((JSONObject)localObject1).optInt("sl", 0) != 1)
                continue;
              localObject6 = paramString1;
              localObject7 = localu;
              localObject8 = localObject5;
              localObject9 = paramString1;
              localObject10 = localu;
              localObject11 = localObject5;
              paramchw.xha = ((JSONObject)localObject1).optLong("fs");
            }
          }
        }
        localObject6 = paramString1;
        localObject7 = localu;
        localObject8 = localObject5;
        localObject9 = paramString1;
        localObject10 = localu;
        localObject11 = localObject5;
        localObject2 = ((JSONObject)localObject2).optJSONObject("vl");
        if (localObject2 != null)
        {
          localObject6 = paramString1;
          localObject7 = localu;
          localObject8 = localObject5;
          localObject9 = paramString1;
          localObject10 = localu;
          localObject11 = localObject5;
          localObject2 = ((JSONObject)localObject2).optJSONArray("vi");
          if (localObject2 != null)
          {
            localObject6 = paramString1;
            localObject7 = localu;
            localObject8 = localObject5;
            localObject9 = paramString1;
            localObject10 = localu;
            localObject11 = localObject5;
            if (((JSONArray)localObject2).length() > 0)
            {
              localObject6 = paramString1;
              localObject7 = localu;
              localObject8 = localObject5;
              localObject9 = paramString1;
              localObject10 = localu;
              localObject11 = localObject5;
              localObject2 = ((JSONArray)localObject2).getJSONObject(0);
              if (localObject2 != null)
              {
                localObject6 = paramString1;
                localObject7 = localu;
                localObject8 = localObject5;
                localObject9 = paramString1;
                localObject10 = localu;
                localObject11 = localObject5;
                localObject3 = ((JSONObject)localObject2).optString("fn");
                localObject6 = paramString1;
                localObject7 = localu;
                localObject8 = localObject5;
                localObject9 = paramString1;
                localObject10 = localu;
                localObject11 = localObject5;
                str = ((JSONObject)localObject2).optString("fvkey");
                localObject6 = paramString1;
                localObject7 = localu;
                localObject8 = localObject5;
                localObject9 = paramString1;
                localObject10 = localu;
                localObject11 = localObject5;
                localObject2 = ((JSONObject)localObject2).optJSONObject("ul");
                if (localObject2 != null)
                {
                  localObject6 = paramString1;
                  localObject7 = localu;
                  localObject8 = localObject5;
                  localObject9 = paramString1;
                  localObject10 = localu;
                  localObject11 = localObject5;
                  localJSONArray = ((JSONObject)localObject2).optJSONArray("ui");
                  if (localJSONArray != null)
                  {
                    localObject6 = paramString1;
                    localObject7 = localu;
                    localObject8 = localObject5;
                    localObject9 = paramString1;
                    localObject10 = localu;
                    localObject11 = localObject5;
                    if (localJSONArray.length() > 0)
                    {
                      k = 0;
                      localObject6 = paramString1;
                      localObject7 = localu;
                      localObject8 = localObject5;
                      localObject9 = paramString1;
                      localObject10 = localu;
                      localObject11 = localObject5;
                      if (k < localJSONArray.length())
                      {
                        localObject6 = paramString1;
                        localObject7 = localu;
                        localObject8 = localObject5;
                        localObject9 = paramString1;
                        localObject10 = localu;
                        localObject11 = localObject5;
                        localObject1 = localJSONArray.getJSONObject(k);
                        if (localObject1 != null)
                        {
                          localObject6 = paramString1;
                          localObject7 = localu;
                          localObject8 = localObject5;
                          localObject9 = paramString1;
                          localObject10 = localu;
                          localObject11 = localObject5;
                          localObject2 = ((JSONObject)localObject1).optString("url");
                          localObject6 = paramString1;
                          localObject7 = localu;
                          localObject8 = localObject5;
                          localObject9 = paramString1;
                          localObject10 = localu;
                          localObject11 = localObject5;
                          int n = ((JSONObject)localObject1).optInt("vt", 0);
                          localObject6 = paramString1;
                          localObject7 = localu;
                          localObject8 = localObject5;
                          localObject9 = paramString1;
                          localObject10 = localu;
                          localObject11 = localObject5;
                          if (!bo.isNullOrNil((String)localObject2))
                          {
                            localObject6 = paramString1;
                            localObject7 = localu;
                            localObject8 = localObject5;
                            localObject9 = paramString1;
                            localObject10 = localu;
                            localObject11 = localObject5;
                            if (!bo.isNullOrNil(str))
                            {
                              localObject6 = paramString1;
                              localObject7 = localu;
                              localObject8 = localObject5;
                              localObject9 = paramString1;
                              localObject10 = localu;
                              localObject11 = localObject5;
                              if (!bo.isNullOrNil((String)localObject3))
                              {
                                localObject6 = paramString1;
                                localObject7 = localu;
                                localObject8 = localObject5;
                                localObject9 = paramString1;
                                localObject10 = localu;
                                localObject11 = localObject5;
                                localObject1 = new java/lang/StringBuilder;
                                localObject6 = paramString1;
                                localObject7 = localu;
                                localObject8 = localObject5;
                                localObject9 = paramString1;
                                localObject10 = localu;
                                localObject11 = localObject5;
                                ((StringBuilder)localObject1).<init>();
                                localObject6 = paramString1;
                                localObject7 = localu;
                                localObject8 = localObject5;
                                localObject9 = paramString1;
                                localObject10 = localu;
                                localObject11 = localObject5;
                                localObject1 = (String)localObject2 + (String)localObject3 + "?vkey=" + str;
                                localObject6 = paramString1;
                                localObject7 = localu;
                                localObject8 = localObject5;
                                localObject2 = localObject1;
                                localObject9 = paramString1;
                                localObject10 = localu;
                                localObject11 = localObject5;
                                if (!bo.isNullOrNil(paramString2))
                                {
                                  localObject6 = paramString1;
                                  localObject7 = localu;
                                  localObject8 = localObject5;
                                  localObject9 = paramString1;
                                  localObject10 = localu;
                                  localObject11 = localObject5;
                                  localObject2 = new java/lang/StringBuilder;
                                  localObject6 = paramString1;
                                  localObject7 = localu;
                                  localObject8 = localObject5;
                                  localObject9 = paramString1;
                                  localObject10 = localu;
                                  localObject11 = localObject5;
                                  ((StringBuilder)localObject2).<init>();
                                  localObject6 = paramString1;
                                  localObject7 = localu;
                                  localObject8 = localObject5;
                                  localObject9 = paramString1;
                                  localObject10 = localu;
                                  localObject11 = localObject5;
                                  localObject2 = (String)localObject1 + "&platform=" + paramString2;
                                }
                                localObject6 = paramString1;
                                localObject7 = localu;
                                localObject8 = localObject5;
                                localObject9 = paramString1;
                                localObject10 = localu;
                                localObject11 = localObject5;
                                if (!bo.isNullOrNil((String)localObject2))
                                  continue;
                                localObject6 = paramString1;
                                localObject7 = localu;
                                localObject8 = localObject5;
                                localObject9 = paramString1;
                                localObject10 = localu;
                                localObject11 = localObject5;
                                localObject1 = new com/tencent/mm/protocal/protobuf/chy;
                                localObject6 = paramString1;
                                localObject7 = localu;
                                localObject8 = localObject5;
                                localObject9 = paramString1;
                                localObject10 = localu;
                                localObject11 = localObject5;
                                ((chy)localObject1).<init>();
                                localObject6 = paramString1;
                                localObject7 = localu;
                                localObject8 = localObject5;
                                localObject9 = paramString1;
                                localObject10 = localu;
                                localObject11 = localObject5;
                                ((chy)localObject1).url = ((String)localObject2);
                                localObject6 = paramString1;
                                localObject7 = localu;
                                localObject8 = localObject5;
                                localObject9 = paramString1;
                                localObject10 = localu;
                                localObject11 = localObject5;
                                ((chy)localObject1).xhg = n;
                                localObject6 = paramString1;
                                localObject7 = localu;
                                localObject8 = localObject5;
                                localObject9 = paramString1;
                                localObject10 = localu;
                                localObject11 = localObject5;
                                paramchw.xhb.add(localObject1);
                              }
                            }
                          }
                        }
                        k++;
                        continue;
                        k++;
                        continue;
                        localObject6 = paramString1;
                        localObject7 = localu;
                        localObject8 = localObject5;
                        localObject9 = paramString1;
                        localObject10 = localu;
                        localObject11 = localObject5;
                        localObject1 = new java/lang/StringBuilder;
                        localObject6 = paramString1;
                        localObject7 = localu;
                        localObject8 = localObject5;
                        localObject9 = paramString1;
                        localObject10 = localu;
                        localObject11 = localObject5;
                        ((StringBuilder)localObject1).<init>();
                        localObject6 = paramString1;
                        localObject7 = localu;
                        localObject8 = localObject5;
                        localObject9 = paramString1;
                        localObject10 = localu;
                        localObject11 = localObject5;
                        localObject2 = (String)localObject2 + "&" + "Unicomtype=" + i + "&newnettype=" + j + "&Netoperator=" + m;
                        localObject6 = paramString1;
                        localObject7 = localu;
                        localObject8 = localObject5;
                        localObject9 = paramString1;
                        localObject10 = localu;
                        localObject11 = localObject5;
                        ab.d("MicroMsg.TopStory.TopStoryVideoDataMgr", "joinUrlWithNetInfo: ".concat(String.valueOf(localObject2)));
                        continue;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      finally
      {
        if (localObject10 != null)
          ((u)localObject10).connection.disconnect();
        if (localObject9 != null)
          ((v)localObject9).gdG.disconnect();
        if (localObject11 != null)
          com.tencent.mm.a.e.p(localObject11);
        AppMethodBeat.o(1773);
      }
      if (localu != null)
        localu.connection.disconnect();
      if (paramString1 != null)
        paramString1.gdG.disconnect();
      if (localObject5 != null)
      {
        com.tencent.mm.a.e.p((InputStream)localObject5);
        AppMethodBeat.o(1773);
      }
      else
      {
        AppMethodBeat.o(1773);
      }
    }
  }

  private static boolean a(int paramInt, chw paramchw, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(1772);
    if (paramInt == 1);
    try
    {
      paramJSONObject = paramJSONObject.optJSONObject("mpInfo");
      while ((paramJSONObject != null) && (paramJSONObject.optJSONArray("urlInfo") != null))
      {
        JSONArray localJSONArray = paramJSONObject.optJSONArray("urlInfo");
        paramInt = 0;
        while (true)
          if (paramInt < localJSONArray.length())
          {
            JSONObject localJSONObject = (JSONObject)localJSONArray.get(paramInt);
            if ((localJSONObject.has("url")) && (localJSONObject.has("filesize")))
            {
              paramchw.xha = localJSONObject.optInt("filesize", 0);
              chy localchy = new com/tencent/mm/protocal/protobuf/chy;
              localchy.<init>();
              localchy.url = localJSONObject.optString("url");
              localchy.xhg = 0;
              paramchw.xhb.add(localchy);
            }
            paramInt++;
            continue;
            paramJSONObject = paramJSONObject.optJSONObject("ctnInfo");
            break;
          }
        paramchw.xgQ = paramJSONObject.optString("coverUrl");
        if (paramchw.xha > 0L)
        {
          bool = bo.ek(paramchw.xhb);
          if (!bool)
            break label250;
        }
        AppMethodBeat.o(1772);
      }
      for (bool = false; ; bool = false)
      {
        return bool;
        AppMethodBeat.o(1772);
      }
    }
    catch (Exception paramchw)
    {
      while (true)
      {
        ab.e("MicroMsg.TopStory.TopStoryVideoDataMgr", "setVideoInfoByCdn exception: " + paramchw.getMessage());
        AppMethodBeat.o(1772);
        boolean bool = false;
        continue;
        label250: AppMethodBeat.o(1772);
        bool = true;
      }
    }
  }

  public final void FK(int paramInt)
  {
    AppMethodBeat.i(1766);
    if (paramInt >= 0);
    try
    {
      if (paramInt < cGQ().size())
        cGQ().remove(paramInt);
      return;
    }
    finally
    {
      AppMethodBeat.o(1766);
    }
  }

  public final chw FL(int paramInt)
  {
    AppMethodBeat.i(1767);
    if (paramInt >= 0);
    try
    {
      chw localchw;
      if (paramInt < cGQ().size())
        localchw = (chw)cGQ().get(paramInt);
      while (true)
      {
        return localchw;
        localchw = null;
        AppMethodBeat.o(1767);
      }
    }
    finally
    {
      AppMethodBeat.o(1767);
    }
  }

  public final boolean FM(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(1768);
    if (this.sEY)
    {
      ab.w("MicroMsg.TopStory.TopStoryVideoDataMgr", "RequestingData");
      AppMethodBeat.o(1768);
      return bool;
    }
    ab.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "requestData: %s", new Object[] { Integer.valueOf(paramInt) });
    this.sEY = true;
    chv localchv = com.tencent.mm.plugin.topstory.a.g.a(this.sDo.cFT());
    localchv.offset = paramInt;
    Object localObject1;
    if (!bo.isNullOrNil(this.sDo.cFT().xgC))
    {
      localObject1 = new tn();
      ((tn)localObject1).key = "relevant_vid";
      ((tn)localObject1).waE = this.sDo.cFT().xgC;
      localchv.tZG.add(localObject1);
    }
    if (!bo.isNullOrNil(this.sDo.cFT().xgD))
    {
      localObject1 = new tn();
      ((tn)localObject1).key = "relevant_expand";
      ((tn)localObject1).waE = this.sDo.cFT().xgD;
      localchv.tZG.add(localObject1);
    }
    if (!bo.isNullOrNil(this.sDo.cFT().xgE))
    {
      localObject1 = new tn();
      ((tn)localObject1).key = "relevant_pre_searchid";
      ((tn)localObject1).waE = this.sDo.cFT().xgE;
      localchv.tZG.add(localObject1);
    }
    if (!bo.isNullOrNil(this.sDo.cFT().xgF))
    {
      localObject1 = new tn();
      ((tn)localObject1).key = "relevant_shared_openid";
      ((tn)localObject1).waE = this.sDo.cFT().xgF;
      localchv.tZG.add(localObject1);
    }
    if (this.sDo.cFT().xgI != null)
    {
      localObject1 = new tn();
      ((tn)localObject1).key = "rec_category";
      ((tn)localObject1).waD = this.sDo.cFT().xgI.wYN;
      localchv.tZG.add(localObject1);
      localObject1 = localchv.tZG.iterator();
      do
        if (!((Iterator)localObject1).hasNext())
          break;
      while (!"show_tag_list".equals(((tn)((Iterator)localObject1).next()).key));
    }
    for (paramInt = 0; ; paramInt = 1)
    {
      if ((this.sDo.cFT().xgI != null) && (paramInt != 0))
      {
        localObject1 = new tn();
        ((tn)localObject1).key = "show_tag_list";
        ((tn)localObject1).waE = this.sDo.cFT().xgI.id;
        localchv.tZG.add(localObject1);
      }
      localObject1 = new tn();
      ((tn)localObject1).key = "fetch_seed_videoinfo";
      label551: Object localObject2;
      label691: com.tencent.mm.plugin.topstory.a.b.b localb;
      if ((this.sDo.cFT().xgI != null) && (!bo.isNullOrNil(this.sDo.cFT().xgI.id)))
      {
        ((tn)localObject1).waD = 0L;
        localchv.tZG.add(localObject1);
        if (cGR() == 1)
        {
          localObject2 = FL(0);
          localObject1 = new tn();
          ((tn)localObject1).key = "first_video_tag_list";
          ((tn)localObject1).waE = com.tencent.mm.plugin.topstory.a.g.dN(((chw)localObject2).wiH).toString();
          localchv.tZG.add(localObject1);
        }
        localObject1 = this.sDo.cFR();
        if (((o)localObject1).sFn.size() <= 0)
          break label964;
        localObject2 = new ArrayList();
        ((List)localObject2).addAll(((o)localObject1).sFn.values());
        localObject1 = new StringBuffer("");
        localObject2 = ((List)localObject2).iterator();
        if (!((Iterator)localObject2).hasNext())
          break label826;
        localb = (com.tencent.mm.plugin.topstory.a.b.b)((Iterator)localObject2).next();
        if (!localb.sAY)
          break label821;
      }
      label821: for (paramInt = 1; ; paramInt = 0)
      {
        ((StringBuffer)localObject1).append(paramInt);
        ((StringBuffer)localObject1).append("_");
        ((StringBuffer)localObject1).append(localb.sAX.xgS);
        ((StringBuffer)localObject1).append(";");
        break label691;
        localObject1 = new tn();
        ((tn)localObject1).key = "rec_category";
        ((tn)localObject1).waD = this.sDo.cFT().xgG;
        localchv.tZG.add(localObject1);
        break;
        ((tn)localObject1).waD = 1L;
        break label551;
      }
      label826: label964: for (localObject1 = ((StringBuffer)localObject1).toString(); ; localObject1 = null)
      {
        if (!bo.isNullOrNil((String)localObject1))
        {
          localObject2 = new tn();
          ((tn)localObject2).key = "client_exposed_info";
          ((tn)localObject2).waE = ((String)localObject1);
          localchv.tZG.add(localObject2);
        }
        localObject1 = new tn();
        ((tn)localObject1).key = "is_prefetch";
        ((tn)localObject1).waD = this.sEZ;
        localchv.tZG.add(localObject1);
        this.sFa = new j(localchv);
        com.tencent.mm.kernel.g.Rg().a(this.sFa, 0);
        com.tencent.mm.kernel.g.Rg().a(1943, this.fur);
        a.kT(0);
        AppMethodBeat.o(1768);
        bool = true;
        break;
      }
    }
  }

  public final void a(chv paramchv, int paramInt)
  {
    AppMethodBeat.i(1769);
    ArrayList localArrayList = new ArrayList();
    try
    {
      List localList = cGQ();
      if ((bo.ek(localList)) || (paramInt >= localList.size()));
      while (true)
      {
        return;
        int i;
        if (paramInt > 0)
          i = paramInt - 1;
        while ((i < localList.size()) && (i < paramInt + 10))
        {
          localArrayList.add(((chw)localList.get(i)).xgS);
          i++;
          continue;
          i = paramInt;
        }
        paramchv = new com.tencent.mm.plugin.topstory.a.c.e(paramchv, localArrayList);
        com.tencent.mm.kernel.g.Rg().a(paramchv, 0);
        com.tencent.mm.kernel.g.Rg().a(paramchv.getType(), new n.2(this, paramchv));
        AppMethodBeat.o(1769);
      }
    }
    finally
    {
      AppMethodBeat.o(1769);
    }
    throw paramchv;
  }

  public final void aEX()
  {
    AppMethodBeat.i(1770);
    com.tencent.mm.kernel.g.Rg().b(1943, this.fur);
    AppMethodBeat.o(1770);
  }

  public final List<chw> cGQ()
  {
    AppMethodBeat.i(1763);
    LinkedList localLinkedList = this.sDo.cFT().xgK;
    AppMethodBeat.o(1763);
    return localLinkedList;
  }

  public final int cGR()
  {
    AppMethodBeat.i(1764);
    int i = cGQ().size();
    AppMethodBeat.o(1764);
    return i;
  }

  public final void d(chw paramchw)
  {
    AppMethodBeat.i(1765);
    try
    {
      cGQ().add(paramchw);
      return;
    }
    finally
    {
      AppMethodBeat.o(1765);
    }
    throw paramchw;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.n
 * JD-Core Version:    0.6.2
 */