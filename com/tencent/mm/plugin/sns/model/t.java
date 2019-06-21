package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.rw;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.bp;
import com.tencent.mm.protocal.protobuf.cai;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbw;
import com.tencent.mm.protocal.protobuf.ccg;
import com.tencent.mm.protocal.protobuf.cch;
import com.tencent.mm.protocal.protobuf.cy;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.protocal.protobuf.vd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class t extends com.tencent.mm.ai.m
  implements k
{
  public int afg;
  final int cvp;
  private com.tencent.mm.ai.b ehh;
  public com.tencent.mm.ai.f ehi;
  private long qIY;
  private String qJA;
  public int qJa;
  public int qJb;
  private long qJz;

  public t()
  {
    AppMethodBeat.i(36295);
    this.qIY = 0L;
    this.qJz = 0L;
    this.qJA = "";
    this.qJa = 0;
    this.qJb = 0;
    this.afg = 0;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ccg();
    ((b.a)localObject).fsK = new cch();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnspreloadingtimeline";
    ((b.a)localObject).fsI = 718;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    int i;
    if (at.isWifi(ah.getContext()))
      i = 1;
    while (true)
    {
      this.cvp = 2;
      ccg localccg = (ccg)this.ehh.fsG.fsP;
      localccg.wZy = i;
      localccg.wZU = 0L;
      int j = af.cnv().cod();
      this.qIY = af.cnF().g(0L, j, true);
      localccg.xbw = this.qIY;
      int k = c.a(this.qIY, 0L, "@__weixintimtline");
      localccg.xbx = k;
      this.qJz = af.cnF().g(0L, 1, true);
      ab.i("MicroMsg.NetSceneSnsPreTimeLine", "newerid " + this.qJz);
      localccg.xby = this.qJz;
      com.tencent.mm.plugin.sns.storage.l locall = af.cnJ().YX("@__weixintimtline");
      if (locall == null)
      {
        localObject = "";
        label252: this.qJA = ((String)localObject);
        if (this.qJA == null)
          this.qJA = "";
        localccg.wZT = this.qJA;
        if ((locall != null) && (locall.field_adsession != null))
          break label449;
      }
      for (localccg.wZw = new SKBuiltinBuffer_t().setBuffer(new byte[0]); ; localccg.wZw = new SKBuiltinBuffer_t().setBuffer(locall.field_adsession))
      {
        ab.i("MicroMsg.NetSceneSnsPreTimeLine", " This req nextCount: " + j + " min:" + this.qIY + " ReqTime:" + localccg.xbx + " nettype: " + i);
        ab.d("MicroMsg.NetSceneSnsPreTimeLine", "minId: %s lastReqTime: %s", new Object[] { i.jV(this.qIY), Integer.valueOf(k) });
        AppMethodBeat.o(36295);
        return;
        if (at.is3G(ah.getContext()))
        {
          i = 3;
          break;
        }
        if (at.is4G(ah.getContext()))
        {
          i = 4;
          break;
        }
        if (!at.is2G(ah.getContext()))
          break label490;
        i = 2;
        break;
        localObject = locall.field_md5;
        break label252;
        label449: ab.d("MicroMsg.NetSceneSnsPreTimeLine", "request adsession %s", new Object[] { locall.field_adsession });
      }
      label490: i = 0;
    }
  }

  private void a(cch paramcch, String paramString)
  {
    AppMethodBeat.i(36296);
    aj.a("@__weixintimtline", this.cvp, paramcch.vKB, paramString);
    this.qIY = ((cbf)paramcch.vKB.getLast()).vQE;
    c.f("@__weixintimtline", ((cbf)paramcch.vKB.getFirst()).vQE, this.qIY, paramcch.xbC);
    paramcch = paramcch.vKB.iterator();
    while (paramcch.hasNext())
    {
      paramString = (cbf)paramcch.next();
      if (paramString.xax == 0)
      {
        Object localObject1 = af.cnF().kD(paramString.vQE);
        if ((localObject1 != null) && (((n)localObject1).cqu() != null))
        {
          LinkedList localLinkedList = ((n)localObject1).cqu().xfI.wbK;
          Object localObject2 = localLinkedList.iterator();
          if (((Iterator)localObject2).hasNext())
          {
            ??? = (bau)((Iterator)localObject2).next();
            if (localLinkedList.size() <= 1)
            {
              i = 1;
              label176: if (??? == null)
                break label320;
              localObject4 = i.e((bau)???);
              if (i == 0)
                break label322;
            }
            label320: label322: for (int i = 1; ; i = 0)
            {
              localObject5 = an.fZ(af.getAccSnsPath(), ((bau)???).Id);
              if ((!com.tencent.mm.vfs.e.ct((String)localObject5 + (String)localObject4)) && (!com.tencent.mm.vfs.e.ct((String)localObject5 + i.l((bau)???))) && (!com.tencent.mm.vfs.e.ct((String)localObject5 + i.m((bau)???))))
                break label328;
              ab.i("MicroMsg.NetSceneSnsPreTimeLine", "dealwithMedia exist:%s", new Object[] { ((bau)???).Id });
              break;
              i = 0;
              break label176;
              break;
            }
            label328: ab.i("MicroMsg.NetSceneSnsPreTimeLine", "dealwithMedia ready to download:%s", new Object[] { ((bau)???).Id });
            Object localObject4 = new com.tencent.mm.plugin.sns.data.e((bau)???);
            ((com.tencent.mm.plugin.sns.data.e)localObject4).qFQ = i;
            ((com.tencent.mm.plugin.sns.data.e)localObject4).nQB = ((bau)???).Id;
            Object localObject5 = af.cnA();
            if (((bau)???).jCt == 6);
            for (i = 5; ; i = 1)
            {
              ((b)localObject5).a((bau)???, i, (com.tencent.mm.plugin.sns.data.e)localObject4, az.xYM);
              break;
            }
          }
          if (((n)localObject1).field_type == 15)
          {
            localObject2 = af.cnD();
            if (localObject1 != null)
              ab.i("MicroMsg.SnsVideoService", "%d add preload video[%s]", new Object[] { Integer.valueOf(localObject2.hashCode()), ((n)localObject1).cqU() });
            synchronized (((ar)localObject2).qMZ)
            {
              ((ar)localObject2).qMZ.addFirst(localObject1);
              try
              {
                localObject1 = ((bau)((n)localObject1).cqu().xfI.wbK.get(0)).Url;
                h.pYm.e(14388, new Object[] { Long.valueOf(paramString.vQE), Integer.valueOf(4), localObject1, Integer.valueOf(0) });
              }
              catch (Exception paramString)
              {
              }
            }
          }
        }
      }
    }
    af.cnD().coj();
    AppMethodBeat.o(36296);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(36298);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(36298);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36297);
    ab.i("MicroMsg.NetSceneSnsPreTimeLine", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramArrayOfByte = (cch)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if ((paramq.ZS().vyl != 207) && (paramq.ZS().vyl != 0))
    {
      y.XP("@__weixintimtline");
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36297);
    }
    String str1;
    label510: Object localObject2;
    while (true)
    {
      return;
      if (paramArrayOfByte.wZZ != null)
      {
        ab.d("MicroMsg.NetSceneSnsPreTimeLine", "serverConfig  " + paramArrayOfByte.wZZ.xbs + " " + paramArrayOfByte.wZZ.xbr);
        paramInt1 = paramArrayOfByte.wZZ.xbs;
        com.tencent.mm.plugin.sns.c.a.qFE = paramInt1;
        if (paramInt1 <= 0)
          com.tencent.mm.plugin.sns.c.a.qFE = 2147483647;
        com.tencent.mm.storage.ab.xID = paramArrayOfByte.wZZ.xbr;
      }
      this.qJa = paramArrayOfByte.wZX;
      this.qJb = paramArrayOfByte.wZY;
      ab.i("MicroMsg.NetSceneSnsPreTimeLine", "for same md5 count: " + paramArrayOfByte.wZX + " , objCount:  " + paramArrayOfByte.wGG + " cflag : " + paramArrayOfByte.wZY);
      this.afg = paramArrayOfByte.wGG;
      str1 = i.jW(0L);
      long l;
      if (!paramArrayOfByte.vKB.isEmpty())
      {
        ab.i("MicroMsg.NetSceneSnsPreTimeLine", "respone size " + paramArrayOfByte.vKB.size() + " Max " + ((cbf)paramArrayOfByte.vKB.getFirst()).vQE + " " + i.jV(((cbf)paramArrayOfByte.vKB.getFirst()).vQE) + "  respone min  " + ((cbf)paramArrayOfByte.vKB.getLast()).vQE + " " + i.jV(((cbf)paramArrayOfByte.vKB.getLast()).vQE));
        if (paramArrayOfByte.xbH <= 0)
          break label703;
        ab.i("MicroMsg.NetSceneSnsPreTimeLine", "%d ads to delete", new Object[] { Integer.valueOf(paramArrayOfByte.xbH) });
        if ((paramArrayOfByte.xbI == null) || (paramArrayOfByte.xbI.size() != paramArrayOfByte.xbH))
          break label703;
        localObject1 = new LinkedList();
        paramInt1 = 0;
        if (paramInt1 >= paramArrayOfByte.xbH)
          break label671;
        l = ((vd)paramArrayOfByte.xbI.get(paramInt1)).vQE;
        ab.i("MicroMsg.NetSceneSnsPreTimeLine", "delete ad %s", new Object[] { Long.valueOf(l) });
        if (l != 0L)
        {
          localObject2 = af.cnI().ku(l);
          if (localObject2 != null)
            break label603;
          ab.i("MicroMsg.NetSceneSnsPreTimeLine", "adSnsInfo is null!");
        }
      }
      while (true)
      {
        paramInt1++;
        break label510;
        ab.i("MicroMsg.NetSceneSnsPreTimeLine", " respone is Empty");
        break;
        label603: localObject3 = new bp();
        ((bp)localObject3).vDS = 13298;
        ((bp)localObject3).vDT = new com.tencent.mm.bt.b(((com.tencent.mm.plugin.sns.storage.e)localObject2).cqq().qPj.getBytes());
        ((bp)localObject3).vDU = (System.currentTimeMillis() / 1000L);
        ((LinkedList)localObject1).add(localObject3);
        a.jX(l);
      }
      label671: if (((LinkedList)localObject1).size() > 0)
      {
        g.RQ();
        g.RO().eJo.a(new l((LinkedList)localObject1), 0);
      }
      label703: this.afg = paramArrayOfByte.wGG;
      if (!this.qJA.equals(paramArrayOfByte.wZT))
        break;
      this.qIY = af.cnF().g(0L, this.qJa, true);
      ab.i("MicroMsg.NetSceneSnsPreTimeLine", "md5 is no change!! the new minid %s", new Object[] { Long.valueOf(this.qIY) });
      y.XP("@__weixintimtline");
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36297);
    }
    af.cnJ().h("@__weixintimtline", paramArrayOfByte.wZT, aa.a(paramArrayOfByte.wZw));
    ab.i("MicroMsg.NetSceneSnsPreTimeLine", "fp resp list size " + paramArrayOfByte.vKB.size() + " adsize : " + paramArrayOfByte.xbD);
    for (paramInt1 = 0; paramInt1 < paramArrayOfByte.xbE.size(); paramInt1++)
    {
      localObject2 = (cy)paramArrayOfByte.xbE.get(paramInt1);
      localObject3 = aa.a(((cy)localObject2).vEY);
      String str2 = aa.a(((cy)localObject2).vEX.wZv);
      localObject1 = aa.b(((cy)localObject2).vEX.wZu.xam);
      ab.i("MicroMsg.NetSceneSnsPreTimeLine", "skXml ".concat(String.valueOf(localObject3)));
      ab.i("MicroMsg.NetSceneSnsPreTimeLine", "adXml ".concat(String.valueOf(str2)));
      ab.i("MicroMsg.NetSceneSnsPreTimeLine", "snsXml " + (String)localObject1 + "\r\n");
      localObject3 = ((cy)localObject2).vEX.wZu.vHl;
      if (!bo.isNullOrNil((String)localObject3))
      {
        ao.a.flu.ai((String)localObject3, "");
        com.tencent.mm.ah.o.acv().qa((String)localObject3);
      }
    }
    a.k(paramArrayOfByte.xbE, paramArrayOfByte.vKB);
    a.ao(paramArrayOfByte.xbE);
    if (paramArrayOfByte.xbD == 0)
    {
      ab.i("MicroMsg.NetSceneSnsPreTimeLine", "recv %d recommend", new Object[] { Integer.valueOf(paramArrayOfByte.xbF) });
      a.e(paramArrayOfByte.xbG, paramArrayOfByte.vKB);
      a.an(paramArrayOfByte.xbG);
    }
    Object localObject3 = new LinkedList();
    Object localObject1 = paramArrayOfByte.vKB.iterator();
    while (((Iterator)localObject1).hasNext())
      ((LinkedList)localObject3).add(Long.valueOf(((cbf)((Iterator)localObject1).next()).vQE));
    localObject1 = new rw();
    ((rw)localObject1).cNP.cNQ = ((LinkedList)localObject3);
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
    if (paramq.ZS().vyl == 207)
    {
      if (paramArrayOfByte.vKB.isEmpty())
        af.cnF().crj();
      while (true)
      {
        y.XP("@__weixintimtline");
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(36297);
        break;
        af.cnF().YZ(i.jW(((cbf)paramArrayOfByte.vKB.getFirst()).vQE));
        af.cnF().YY(i.jW(((cbf)paramArrayOfByte.vKB.getLast()).vQE));
        a(paramArrayOfByte, str1);
        a.ap(paramArrayOfByte.vKB);
      }
    }
    if (paramArrayOfByte.vKB.isEmpty())
      af.cnF().crj();
    while (true)
    {
      y.XP("@__weixintimtline");
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36297);
      break;
      a(paramArrayOfByte, str1);
      a.ap(paramArrayOfByte.vKB);
    }
  }

  public final int getType()
  {
    return 718;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.t
 * JD-Core Version:    0.6.2
 */