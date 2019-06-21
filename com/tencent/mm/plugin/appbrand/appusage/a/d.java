package com.tencent.mm.plugin.appbrand.appusage.a;

import a.a.e;
import a.f.a.a;
import a.f.a.q;
import a.f.b.j;
import a.f.b.t;
import a.f.b.v;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.ars;
import com.tencent.mm.protocal.protobuf.bqd;
import com.tencent.mm.protocal.protobuf.sq;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import java.util.Collection;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appusage/recommend/AppBrandRecommendLogic;", "", "()V", "cache_seconds", "", "callback", "Lcom/tencent/mm/plugin/appbrand/appusage/recommend/CgiGetRecommendWxa$IGetRecommendWxaCallback;", "getCallback", "()Lcom/tencent/mm/plugin/appbrand/appusage/recommend/CgiGetRecommendWxa$IGetRecommendWxaCallback;", "setCallback", "(Lcom/tencent/mm/plugin/appbrand/appusage/recommend/CgiGetRecommendWxa$IGetRecommendWxaCallback;)V", "dataList", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/RecommendCard;", "getDataList", "()Ljava/util/LinkedList;", "dataList$delegate", "Lkotlin/Lazy;", "lastUpdateTime", "lastVisiblePos", "", "listener", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "result", "recommendCardList", "remainCount", "", "getListener", "()Lkotlin/jvm/functions/Function3;", "setListener", "(Lkotlin/jvm/functions/Function3;)V", "loadFromMemory", "", "locationGet", "Lcom/tencent/mm/plugin/appbrand/appusage/recommend/AppBrandRecommendLocationGet;", "mockData", "Lcom/tencent/mm/plugin/appbrand/appusage/recommend/MockData;", "pageNum", "rList", "getRList", "rList$delegate", "remain_count", "sessionId", "strategy", "testData", "delAllDB", "doGetRecommendCard", "fLongitude", "", "fLatitude", "fetchFromDB", "kotlin.jvm.PlatformType", "fetchPageData", "fetchPageDataFromMemory", "forceRefreshPageData", "getLastVisiblePos", "getPageNum", "getRemainCount", "getSessionId", "handleResponse", "response", "Lcom/tencent/mm/protocal/protobuf/GetRecommendWxaResponse;", "isDataEmpty", "isDataTimeOut", "needStoreToDB", "onFetchFinish", "list", "removeListener", "resetStrategy", "setLastVisiblePos", "pos", "setLoadFromMemory", "fromMemory", "shouldLoadFromMemory", "storeToDB", "Companion", "plugin-appbrand-integration_release"})
public final class d
{
  private static d hbt;
  public static final d.a hbu;
  public int cPK;
  private final k hbg;
  public final c hbh;
  private final a.f hbi;
  public long hbj;
  long hbk;
  public int hbl;
  public int hbm;
  public boolean hbn;
  public int hbo;
  private final a.f hbp;
  private boolean hbq;
  private h.a hbr;
  public q<? super Integer, ? super LinkedList<bqd>, ? super Integer, y> hbs;
  long lastUpdateTime;

  static
  {
    AppMethodBeat.i(134580);
    eQB = new a.i.k[] { (a.i.k)v.a(new t(v.aN(d.class), "rList", "getRList()Ljava/util/LinkedList;")), (a.i.k)v.a(new t(v.aN(d.class), "dataList", "getDataList()Ljava/util/LinkedList;")) };
    hbu = new d.a((byte)0);
    AppMethodBeat.o(134580);
  }

  private d()
  {
    AppMethodBeat.i(134586);
    this.hbg = new k();
    this.hbh = new c();
    this.hbi = a.g.g((a)d.h.hbz);
    this.hbo = 1;
    this.hbp = a.g.g((a)d.c.hbw);
    this.hbr = ((h.a)new d.b(this));
    this.hbs = ((q)d.g.hby);
    AppMethodBeat.o(134586);
  }

