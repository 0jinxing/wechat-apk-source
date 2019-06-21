package com.tencent.mm.plugin.appbrand.appusage.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bqd;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appusage/recommend/MockData;", "", "()V", "fakeRecommendCard", "Lcom/tencent/mm/protocal/protobuf/RecommendCard;", "getFakeRecommendCard", "()Lcom/tencent/mm/protocal/protobuf/RecommendCard;", "setFakeRecommendCard", "(Lcom/tencent/mm/protocal/protobuf/RecommendCard;)V", "copyMockData", "", "mockData", "mock", "Ljava/util/LinkedList;", "pageNum", "", "plugin-appbrand-integration_release"})
public final class k
{
  bqd hbU;

  public k()
  {
    AppMethodBeat.i(134595);
    this.hbU = new bqd();
    AppMethodBeat.o(134595);
  }

  final void a(bqd parambqd)
  {
    parambqd.wSq = this.hbU.wSq;
    parambqd.izZ = this.hbU.izZ;
    parambqd.iAb = this.hbU.iAb;
    parambqd.wSs = this.hbU.wSs;
    parambqd.kLg = "####客户端mock数据####商品";
    parambqd.iAc = this.hbU.iAc;
    parambqd.wSu = this.hbU.wSu;
    parambqd.wSt = this.hbU.wSt;
    parambqd.wSp = this.hbU.wSp;
    parambqd.score = this.hbU.score;
    parambqd.iAd = this.hbU.iAd;
    parambqd.wSv = this.hbU.wSv;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.k
 * JD-Core Version:    0.6.2
 */