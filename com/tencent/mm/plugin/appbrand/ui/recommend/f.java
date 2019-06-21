package com.tencent.mm.plugin.appbrand.ui.recommend;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.a.f.1;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.protocal.protobuf.bqd;
import com.tencent.mm.protocal.protobuf.sp;
import com.tencent.mm.protocal.protobuf.zd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class f
{
  private long iQa;
  private long iQb;
  private long iQc;
  private boolean iQd;
  private HashMap<String, zd> iQe;
  private LinkedList<sp> iQf;
  private HashMap<String, sp> iQg;

  public f()
  {
    AppMethodBeat.i(133566);
    this.iQa = 0L;
    this.iQb = 0L;
    this.iQc = 0L;
    this.iQd = false;
    this.iQe = new HashMap();
    this.iQf = new LinkedList();
    this.iQg = new HashMap();
    AppMethodBeat.o(133566);
  }

  private static void a(LinkedList<sp> paramLinkedList, LinkedList<zd> paramLinkedList1)
  {
    AppMethodBeat.i(133571);
    Object localObject;
    if (paramLinkedList.size() > 0)
    {
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        localObject = (sp)localIterator.next();
        paramLinkedList = new StringBuilder();
        paramLinkedList.append("{");
        paramLinkedList.append("username:").append(((sp)localObject).username).append(",");
        paramLinkedList.append("recommend_id:").append(((sp)localObject).izZ).append(",");
        paramLinkedList.append("item_count:").append(((sp)localObject).wad).append(",");
        paramLinkedList.append("footnote_count:").append(((sp)localObject).wae).append(",");
        paramLinkedList.append("strategy_info:").append(((sp)localObject).iAa).append(",");
        paramLinkedList.append("appid:").append(((sp)localObject).csB).append(",");
        paramLinkedList.append("page_path:").append(((sp)localObject).iAb).append(",");
        paramLinkedList.append("page_param:").append(((sp)localObject).iAc).append(",");
        paramLinkedList.append("card_type:").append(((sp)localObject).iAd).append(",");
        paramLinkedList.append("pass_str:").append(((sp)localObject).iAe).append(",");
        paramLinkedList.append("},");
        ab.i("MicroMsg.Recommend.AppBrandRecommendReport", "doReportData clickData:%s", new Object[] { paramLinkedList.toString() });
      }
    }
    if (paramLinkedList1.size() > 0)
    {
      localObject = paramLinkedList1.iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramLinkedList = (zd)((Iterator)localObject).next();
        paramLinkedList1 = new StringBuilder();
        paramLinkedList1.append("{");
        paramLinkedList1.append("username:").append(paramLinkedList.username).append(",");
        paramLinkedList1.append("recommend_id:").append(paramLinkedList.izZ).append(",");
        paramLinkedList1.append("count:").append(paramLinkedList.count).append(",");
        paramLinkedList1.append("strategy_info:").append(paramLinkedList.iAa).append(",");
        paramLinkedList1.append("expose_millisecond:").append(paramLinkedList.wez).append(",");
        paramLinkedList1.append("appid:").append(paramLinkedList.csB).append(",");
        paramLinkedList1.append("page_path:").append(paramLinkedList.iAb).append(",");
        paramLinkedList1.append("page_param:").append(paramLinkedList.iAc).append(",");
        paramLinkedList1.append("card_type:").append(paramLinkedList.iAd).append(",");
        paramLinkedList1.append("pass_str:").append(paramLinkedList.iAe).append(",");
        paramLinkedList1.append("},");
        ab.d("MicroMsg.Recommend.AppBrandRecommendReport", "doReportData exposureData:%s", new Object[] { paramLinkedList1.toString() });
      }
    }
    AppMethodBeat.o(133571);
  }

  private void aNH()
  {
    AppMethodBeat.i(133568);
    this.iQb = bo.anT();
    this.iQa = this.iQb;
    this.iQd = false;
    this.iQe.clear();
    this.iQf.clear();
    this.iQg.clear();
    this.iQc = 0L;
    AppMethodBeat.o(133568);
  }

  private LinkedList<zd> aNK()
  {
    AppMethodBeat.i(133569);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.iQe.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localLinkedList.add(this.iQe.get(str));
    }
    ab.d("MicroMsg.Recommend.AppBrandRecommendReport", "exposureNodeMap size:%d", new Object[] { Integer.valueOf(this.iQe.size()) });
    AppMethodBeat.o(133569);
    return localLinkedList;
  }

  private static sp c(int paramInt, bqd parambqd)
  {
    AppMethodBeat.i(133574);
    sp localsp = new sp();
    localsp.username = parambqd.wSq;
    localsp.izZ = parambqd.izZ;
    localsp.iAa = parambqd.iAa;
    localsp.iAb = parambqd.iAb;
    localsp.iAc = parambqd.iAc;
    localsp.iAd = parambqd.iAd;
    localsp.iAe = parambqd.iAe;
    localsp.position = (paramInt + 1);
    parambqd = com.tencent.mm.plugin.appbrand.app.f.auO().d(parambqd.wSq, new String[0]);
    if (parambqd != null)
      localsp.csB = parambqd.field_appId;
    AppMethodBeat.o(133574);
    return localsp;
  }

  public final void a(int paramInt, bqd parambqd)
  {
    AppMethodBeat.i(133572);
    if (parambqd == null)
      AppMethodBeat.o(133572);
    while (true)
    {
      return;
      ab.i("MicroMsg.Recommend.AppBrandRecommendReport", "reportContentClick position:%d, app_user_name:%s, app_nick_name:%s, card_type:%d, recommend_id:%s", new Object[] { Integer.valueOf(paramInt), parambqd.wSq, parambqd.wSw, Integer.valueOf(parambqd.iAd), parambqd.izZ });
      if (this.iQg.containsKey(parambqd.izZ))
      {
        parambqd = (sp)this.iQg.get(parambqd.izZ);
        parambqd.wad += 1;
        AppMethodBeat.o(133572);
      }
      else
      {
        sp localsp = c(paramInt, parambqd);
        localsp.wad = 1;
        localsp.wae = 0;
        this.iQg.put(parambqd.izZ, localsp);
        this.iQf.add(localsp);
        AppMethodBeat.o(133572);
      }
    }
  }

  public final void aNG()
  {
    AppMethodBeat.i(133567);
    aNH();
    AppMethodBeat.o(133567);
  }

  public final void aNI()
  {
    AppMethodBeat.i(138700);
    this.iQb = bo.anT();
    AppMethodBeat.o(138700);
  }

  public final void aNJ()
  {
    AppMethodBeat.i(138701);
    this.iQc = (bo.anT() - this.iQb + this.iQc);
    this.iQb = bo.anT();
    AppMethodBeat.o(138701);
  }

  public final void b(int paramInt, bqd parambqd)
  {
    AppMethodBeat.i(133573);
    if (parambqd == null)
      AppMethodBeat.o(133573);
    while (true)
    {
      return;
      ab.i("MicroMsg.Recommend.AppBrandRecommendReport", "reportFooterClick position:%d, app_user_name:%s, app_nick_name:%s, card_type:%d, recommendId:%s", new Object[] { Integer.valueOf(paramInt), parambqd.wSq, parambqd.wSw, Integer.valueOf(parambqd.iAd), parambqd.izZ });
      if (this.iQg.containsKey(parambqd.izZ))
      {
        parambqd = (sp)this.iQg.get(parambqd.izZ);
        parambqd.wae += 1;
        AppMethodBeat.o(133573);
      }
      else
      {
        sp localsp = c(paramInt, parambqd);
        localsp.wad = 0;
        localsp.wae = 1;
        this.iQg.put(parambqd.izZ, localsp);
        this.iQf.add(localsp);
        AppMethodBeat.o(133573);
      }
    }
  }

  public final void d(int paramInt, bqd parambqd)
  {
    AppMethodBeat.i(133575);
    zd localzd;
    if (this.iQe.containsKey(parambqd.izZ))
    {
      localzd = (zd)this.iQe.get(parambqd.izZ);
      localzd.count += 1;
      this.iQe.put(parambqd.izZ, localzd);
      AppMethodBeat.o(133575);
    }
    while (true)
    {
      return;
      localzd = new zd();
      localzd.username = parambqd.wSq;
      localzd.count = 1;
      localzd.izZ = parambqd.izZ;
      localzd.iAa = parambqd.iAa;
      localzd.wez = 0;
      localzd.iAb = parambqd.iAb;
      localzd.iAc = parambqd.iAc;
      localzd.iAd = parambqd.iAd;
      localzd.iAe = parambqd.iAe;
      localzd.position = (paramInt + 1);
      WxaAttributes localWxaAttributes = com.tencent.mm.plugin.appbrand.app.f.auO().d(parambqd.wSq, new String[0]);
      if (localWxaAttributes != null)
        localzd.csB = localWxaAttributes.field_appId;
      this.iQe.put(parambqd.izZ, localzd);
      AppMethodBeat.o(133575);
    }
  }

  public final void eK(boolean paramBoolean)
  {
    this.iQd = paramBoolean;
  }

  public final void gu(long paramLong)
  {
    long l1 = 86400L;
    AppMethodBeat.i(133570);
    if (this.iQf.size() == 0)
    {
      if (this.iQe.size() > 0);
      for (i = 1; i == 0; i = 0)
      {
        ab.e("MicroMsg.Recommend.AppBrandRecommendReport", "none data report");
        AppMethodBeat.o(133570);
        return;
      }
    }
    ab.i("MicroMsg.Recommend.AppBrandRecommendReport", "doReportData");
    long l2 = bo.anT() - this.iQb;
    label86: LinkedList localLinkedList1;
    LinkedList localLinkedList2;
    if (l2 >= 86400L)
    {
      localLinkedList1 = new LinkedList();
      localLinkedList1.addAll(this.iQf);
      localLinkedList2 = aNK();
      if (!this.iQd)
        break label268;
    }
    label268: for (int i = 1; ; i = 0)
    {
      ab.i("MicroMsg.Recommend.AppBrandRecommendReport", "doReportData sessionId:%d, click_node_list size :%d, exposureNodeList size:%d, exposureSceneType:%d, stayTime:%d, startRecordTime:%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(this.iQf.size()), Integer.valueOf(localLinkedList2.size()), Integer.valueOf(i), Long.valueOf(l1), Long.valueOf(this.iQa) });
      a(this.iQf, localLinkedList2);
      int j = (int)l1;
      int k = (int)this.iQa;
      ab.d("MicroMsg.Recommend.AppBrandReportRecommendLogic", "reportReportRecommendWxa");
      e.aNS().aa(new f.1(paramLong, localLinkedList2, localLinkedList1, i, j, k));
      aNH();
      AppMethodBeat.o(133570);
      break;
      l1 = this.iQc + l2;
      break label86;
    }
  }

  public final void y(String paramString, long paramLong)
  {
    AppMethodBeat.i(133576);
    if (this.iQe.containsKey(paramString))
    {
      zd localzd = (zd)this.iQe.get(paramString);
      localzd.wez = ((int)(localzd.wez + paramLong));
      this.iQe.put(paramString, localzd);
    }
    AppMethodBeat.o(133576);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.f
 * JD-Core Version:    0.6.2
 */