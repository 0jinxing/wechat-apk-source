package com.tencent.mm.plugin.topstory.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.plugin.websearch.api.a.a;
import com.tencent.mm.plugin.websearch.api.a.b;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.w;
import com.tencent.mm.protocal.protobuf.abz;
import com.tencent.mm.protocal.protobuf.bsj;
import com.tencent.mm.protocal.protobuf.chn;
import com.tencent.mm.protocal.protobuf.chu;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.protocal.protobuf.cvi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class h
{
  public static void Fz(int paramInt)
  {
    AppMethodBeat.i(96372);
    switch (paramInt)
    {
    default:
      b.kT(b.uca);
    case -1010:
    case -1007:
    case -1004:
    case -10012:
    case -10004:
    case -21009:
    case -21020:
    case 404:
    case 403:
    case 503:
    case 502:
    case 416:
    case 405:
    }
    while (true)
    {
      a.kT(7);
      AppMethodBeat.o(96372);
      return;
      b.kT(b.ubM);
      continue;
      b.kT(b.ubN);
      continue;
      b.kT(b.ubO);
      continue;
      b.kT(b.ubP);
      continue;
      b.kT(b.ubQ);
      continue;
      b.kT(b.ubR);
      continue;
      b.kT(b.ubS);
      continue;
      b.kT(b.ubT);
      continue;
      b.kT(b.ubU);
      continue;
      b.kT(b.ubV);
      continue;
      b.kT(b.ubW);
      continue;
      b.kT(b.ubX);
      continue;
      b.kT(b.ubY);
    }
  }

  public static void a(chn paramchn, String paramString, long paramLong)
  {
    AppMethodBeat.i(96370);
    if ((paramchn.xgk.size() > 0) && ("clickTopStory".equals(((chu)paramchn.xgk.get(0)).name)));
    for (long l = paramLong - ((chu)paramchn.xgk.get(0)).timestamp; ; l = 0L)
    {
      int i = aa.HV(1);
      paramchn = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(paramchn.scene), paramchn.xgj, paramchn.cvF, Integer.valueOf(i), paramString, Long.valueOf(paramLong), Integer.valueOf(paramchn.sBd), Integer.valueOf(paramchn.xgl), paramchn.xgn, Long.valueOf(l), paramchn.xgo });
      ab.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryHomeUIAction 15466 %s", new Object[] { paramchn });
      com.tencent.mm.plugin.report.service.h.pYm.X(15466, paramchn);
      AppMethodBeat.o(96370);
      return;
    }
  }

  public static final void a(chv paramchv, long paramLong, chw paramchw)
  {
    AppMethodBeat.i(96375);
    int i;
    long l;
    if (paramLong > 0L)
    {
      i = paramchv.scene;
      l = paramLong / 1000L;
      paramLong = paramchv.xgG;
      if (paramchw == null)
        break label156;
    }
    label156: for (paramchw = paramchw.xgV; ; paramchw = paramchv.xgD)
    {
      paramchw = String.format("videoflowbrowsereport=1&scene=%s&staytime=%s&channelid=%s&pageid=%s&nettype=%s&source=%s&expand=%s&searchid=%s", new Object[] { Integer.valueOf(i), Long.valueOf(l), Long.valueOf(paramLong), Integer.valueOf(3), "", Integer.valueOf(2), paramchw, paramchv.hlm });
      ab.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryVideoPageBrowseTime 15018 %s", new Object[] { paramchw });
      paramchv = new bsj();
      paramchv.wUu = paramchw;
      paramchv = new w(paramchv);
      g.Rg().a(paramchv, 0);
      AppMethodBeat.o(96375);
      return;
    }
  }

  public static void a(chv paramchv, chw paramchw, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(96369);
    paramchv = String.format("videosharereport=1&scene=%s&searchid=%s&docid=%s&videoid=%s&optype=%s&fromuser=%s&touser=%s&channelid=%s&optypes=%s&expand=%s", new Object[] { Integer.valueOf(paramchv.scene), paramchv.hlm, paramchw.ubA, paramchw.xgS, Integer.valueOf(0), paramString2, paramString3, Long.valueOf(paramchv.xgG), paramString1, paramchw.xgV });
    ab.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryVideoShare 15035 %s", new Object[] { paramchv });
    paramchw = new bsj();
    paramchw.wUu = paramchv;
    paramchv = new w(paramchw);
    g.Rg().a(paramchv, 0);
    AppMethodBeat.o(96369);
  }

  public static void a(chv paramchv, chw paramchw, Set<abz> paramSet, int paramInt)
  {
    AppMethodBeat.i(96374);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("isfeedback=1");
    localStringBuffer.append("&feedtype=0");
    localStringBuffer.append("&businesstype=2");
    localStringBuffer.append("&itemtype=");
    localStringBuffer.append(paramchw.xgW);
    localStringBuffer.append("&scene=");
    localStringBuffer.append(paramchv.scene);
    localStringBuffer.append("&searchid=");
    localStringBuffer.append(paramchv.hlm);
    localStringBuffer.append("&clicktime=");
    localStringBuffer.append(System.currentTimeMillis());
    localStringBuffer.append("&docid=");
    localStringBuffer.append(paramchw.ubA);
    localStringBuffer.append("&docpos=");
    localStringBuffer.append(paramInt);
    localStringBuffer.append("&reasonid=");
    Object localObject = paramSet.iterator();
    while (((Iterator)localObject).hasNext())
    {
      localStringBuffer.append(((abz)((Iterator)localObject).next()).id);
      localStringBuffer.append("#");
    }
    localStringBuffer.append("&reasonwording=");
    localObject = new StringBuffer();
    paramSet = paramSet.iterator();
    while (paramSet.hasNext())
    {
      ((StringBuffer)localObject).append(((abz)paramSet.next()).cEh);
      ((StringBuffer)localObject).append("#");
    }
    try
    {
      localStringBuffer.append(q.encode(((StringBuffer)localObject).toString(), "utf8"));
      label286: localStringBuffer.append("&offset=");
      localStringBuffer.append(paramInt);
      localStringBuffer.append("&sessionid=");
      localStringBuffer.append(aa.HP(paramchv.scene));
      localStringBuffer.append("&reserveexpand=");
      localStringBuffer.append(paramchw.xgX);
      ab.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportFeedBackClick %s", new Object[] { localStringBuffer.toString() });
      paramchv = new bsj();
      paramchv.wUu = localStringBuffer.toString();
      paramchv = new w(paramchv);
      g.Rg().a(paramchv, 0);
      AppMethodBeat.o(96374);
      return;
    }
    catch (UnsupportedEncodingException paramSet)
    {
      break label286;
    }
  }

  public static void a(chw paramchw, int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(96373);
    int i;
    if (at.isWifi(ah.getContext()))
    {
      i = 2;
      if (paramchw == null)
        break label122;
    }
    label122: for (paramchw = paramchw.ubA; ; paramchw = "")
    {
      paramchw = String.format("%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(paramInt1), paramString, paramchw, Integer.valueOf(i), Integer.valueOf(paramInt2) });
      ab.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportKvTopStoryVideoPlayError %s", new Object[] { paramchw });
      e.pXa.X(15248, paramchw);
      AppMethodBeat.o(96373);
      return;
      if (!at.isConnected(ah.getContext()))
      {
        i = 1;
        break;
      }
      i = 3;
      break;
    }
  }

  public static void a(cvi paramcvi, bi parambi)
  {
    AppMethodBeat.i(96371);
    Object localObject1;
    Object localObject2;
    int i;
    if (t.kH(parambi.field_talker))
      if (parambi.field_isSend == 1)
      {
        localObject1 = r.Yz();
        localObject2 = parambi.field_talker;
        i = 2;
        parambi = (bi)localObject1;
        localObject1 = new StringBuffer();
        ((StringBuffer)localObject1).append("isShareClick=1");
        ((StringBuffer)localObject1).append("&relevant_vid=");
        ((StringBuffer)localObject1).append(paramcvi.uaa);
        ((StringBuffer)localObject1).append("&relevant_pre_searchid=");
        ((StringBuffer)localObject1).append(paramcvi.uac);
        ((StringBuffer)localObject1).append("&relevant_shared_openid=");
        ((StringBuffer)localObject1).append(paramcvi.uad);
        ((StringBuffer)localObject1).append("&rec_category=");
        if (paramcvi.uam <= 0L)
          break label318;
        ((StringBuffer)localObject1).append(paramcvi.uam);
      }
    while (true)
    {
      ((StringBuffer)localObject1).append("&source=");
      ((StringBuffer)localObject1).append(paramcvi.source);
      ((StringBuffer)localObject1).append("&fromUser=");
      ((StringBuffer)localObject1).append(parambi);
      ((StringBuffer)localObject1).append("&fromScene=");
      ((StringBuffer)localObject1).append(i);
      ((StringBuffer)localObject1).append("&targetInfo=");
      ((StringBuffer)localObject1).append((String)localObject2);
      ((StringBuffer)localObject1).append("&expand=");
      ((StringBuffer)localObject1).append(paramcvi.uab);
      ab.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryClickShareItem 15371 %s", new Object[] { ((StringBuffer)localObject1).toString() });
      paramcvi = new bsj();
      paramcvi.wUu = ((StringBuffer)localObject1).toString();
      paramcvi = new w(paramcvi);
      g.Rg().a(paramcvi, 0);
      AppMethodBeat.o(96371);
      return;
      localObject1 = bf.oy(parambi.field_content);
      break;
      if (parambi.field_isSend == 1)
      {
        localObject2 = r.Yz();
        localObject1 = parambi.field_talker;
        parambi = (bi)localObject2;
      }
      while (true)
      {
        i = 1;
        localObject2 = localObject1;
        break;
        parambi = parambi.field_talker;
        localObject1 = r.Yz();
      }
      label318: ((StringBuffer)localObject1).append(paramcvi.uae);
    }
  }

  public static final void c(String paramString1, String paramString2, int paramInt, long paramLong)
  {
    AppMethodBeat.i(96377);
    if ((!bo.isNullOrNil(paramString1)) && (paramString1.startsWith("wrd")));
    while (true)
    {
      try
      {
        paramString1 = String.format("%s,%s,%s,%s", new Object[] { q.encode(paramString2, "utf8"), Integer.valueOf(paramInt), paramString1, Long.valueOf(paramLong) });
        ab.i("MicroMsg.TopStory.TopStoryReportApiLogic", "kvReportTopStoryOpenWebViewError 15728 %s", new Object[] { paramString1 });
        com.tencent.mm.plugin.report.service.h.pYm.X(15728, paramString1);
        AppMethodBeat.o(96377);
        return;
      }
      catch (UnsupportedEncodingException paramString1)
      {
      }
      AppMethodBeat.o(96377);
    }
  }

  public static final void jdMethod_do(String paramString, int paramInt)
  {
    AppMethodBeat.i(96376);
    if ((!bo.isNullOrNil(paramString)) && (paramString.startsWith("wrd")))
      com.tencent.mm.plugin.report.service.h.pYm.a(900L, paramInt, 1L, false);
    AppMethodBeat.o(96376);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.h
 * JD-Core Version:    0.6.2
 */