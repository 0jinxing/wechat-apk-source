package com.tencent.mm.plugin.wallet_core.c.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.Promotions;
import com.tencent.mm.protocal.protobuf.biw;
import com.tencent.mm.protocal.protobuf.bix;
import com.tencent.mm.protocal.protobuf.bja;
import com.tencent.mm.protocal.protobuf.bjh;
import com.tencent.mm.protocal.protobuf.bji;
import com.tencent.mm.protocal.protobuf.bjj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c extends u
{
  private b ehh;
  private f ehi;
  public int tuI;
  public Orders tux;

  public c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    AppMethodBeat.i(46566);
    this.tuI = 0;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bjh();
    ((b.a)localObject).fsK = new bji();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payibgjsgettransaction";
    ((b.a)localObject).fsI = 1565;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bjh)this.ehh.fsG.fsP;
    ((bjh)localObject).fKh = paramString1;
    ((bjh)localObject).vYP = paramString4;
    ((bjh)localObject).vYO = paramString2;
    ((bjh)localObject).vYQ = paramString5;
    ((bjh)localObject).vYR = paramString6;
    ((bjh)localObject).vLo = paramString3;
    ((bjh)localObject).vXP = paramString7;
    AppMethodBeat.o(46566);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(46568);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(46568);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(46567);
    ab.i("MicroMsg.NetSceneIbgGetTransaction", "hy: get h5 transaction: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    bji localbji = (bji)((b)paramq).fsH.fsP;
    int i = paramInt2;
    paramq = paramString;
    if (paramInt2 == 0)
    {
      i = paramInt2;
      paramq = paramString;
      if (paramInt1 == 0)
      {
        i = localbji.luT;
        paramq = localbji.luU;
      }
    }
    ab.i("MicroMsg.NetSceneIbgGetTransaction", "resp.IsUseNewPage: %s", new Object[] { Integer.valueOf(localbji.wMH) });
    this.tuI = localbji.wMH;
    this.tux = new Orders();
    this.tux.tuo = 1;
    if ((localbji == null) || (localbji.wME == null))
      ab.e("MicroMsg.NetSceneIbgGetTransaction", "hy: info not valid");
    while (true)
    {
      paramString = paramq;
      if (bo.isNullOrNil(paramq))
        paramString = ah.getContext().getString(2131304763);
      this.ehi.onSceneEnd(paramInt1, i, paramString, this);
      AppMethodBeat.o(46567);
      return;
      this.tux.pTN = localbji.wME.wMK;
      paramString = new Orders.Commodity();
      paramString.cAa = localbji.wME.pQe;
      paramString.desc = localbji.wME.fFZ;
      paramString.kCJ = (localbji.wME.wMK / 100.0D);
      paramString.pce = String.valueOf(localbji.wME.wMM);
      paramString.pcf = localbji.wME.wMN;
      paramString.pcj = localbji.wME.wMJ;
      paramString.pch = localbji.wME.wMI;
      paramString.pcl = localbji.wME.pcl;
      paramString.pca = localbji.wME.wML;
      paramString.tAR = (localbji.wME.wMO / 100.0D);
      Object localObject1;
      if (localbji.wMF != null)
      {
        paramString.pcm = localbji.wMF.vTT;
        localObject1 = new Orders.Promotions();
        ((Orders.Promotions)localObject1).name = localbji.wMF.wMp;
        ((Orders.Promotions)localObject1).pcm = localbji.wMF.vTT;
        paramString.tAS = localbji.wMF.vTT;
        ((Orders.Promotions)localObject1).pia = localbji.wMF.kbV;
        paramString.tAh = localbji.wMF.wMn;
        ((Orders.Promotions)localObject1).type = Orders.tAP;
        if (!bo.isNullOrNil(((Orders.Promotions)localObject1).name))
        {
          paramString.tBa.add(localObject1);
          paramString.tBb = true;
        }
      }
      Object localObject2;
      Object localObject3;
      for (this.tux.tAh = localbji.wMF.wMn; (localbji.wME.wMP != null) && (localbji.wME.wMP.size() > 0); this.tux.tAh = 0)
      {
        paramString.tAU = new ArrayList();
        localObject1 = localbji.wME.wMP.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (bja)((Iterator)localObject1).next();
          localObject3 = new Orders.DiscountInfo();
          ((Orders.DiscountInfo)localObject3).pOz = ((bja)localObject2).wMq;
          paramString.tAU.add(localObject3);
        }
        ab.i("MicroMsg.NetSceneIbgGetTransaction", "hy: no biz info");
      }
      if ((localbji.wMG != null) && (localbji.wMG.size() > 0))
      {
        paramString.tBa = new ArrayList();
        localObject2 = localbji.wMG.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (biw)((Iterator)localObject2).next();
          localObject1 = new Orders.Promotions();
          ((Orders.Promotions)localObject1).type = Orders.tAQ;
          ((Orders.Promotions)localObject1).url = ((biw)localObject3).url;
          ((Orders.Promotions)localObject1).name = ((biw)localObject3).cEh;
          ((Orders.Promotions)localObject1).pia = ((biw)localObject3).cIY;
          ((Orders.Promotions)localObject1).tzS = ((biw)localObject3).tID;
          ((Orders.Promotions)localObject1).tBn = bo.getInt(((biw)localObject3).type, 0);
          ((Orders.Promotions)localObject1).title = ((biw)localObject3).title;
          ((Orders.Promotions)localObject1).ttW = ((biw)localObject3).tBx;
          ((Orders.Promotions)localObject1).tBo = ((int)((biw)localObject3).tBy);
          ((Orders.Promotions)localObject1).tBq = ((biw)localObject3).tzT;
          ((Orders.Promotions)localObject1).tBp = ((int)((biw)localObject3).tBz);
          ((Orders.Promotions)localObject1).tzP = ((biw)localObject3).tBA;
          ((Orders.Promotions)localObject1).tzQ = ((biw)localObject3).tBB;
          ((Orders.Promotions)localObject1).tBr = ((biw)localObject3).wMk;
          ((Orders.Promotions)localObject1).tBs = ((biw)localObject3).wMl;
          ((Orders.Promotions)localObject1).tzR = ((biw)localObject3).tBC;
          ((Orders.Promotions)localObject1).tBt = ((biw)localObject3).wMm;
          paramString.tBa.add(localObject1);
        }
      }
      this.tux.tAq = new ArrayList();
      this.tux.tAq.add(paramString);
      this.tux.tAj = localbji.wME.wMN;
      ab.i("MicroMsg.NetSceneIbgGetTransaction", "formatOrders finish, mOrder.commoditys.size: %s, mOrder: %s", new Object[] { Integer.valueOf(this.tux.tAq.size()), this.tux });
    }
  }

  public final int getType()
  {
    return 1565;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.a.c
 * JD-Core Version:    0.6.2
 */