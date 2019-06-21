package com.tencent.mm.plugin.sns.h;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.at;
import com.tencent.mm.protocal.protobuf.av;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.azu;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.baw;
import com.tencent.mm.protocal.protobuf.cde;
import com.tencent.mm.protocal.protobuf.cdg;
import com.tencent.mm.protocal.protobuf.cfg;
import com.tencent.mm.protocal.protobuf.cth;
import com.tencent.mm.protocal.protobuf.cvi;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class j
{
  public static String jrk = "<TimelineObject>";
  public static String jrl = "</TimelineObject>";
  public static String jvr = "]]>";

  private static String YE(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }

  private static String YF(String paramString)
  {
    AppMethodBeat.i(36840);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(36840);
    }
    while (true)
    {
      return paramString;
      if (paramString.matches("\\d*"));
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label50;
        AppMethodBeat.o(36840);
        break;
      }
      label50: paramString = "";
      AppMethodBeat.o(36840);
    }
  }

  public static String b(TimeLineObject paramTimeLineObject)
  {
    AppMethodBeat.i(36841);
    j.a locala = new j.a();
    Object localObject1 = new HashMap();
    locala.Fi("TimelineObject");
    locala.Fi("id");
    Object localObject2;
    label1917: Object localObject3;
    if ((paramTimeLineObject.Id == null) || (paramTimeLineObject.Id.equals("")))
    {
      locala.setText("0");
      locala.Fj("id");
      if (paramTimeLineObject.jBB != null)
      {
        locala.Fi("username");
        locala.setText(paramTimeLineObject.jBB);
        locala.Fj("username");
      }
      locala.Fi("createTime");
      locala.setText(paramTimeLineObject.pcX);
      locala.Fj("createTime");
      locala.Fi("contentDescShowType");
      locala.setText(paramTimeLineObject.xfK);
      locala.Fj("contentDescShowType");
      locala.Fi("contentDescScene");
      locala.setText(paramTimeLineObject.xfL);
      locala.Fj("contentDescScene");
      locala.Fi("private");
      locala.setText(paramTimeLineObject.wEJ);
      locala.Fj("private");
      if ((paramTimeLineObject.xfH != null) && (!bo.isNullOrNil(paramTimeLineObject.xfH.Id)))
      {
        locala.Fi("appInfo");
        locala.Fi("id");
        locala.setText(YE(paramTimeLineObject.xfH.Id));
        locala.Fj("id");
        locala.Fi("version");
        locala.setText(YE(paramTimeLineObject.xfH.jCh));
        locala.Fj("version");
        locala.Fi("appName");
        locala.setText(YE(paramTimeLineObject.xfH.ncH));
        locala.Fj("appName");
        locala.Fi("installUrl");
        locala.setText(YE(paramTimeLineObject.xfH.vFw));
        locala.Fj("installUrl");
        locala.Fi("fromUrl");
        locala.setText(YE(paramTimeLineObject.xfH.vFx));
        locala.Fj("fromUrl");
        locala.Fj("appInfo");
      }
      if ((paramTimeLineObject.xfN != null) && (!bo.isNullOrNil(paramTimeLineObject.xfN.fiG)))
      {
        locala.Fi("streamvideo");
        locala.Fi("streamvideourl");
        locala.setText(YE(paramTimeLineObject.xfN.fiG));
        locala.Fj("streamvideourl");
        locala.Fi("streamvideototaltime");
        locala.setText(paramTimeLineObject.xfN.fiH);
        locala.Fj("streamvideototaltime");
        locala.Fi("streamvideotitle");
        locala.setText(YE(paramTimeLineObject.xfN.fiI));
        locala.Fj("streamvideotitle");
        locala.Fi("streamvideowording");
        locala.setText(YE(paramTimeLineObject.xfN.fiJ));
        locala.Fj("streamvideowording");
        locala.Fi("streamvideoweburl");
        locala.setText(YE(paramTimeLineObject.xfN.fiK));
        locala.Fj("streamvideoweburl");
        locala.Fi("streamvideothumburl");
        locala.setText(YE(paramTimeLineObject.xfN.fiL));
        locala.Fj("streamvideothumburl");
        locala.Fi("streamvideoaduxinfo");
        locala.setText(YE(paramTimeLineObject.xfN.fiM));
        locala.Fj("streamvideoaduxinfo");
        locala.Fi("streamvideopublishid");
        locala.setText(YE(paramTimeLineObject.xfN.fiN));
        locala.Fj("streamvideopublishid");
        locala.Fj("streamvideo");
      }
      if ((paramTimeLineObject.qNQ != null) && (!bo.isNullOrNil(paramTimeLineObject.qNQ.uaa)))
      {
        locala.Fi("websearch");
        locala.Fi("relevant_vid");
        locala.setText(YE(paramTimeLineObject.qNQ.uaa));
        locala.Fj("relevant_vid");
        locala.Fi("relevant_expand");
        locala.setText(YE(paramTimeLineObject.qNQ.uab));
        locala.Fj("relevant_expand");
        locala.Fi("relevant_pre_searchid");
        locala.setText(YE(paramTimeLineObject.qNQ.uac));
        locala.Fj("relevant_pre_searchid");
        locala.Fi("relevant_shared_openid");
        locala.setText(YE(paramTimeLineObject.qNQ.uad));
        locala.Fj("relevant_shared_openid");
        locala.Fi("rec_category");
        locala.setText(YE(paramTimeLineObject.qNQ.uae));
        locala.Fj("rec_category");
        locala.Fi("shareUrl");
        locala.setText(YE(paramTimeLineObject.qNQ.lvz));
        locala.Fj("shareUrl");
        locala.Fi("shareTitle");
        locala.setText(YE(paramTimeLineObject.qNQ.lvA));
        locala.Fj("shareTitle");
        locala.Fi("shareDesc");
        locala.setText(YE(paramTimeLineObject.qNQ.qVw));
        locala.Fj("shareDesc");
        locala.Fi("shareImgUrl");
        locala.setText(YE(paramTimeLineObject.qNQ.uaf));
        locala.Fj("shareImgUrl");
        locala.Fi("shareString");
        locala.setText(YE(paramTimeLineObject.qNQ.uag));
        locala.Fj("shareString");
        locala.Fi("shareStringUrl");
        locala.setText(YE(paramTimeLineObject.qNQ.uah));
        locala.Fj("shareStringUrl");
        locala.Fi("source");
        locala.setText(YE(paramTimeLineObject.qNQ.source));
        locala.Fj("source");
        locala.Fi("strPlayCount");
        locala.setText(YE(paramTimeLineObject.qNQ.uai));
        locala.Fj("strPlayCount");
        locala.Fi("titleUrl");
        locala.setText(YE(paramTimeLineObject.qNQ.uaj));
        locala.Fj("titleUrl");
        locala.Fi("extReqParams");
        locala.setText(YE(paramTimeLineObject.qNQ.uak));
        locala.Fj("extReqParams");
        locala.Fi("tagList");
        locala.setText(YE(paramTimeLineObject.qNQ.ual));
        locala.Fj("tagList");
        locala.Fi("channelId");
        locala.setText(YE(paramTimeLineObject.qNQ.uam));
        locala.Fj("channelId");
        locala.Fi("thumbUrl");
        locala.setText(YE(paramTimeLineObject.qNQ.thumbUrl));
        locala.Fj("thumbUrl");
        locala.Fi("shareTag");
        locala.setText(YE(paramTimeLineObject.qNQ.uan));
        locala.Fj("shareTag");
        locala.Fj("websearch");
      }
      locala.Fi("contentDesc");
      locala.setText(YE(paramTimeLineObject.xfF));
      locala.Fj("contentDesc");
      locala.Fi("contentattr");
      locala.setText(paramTimeLineObject.fgt);
      locala.Fj("contentattr");
      locala.Fi("sourceUserName");
      locala.setText(YE(paramTimeLineObject.ijx));
      locala.Fj("sourceUserName");
      locala.Fi("sourceNickName");
      locala.setText(YE(paramTimeLineObject.vjM));
      locala.Fj("sourceNickName");
      locala.Fi("statisticsData");
      locala.setText(YE(paramTimeLineObject.xfM));
      locala.Fj("statisticsData");
      locala.Fi("weappInfo");
      locala.Fi("appUserName");
      locala.setText(YE(paramTimeLineObject.xfO.username));
      locala.Fj("appUserName");
      locala.Fi("pagePath");
      locala.setText(YE(paramTimeLineObject.xfO.path));
      locala.Fj("pagePath");
      locala.Fj("weappInfo");
      locala.Fi("canvasInfoXml");
      locala.setText(YE(paramTimeLineObject.rCK));
      locala.Fj("canvasInfoXml");
      if (paramTimeLineObject.xfG != null)
      {
        float f1 = paramTimeLineObject.xfG.vRp;
        float f2 = paramTimeLineObject.xfG.vRq;
        if ((f1 != -1000.0F) && (f2 != -1000.0F))
        {
          ((Map)localObject1).clear();
          ((Map)localObject1).put("longitude", paramTimeLineObject.xfG.vRp);
          ((Map)localObject1).put("latitude", paramTimeLineObject.xfG.vRq);
          ((Map)localObject1).put("city", bo.ani(YE(paramTimeLineObject.xfG.guP)));
          ((Map)localObject1).put("poiName", bo.ani(YE(paramTimeLineObject.xfG.eUu)));
          ((Map)localObject1).put("poiAddress", bo.ani(YE(paramTimeLineObject.xfG.rkg)));
          ((Map)localObject1).put("poiScale", paramTimeLineObject.xfG.wCE);
          ((Map)localObject1).put("poiClassifyId", YE(paramTimeLineObject.xfG.wCC));
          ((Map)localObject1).put("poiClassifyType", paramTimeLineObject.xfG.rki);
          ((Map)localObject1).put("poiClickableStatus", paramTimeLineObject.xfG.wCF);
          locala.m("location", (Map)localObject1);
          locala.Fj("location");
        }
      }
      locala.Fi("ContentObject");
      locala.Fi("contentStyle");
      locala.setText(paramTimeLineObject.xfI.wbJ);
      locala.Fj("contentStyle");
      locala.Fi("contentSubStyle");
      locala.setText(paramTimeLineObject.xfI.wbL);
      locala.Fj("contentSubStyle");
      locala.Fi("title");
      locala.setText(YE(paramTimeLineObject.xfI.Title));
      locala.Fj("title");
      locala.Fi("description");
      locala.setText(YE(paramTimeLineObject.xfI.Desc));
      locala.Fj("description");
      locala.Fi("contentUrl");
      locala.setText(YE(paramTimeLineObject.xfI.Url));
      locala.Fj("contentUrl");
      if (paramTimeLineObject.xfI.wbK.size() <= 0)
        break label2713;
      locala.Fi("mediaList");
      localObject2 = paramTimeLineObject.xfI.wbK.iterator();
      if (!((Iterator)localObject2).hasNext())
        break label2706;
      localObject3 = (bau)((Iterator)localObject2).next();
      locala.Fi("media");
      locala.Fi("id");
      if (!YF(((bau)localObject3).Id).equals(""))
        break label2691;
      locala.setText("0");
    }
    while (true)
    {
      locala.Fj("id");
      locala.Fi("type");
      locala.setText(((bau)localObject3).jCt);
      locala.Fj("type");
      locala.Fi("title");
      locala.setText(YE(((bau)localObject3).Title));
      locala.Fj("title");
      locala.Fi("description");
      locala.setText(YE(((bau)localObject3).Desc));
      locala.Fj("description");
      locala.Fi("private");
      locala.setText(((bau)localObject3).wEJ);
      locala.Fj("private");
      ((Map)localObject1).clear();
      ((Map)localObject1).put("type", ((bau)localObject3).wEG);
      if (!bo.isNullOrNil(((bau)localObject3).cvZ))
        ((Map)localObject1).put("md5", ((bau)localObject3).cvZ);
      if (!bo.isNullOrNil(((bau)localObject3).wFc))
        ((Map)localObject1).put("videomd5", ((bau)localObject3).wFc);
      locala.m("url", (Map)localObject1);
      locala.setText(YE(((bau)localObject3).Url));
      locala.Fj("url");
      if ((((bau)localObject3).wEH != null) && (!((bau)localObject3).wEH.equals("")))
      {
        ((Map)localObject1).clear();
        ((Map)localObject1).put("type", ((bau)localObject3).wEI);
        locala.m("thumb", (Map)localObject1);
        locala.setText(YE(((bau)localObject3).wEH));
        locala.Fj("thumb");
      }
      if (((bau)localObject3).cuu > 0)
      {
        locala.Fi("subType");
        locala.setText(((bau)localObject3).cuu);
        locala.Fj("subType");
      }
      if (!bo.isNullOrNil(((bau)localObject3).rik))
      {
        locala.Fi("userData");
        locala.setText(((bau)localObject3).rik);
        locala.Fj("userData");
      }
      if ((((bau)localObject3).wEL != null) && (!((bau)localObject3).wEL.equals("")))
      {
        ((Map)localObject1).clear();
        ((Map)localObject1).put("type", ((bau)localObject3).wEM);
        locala.m("lowBandUrl", (Map)localObject1);
        locala.setText(YE(((bau)localObject3).wEL));
        locala.Fj("lowBandUrl");
      }
      if (((bau)localObject3).wEK != null)
      {
        ((Map)localObject1).clear();
        if (((bau)localObject3).wEK.wFx > 0.0F)
          ((Map)localObject1).put("width", ((bau)localObject3).wEK.wFx);
        if (((bau)localObject3).wEK.wFy > 0.0F)
          ((Map)localObject1).put("height", ((bau)localObject3).wEK.wFy);
        if (((bau)localObject3).wEK.wFz > 0.0F)
          ((Map)localObject1).put("totalSize", ((bau)localObject3).wEK.wFz);
        locala.m("size", (Map)localObject1);
        locala.Fj("size");
      }
      locala.Fj("media");
      break label1917;
      locala.setText(paramTimeLineObject.Id);
      break;
      label2691: locala.setText(YF(((bau)localObject3).Id));
    }
    label2706: locala.Fj("mediaList");
    label2713: locala.jvt.append(YE(paramTimeLineObject.xfI.wbM));
    if ((paramTimeLineObject.xfI.wbN != null) && (paramTimeLineObject.xfI.wbN.vGc != -1))
    {
      locala.Fi("mmreadershare");
      if (paramTimeLineObject.xfI.wbN.vGc == 5)
      {
        locala.Fi("itemshowtype");
        locala.setText(paramTimeLineObject.xfI.wbN.vGc);
        locala.Fj("itemshowtype");
        locala.Fi("pubtime");
        locala.setText(paramTimeLineObject.xfI.wbN.fga);
        locala.Fj("pubtime");
        locala.Fi("vid");
        locala.setText(paramTimeLineObject.xfI.wbN.fgd);
        locala.Fj("vid");
        locala.Fi("funcflag");
        locala.setText(paramTimeLineObject.xfI.wbN.fgc);
        locala.Fj("funcflag");
        locala.Fi("duration");
        locala.setText(paramTimeLineObject.xfI.wbN.duration);
        locala.Fj("duration");
        locala.Fi("digest");
        locala.setText(paramTimeLineObject.xfI.wbN.desc);
        locala.Fj("digest");
        locala.Fi("cover");
        locala.setText(paramTimeLineObject.xfI.wbN.lvx);
        locala.Fj("cover");
        locala.Fi("nativepage");
        locala.setText(1);
        locala.Fj("nativepage");
        locala.Fi("width");
        locala.setText(paramTimeLineObject.xfI.wbN.videoWidth);
        locala.Fj("width");
        locala.Fi("height");
        locala.setText(paramTimeLineObject.xfI.wbN.videoHeight);
        locala.Fj("height");
      }
      locala.Fj("mmreadershare");
    }
    locala.Fj("ContentObject");
    if (paramTimeLineObject.qNO != null)
    {
      locala.Fi("actionInfo");
      if (paramTimeLineObject.qNO.vCy != null)
      {
        locala.Fi("appMsg");
        locala.Fi("mediaTagName");
        locala.setText(paramTimeLineObject.qNO.vCy.vCs);
        locala.Fj("mediaTagName");
        locala.Fi("messageExt");
        locala.setText(paramTimeLineObject.qNO.vCy.vCt);
        locala.Fj("messageExt");
        locala.Fi("messageAction");
        locala.setText(paramTimeLineObject.qNO.vCy.vCu);
        locala.Fj("messageAction");
        locala.Fj("appMsg");
      }
      locala.Fj("actionInfo");
    }
    if ((paramTimeLineObject.xfH != null) && (!bo.isNullOrNil(paramTimeLineObject.xfH.Id)))
    {
      localObject1 = paramTimeLineObject.rjC;
      localObject2 = new cdg();
      if (localObject1 != null)
        localObject3 = Base64.decode((String)localObject1, 0);
    }
    try
    {
      ((cdg)localObject2).parseFrom((byte[])localObject3);
      label3243: ((cdg)localObject2).xcU = new cde();
      ((cdg)localObject2).xcU.mVX = paramTimeLineObject.xfH.Id;
      try
      {
        localObject2 = Base64.encodeToString(((cdg)localObject2).toByteArray(), 0);
        localObject1 = localObject2;
        localObject2 = ((String)localObject2).replace("\n", "");
        localObject1 = localObject2;
        paramTimeLineObject.rjC = ((String)localObject1);
        if (paramTimeLineObject.rjC != null)
        {
          locala.Fi("statExtStr");
          locala.setText(paramTimeLineObject.rjC);
          locala.Fj("statExtStr");
        }
        locala.Fj("TimelineObject");
        paramTimeLineObject = locala.jvt.toString();
        ab.d("MicroMsg.TimelineConvert", "xmlContent: ".concat(String.valueOf(paramTimeLineObject)));
        if (br.z(paramTimeLineObject, "TimelineObject") == null)
        {
          ab.e("MicroMsg.TimelineConvert", "xml is error");
          paramTimeLineObject = "";
          AppMethodBeat.o(36841);
          return paramTimeLineObject;
        }
      }
      catch (IOException localIOException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.TimelineConvert", localIOException, "", new Object[0]);
          continue;
          AppMethodBeat.o(36841);
        }
      }
    }
    catch (Exception localException)
    {
      break label3243;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.h.j
 * JD-Core Version:    0.6.2
 */