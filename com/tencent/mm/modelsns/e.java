package com.tencent.mm.modelsns;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.bz.a;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.at;
import com.tencent.mm.protocal.protobuf.av;
import com.tencent.mm.protocal.protobuf.ayt;
import com.tencent.mm.protocal.protobuf.azu;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.baw;
import com.tencent.mm.protocal.protobuf.cbc;
import com.tencent.mm.protocal.protobuf.cfg;
import com.tencent.mm.protocal.protobuf.cth;
import com.tencent.mm.protocal.protobuf.cvi;
import com.tencent.mm.protocal.protobuf.dj;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.protocal.protobuf.dt;
import com.tencent.mm.protocal.protobuf.du;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.LinkedList;
import java.util.Map;

public final class e
{
  public static Pair<Integer, Integer> a(int paramInt1, int paramInt2, Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(35582);
    if (paramInt1 <= 0);
    for (int i = 320; ; i = paramInt1)
    {
      int j = paramInt2;
      if (paramInt2 <= 0)
        j = 240;
      if (paramContext == null)
      {
        ab.e("MicroMsg.TimeLineHelper", "the context is null");
        paramContext = Pair.create(Integer.valueOf(i), Integer.valueOf(j));
        AppMethodBeat.o(35582);
        return paramContext;
      }
      DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
      if (localDisplayMetrics != null);
      for (paramInt1 = (int)Math.min(localDisplayMetrics.widthPixels * 0.63F, localDisplayMetrics.heightPixels * 0.63F); ; paramInt1 = i)
      {
        paramInt1 = paramInt1 >> 5 << 5;
        int k = paramInt1;
        if (i < j)
        {
          k = paramInt1;
          if (paramContext != null)
            k = Math.min(BackwardSupportUtil.b.b(paramContext, 160.0F), paramInt1);
        }
        int m = (int)(k * 1.0D * j / i);
        paramInt1 = m;
        paramInt2 = k;
        int n;
        int i1;
        if (!paramBoolean)
        {
          n = a.fromDPToPix(paramContext, 200);
          i1 = a.fromDPToPix(paramContext, 44);
          if (m < k)
            break label304;
          paramInt1 = m;
          if (m > n)
            paramInt1 = n;
          k = (int)(i * 1.0F / j * paramInt1);
          paramInt2 = k;
          if (k < i1)
          {
            paramInt1 = (int)(i1 * 1.0D * j / i);
            paramInt2 = i1;
          }
        }
        while (true)
        {
          ab.i("MicroMsg.TimeLineHelper", "getTimelineVideoSize: width %d, height %d, expectWidth %d,expectHeight %d, isAd: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean) });
          paramContext = Pair.create(Integer.valueOf(paramInt2), Integer.valueOf(paramInt1));
          AppMethodBeat.o(35582);
          break;
          label304: paramInt2 = k;
          if (k > n)
            paramInt2 = n;
          k = (int)(j * 1.0F / i * paramInt2);
          paramInt1 = k;
          if (k < i1)
          {
            paramInt2 = (int)(i1 * 1.0D * i / j);
            paramInt1 = i1;
          }
        }
      }
    }
  }

  public static Pair<Integer, Integer> a(TimeLineObject paramTimeLineObject, Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(35581);
    int i;
    int j;
    if ((paramTimeLineObject != null) && (paramTimeLineObject.xfI != null) && (paramTimeLineObject.xfI.wbK != null) && (paramTimeLineObject.xfI.wbK.size() > 0))
    {
      paramTimeLineObject = (bau)paramTimeLineObject.xfI.wbK.get(0);
      if ((paramTimeLineObject != null) && (paramTimeLineObject.wEK != null) && (paramTimeLineObject.wEK.wFx > 0.0F) && (paramTimeLineObject.wEK.wFy > 0.0F))
      {
        i = (int)paramTimeLineObject.wEK.wFx;
        j = (int)paramTimeLineObject.wEK.wFy;
      }
    }
    while (true)
    {
      paramTimeLineObject = a(i, j, paramContext, paramBoolean);
      AppMethodBeat.o(35581);
      return paramTimeLineObject;
      j = 0;
      i = 0;
    }
  }

  public static bau a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, int paramInt4, String paramString4, baw parambaw)
  {
    AppMethodBeat.i(35577);
    bau localbau = new bau();
    localbau.Id = tB(paramString1);
    localbau.jCt = paramInt1;
    localbau.Desc = tB(paramString4);
    localbau.Url = tB(paramString2);
    localbau.wEG = paramInt2;
    localbau.wEH = tB(paramString3);
    localbau.wEI = paramInt3;
    localbau.wEJ = paramInt4;
    localbau.wEK = parambaw;
    if (paramString2 == null);
    for (paramString1 = "".getBytes(); ; paramString1 = paramString2.getBytes())
    {
      localbau.wEV = g.x(paramString1);
      AppMethodBeat.o(35577);
      return localbau;
    }
  }

