package com.tencent.mm.al;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.jv;
import com.tencent.mm.g.a.lp;
import com.tencent.mm.g.b.a.ai;
import com.tencent.mm.g.b.a.an;
import com.tencent.mm.g.b.a.bm;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.model.n;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bh;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class e
  implements com.tencent.mm.ai.f, a.a
{
  Queue<String> fyK;
  Map<String, com.tencent.mm.i.h> fyL;
  Map<String, com.tencent.mm.i.h> fyM;
  Map<String, com.tencent.mm.i.h> fzq;
  Map<String, com.tencent.mm.i.d> fzr;

  public e()
  {
    AppMethodBeat.i(50568);
    this.fyK = new LinkedList();
    this.fyL = new HashMap();
    this.fyM = new HashMap();
    this.fzq = new HashMap();
    this.fzr = new HashMap();
    com.tencent.mm.kernel.g.Rg().a(379, this);
    AppMethodBeat.o(50568);
  }

  public static com.tencent.mm.i.h a(az paramaz, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(50585);
    if (paramaz == null)
    {
      ab.w("MicroMsg.OnlineVideoService", "check can sns online video, scene is null.");
      paramaz = null;
      AppMethodBeat.o(50585);
    }
    Object localObject;
    String str;
    while (true)
    {
      return paramaz;
      if (bo.isNullOrNil(paramString1))
      {
        ab.w("MicroMsg.OnlineVideoService", "check can sns online video, url is null.");
        paramaz = null;
        AppMethodBeat.o(50585);
      }
      else
      {
        localObject = u.ut(paramString3);
        if (localObject == null)
        {
          ab.w("MicroMsg.OnlineVideoService", "check can sns online video, video info is null. %s", new Object[] { paramString3 });
          paramaz = null;
          AppMethodBeat.o(50585);
        }
        else
        {
          str = c.a("snsvideo", paramaz.oyB, "sns", paramString1);
          if (!bo.isNullOrNil(str))
            break;
          ab.w("MicroMsg.OnlineVideoService", "check can http online video, can not create media id. url %s ", new Object[] { paramString1 });
          paramaz = null;
          AppMethodBeat.o(50585);
        }
      }
    }
    com.tencent.mm.i.h localh = new com.tencent.mm.i.h();
    localh.filename = paramString3;
    localh.field_fullpath = paramString2;
    localh.field_mediaId = str;
    localh.egy = 2;
    localh.egD = paramInt;
    localh.egF = ((com.tencent.mm.modelvideo.s)localObject).egF;
    if (paramaz == null);
    label191: label764: for (paramString3 = ""; ; paramString3 = "")
    {
      int i = com.tencent.mm.protocal.d.vxo;
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RN();
      str = com.tencent.mm.a.p.getString(com.tencent.mm.kernel.a.QF());
      int j = at.getNetTypeForStat(ah.getContext());
      int k = at.getStrength(ah.getContext());
      long l2;
      if (!bo.isNullOrNil(paramString3))
      {
        localObject = "&scene=".concat(String.valueOf(paramString3));
        localh.referer = String.format("http://weixin.qq.com/?version=%d&uin=%s&nettype=%d&signal=%d%s", new Object[] { Integer.valueOf(i), str, Integer.valueOf(j), Integer.valueOf(k), localObject });
        localh.url = paramString1;
        paramString1 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("SnsSightDomainList");
        long l1 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getInt("SnsSightMainStandbyIpSwitchTime", 0);
        ab.i("MicroMsg.OnlineVideoService", "hostvalue %s dcipTime %s scene.time[%d]", new Object[] { paramString1, Long.valueOf(l1), Integer.valueOf(paramaz.oyB) });
        l2 = l1;
        if (l1 <= 0L)
          l2 = 259200L;
      }
      for (boolean bool = a(paramaz, localh.url, l2, paramString1); ; bool = false)
      {
        try
        {
          paramString1 = new java/net/URL;
          paramString1.<init>(localh.url);
          localh.host = paramString1.getHost();
          paramString1 = new java/util/ArrayList;
          paramString1.<init>();
          com.tencent.mm.network.b.a(bool, paramString1, localh.host);
          localh.ege = new String[paramString1.size()];
          paramString1.toArray(localh.ege);
          if (bo.fp(paramaz.oyB) <= l2)
            continue;
          bool = true;
          localh.isColdSnsData = bool;
          localh.signalQuality = at.getStrength(ah.getContext());
          localh.snsScene = paramString3;
          if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lFM, false))
            localh.field_requestVideoFormat = com.tencent.mm.modelcontrol.d.u(paramInt, paramString2);
          AppMethodBeat.o(50585);
          paramaz = localh;
          break;
          if (paramaz.equals(az.xYN))
          {
            paramString3 = "album_friend";
            break label191;
          }
          if (paramaz.equals(az.xYO))
          {
            paramString3 = "album_self";
            break label191;
          }
          if (paramaz.equals(az.xYP))
          {
            paramString3 = "album_stranger";
            break label191;
          }
          if (paramaz.equals(az.xYQ))
          {
            paramString3 = "profile_friend";
            break label191;
          }
          if (paramaz.equals(az.xYR))
          {
            paramString3 = "profile_stranger";
            break label191;
          }
          if (paramaz.equals(az.xYS))
          {
            paramString3 = "comment";
            break label191;
          }
          if (paramaz.equals(az.xYM))
          {
            paramString3 = "timeline";
            break label191;
          }
          if (paramaz.equals(az.xYV))
          {
            paramString3 = "snssight";
            break label191;
          }
          if (!paramaz.equals(az.xYX))
            break label764;
          paramString3 = "storysight";
          break label191;
          localObject = "";
        }
        catch (Exception paramaz)
        {
          ab.printErrStackTrace("MicroMsg.OnlineVideoService", paramaz, "check can sns online video error taskInfo %s", new Object[] { localh });
          paramaz = null;
          AppMethodBeat.o(50585);
        }
        break;
      }
    }
  }

  static void a(com.tencent.mm.modelvideo.s params, int paramInt, String paramString)
  {
    AppMethodBeat.i(50582);
    ab.i("MicroMsg.OnlineVideoService", "download finish. totalLen %d ", new Object[] { Integer.valueOf(paramInt) });
    if (params != null)
    {
      u.ae(params.getFileName(), paramInt);
      i(paramInt, paramString, params.getFileName());
    }
    AppMethodBeat.o(50582);
  }

  private static void a(PInt paramPInt1, PInt paramPInt2, String paramString, int paramInt)
  {
    AppMethodBeat.i(50588);
    int i = 0;
    paramString = u.ut(paramString);
    if (paramString != null)
      i = paramString.cFa;
    for (int j = paramString.frO; ; j = 0)
    {
      if (paramInt <= 0)
      {
        k = 1;
        paramPInt1.value = i;
        paramPInt2.value = k;
        ab.d("MicroMsg.OnlineVideoService", "getPreloadVideoInfo pHadPreloadSize[%d] pHadPreloadCompletion[%d]", new Object[] { Integer.valueOf(paramPInt1.value), Integer.valueOf(paramPInt2.value) });
        AppMethodBeat.o(50588);
        return;
      }
      int m = (int)(paramInt / 100.0F * j);
      if (i < m);
      for (int k = 2; ; k = 3)
      {
        ab.d("MicroMsg.OnlineVideoService", "getPreloadVideoInfo %d * %d = configSize[%d] preloadSize[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(i) });
        break;
      }
    }
  }

  private static void a(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, long paramLong1, long paramLong2, String paramString4, String[] paramArrayOfString, String paramString5, int paramInt3, int paramInt4, String paramString6)
  {
    AppMethodBeat.i(50589);
    jv localjv = new jv();
    localjv.cEU.cEV = paramString1;
    localjv.cEU.cEW = paramString2;
    localjv.cEU.cEX = paramInt1;
    localjv.cEU.fileId = paramString3;
    localjv.cEU.netType = paramInt2;
    localjv.cEU.startTime = paramLong1;
    localjv.cEU.endTime = paramLong2;
    localjv.cEU.path = paramString4;
    localjv.cEU.cEY = paramArrayOfString;
    localjv.cEU.cEZ = paramString5;
    localjv.cEU.cFa = paramInt3;
    localjv.cEU.cFb = paramInt4;
    localjv.cEU.cFc = paramString6;
    com.tencent.mm.sdk.b.a.xxA.m(localjv);
    AppMethodBeat.o(50589);
  }

  public static void a(Object[] paramArrayOfObject, com.tencent.mm.i.d paramd, com.tencent.mm.i.h paramh, boolean paramBoolean)
  {
    AppMethodBeat.i(50587);
    if ((paramh == null) || (paramd == null))
    {
      ab.w("MicroMsg.OnlineVideoService", "video task info is null or download result is null.");
      AppMethodBeat.o(50587);
    }
    while (true)
    {
      return;
      if ((paramh.Jp()) || (paramh.Jr()) || (paramh.Jt()))
        break;
      AppMethodBeat.o(50587);
    }
    String str1 = paramd.field_clientIP;
    int i;
    label75: boolean bool1;
    label148: label169: boolean bool2;
    Object localObject;
    PInt localPInt1;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    if (paramd.field_isCrossNet)
    {
      i = 1;
      ab.i("MicroMsg.OnlineVideoService", "rpt online video format[%d] clientIp[%s] isCrossNet[%d]", new Object[] { Integer.valueOf(paramd.field_videoFormat), str1, Integer.valueOf(i) });
      if (paramd.field_videoFormat == 2)
        u.ux(paramh.filename);
      if (!bo.isNullOrNil(str1))
        break label1439;
      com.tencent.mm.plugin.report.service.h.pYm.a(354L, 45L, 1L, false);
      if (!paramd.field_isCrossNet)
        break label1456;
      com.tencent.mm.plugin.report.service.h.pYm.a(354L, 47L, 1L, false);
      bool1 = paramh.Jr();
      bool2 = paramh.Jt();
      localObject = new PInt();
      localPInt1 = new PInt();
      localPInt1.value = 0;
      ((PInt)localObject).value = 0;
      u.a(paramh.field_fullpath, (PInt)localObject, localPInt1);
      j = ((PInt)localObject).value * 1000;
      k = localPInt1.value;
      if (paramArrayOfObject == null)
        break label2591;
      m = ((Integer)paramArrayOfObject[0]).intValue();
      n = ((Integer)paramArrayOfObject[1]).intValue();
      i1 = ((Integer)paramArrayOfObject[2]).intValue();
      i2 = ((Integer)paramArrayOfObject[3]).intValue();
      i3 = ((Integer)paramArrayOfObject[4]).intValue();
      i4 = ((Integer)paramArrayOfObject[5]).intValue();
      i5 = ((Integer)paramArrayOfObject[6]).intValue();
      i6 = m * 1000;
    }
    while (true)
    {
      int i7 = paramh.egF;
      m = i7;
      label355: int i8;
      String str2;
      PInt localPInt2;
      StringBuffer localStringBuffer;
      if (i7 <= 0)
      {
        if (bool1)
          m = 10;
      }
      else
      {
        i8 = at.gC(ah.getContext());
        str2 = paramd.Jn();
        localPInt1 = new PInt();
        localPInt2 = new PInt();
        a(localPInt1, localPInt2, paramh.filename, paramh.egI);
        localStringBuffer = new StringBuffer();
        if (!bool1)
          break label1480;
        localStringBuffer.append(paramh.field_fileId).append(",").append(paramh.field_aesKey).append(",");
        label445: localStringBuffer.append(paramd.field_fileLength).append(",").append(j).append(",");
        localStringBuffer.append(paramd.field_recvedBytes).append(",");
        localStringBuffer.append(i6 + ",").append(n + ",").append(i1 + ",");
        localStringBuffer.append(i2 + ",").append(i3 + ",");
        localStringBuffer.append(i8).append(",");
        localStringBuffer.append(m).append(",");
        localStringBuffer.append(paramd.field_startTime).append(",");
        localStringBuffer.append(paramd.field_endTime).append(",");
        if (!bool1)
          break label1527;
        if (paramh.egE == null)
          break label1512;
        localObject = com.tencent.mm.a.g.x(paramh.egE.getBytes());
        label698: localStringBuffer.append(localObject).append(",");
        if (!com.tencent.mm.model.t.kH(paramh.egE))
          break label1521;
        m = 1;
        label725: localStringBuffer.append(m).append(",");
        label739: localStringBuffer.append(paramd.field_retCode).append(",");
        localStringBuffer.append(paramd.field_enQueueTime).append(",");
        localStringBuffer.append(paramd.field_firstRequestCost).append(",");
        localStringBuffer.append(paramd.field_firstRequestSize).append(",");
        localStringBuffer.append(paramd.field_firstRequestDownloadSize).append(",");
        if (!paramd.field_firstRequestCompleted)
          break label1559;
        m = 1;
        label829: localStringBuffer.append(m).append(",");
        localStringBuffer.append(paramd.field_averageSpeed).append(",");
        localStringBuffer.append(paramd.field_averageConnectCost).append(",");
        localStringBuffer.append(paramd.field_firstConnectCost).append(",");
        localStringBuffer.append(paramd.field_netConnectTimes).append(",");
        localStringBuffer.append(paramd.field_moovRequestTimes).append(",");
        localStringBuffer.append(paramd.field_moovCost).append(",");
        localStringBuffer.append(paramd.field_moovSize).append(",");
        if (!paramd.field_moovCompleted)
          break label1565;
        m = 1;
        label965: localStringBuffer.append(m).append(",");
        localStringBuffer.append(paramd.field_moovFailReason).append(",");
        localStringBuffer.append(i4).append(",");
        localStringBuffer.append(i5).append(",");
        if (!bool1)
          break label1571;
        localStringBuffer.append(k).append(",");
        localStringBuffer.append(str2).append(",");
        if (!bool1)
          break label1630;
        localStringBuffer.append(paramh.egH).append(",");
        localStringBuffer.append(paramh.cKK).append(",");
        localStringBuffer.append(paramh.initialDownloadLength).append(",");
        localStringBuffer.append(paramd.field_videoFormat).append(",");
        label1125: localStringBuffer.append(str1).append(",");
        localStringBuffer.append(i).append(",");
        localStringBuffer.append(paramh.egJ).append(",");
        localStringBuffer.append(localPInt1.value).append(",");
        localStringBuffer.append(localPInt2.value);
        if (!bool1)
          break label1652;
        m = 13570;
        label1207: if (bool2)
          m = 13570;
        localObject = localStringBuffer.toString();
        ab.i("MicroMsg.OnlineVideoService", "report online video %d:%s", new Object[] { Integer.valueOf(m), localObject });
        if (!bool1)
          break label1660;
        new com.tencent.mm.g.b.a.s((String)localObject).ajK();
        label1267: if (paramBoolean)
          a(paramh.cEV, paramh.egE, paramh.cEX, paramd.field_fileId, i8, paramd.field_startTime, paramd.field_endTime, paramh.field_fullpath, paramd.field_usedSvrIps, paramh.url, localPInt1.value, localPInt2.value, paramh.cFc);
        if (bool1)
        {
          if (paramd.field_videoFormat != 2)
            break label2574;
          com.tencent.mm.plugin.report.service.h.pYm.a(354L, 132L, 1L, false);
        }
      }
      while (true)
      {
        paramArrayOfObject = u.ut(paramh.filename);
        if (paramArrayOfObject != null)
        {
          paramArrayOfObject = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(paramArrayOfObject.fXe);
          ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(new h.c(paramArrayOfObject.field_talker, "update", paramArrayOfObject));
        }
        AppMethodBeat.o(50587);
        break;
        i = 0;
        break label75;
        label1439: com.tencent.mm.plugin.report.service.h.pYm.a(354L, 46L, 1L, false);
        break label148;
        label1456: com.tencent.mm.plugin.report.service.h.pYm.a(354L, 48L, 1L, false);
        break label169;
        m = 31;
        break label355;
        label1480: localStringBuffer.append(paramh.url).append(",").append(paramh.egG).append(",");
        break label445;
        label1512: localObject = Integer.valueOf(0);
        break label698;
        label1521: m = 0;
        break label725;
        label1527: localStringBuffer.append(0).append(",");
        localStringBuffer.append(paramd.field_httpStatusCode).append(",");
        break label739;
        label1559: m = 0;
        break label829;
        label1565: m = 0;
        break label965;
        label1571: localStringBuffer.append(k).append(",");
        if (paramh.egE != null);
        for (localObject = com.tencent.mm.a.g.x(paramh.egE.getBytes()); ; localObject = Integer.valueOf(0))
        {
          localStringBuffer.append(localObject).append(",");
          break;
        }
        label1630: localStringBuffer.append(com.tencent.mm.plugin.video.c.abR(paramh.cFc)).append(",");
        break label1125;
        label1652: m = 13790;
        break label1207;
        label1660: if (bool2)
        {
          int i9 = 0;
          int i10 = 0;
          str1 = "";
          long l1 = 0L;
          int i11 = 0;
          int i12 = 0;
          int i13 = 0;
          int i14 = 0;
          int i15 = i14;
          int i16 = i13;
          long l2 = l1;
          int i17 = i12;
          i7 = i11;
          localObject = str1;
          i = i10;
          m = i9;
          if (paramArrayOfObject != null)
          {
            i15 = i14;
            i16 = i13;
            l2 = l1;
            i17 = i12;
            i7 = i11;
            localObject = str1;
            i = i10;
            m = i9;
            if (paramArrayOfObject.length >= 11)
            {
              m = bo.getInt(paramArrayOfObject[7].toString(), 0);
              bo.getInt(paramArrayOfObject[8].toString(), 0);
              i = bo.getInt(paramArrayOfObject[9].toString(), 0);
              localObject = paramArrayOfObject[11].toString();
              i7 = bo.getInt(paramArrayOfObject[12].toString(), 0);
              l2 = bo.getLong(paramArrayOfObject[13].toString(), 0L);
              i17 = bo.getInt(paramArrayOfObject[14].toString(), 0);
              i16 = bo.getInt(paramArrayOfObject[15].toString(), 0);
              i15 = bo.getInt(paramArrayOfObject[16].toString(), 0);
            }
          }
          paramArrayOfObject = new bm();
          localObject = paramArrayOfObject.gf((String)localObject);
          ((bm)localObject).dcr = i7;
          ((bm)localObject).dcs = i16;
          ((bm)localObject).dct = i17;
          ((bm)localObject).cVG = j;
          ((bm)localObject).dcu = (i6 / 1000);
          ((bm)localObject).cXi = n;
          ((bm)localObject).cXj = i1;
          ((bm)localObject).dcv = i2;
          ((bm)localObject).cXl = i3;
          ((bm)localObject).dcw = 0L;
          ((bm)localObject).cXF = i4;
          ((bm)localObject).dcx = i5;
          localObject = ((bm)localObject).gg("");
          ((bm)localObject).cVH = (k * 1000);
          localObject = ((bm)localObject).gh(paramh.field_requestVideoFormat);
          ((bm)localObject).cTL = paramd.field_fileLength;
          ((bm)localObject).dcA = paramd.field_recvedBytes;
          ((bm)localObject).cXo = paramd.field_startTime;
          ((bm)localObject).cXp = paramd.field_endTime;
          ((bm)localObject).dcB = paramd.field_retCode;
          ((bm)localObject).dcC = paramd.field_enQueueTime;
          ((bm)localObject).dcD = paramd.field_moovRequestTimes;
          ((bm)localObject).dcE = paramd.field_moovCost;
          ((bm)localObject).cXC = paramd.field_moovSize;
          if (paramd.field_moovCompleted)
          {
            l1 = 1L;
            ((bm)localObject).dcF = l1;
            ((bm)localObject).dcG = paramd.field_moovFailReason;
            ((bm)localObject).dcH = paramd.field_firstConnectCost;
            ((bm)localObject).dcI = paramd.field_firstRequestCost;
            ((bm)localObject).dcJ = paramd.field_firstRequestSize;
            ((bm)localObject).dcK = paramd.field_firstRequestDownloadSize;
            if (!paramd.field_firstRequestCompleted)
              break label2546;
            l1 = 1L;
            ((bm)localObject).dcL = l1;
            ((bm)localObject).dcM = paramd.field_averageSpeed;
            ((bm)localObject).dcN = paramd.field_averageConnectCost;
            ((bm)localObject).cXz = paramd.field_netConnectTimes;
            localObject = ((bm)localObject).gi(paramd.Jn()).gj(paramd.field_clientIP);
            if (!paramd.field_isCrossNet)
              break label2552;
          }
          for (l1 = 1L; ; l1 = 0L)
          {
            ((bm)localObject).dcP = l1;
            ((bm)localObject).cXN = paramh.egJ;
            ((bm)localObject).dcQ = i;
            ((bm)localObject).cTJ = i8;
            ((bm)localObject).dcR = l2;
            ((bm)localObject).cVO = m;
            ((bm)localObject).dcS = i15;
            ab.d("MicroMsg.OnlineVideoService", "time distance %d", new Object[] { Long.valueOf(System.currentTimeMillis() - paramArrayOfObject.dcR) });
            if (System.currentTimeMillis() - paramArrayOfObject.dcR > 500L)
              paramArrayOfObject.ajK();
            paramArrayOfObject = new an();
            localObject = com.tencent.mm.plugin.sight.base.d.WR(paramh.field_fullpath);
            if (localObject != null)
            {
              paramArrayOfObject.cVG = ((com.tencent.mm.plugin.sight.base.a)localObject).eWK;
              paramArrayOfObject.cVH = ((com.tencent.mm.plugin.sight.base.a)localObject).videoBitrate;
              paramArrayOfObject.cVI = ((com.tencent.mm.plugin.sight.base.a)localObject).fzS;
              paramArrayOfObject.cVJ = ((com.tencent.mm.plugin.sight.base.a)localObject).eTk;
              paramArrayOfObject.cVK = ((com.tencent.mm.plugin.sight.base.a)localObject).width;
              paramArrayOfObject.cVL = ((com.tencent.mm.plugin.sight.base.a)localObject).height;
              paramArrayOfObject.cVN = ((com.tencent.mm.plugin.sight.base.a)localObject).qwV;
            }
            paramArrayOfObject.cVF = paramd.field_fileLength;
            paramArrayOfObject = paramArrayOfObject.ft(paramh.url);
            f.afy();
            paramArrayOfObject = paramArrayOfObject.fu(a.rJ(paramh.field_fullpath));
            paramArrayOfObject.cVD = paramd.field_startTime;
            paramArrayOfObject.cVE = paramd.field_endTime;
            paramArrayOfObject = paramArrayOfObject.fv(str2);
            paramArrayOfObject.cVO = m;
            paramArrayOfObject.cVP = localPInt2.value;
            paramArrayOfObject.ajK();
            break;
            l1 = 0L;
            break label2133;
            l1 = 0L;
            break label2200;
          }
        }
        label2133: label2546: label2552: new ai((String)localObject).ajK();
        label2200: break label1267;
        label2574: com.tencent.mm.plugin.report.service.h.pYm.a(354L, 133L, 1L, false);
      }
      label2591: i2 = 0;
      i3 = 0;
      i4 = 0;
      i5 = 0;
      i6 = 0;
      n = 0;
      i1 = 0;
    }
  }

  private static boolean a(az paramaz, String paramString1, long paramLong, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(50586);
    if (paramString1 == null)
      AppMethodBeat.o(50586);
    while (true)
    {
      return bool;
      try
      {
        URL localURL = new java/net/URL;
        localURL.<init>(paramString1);
        if (paramaz == null)
        {
          AppMethodBeat.o(50586);
        }
        else if (paramString2 == null)
        {
          AppMethodBeat.o(50586);
        }
        else
        {
          int i = paramString2.indexOf(localURL.getHost());
          if (i == -1)
          {
            AppMethodBeat.o(50586);
          }
          else
          {
            i = paramaz.oyB;
            if (i == 0)
            {
              AppMethodBeat.o(50586);
            }
            else
            {
              long l = bo.fp(paramaz.oyB);
              if (l > paramLong)
              {
                AppMethodBeat.o(50586);
                bool = true;
              }
              else
              {
                AppMethodBeat.o(50586);
              }
            }
          }
        }
      }
      catch (Exception paramaz)
      {
        ab.e("MicroMsg.OnlineVideoService", "error for check dcip %s", new Object[] { paramaz.getMessage() });
        AppMethodBeat.o(50586);
      }
    }
  }

  private static boolean i(int paramInt, String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(50583);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(50583);
    while (true)
    {
      return bool;
      o.all();
      paramString2 = com.tencent.mm.modelvideo.t.uh(paramString2);
      if ((bo.isNullOrNil(paramString1)) || (paramInt <= 0) || (bo.isNullOrNil(paramString2)))
      {
        ab.w("MicroMsg.OnlineVideoService", "insert media duplication but args is error.[%d, %s, %s]", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 });
        AppMethodBeat.o(50583);
      }
      else
      {
        bool = ((com.tencent.mm.plugin.m.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.m.a.a.class)).XT().y(paramString1, paramInt, paramString2);
        AppMethodBeat.o(50583);
      }
    }
  }

  public static int k(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50576);
    f.afy();
    int i = a.k(paramString, paramInt1, paramInt2);
    ab.i("MicroMsg.OnlineVideoService", "request video video[%s], offset[%d], length[%d] duration[%d] ret[%d]", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(i) });
    AppMethodBeat.o(50576);
    return i;
  }

  public static com.tencent.mm.i.h rQ(String paramString)
  {
    AppMethodBeat.i(50584);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(50584);
      paramString = null;
    }
    com.tencent.mm.modelvideo.s locals;
    String str1;
    int i;
    Object localObject2;
    String str2;
    String str3;
    String str4;
    while (true)
    {
      return paramString;
      locals = u.ut(paramString);
      if (locals == null)
      {
        AppMethodBeat.o(50584);
        paramString = null;
      }
      else
      {
        localObject1 = br.z(locals.alw(), "msg");
        if (localObject1 == null)
        {
          ab.w("MicroMsg.OnlineVideoService", "cdntra parse video recv xml failed");
          AppMethodBeat.o(50584);
          paramString = null;
        }
        else
        {
          str1 = (String)((Map)localObject1).get(".msg.videomsg.$cdnvideourl");
          if (bo.isNullOrNil(str1))
          {
            ab.w("MicroMsg.OnlineVideoService", "cdntra parse video recv xml failed");
            AppMethodBeat.o(50584);
            paramString = null;
          }
          else
          {
            i = Integer.valueOf((String)((Map)localObject1).get(".msg.videomsg.$length")).intValue();
            localObject2 = (String)((Map)localObject1).get(".msg.videomsg.$md5");
            str2 = (String)((Map)localObject1).get(".msg.videomsg.$aeskey");
            str3 = (String)((Map)localObject1).get(".msg.videomsg.$fileparam");
            str4 = c.a("downvideo", locals.createTime, locals.getUser(), locals.getFileName());
            if (!bo.isNullOrNil(str4))
              break;
            ab.w("MicroMsg.OnlineVideoService", "cdntra genClientId failed not use cdn file:%s", new Object[] { locals.getFileName() });
            AppMethodBeat.o(50584);
            paramString = null;
          }
        }
      }
    }
    o.all();
    String str5 = com.tencent.mm.modelvideo.t.uh(paramString);
    Object localObject1 = new com.tencent.mm.i.h();
    ((com.tencent.mm.i.h)localObject1).filename = paramString;
    ((com.tencent.mm.i.h)localObject1).egB = ((String)localObject2);
    ((com.tencent.mm.i.h)localObject1).egC = i;
    ((com.tencent.mm.i.h)localObject1).egD = 1;
    ((com.tencent.mm.i.h)localObject1).cEV = locals.alt();
    ((com.tencent.mm.i.h)localObject1).egE = locals.getUser();
    if (com.tencent.mm.model.t.kH(locals.getUser()))
    {
      j = n.mA(locals.getUser());
      label311: ((com.tencent.mm.i.h)localObject1).cEX = j;
      ((com.tencent.mm.i.h)localObject1).field_mediaId = str4;
      ((com.tencent.mm.i.h)localObject1).field_fullpath = str5;
      ((com.tencent.mm.i.h)localObject1).field_fileType = com.tencent.mm.i.a.MediaType_VIDEO;
      ((com.tencent.mm.i.h)localObject1).field_totalLen = i;
      ((com.tencent.mm.i.h)localObject1).field_aesKey = str2;
      ((com.tencent.mm.i.h)localObject1).field_fileId = str1;
      ((com.tencent.mm.i.h)localObject1).field_priority = com.tencent.mm.i.a.efC;
      ((com.tencent.mm.i.h)localObject1).field_wxmsgparam = str3;
      if (!com.tencent.mm.model.t.kH(locals.getUser()))
        break label527;
      j = 1;
      label379: ((com.tencent.mm.i.h)localObject1).field_chattype = j;
      ((com.tencent.mm.i.h)localObject1).egF = locals.egF;
      localObject2 = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Q(locals.getUser(), locals.cKK);
      paramString = bf.oE(((cy)localObject2).dqJ);
      ((com.tencent.mm.i.h)localObject1).initialDownloadLength = 0;
      ((com.tencent.mm.i.h)localObject1).initialDownloadOffset = 0;
      ((com.tencent.mm.i.h)localObject1).egH = ((cy)localObject2).field_createTime;
      ((com.tencent.mm.i.h)localObject1).cKK = ((cy)localObject2).field_msgSvrId;
      if (paramString == null)
        break label533;
    }
    label527: label533: for (int j = paramString.fmG; ; j = 0)
    {
      ((com.tencent.mm.i.h)localObject1).egI = j;
      if (((com.tencent.mm.i.h)localObject1).initialDownloadLength > 0)
        com.tencent.mm.plugin.report.service.h.pYm.a(354L, 36L, 1L, false);
      ((com.tencent.mm.i.h)localObject1).field_autostart = false;
      ((com.tencent.mm.i.h)localObject1).field_requestVideoFormat = com.tencent.mm.modelcontrol.d.a(1, locals);
      AppMethodBeat.o(50584);
      paramString = (String)localObject1;
      break;
      j = 0;
      break label311;
      j = 0;
      break label379;
    }
  }

  public final int a(String paramString, com.tencent.mm.i.c paramc, com.tencent.mm.i.d paramd)
  {
    AppMethodBeat.i(50581);
    int i;
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.OnlineVideoService", "cdn callback mediaid is null.");
      i = -1;
      AppMethodBeat.o(50581);
    }
    while (true)
    {
      return i;
      if ((paramc == null) && (paramd == null))
      {
        ab.e("MicroMsg.OnlineVideoService", "cdn callback info all null.");
        i = -2;
        AppMethodBeat.o(50581);
      }
      else
      {
        com.tencent.mm.kernel.g.RS().aa(new e.2(this, paramString, paramc, paramd));
        if (this.fyM.get(paramString) != null)
        {
          i = 1;
          AppMethodBeat.o(50581);
        }
        else
        {
          i = 0;
          AppMethodBeat.o(50581);
        }
      }
    }
  }

  public final boolean a(final com.tencent.mm.i.h paramh)
  {
    boolean bool = false;
    AppMethodBeat.i(50572);
    if (bo.isNullOrNil(paramh.field_mediaId))
    {
      ab.e("MicroMsg.OnlineVideoService", "add download task, but task mediaId is null.");
      AppMethodBeat.o(50572);
      return bool;
    }
    ab.i("MicroMsg.OnlineVideoService", "add download task : " + paramh.field_mediaId);
    if (paramh.field_fileId == null)
      paramh.field_fileId = "";
    if (paramh.field_aesKey == null)
      paramh.field_aesKey = "";
    paramh.cRY = false;
    if (Looper.myLooper() != Looper.getMainLooper())
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(50562);
          e.this.fyK.add(paramh.field_mediaId);
          e.this.fyL.put(paramh.field_mediaId, paramh);
          e.this.cK(false);
          AppMethodBeat.o(50562);
        }
      });
    while (true)
    {
      bool = true;
      AppMethodBeat.o(50572);
      break;
      this.fyK.add(paramh.field_mediaId);
      this.fyL.put(paramh.field_mediaId, paramh);
      cK(false);
    }
  }

  public final boolean a(com.tencent.mm.i.h paramh, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(50571);
    if (paramh == null)
    {
      ab.e("MicroMsg.OnlineVideoService", "add download task, but task is null.");
      AppMethodBeat.o(50571);
    }
    for (paramBoolean = bool; ; paramBoolean = bool)
    {
      return paramBoolean;
      if (!bo.isNullOrNil(paramh.field_mediaId))
        break;
      ab.e("MicroMsg.OnlineVideoService", "add download task, but task mediaId is null.");
      AppMethodBeat.o(50571);
    }
    ab.i("MicroMsg.OnlineVideoService", "add download task : " + paramh.field_mediaId + " delay : " + paramBoolean);
    if (paramh.field_fileId == null)
      paramh.field_fileId = "";
    if (paramh.field_aesKey == null)
      paramh.field_aesKey = "";
    paramh.cRY = false;
    if ((m(paramh.field_mediaId, null)) || (paramBoolean))
      com.tencent.mm.kernel.g.RS().aa(new e.3(this, paramh));
    while (true)
    {
      paramBoolean = true;
      AppMethodBeat.o(50571);
      break;
      com.tencent.mm.kernel.g.RS().aa(new e.4(this, paramh));
    }
  }

  public final void cK(boolean paramBoolean)
  {
    AppMethodBeat.i(50577);
    if (!com.tencent.mm.kernel.g.RK())
      AppMethodBeat.o(50577);
    while (true)
    {
      return;
      if ((!paramBoolean) && (f.afy().afq()))
      {
        com.tencent.mm.kernel.g.RN();
        if (com.tencent.mm.kernel.a.QX())
        {
          ab.w("MicroMsg.OnlineVideoService", "cdn engine not init cdn dnsinfo , will retry after set info");
          f.afx().cK(paramBoolean);
          AppMethodBeat.o(50577);
        }
      }
      else
      {
        f.afx().afs();
        while (!this.fyK.isEmpty())
        {
          Object localObject1 = (String)this.fyK.poll();
          Object localObject2 = (com.tencent.mm.i.h)this.fyL.remove(localObject1);
          if (localObject2 != null)
          {
            ((com.tencent.mm.i.h)localObject2).field_startTime = bo.anU();
            if (!((com.tencent.mm.i.h)localObject2).cRY)
            {
              if (((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xOL, Integer.valueOf(-1))).intValue() == 2)
                ab.i("MicroMsg.OnlineVideoService", "command set do not check media duplication.");
              label163: int j;
              for (int i = 0; ; i = 1)
              {
                if (i == 0)
                  break label407;
                localObject2 = new lp();
                ((lp)localObject2).cHq.cAd = 6;
                ((lp)localObject2).cHq.cHr = ((String)localObject1);
                com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
                break;
                if (((com.tencent.mm.i.h)localObject2).Js())
                  break label163;
                Object localObject3 = ((com.tencent.mm.i.h)localObject2).egB;
                i = ((com.tencent.mm.i.h)localObject2).egC;
                Object localObject4 = ((com.tencent.mm.plugin.m.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.m.a.a.class)).XT().es((String)localObject3, i);
                j = i - (int)com.tencent.mm.vfs.e.asZ((String)localObject4);
                if ((bo.isNullOrNil((String)localObject4)) || (j < 0) || (j > 16))
                  break label163;
                ab.i("MicroMsg.OnlineVideoService", "it had download this video[%d, %s, %s].", new Object[] { Integer.valueOf(i), localObject3, localObject4 });
                com.tencent.mm.vfs.e.y((String)localObject4, ((com.tencent.mm.i.h)localObject2).field_fullpath);
                localObject4 = u.ut(((com.tencent.mm.i.h)localObject2).filename);
                a((com.tencent.mm.modelvideo.s)localObject4, i, (String)localObject3);
                localObject3 = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(((com.tencent.mm.modelvideo.s)localObject4).fXe);
                ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().a(new h.c(((cy)localObject3).field_talker, "update", (bi)localObject3));
              }
              label407: if (((com.tencent.mm.i.h)localObject2).Jr())
              {
                i = f.afy().a((com.tencent.mm.i.g)localObject2, ((com.tencent.mm.i.h)localObject2).egD);
                label427: ab.i("MicroMsg.OnlineVideoService", "start task %s streaming download. ret %d ", new Object[] { localObject2, Integer.valueOf(i) });
                if (i == 0)
                  break label997;
                ab.w("MicroMsg.OnlineVideoService", "start stream video error. ret : " + i + " media id: " + ((com.tencent.mm.i.h)localObject2).field_mediaId);
                paramBoolean = ((com.tencent.mm.i.h)localObject2).Jr();
                j = ((com.tencent.mm.i.h)localObject2).egD;
                if (!paramBoolean)
                  break label907;
                com.tencent.mm.plugin.report.service.h.pYm.a(354L, 3L, 1L, false);
                if (j != 1)
                  break label840;
                if (i != -21006)
                  break label798;
                com.tencent.mm.plugin.report.service.h.pYm.a(354L, 100L, 1L, false);
              }
              while (true)
              {
                com.tencent.mm.plugin.report.service.h.pYm.e(13836, new Object[] { Integer.valueOf(100), Long.valueOf(bo.anT()), "" });
                break;
                if (((com.tencent.mm.i.h)localObject2).Jp())
                {
                  i = f.afy().a(((com.tencent.mm.i.h)localObject2).field_mediaId, ((com.tencent.mm.i.h)localObject2).url, ((com.tencent.mm.i.h)localObject2).referer, ((com.tencent.mm.i.h)localObject2).field_fullpath, ((com.tencent.mm.i.h)localObject2).egD, ((com.tencent.mm.i.h)localObject2).ege, ((com.tencent.mm.i.h)localObject2).isColdSnsData, ((com.tencent.mm.i.h)localObject2).signalQuality, ((com.tencent.mm.i.h)localObject2).snsScene, ((com.tencent.mm.i.h)localObject2).field_preloadRatio, ((com.tencent.mm.i.h)localObject2).field_requestVideoFormat, 4);
                  break label427;
                }
                if (((com.tencent.mm.i.h)localObject2).Jt())
                {
                  i = f.afy().b(((com.tencent.mm.i.h)localObject2).field_mediaId, ((com.tencent.mm.i.h)localObject2).url, ((com.tencent.mm.i.h)localObject2).referer, ((com.tencent.mm.i.h)localObject2).field_fullpath, ((com.tencent.mm.i.h)localObject2).egD, ((com.tencent.mm.i.h)localObject2).ege, ((com.tencent.mm.i.h)localObject2).isColdSnsData, ((com.tencent.mm.i.h)localObject2).signalQuality, ((com.tencent.mm.i.h)localObject2).snsScene, ((com.tencent.mm.i.h)localObject2).field_preloadRatio, ((com.tencent.mm.i.h)localObject2).field_requestVideoFormat, 4);
                  break label427;
                }
                if (((com.tencent.mm.i.h)localObject2).Jq())
                {
                  i = f.afy().a(((com.tencent.mm.i.h)localObject2).field_mediaId, ((com.tencent.mm.i.h)localObject2).url, ((com.tencent.mm.i.h)localObject2).referer, ((com.tencent.mm.i.h)localObject2).field_fullpath, ((com.tencent.mm.i.h)localObject2).egD, ((com.tencent.mm.i.h)localObject2).field_preloadRatio, ((com.tencent.mm.i.h)localObject2).concurrentCount);
                  break label427;
                }
                i = f.afy().a(((com.tencent.mm.i.h)localObject2).field_mediaId, ((com.tencent.mm.i.h)localObject2).url, ((com.tencent.mm.i.h)localObject2).referer, ((com.tencent.mm.i.h)localObject2).field_fullpath, ((com.tencent.mm.i.h)localObject2).egD, ((com.tencent.mm.i.h)localObject2).ege, ((com.tencent.mm.i.h)localObject2).field_preloadRatio);
                break label427;
                label798: if (i == -20003)
                {
                  com.tencent.mm.plugin.report.service.h.pYm.a(354L, 101L, 1L, false);
                }
                else
                {
                  com.tencent.mm.plugin.report.service.h.pYm.a(354L, 102L, 1L, false);
                  continue;
                  label840: if (i == -21006)
                    com.tencent.mm.plugin.report.service.h.pYm.a(354L, 106L, 1L, false);
                  else if (i == -20003)
                    com.tencent.mm.plugin.report.service.h.pYm.a(354L, 107L, 1L, false);
                  else
                    com.tencent.mm.plugin.report.service.h.pYm.a(354L, 108L, 1L, false);
                }
              }
              label907: com.tencent.mm.plugin.report.service.h.pYm.a(354L, 210L, 1L, false);
              if (j == 1)
                com.tencent.mm.plugin.report.service.h.pYm.a(354L, 211L, 1L, false);
              while (true)
              {
                com.tencent.mm.plugin.report.service.h.pYm.e(13836, new Object[] { Integer.valueOf(200), Long.valueOf(bo.anT()), "" });
                break;
                com.tencent.mm.plugin.report.service.h.pYm.a(354L, 212L, 1L, false);
              }
              label997: ((com.tencent.mm.i.h)localObject2).egA = bo.anU();
              if (((com.tencent.mm.i.h)localObject2).Jr())
              {
                localObject1 = u.ut(((com.tencent.mm.i.h)localObject2).filename);
                if (localObject1 != null)
                {
                  i = ((com.tencent.mm.modelvideo.s)localObject1).status;
                  if ((i != 120) && (i != 122) && (i != 121))
                  {
                    ((com.tencent.mm.modelvideo.s)localObject1).status = 120;
                    ((com.tencent.mm.modelvideo.s)localObject1).bJt = 256;
                    o.all().c((com.tencent.mm.modelvideo.s)localObject1);
                  }
                }
              }
              this.fyM.put(((com.tencent.mm.i.h)localObject2).field_mediaId, localObject2);
            }
          }
        }
        AppMethodBeat.o(50577);
      }
    }
  }

  public final boolean isVideoDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50575);
    boolean bool;
    if ((com.tencent.mm.i.h)this.fyM.get(paramString) == null)
    {
      ab.i("MicroMsg.OnlineVideoService", "this media[%s] don't download now.", new Object[] { paramString });
      AppMethodBeat.o(50575);
      bool = false;
    }
    while (true)
    {
      return bool;
      f.afy();
      bool = a.isVideoDataAvailable(paramString, paramInt1, paramInt2);
      ab.i("MicroMsg.OnlineVideoService", "is video[%s] data[%d, %d] available[%b]", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      AppMethodBeat.o(50575);
    }
  }

  public final boolean l(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(50573);
    boolean bool;
    if (!bo.isNullOrNil(paramString))
      if (this.fyM.containsKey(paramString))
      {
        bool = true;
        if (Looper.myLooper() == Looper.getMainLooper())
          break label103;
        al.d(new e.6(this, paramString, paramArrayOfObject));
      }
    while (true)
    {
      ab.i("MicroMsg.OnlineVideoService", "cancelDownloadTaskInMainThread mediaId : " + paramString + " remove : " + bool);
      AppMethodBeat.o(50573);
      return bool;
      f.afx().rO(paramString);
      bool = false;
      break;
      label103: com.tencent.mm.i.h localh = (com.tencent.mm.i.h)this.fyM.remove(paramString);
      com.tencent.mm.i.d locald;
      int i;
      if (localh != null)
      {
        locald = new com.tencent.mm.i.d();
        f.afy();
        i = a.b(localh.field_mediaId, locald);
        if (i == 0)
          a(paramArrayOfObject, locald, localh, false);
      }
      while (true)
      {
        this.fyL.remove(paramString);
        break;
        ab.w("MicroMsg.OnlineVideoService", "stop video stream download error. ret %d, mediaId %s", new Object[] { Integer.valueOf(i), localh.field_mediaId });
        continue;
        localh = (com.tencent.mm.i.h)this.fzq.remove(paramString);
        locald = (com.tencent.mm.i.d)this.fzr.remove(paramString);
        if ((localh != null) && (locald != null))
          a(paramArrayOfObject, locald, localh, true);
      }
      bool = false;
    }
  }

  public final boolean m(String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(50574);
    boolean bool1 = false;
    boolean bool2 = false;
    if (!bo.isNullOrNil(paramString))
      if (!this.fyM.containsKey(paramString))
        break label90;
    for (bool1 = true; ; bool1 = bool2)
    {
      com.tencent.mm.kernel.g.RS().aa(new e.7(this, paramString, paramArrayOfObject));
      ab.i("MicroMsg.OnlineVideoService", "cancelDownloadTask mediaId : " + paramString + " remove : " + bool1);
      AppMethodBeat.o(50574);
      return bool1;
      label90: f.afx().rO(paramString);
    }
  }

  public final void onDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50579);
    ab.i("MicroMsg.OnlineVideoService", "onDataAvailable. offset %d, length %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(50579);
    while (true)
    {
      return;
      com.tencent.mm.kernel.g.RS().aa(new e.9(this, paramString, paramInt1, paramInt2));
      AppMethodBeat.o(50579);
    }
  }

  public final void onDownloadToEnd(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50580);
    ab.i("MicroMsg.OnlineVideoService", "onDownloadToEnd. offset %d, length %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(50580);
    while (true)
    {
      return;
      com.tencent.mm.kernel.g.RS().aa(new e.10(this, paramString, paramInt1, paramInt2));
      AppMethodBeat.o(50580);
    }
  }

  public final void onMoovReady(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50578);
    ab.i("MicroMsg.OnlineVideoService", "onMoovReady mediaId[%s]", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(50578);
    while (true)
    {
      return;
      com.tencent.mm.kernel.g.RS().aa(new e.8(this, paramString, paramInt1, paramInt2));
      AppMethodBeat.o(50578);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(50570);
    if (paramm.getType() != 379)
      AppMethodBeat.o(50570);
    while (true)
    {
      return;
      ab.i("MicroMsg.OnlineVideoService", "it get cdn dns success[%d, %d], try to start.", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (com.tencent.mm.kernel.g.RN().QY())
        com.tencent.mm.kernel.g.RS().aa(new e.1(this));
      AppMethodBeat.o(50570);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(50569);
    com.tencent.mm.kernel.g.Rg().b(379, this);
    AppMethodBeat.o(50569);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.e
 * JD-Core Version:    0.6.2
 */