  private final void a(int paramInt, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(134585);
    if (!com.tencent.mm.kernel.g.RK())
      AppMethodBeat.o(134585);
    while (true)
    {
      return;
      Object localObject1 = new sq();
      ((sq)localObject1).waf = at.getNetTypeString(ah.getContext());
      ((sq)localObject1).longitude = paramFloat1;
      ((sq)localObject1).latitude = paramFloat2;
      if ((com.tencent.mm.sdk.platformtools.f.DEBUG) && (paramInt != 0) && (this.hbq))
      {
        k localk = this.hbg;
        localObject1 = new LinkedList();
        Object localObject2 = new bqd();
        localk.a((bqd)localObject2);
        ((bqd)localObject2).kLg = "####客户端mock数据####大视频";
        ((bqd)localObject2).iAd = 6;
        ((bqd)localObject2).wSr = "http://221.228.226.23/11/t/j/v/b/tjvbwspwhqdmgouolposcsfafpedmb/sh.yinyuetai.com/691201536EE4912BF7E4F1E2C67B8119.mp4";
        ((bqd)localObject2).wSt = "http://ent.chinadaily.com.cn/att/site1/20140818/0023ae72898c155ba5db5b.jpeg";
        ((LinkedList)localObject1).addLast(localObject2);
        localObject2 = (Collection)localObject1;
        bqd[] arrayOfbqd = new bqd[4];
        int i = 0;
        if (i < 4)
        {
          bqd localbqd = new bqd();
          localk.a(localbqd);
          localbqd.wSv = new ars();
          localbqd.wSv.wvH = 1500;
          localbqd.wSv.wvG = 1750;
          localbqd.iAd = 5;
          switch (i)
          {
          default:
            localbqd.kLg = "####客户端mock数据####商品ft";
            localbqd.wSv.wvJ = false;
            localbqd.wSv.wvI = true;
          case 0:
          case 1:
          case 2:
          }
          while (true)
          {
            String str = localbqd.kLg;
            localbqd.kLg = (str + paramInt);
            arrayOfbqd[i] = localbqd;
            i++;
            break;
            localbqd.kLg = "####客户端mock数据####商品tt";
            localbqd.wSv.wvJ = true;
            localbqd.wSv.wvI = true;
            continue;
            localbqd.kLg = "####客户端mock数据####商品tf";
            localbqd.wSv.wvJ = true;
            localbqd.wSv.wvI = false;
            continue;
            localbqd.kLg = "####客户端mock数据####商品ff";
            localbqd.wSv.wvJ = false;
            localbqd.wSv.wvI = false;
          }
        }
        j.p(localObject2, "receiver$0");
        j.p(arrayOfbqd, "elements");
        ((Collection)localObject2).addAll((Collection)e.asList(arrayOfbqd));
        if (paramInt == 2);
        for (paramInt = 0; ; paramInt = ((LinkedList)localObject1).size())
        {
          Thread.sleep(2000L);
          a(0, (LinkedList)localObject1, paramInt);
          AppMethodBeat.o(134585);
          break;
        }
      }
      h.a(paramInt, (sq)localObject1, this.hbj, this.hbr, this.hbo);
      AppMethodBeat.o(134585);
    }
  }

  private final void a(int paramInt1, LinkedList<bqd> paramLinkedList, int paramInt2)
  {
    AppMethodBeat.i(134583);
    q localq = this.hbs;
    if (localq != null)
    {
      localq.g(Integer.valueOf(paramInt1), paramLinkedList, Integer.valueOf(paramInt2));
      AppMethodBeat.o(134583);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134583);
    }
  }

  private final LinkedList<Integer> axX()
  {
    AppMethodBeat.i(134581);
    LinkedList localLinkedList = (LinkedList)this.hbi.getValue();
    AppMethodBeat.o(134581);
    return localLinkedList;
  }

  public final LinkedList<bqd> axY()
  {
    AppMethodBeat.i(134582);
    LinkedList localLinkedList = (LinkedList)this.hbp.getValue();
    AppMethodBeat.o(134582);
    return localLinkedList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.d
 * JD-Core Version:    0.6.2
 */