  public static bau a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, String paramString4)
  {
    AppMethodBeat.i(35576);
    bau localbau = new bau();
    localbau.Id = paramString1;
    localbau.jCt = paramInt1;
    localbau.Url = paramString2;
    localbau.wEH = paramString3;
    localbau.wEG = paramInt2;
    localbau.wEI = paramInt3;
    localbau.Desc = paramString4;
    paramString1 = new baw();
    paramString1.wFy = 0.0F;
    paramString1.wFx = 0.0F;
    paramString1.wFz = 0.0F;
    localbau.wEK = paramString1;
    if (paramString2 == null);
    for (paramString1 = "".getBytes(); ; paramString1 = paramString2.getBytes())
    {
      localbau.wEV = g.x(paramString1);
      AppMethodBeat.o(35576);
      return localbau;
    }
  }

  public static TimeLineObject ajM()
  {
    AppMethodBeat.i(35574);
    TimeLineObject localTimeLineObject = new TimeLineObject();
    Object localObject = new uf();
    localTimeLineObject.xfH = new ds();
    localTimeLineObject.xfI = ((uf)localObject);
    localTimeLineObject.wEJ = 0;
    localTimeLineObject.pcX = 0;
    localTimeLineObject.Id = "";
    localObject = new ayt();
    ((ayt)localObject).vRq = 0.0F;
    ((ayt)localObject).vRp = 0.0F;
    localTimeLineObject.xfG = ((ayt)localObject);
    localTimeLineObject.rCK = "";
    localTimeLineObject.xfO = new cth();
    AppMethodBeat.o(35574);
    return localTimeLineObject;
  }

  public static bau ajN()
  {
    AppMethodBeat.i(35575);
    bau localbau = new bau();
    localbau.Desc = "";
    localbau.wEJ = 0;
    AppMethodBeat.o(35575);
    return localbau;
  }

  private static float tA(String paramString)
  {
    float f = 0.0F;
    AppMethodBeat.i(35573);
    if (paramString == null)
      AppMethodBeat.o(35573);
    while (true)
    {
      return f;
      f = bo.getFloat(paramString, 0.0F);
      AppMethodBeat.o(35573);
    }
  }

  private static String tB(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }

  public static TimeLineObject tC(String paramString)
  {
    AppMethodBeat.i(35578);
    Map localMap = br.z(paramString, "TimelineObject");
    TimeLineObject localTimeLineObject = ajM();
    int i;
    label1618: label2655: label2667: int j;
    if (localMap != null)
    {
      localTimeLineObject.Id = tB((String)localMap.get(".TimelineObject.id"));
      localTimeLineObject.jBB = tB((String)localMap.get(".TimelineObject.username"));
      localTimeLineObject.wEJ = bo.getInt((String)localMap.get(".TimelineObject.private"), 0);
      localTimeLineObject.pcX = bo.getInt((String)localMap.get(".TimelineObject.createTime"), 0);
      localTimeLineObject.xfF = tB((String)localMap.get(".TimelineObject.contentDesc"));
      localTimeLineObject.xfK = bo.getInt((String)localMap.get(".TimelineObject.contentDescShowType"), 0);
      localTimeLineObject.xfL = bo.getInt((String)localMap.get(".TimelineObject.contentDescScene"), 0);
      localTimeLineObject.rjC = tB((String)localMap.get(".TimelineObject.statExtStr"));
      localTimeLineObject.xfP = bo.getInt((String)localMap.get(".TimelineObject.sightFolded"), 0);
      localTimeLineObject.dtW = bo.getInt((String)localMap.get(".TimelineObject.showFlag"), 0);
      Object localObject1 = new ayt();
      ((ayt)localObject1).vRp = tA((String)localMap.get(".TimelineObject.location.$longitude"));
      ((ayt)localObject1).vRq = tA((String)localMap.get(".TimelineObject.location.$latitude"));
      ((ayt)localObject1).guP = tB((String)localMap.get(".TimelineObject.location.$city"));
      ((ayt)localObject1).wCE = bo.getInt((String)localMap.get(".TimelineObject.location.$poiScale"), 0);
      ((ayt)localObject1).wCC = tB((String)localMap.get(".TimelineObject.location.$poiClassifyId"));
      ((ayt)localObject1).rki = bo.getInt((String)localMap.get(".TimelineObject.location.$poiClassifyType"), 0);
      ((ayt)localObject1).rkg = tB((String)localMap.get(".TimelineObject.location.$poiAddress"));
      ((ayt)localObject1).eUu = tB((String)localMap.get(".TimelineObject.location.$poiName"));
      ((ayt)localObject1).wCF = bo.getInt((String)localMap.get(".TimelineObject.location.$poiClickableStatus"), 0);
      ((ayt)localObject1).wCH = tB((String)localMap.get(".TimelineObject.location.$poiAddressName"));
      ((ayt)localObject1).country = tB((String)localMap.get(".TimelineObject.location.$country"));
      localTimeLineObject.xfG = ((ayt)localObject1);
      if (localTimeLineObject.xfI == null)
        localTimeLineObject.xfI = new uf();
      localTimeLineObject.xfI.Desc = tB((String)localMap.get(".TimelineObject.ContentObject.description"));
      localTimeLineObject.xfI.wbJ = bo.getInt((String)localMap.get(".TimelineObject.ContentObject.contentStyle"), 0);
      localTimeLineObject.xfI.wbL = bo.getInt((String)localMap.get(".TimelineObject.ContentObject.contentSubStyle"), 0);
      localTimeLineObject.xfI.Title = tB((String)localMap.get(".TimelineObject.ContentObject.title"));
      localTimeLineObject.xfI.Url = tB((String)localMap.get(".TimelineObject.ContentObject.contentUrl"));
      if (localMap.containsKey(".TimelineObject.ContentObject.mmreadershare.itemshowtype"))
      {
        i = bo.getInt((String)localMap.get(".TimelineObject.ContentObject.mmreadershare.itemshowtype"), 0);
        if (i != -1)
        {
          localTimeLineObject.xfI.wbN = new azu();
          localTimeLineObject.xfI.wbN.vGc = i;
        }
        if (i == 5)
        {
          localTimeLineObject.xfI.wbN.fga = bo.getInt((String)localMap.get(".TimelineObject.ContentObject.mmreadershare.pubtime"), 0);
          localTimeLineObject.xfI.wbN.fgd = tB((String)localMap.get(".TimelineObject.ContentObject.mmreadershare.vid"));
          localTimeLineObject.xfI.wbN.lvx = tB((String)localMap.get(".TimelineObject.ContentObject.mmreadershare.cover"));
          localTimeLineObject.xfI.wbN.fgc = bo.getInt((String)localMap.get(".TimelineObject.ContentObject.mmreadershare.funcflag"), 0);
          localTimeLineObject.xfI.wbN.duration = bo.getInt((String)localMap.get(".TimelineObject.ContentObject.mmreadershare.duration"), 0);
          localTimeLineObject.xfI.wbN.desc = tB((String)localMap.get(".TimelineObject.ContentObject.mmreadershare.digest"));
          localTimeLineObject.xfI.wbN.fgb = bo.getInt((String)localMap.get(".TimelineObject.ContentObject.mmreadershare.nativepage"), 0);
          localTimeLineObject.xfI.wbN.videoWidth = bo.getInt((String)localMap.get(".TimelineObject.ContentObject.mmreadershare.width"), 0);
          localTimeLineObject.xfI.wbN.videoHeight = bo.getInt((String)localMap.get(".TimelineObject.ContentObject.mmreadershare.height"), 0);
        }
      }
      i = 0;
      String str1;
      String str2;
      String str3;
      String str4;
      String str5;
      String str6;
      String str7;
      String str8;
      String str9;
      String str10;
      String str11;
      String str12;
      Object localObject2;
      String str13;
      String str14;
      String str15;
      String str16;
      String str17;
      String str18;
      String str19;
      String str20;
      String str21;
      String str22;
      Object localObject3;
      Object localObject4;
      Object localObject5;
      Object localObject6;
      String str23;
      String str24;
      Object localObject7;
      if (i != 0)
      {
        str1 = ".TimelineObject.ContentObject.mediaList.media" + i + ".id";
        str2 = ".TimelineObject.ContentObject.mediaList.media" + i + ".type";
        str3 = ".TimelineObject.ContentObject.mediaList.media" + i + ".title";
        str4 = ".TimelineObject.ContentObject.mediaList.media" + i + ".description";
        str5 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url";
        str6 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$videomd5";
        str7 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb";
        str8 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$type";
        str9 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$type";
        str10 = ".TimelineObject.ContentObject.mediaList.media" + i + ".private";
        str11 = ".TimelineObject.ContentObject.mediaList.media" + i + ".subType";
        str12 = ".TimelineObject.ContentObject.mediaList.media" + i + ".userData";
        localObject2 = ".TimelineObject.ContentObject.mediaList.media".concat(String.valueOf(i));
        str13 = ".TimelineObject.ContentObject.mediaList.media" + i + ".lowBandUrl";
        str14 = ".TimelineObject.ContentObject.mediaList.media" + i + ".lowBandUrl.$type";
        str15 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachUrl";
        str16 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachUrl.$md5";
        str17 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$md5";
        str18 = ".TimelineObject.ContentObject.mediaList.media" + i + ".videosize.$attachTotalTime";
        str19 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachThumbUrl";
        str20 = ".TimelineObject.ContentObject.mediaList.media" + i + ".attachShareTitle";
        str21 = ".TimelineObject.ContentObject.mediaList.media" + i + ".enc";
        str22 = ".TimelineObject.ContentObject.mediaList.media" + i + ".enc.$key";
        localObject3 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$token";
        localObject4 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$enc_idx";
        localObject5 = ".TimelineObject.ContentObject.mediaList.media" + i + ".url.$key";
        localObject6 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$token";
        str23 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$enc_idx";
        localObject1 = ".TimelineObject.ContentObject.mediaList.media" + i + ".thumb.$key";
        str24 = (String)localObject2 + ".size.$width";
        localObject7 = (String)localObject2 + ".size.$height";
        localObject2 = (String)localObject2 + ".size.$totalSize";
        str24 = (String)localMap.get(str24);
        localObject7 = (String)localMap.get(localObject7);
        String str25 = (String)localMap.get(localObject2);
        localObject2 = new baw();
        ((baw)localObject2).wFy = 0.0F;
        ((baw)localObject2).wFx = 0.0F;
        ((baw)localObject2).wFz = 0.0F;
        if (str24 != null)
          ((baw)localObject2).wFx = tA(str24);
        if (localObject7 != null)
          ((baw)localObject2).wFy = tA((String)localObject7);
        if (str25 != null)
          ((baw)localObject2).wFz = tA(str25);
        str1 = (String)localMap.get(str1);
        str2 = (String)localMap.get(str2);
        str3 = (String)localMap.get(str3);
        str4 = (String)localMap.get(str4);
        str5 = (String)localMap.get(str5);
        str10 = (String)localMap.get(str10);
        str7 = (String)localMap.get(str7);
        str6 = (String)localMap.get(str6);
        str8 = (String)localMap.get(str8);
        str9 = (String)localMap.get(str9);
        str13 = (String)localMap.get(str13);
        str14 = (String)localMap.get(str14);
        str11 = (String)localMap.get(str11);
        str12 = (String)localMap.get(str12);
        str15 = (String)localMap.get(str15);
        str16 = (String)localMap.get(str16);
        str17 = (String)localMap.get(str17);
        str18 = (String)localMap.get(str18);
        str19 = (String)localMap.get(str19);
        str20 = (String)localMap.get(str20);
        str21 = (String)localMap.get(str21);
        str22 = (String)localMap.get(str22);
        localObject3 = (String)localMap.get(localObject3);
        localObject4 = (String)localMap.get(localObject4);
        localObject5 = (String)localMap.get(localObject5);
        localObject6 = (String)localMap.get(localObject6);
        str23 = (String)localMap.get(str23);
        str24 = (String)localMap.get(localObject1);
        if ((str2 == null) || (str1 == null))
          break label2667;
        localObject7 = new bau();
        ((bau)localObject7).Id = tB(str1);
        ((bau)localObject7).jCt = bo.getInt(str2, 0);
        ((bau)localObject7).Title = tB(str3);
        ((bau)localObject7).Desc = tB(str4);
        ((bau)localObject7).Url = tB(str5);
        ((bau)localObject7).wEG = bo.getInt(str8, 0);
        ((bau)localObject7).wEH = tB(str7);
        ((bau)localObject7).wEI = bo.getInt(str9, 0);
        ((bau)localObject7).wEJ = bo.getInt(str10, 0);
        ((bau)localObject7).wEK = ((baw)localObject2);
        ((bau)localObject7).wEL = tB(str13);
        ((bau)localObject7).wEM = bo.getInt(str14, 0);
        ((bau)localObject7).rik = tB(str12);
        ((bau)localObject7).cuu = bo.getInt(str11, 0);
        ((bau)localObject7).wEO = tB(str15);
        ((bau)localObject7).wEQ = tB(str16);
        ((bau)localObject7).wEP = tB(str17);
        ((bau)localObject7).wFc = tB(str6);
        ((bau)localObject7).rEd = bo.getInt(str18, 0);
        ((bau)localObject7).wER = tB(str19);
        ((bau)localObject7).wES = tB(str20);
        ((bau)localObject7).wET = bo.getInt(str21, 0);
        ((bau)localObject7).wEU = bo.getLong(str22, 0L);
        if (((bau)localObject7).Url != null)
          break label2655;
      }
      for (localObject1 = "".getBytes(); ; localObject1 = ((bau)localObject7).Url.getBytes())
      {
        ((bau)localObject7).wEV = g.x((byte[])localObject1);
        ((bau)localObject7).wEW = ((String)localObject3);
        ((bau)localObject7).wEX = bo.getInt((String)localObject4, 0);
        ((bau)localObject7).wEY = ((String)localObject5);
        ((bau)localObject7).wEZ = ((String)localObject6);
        ((bau)localObject7).wFa = bo.getInt(str23, 0);
        ((bau)localObject7).wFb = str24;
        localTimeLineObject.xfI.wbK.add(localObject7);
        i++;
        break;
        str1 = ".TimelineObject.ContentObject.mediaList.media.id";
        str2 = ".TimelineObject.ContentObject.mediaList.media.type";
        str3 = ".TimelineObject.ContentObject.mediaList.media.title";
        str4 = ".TimelineObject.ContentObject.mediaList.media.description";
        str5 = ".TimelineObject.ContentObject.mediaList.media.url";
        str6 = ".TimelineObject.ContentObject.mediaList.media.url.$videomd5";
        str7 = ".TimelineObject.ContentObject.mediaList.media.thumb";
        str8 = ".TimelineObject.ContentObject.mediaList.media.url.$type";
        str9 = ".TimelineObject.ContentObject.mediaList.media.thumb.$type";
        str10 = ".TimelineObject.ContentObject.mediaList.media.private";
        str11 = ".TimelineObject.ContentObject.mediaList.media.subType";
        str12 = ".TimelineObject.ContentObject.mediaList.media.userData";
        localObject2 = ".TimelineObject.ContentObject.mediaList.media";
        str13 = ".TimelineObject.ContentObject.mediaList.media.lowBandUrl";
        str14 = ".TimelineObject.ContentObject.mediaList.media.lowBandUrl.$type";
        localObject1 = ".TimelineObject.ContentObject.mediaList.media.thumb.$key";
        str23 = ".TimelineObject.ContentObject.mediaList.media.thumb.$enc_idx";
        localObject6 = ".TimelineObject.ContentObject.mediaList.media.thumb.$token";
        localObject5 = ".TimelineObject.ContentObject.mediaList.media.url.$key";
        localObject4 = ".TimelineObject.ContentObject.mediaList.media.url.$enc_idx";
        localObject3 = ".TimelineObject.ContentObject.mediaList.media.url.$token";
        str22 = ".TimelineObject.ContentObject.mediaList.media.enc.$key";
        str21 = ".TimelineObject.ContentObject.mediaList.media.enc";
        str20 = ".TimelineObject.ContentObject.mediaList.media.attachShareTitle";
        str19 = ".TimelineObject.ContentObject.mediaList.media.attachThumbUrl";
        str18 = ".TimelineObject.ContentObject.mediaList.media.videosize.$attachTotalTime";
        str17 = ".TimelineObject.ContentObject.mediaList.media.url.$md5";
        str16 = ".TimelineObject.ContentObject.mediaList.media.attachUrl.$md5";
        str15 = ".TimelineObject.ContentObject.mediaList.media.attachUrl";
        break label1618;
      }
      i = paramString.indexOf("<noteinfo>");
      j = paramString.indexOf("</noteinfo>");
      if ((i < 0) || (j < 0))
      {
        paramString = localTimeLineObject;
        localObject3 = new ds();
        localObject4 = tB((String)localMap.get(".TimelineObject.appInfo.id"));
        str23 = tB((String)localMap.get(".TimelineObject.appInfo.version"));
        localObject5 = tB((String)localMap.get(".TimelineObject.appInfo.appName"));
        localObject1 = tB((String)localMap.get(".TimelineObject.appInfo.installUrl "));
        localObject6 = tB((String)localMap.get(".TimelineObject.appInfo.fromUrl "));
        ((ds)localObject3).Id = ((String)localObject4);
        ((ds)localObject3).ncH = ((String)localObject5);
        ((ds)localObject3).vFw = ((String)localObject1);
        ((ds)localObject3).vFx = ((String)localObject6);
        ((ds)localObject3).jCh = str23;
        ((ds)localObject3).vFy = bo.getInt((String)localMap.get(".TimelineObject.appInfo.clickable"), 0);
        paramString.xfH = ((ds)localObject3);
        localObject6 = new cth();
        str23 = tB((String)localMap.get(".TimelineObject.weappInfo.appUserName"));
        localObject1 = tB((String)localMap.get(".TimelineObject.weappInfo.pagePath"));
        ((cth)localObject6).username = str23;
        ((cth)localObject6).path = ((String)localObject1);
        paramString.xfO = ((cth)localObject6);
        localObject1 = new cfg();
        localObject4 = tB((String)localMap.get(".TimelineObject.streamvideo.streamvideotitle"));
        str23 = tB((String)localMap.get(".TimelineObject.streamvideo.streamvideototaltime"));
        str21 = tB((String)localMap.get(".TimelineObject.streamvideo.streamvideourl"));
        localObject5 = tB((String)localMap.get(".TimelineObject.streamvideo.streamvideoweburl"));
        localObject3 = tB((String)localMap.get(".TimelineObject.streamvideo.streamvideowording"));
        str22 = tB((String)localMap.get(".TimelineObject.streamvideo.streamvideothumburl"));
        localObject6 = tB((String)localMap.get(".TimelineObject.streamvideo.streamvideoaduxinfo"));
        str20 = tB((String)localMap.get(".TimelineObject.streamvideo.streamvideopublishid"));
        ((cfg)localObject1).fiI = ((String)localObject4);
        ((cfg)localObject1).fiH = bo.ank(str23);
        ((cfg)localObject1).fiG = str21;
        ((cfg)localObject1).fiK = ((String)localObject5);
        ((cfg)localObject1).fiJ = ((String)localObject3);
        ((cfg)localObject1).fiL = str22;
        ((cfg)localObject1).fiM = ((String)localObject6);
        ((cfg)localObject1).fiN = str20;
        paramString.xfN = ((cfg)localObject1);
        localObject1 = new cbc();
        localObject6 = tB((String)localMap.get(".TimelineObject.redEnvelopesInfo.sendId"));
        str23 = tB((String)localMap.get(".TimelineObject.redEnvelopesInfo.ticket"));
        ((cbc)localObject1).nSX = ((String)localObject6);
        ((cbc)localObject1).cxb = str23;
        localObject1 = new av();
        j = bo.getInt((String)localMap.get(".TimelineObject.actionInfo.scene"), 0);
        localObject6 = tB((String)localMap.get(".TimelineObject.actionInfo.appid"));
        i = bo.getInt((String)localMap.get(".TimelineObject.actionInfo.type"), 0);
        localObject5 = tB((String)localMap.get(".TimelineObject.actionInfo.url"));
        localObject4 = tB((String)localMap.get(".TimelineObject.actionInfo.mediaTagName"));
        str23 = tB((String)localMap.get(".TimelineObject.actionInfo.wordingKey"));
        ((av)localObject1).vCv = ((String)localObject6);
        ((av)localObject1).Scene = j;
        ((av)localObject1).jCt = i;
        ((av)localObject1).Url = ((String)localObject5);
        ((av)localObject1).vCw = ((String)localObject4);
        ((av)localObject1).vCx = str23;
        localObject4 = new at();
        localObject3 = tB((String)localMap.get(".TimelineObject.actionInfo.appMsg.appid"));
        str23 = tB((String)localMap.get(".TimelineObject.actionInfo.appMsg.mediaTagName"));
        localObject6 = tB((String)localMap.get(".TimelineObject.actionInfo.appMsg.messageExt"));
        localObject5 = tB((String)localMap.get(".TimelineObject.actionInfo.appMsg.messageAction"));
        ((at)localObject4).fKh = ((String)localObject3);
        ((at)localObject4).vCs = str23;
        ((at)localObject4).vCt = ((String)localObject6);
        ((at)localObject4).vCu = ((String)localObject5);
        ((av)localObject1).vCy = ((at)localObject4);
        i = bo.getInt((String)localMap.get(".TimelineObject.actionInfo.appActionScene.installedActionScene"), 0);
        j = bo.getInt((String)localMap.get(".TimelineObject.actionInfo.appActionScene.uninstalledActionScene"), 0);
        localObject4 = tB((String)localMap.get(".TimelineObject.actionInfo.appJumpWordingKey.installedWordingKey"));
        str23 = tB((String)localMap.get(".TimelineObject.actionInfo.appJumpWordingKey.uninstalledWordingKey"));
        ((av)localObject1).vCz = tB((String)localMap.get(".TimelineObject.actionInfo.newWordingKey"));
        localObject6 = new dj();
        ((dj)localObject6).vFo = i;
        ((dj)localObject6).vFp = j;
        localObject5 = new du();
        ((du)localObject5).vFC = ((String)localObject4);
        ((du)localObject5).vFD = str23;
        ((av)localObject1).vCA = ((dj)localObject6);
        ((av)localObject1).vCB = ((du)localObject5);
        ((av)localObject1).vCC = tD((String)localMap.get(".TimelineObject.actionInfo.installedWording"));
        ((av)localObject1).vCD = tD((String)localMap.get(".TimelineObject.actionInfo.uninstalledWording"));
        paramString.qNO = ((av)localObject1);
        paramString.ijx = tB((String)localMap.get(".TimelineObject.sourceUserName"));
        paramString.vjM = tB((String)localMap.get(".TimelineObject.sourceNickName"));
        paramString.xfJ = tB((String)localMap.get(".TimelineObject.publicUserName"));
        paramString.xfM = tB((String)localMap.get(".TimelineObject.statisticsData"));
        paramString.rCK = tB((String)localMap.get(".TimelineObject.canvasInfoXml"));
        paramString.fgt = bo.getInt((String)localMap.get(".TimelineObject.contentattr"), 0);
        localObject1 = new cvi();
        ((cvi)localObject1).uaa = tB((String)localMap.get(".TimelineObject.websearch.relevant_vid"));
        ((cvi)localObject1).uab = tB((String)localMap.get(".TimelineObject.websearch.relevant_expand"));
        ((cvi)localObject1).uac = tB((String)localMap.get(".TimelineObject.websearch.relevant_pre_searchid"));
        ((cvi)localObject1).uad = tB((String)localMap.get(".TimelineObject.websearch.relevant_shared_openid"));
        ((cvi)localObject1).uae = bo.getLong((String)localMap.get(".TimelineObject.websearch.rec_category"), 0L);
        ((cvi)localObject1).lvz = tB((String)localMap.get(".TimelineObject.websearch.shareUrl"));
        ((cvi)localObject1).lvA = tB((String)localMap.get(".TimelineObject.websearch.shareTitle"));
        ((cvi)localObject1).qVw = tB((String)localMap.get(".TimelineObject.websearch.shareDesc"));
        ((cvi)localObject1).uaf = tB((String)localMap.get(".TimelineObject.websearch.shareImgUrl"));
        ((cvi)localObject1).uag = tB((String)localMap.get(".TimelineObject.websearch.shareString"));
        ((cvi)localObject1).uah = tB((String)localMap.get(".TimelineObject.websearch.shareStringUrl"));
        ((cvi)localObject1).source = tB((String)localMap.get(".TimelineObject.websearch.source"));
        ((cvi)localObject1).phw = tB((String)localMap.get(".TimelineObject.websearch.sourceUrl"));
        ((cvi)localObject1).uai = tB((String)localMap.get(".TimelineObject.websearch.strPlayCount"));
        ((cvi)localObject1).uaj = tB((String)localMap.get(".TimelineObject.websearch.titleUrl"));
        ((cvi)localObject1).uak = tB((String)localMap.get(".TimelineObject.websearch.extReqParams"));
        ((cvi)localObject1).ual = tB((String)localMap.get(".TimelineObject.websearch.tagList"));
        ((cvi)localObject1).uam = bo.getLong((String)localMap.get(".TimelineObject.websearch.channelId"), 0L);
        ((cvi)localObject1).uan = tB((String)localMap.get(".TimelineObject.websearch.shareTag"));
        paramString.qNQ = ((cvi)localObject1);
      }
    }
    while (true)
    {
      AppMethodBeat.o(35578);
      return localTimeLineObject;
      localTimeLineObject.xfI.wbM = paramString.substring(i, j + 11);
      break;
    }
  }

  private static dt tD(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(35579);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(35579);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = tE(paramString);
      Map localMap = br.z("<root>" + paramString + "</root>", "root");
      if (localMap == null)
      {
        AppMethodBeat.o(35579);
        paramString = localObject;
      }
      else
      {
        paramString = new dt();
        paramString.vFz = tB((String)localMap.get(".root.en"));
        paramString.vFA = tB((String)localMap.get(".root.zh-CN"));
        paramString.vFB = tB((String)localMap.get(".root.zh-TW"));
        AppMethodBeat.o(35579);
      }
    }
  }

  private static String tE(String paramString)
  {
    AppMethodBeat.i(35580);
    StringBuilder localStringBuilder = new StringBuilder(paramString.length());
    int i = 0;
    int j = paramString.length();
    while (i < j)
    {
      char c = paramString.charAt(i);
      if (c != '&')
      {
        localStringBuilder.append(c);
        i++;
      }
      else if (paramString.startsWith("&amp;", i))
      {
        localStringBuilder.append('&');
        i += 5;
      }
      else if (paramString.startsWith("&apos;", i))
      {
        localStringBuilder.append('\'');
        i += 6;
      }
      else if (paramString.startsWith("&quot;", i))
      {
        localStringBuilder.append('"');
        i += 6;
      }
      else if (paramString.startsWith("&lt;", i))
      {
        localStringBuilder.append('<');
        i += 4;
      }
      else if (paramString.startsWith("&gt;", i))
      {
        localStringBuilder.append('>');
        i += 4;
      }
    }
    paramString = localStringBuilder.toString();
    AppMethodBeat.o(35580);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsns.e
 * JD-Core Version:    0.6.2
 */