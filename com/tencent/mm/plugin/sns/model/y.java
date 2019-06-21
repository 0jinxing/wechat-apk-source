package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
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
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public final class y extends com.tencent.mm.ai.m
  implements k, d
{
  private static Vector<String> qIZ;
  public int afg;
  final int cvp;
  private com.tencent.mm.ai.b ehh;
  public com.tencent.mm.ai.f ehi;
  private boolean fNO;
  public boolean qIW;
  private long qIX;
  long qIY;
  private String qJA;
  private long qJR;
  private boolean qJS;
  private boolean qJT;
  public int qJa;
  public int qJb;
  private long qJz;

  static
  {
    AppMethodBeat.i(36344);
    qIZ = new Vector();
    AppMethodBeat.o(36344);
  }

  public y(long paramLong)
  {
    AppMethodBeat.i(36338);
    this.fNO = false;
    this.qJR = 0L;
    this.qIX = 0L;
    this.qIY = 0L;
    this.qJz = 0L;
    this.qJA = "";
    this.qJS = false;
    this.qJT = false;
    this.qJa = 0;
    this.qJb = 0;
    this.afg = 0;
    long l1 = System.currentTimeMillis();
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ccg();
    ((b.a)localObject).fsK = new cch();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/mmsnstimeline";
    ((b.a)localObject).fsI = 211;
    ((b.a)localObject).fsL = 98;
    ((b.a)localObject).fsM = 1000000098;
    this.ehh = ((b.a)localObject).acD();
    int i;
    if (at.isWifi(ah.getContext()))
      i = 1;
    while (true)
    {
      this.qIX = paramLong;
      boolean bool;
      label166: ccg localccg;
      int j;
      long l2;
      label228: int k;
      com.tencent.mm.plugin.sns.storage.l locall;
      if (paramLong == 0L)
      {
        bool = true;
        this.qIW = bool;
        this.cvp = 2;
        localccg = (ccg)this.ehh.fsG.fsP;
        localccg.wZy = i;
        localccg.wZU = paramLong;
        j = af.cnv().cod();
        localObject = af.cnF();
        if (!this.qIW)
          break label592;
        l2 = 0L;
        this.qIY = ((com.tencent.mm.plugin.sns.storage.o)localObject).g(l2, j, true);
        localccg.xbw = this.qIY;
        k = c.a(this.qIY, paramLong, "@__weixintimtline");
        localccg.xbx = k;
        if (this.qIW)
        {
          this.qJz = af.cnF().g(0L, 1, true);
          ab.i("MicroMsg.NetSceneSnsTimeLine", "newerid " + this.qJz);
          localccg.xby = this.qJz;
          locall = af.cnJ().YX("@__weixintimtline");
          if (locall != null)
            break label598;
          localObject = "";
          label342: this.qJA = ((String)localObject);
          if (this.qJA == null)
            this.qJA = "";
          localccg.wZT = this.qJA;
          if ((locall != null) && (locall.field_adsession != null))
            break label608;
        }
      }
      for (localccg.wZw = new SKBuiltinBuffer_t().setBuffer(new byte[0]); ; localccg.wZw = new SKBuiltinBuffer_t().setBuffer(locall.field_adsession))
      {
        this.qJR = paramLong;
        ab.i("MicroMsg.NetSceneSnsTimeLine", " This req nextCount: " + j + " max:" + paramLong + " min:" + this.qIY + " ReqTime:" + localccg.xbx + " nettype: " + i);
        ab.d("MicroMsg.NetSceneSnsTimeLine", "maxId: %s minId: %s lastReqTime: %s", new Object[] { i.jV(paramLong), i.jV(this.qIY), Integer.valueOf(k) });
        ab.d("MicroMsg.NetSceneSnsTimeLine", "NetSceneSnsTimeLine %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
        AppMethodBeat.o(36338);
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
          break label651;
        i = 2;
        break;
        bool = false;
        break label166;
        label592: l2 = paramLong;
        break label228;
        label598: localObject = locall.field_md5;
        break label342;
        label608: ab.d("MicroMsg.NetSceneSnsTimeLine", "request adsession %s", new Object[] { locall.field_adsession });
      }
      label651: i = 0;
    }
  }

  public static boolean XO(String paramString)
  {
    try
    {
      AppMethodBeat.i(36336);
      boolean bool;
      if (qIZ.contains(paramString))
      {
        bool = false;
        AppMethodBeat.o(36336);
      }
      while (true)
      {
        return bool;
        qIZ.add(paramString);
        bool = true;
        AppMethodBeat.o(36336);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public static boolean XP(String paramString)
  {
    try
    {
      AppMethodBeat.i(36337);
      qIZ.remove(paramString);
      AppMethodBeat.o(36337);
      return true;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }

  private void a(cch paramcch, String paramString)
  {
    AppMethodBeat.i(36340);
    aj.a("@__weixintimtline", this.cvp, paramcch.vKB, paramString);
    this.qIY = ((cbf)paramcch.vKB.getLast()).vQE;
    if (this.qIX == 0L)
      this.qIX = ((cbf)paramcch.vKB.getFirst()).vQE;
    while (true)
    {
      c.f("@__weixintimtline", this.qIX, this.qIY, paramcch.xbC);
      try
      {
        paramcch = paramcch.vKB.iterator();
        while (true)
          if (paramcch.hasNext())
          {
            paramString = (cbf)paramcch.next();
            if (paramString.xax == 0)
            {
              Object localObject = af.cnF().kD(paramString.vQE);
              if ((localObject != null) && (((n)localObject).cqu() != null))
              {
                int i = ((n)localObject).field_type;
                if (i == 15)
                {
                  try
                  {
                    localObject = ((bau)((n)localObject).cqu().xfI.wbK.get(0)).Url;
                    h.pYm.e(14388, new Object[] { Long.valueOf(paramString.vQE), Integer.valueOf(4), localObject, Integer.valueOf(0) });
                  }
                  catch (Exception paramString)
                  {
                  }
                  continue;
                  this.qIX = c.ka(this.qIX);
                  break;
                }
              }
            }
          }
        AppMethodBeat.o(36340);
        return;
      }
      catch (Exception paramcch)
      {
        while (true)
          AppMethodBeat.o(36340);
      }
    }
  }

  private static boolean c(cy paramcy)
  {
    boolean bool = false;
    AppMethodBeat.i(36342);
    if (!at.isWifi(ah.getContext()))
      AppMethodBeat.o(36342);
    while (true)
    {
      return bool;
      try
      {
        com.tencent.mm.modelsns.e.tC(aa.b(paramcy.vEX.wZu.xam));
        af.cnA();
        bool = true;
        AppMethodBeat.o(36342);
      }
      catch (Exception paramcy)
      {
        AppMethodBeat.o(36342);
      }
    }
  }

  private void cnc()
  {
    AppMethodBeat.i(36339);
    com.tencent.mm.plugin.sns.storage.o localo = af.cnF();
    Object localObject = com.tencent.mm.plugin.sns.storage.o.crn();
    localObject = localo.bSd.a((String)localObject, null, 2);
    for (int i = 0; ((Cursor)localObject).moveToNext(); i++);
    ((Cursor)localObject).close();
    if ((i < 3) && (i > 0))
    {
      this.qJT = true;
      AppMethodBeat.o(36339);
    }
    while (true)
    {
      return;
      if (i == 0)
        this.qJS = true;
      AppMethodBeat.o(36339);
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(36343);
    this.ehi = paramf;
    ccg localccg = (ccg)this.ehh.fsG.fsP;
    paramf = com.tencent.mm.plugin.sns.i.e.qTd.coH();
    if ((paramf != null) && (!paramf.isEmpty()))
    {
      localccg.xbA = paramf;
      localccg.xbz = localccg.xbA.size();
      ab.d("MicroMsg.NetSceneSnsTimeLine", "req sns timeline had exposure feed id %s", new Object[] { paramf });
    }
    while (true)
    {
      localccg.xbB = g.RP().Ry().getInt(ac.a.xWq, 0);
      g.RP().Ry().set(ac.a.xWq, Integer.valueOf(0));
      ab.i("MicroMsg.NetSceneSnsTimeLine", "req sns timeline read exposure size[%d] update scene[%d]", new Object[] { Integer.valueOf(localccg.xbz), Integer.valueOf(localccg.xbB) });
      int i = a(parame, this.ehh, this);
      AppMethodBeat.o(36343);
      return i;
      localccg.xbz = 0;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36341);
    ab.i("MicroMsg.NetSceneSnsTimeLine", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    cch localcch = (cch)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if ((paramq.ZS().vyl != 207) && (paramq.ZS().vyl != 0))
    {
      XP("@__weixintimtline");
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36341);
    }
    while (true)
    {
      return;
      if (localcch.wZZ != null)
      {
        ab.i("MicroMsg.NetSceneSnsTimeLine", "serverConfig  " + localcch.wZZ.xbs + " " + localcch.wZZ.xbr);
        paramInt1 = localcch.wZZ.xbs;
        com.tencent.mm.plugin.sns.c.a.qFE = paramInt1;
        if (paramInt1 <= 0)
          com.tencent.mm.plugin.sns.c.a.qFE = 2147483647;
        com.tencent.mm.storage.ab.xID = localcch.wZZ.xbr;
      }
      this.qJa = localcch.wZX;
      this.qJb = localcch.wZY;
      ab.i("MicroMsg.NetSceneSnsTimeLine", "for same md5 count: " + localcch.wZX + " , objCount:  " + localcch.wGG + " cflag : " + localcch.wZY);
      this.afg = localcch.wGG;
      paramArrayOfByte = i.jW(this.qIX);
      Object localObject1;
      label513: long l;
      Object localObject3;
      if (!localcch.vKB.isEmpty())
      {
        ab.i("MicroMsg.NetSceneSnsTimeLine", "respone size " + localcch.vKB.size() + " Max " + ((cbf)localcch.vKB.getFirst()).vQE + " " + i.jV(((cbf)localcch.vKB.getFirst()).vQE) + "  respone min  " + ((cbf)localcch.vKB.getLast()).vQE + " " + i.jV(((cbf)localcch.vKB.getLast()).vQE));
        if (localcch.xbH <= 0)
          break label706;
        ab.i("MicroMsg.NetSceneSnsTimeLine", "%d ads to delete", new Object[] { Integer.valueOf(localcch.xbH) });
        if ((localcch.xbI == null) || (localcch.xbI.size() != localcch.xbH))
          break label706;
        localObject1 = new LinkedList();
        paramInt1 = 0;
        if (paramInt1 >= localcch.xbH)
          break label674;
        l = ((vd)localcch.xbI.get(paramInt1)).vQE;
        ab.i("MicroMsg.NetSceneSnsTimeLine", "delete ad %s", new Object[] { Long.valueOf(l) });
        if (l != 0L)
        {
          localObject3 = af.cnI().ku(l);
          if (localObject3 != null)
            break label606;
          ab.i("MicroMsg.NetSceneSnsTimeLine", "adSnsInfo is null!");
        }
      }
      label606: Object localObject4;
      while (true)
      {
        paramInt1++;
        break label513;
        ab.i("MicroMsg.NetSceneSnsTimeLine", " respone is Empty");
        break;
        localObject4 = new bp();
        ((bp)localObject4).vDS = 13298;
        ((bp)localObject4).vDT = new com.tencent.mm.bt.b(((com.tencent.mm.plugin.sns.storage.e)localObject3).cqq().qPj.getBytes());
        ((bp)localObject4).vDU = (System.currentTimeMillis() / 1000L);
        ((LinkedList)localObject1).add(localObject4);
        a.jX(l);
      }
      label674: if (((LinkedList)localObject1).size() > 0)
      {
        g.RQ();
        g.RO().eJo.a(new l((LinkedList)localObject1), 0);
      }
      label706: if (this.qJA.equals(localcch.wZT))
      {
        paramq = af.cnF();
        if (this.qIW);
        for (l = 0L; ; l = this.qJR)
        {
          this.qIY = paramq.g(l, this.qJa, true);
          ab.i("MicroMsg.NetSceneSnsTimeLine", "md5 is no change!! the new minid %s", new Object[] { Long.valueOf(this.qIY) });
          cnc();
          XP("@__weixintimtline");
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(36341);
          break;
        }
      }
      af.cnJ().h("@__weixintimtline", localcch.wZT, aa.a(localcch.wZw));
      ab.i("MicroMsg.NetSceneSnsTimeLine", "resp list size " + localcch.vKB.size() + " adsize : " + localcch.xbD);
      paramInt1 = 0;
      String str;
      while (true)
        if (paramInt1 < localcch.xbE.size())
        {
          localObject3 = (cy)localcch.xbE.get(paramInt1);
          if (this.fNO)
            localObject4 = af.getAccPath() + "ad.proto";
          try
          {
            localObject1 = ((cy)localObject3).toByteArray();
            com.tencent.mm.vfs.e.b((String)localObject4, (byte[])localObject1, localObject1.length);
            localObject1 = aa.a(((cy)localObject3).vEY);
            str = aa.a(((cy)localObject3).vEX.wZv);
            localObject4 = aa.b(((cy)localObject3).vEX.wZu.xam);
            ab.i("MicroMsg.NetSceneSnsTimeLine", "skXml ".concat(String.valueOf(localObject1)));
            ab.i("MicroMsg.NetSceneSnsTimeLine", "adXml ".concat(String.valueOf(str)));
            ab.i("MicroMsg.NetSceneSnsTimeLine", "snsXml " + (String)localObject4 + "\r\n");
            localObject3 = ((cy)localObject3).vEX.wZu.vHl;
            if (!bo.isNullOrNil((String)localObject3))
            {
              ao.a.flu.ai((String)localObject3, "");
              com.tencent.mm.ah.o.acv().qa((String)localObject3);
            }
            paramInt1++;
          }
          catch (Exception localException1)
          {
            while (true)
              ab.e("MicroMsg.NetSceneSnsTimeLine", "save error " + localException1.getMessage());
          }
        }
      if ((this.fNO) && (localcch.xbE.size() == 0));
      try
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject2 = com.tencent.mm.vfs.e.e(af.getAccPath() + "ad.proto", 0, -1);
        localObject3 = new com/tencent/mm/protocal/protobuf/cy;
        ((cy)localObject3).<init>();
        ((cy)localObject3).parseFrom((byte[])localObject2);
        localcch.xbE.add(localObject3);
        localcch.xbD = localcch.xbE.size();
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("read from path ");
        ab.d("MicroMsg.NetSceneSnsTimeLine", localcch.xbD);
        if (localcch.xbE.size() > 0)
        {
          localObject2 = (cy)localcch.xbE.get(0);
          str = aa.a(((cy)localObject2).vEY);
          localObject4 = aa.a(((cy)localObject2).vEX.wZv);
          localObject3 = aa.b(((cy)localObject2).vEX.wZu.xam);
          ab.i("MicroMsg.NetSceneSnsTimeLine", "skXml ".concat(String.valueOf(str)));
          ab.i("MicroMsg.NetSceneSnsTimeLine", "adXml ".concat(String.valueOf(localObject4)));
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("snsXml ");
          ab.i("MicroMsg.NetSceneSnsTimeLine", (String)localObject3 + "\r\n");
          c((cy)localObject2);
        }
        a.k(localcch.xbE, localcch.vKB);
        a.ao(localcch.xbE);
        if (localcch.xbD == 0)
        {
          ab.i("MicroMsg.NetSceneSnsTimeLine", "recv %d recommend", new Object[] { Integer.valueOf(localcch.xbF) });
          a.e(localcch.xbG, localcch.vKB);
          a.an(localcch.xbG);
        }
        if (!this.qIW)
        {
          ab.d("MicroMsg.NetSceneSnsTimeLine", "np resp list size " + localcch.vKB.size());
          if (localcch.vKB.isEmpty())
          {
            af.cnF().YY(paramArrayOfByte);
            this.qJS = true;
            this.qIY = this.qIX;
            XP("@__weixintimtline");
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
            AppMethodBeat.o(36341);
          }
        }
      }
      catch (Exception localException2)
      {
        while (true)
        {
          ab.e("MicroMsg.NetSceneSnsTimeLine", "read error " + localException2.getMessage());
          continue;
          a(localcch, paramArrayOfByte);
        }
        LinkedList localLinkedList = new LinkedList();
        Object localObject2 = localcch.vKB.iterator();
        while (((Iterator)localObject2).hasNext())
          localLinkedList.add(Long.valueOf(((cbf)((Iterator)localObject2).next()).vQE));
        localObject2 = new rw();
        ((rw)localObject2).cNP.cNQ = localLinkedList;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        if (paramq.ZS().vyl == 207)
        {
          if (localcch.vKB.isEmpty())
          {
            af.cnF().crj();
            this.qIY = this.qIX;
          }
          while (true)
          {
            this.qJS = true;
            XP("@__weixintimtline");
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
            AppMethodBeat.o(36341);
            break;
            af.cnF().YZ(i.jW(((cbf)localcch.vKB.getFirst()).vQE));
            af.cnF().YY(i.jW(((cbf)localcch.vKB.getLast()).vQE));
            a(localcch, paramArrayOfByte);
            a.ap(localcch.vKB);
          }
        }
        if (!localcch.vKB.isEmpty())
          break label1890;
      }
    }
    af.cnF().crj();
    this.qIY = this.qIX;
    this.qJS = true;
    while (true)
    {
      XP("@__weixintimtline");
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(36341);
      break;
      label1890: a(localcch, paramArrayOfByte);
      a.ap(localcch.vKB);
    }
  }

  public final boolean cmM()
  {
    return this.qIW;
  }

  public final boolean cmN()
  {
    return this.qJS;
  }

  public final boolean cmO()
  {
    return this.qJT;
  }

  public final boolean cmP()
  {
    return false;
  }

  public final long cmQ()
  {
    return this.qIY;
  }

  public final boolean cmR()
  {
    return false;
  }

  public final long cmS()
  {
    return 0L;
  }

  public final String cmT()
  {
    return "";
  }

  public final int getType()
  {
    return 211;
  }

  public final String getUserName()
  {
    return "@__weixintimtline";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.y
 * JD-Core Version:    0.6.2
 */