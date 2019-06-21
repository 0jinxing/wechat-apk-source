package com.tencent.mm.plugin.brandservice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.asb;
import com.tencent.mm.protocal.protobuf.asc;
import com.tencent.mm.protocal.protobuf.bqh;
import com.tencent.mm.protocal.protobuf.bqi;
import com.tencent.mm.protocal.protobuf.bvn;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class f extends m
  implements k
{
  private static long jKz = 0L;
  private b ehh;
  private com.tencent.mm.ai.f ehi;

  public static boolean aVV()
  {
    AppMethodBeat.i(13839);
    boolean bool;
    if (System.currentTimeMillis() - jKz > 3600000L)
    {
      bool = true;
      AppMethodBeat.o(13839);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(13839);
    }
  }

  public static LinkedList<bqh> aVW()
  {
    AppMethodBeat.i(13842);
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = com.tencent.mm.vfs.e.e(g.RP().eJM + "search_biz_recommend", 0, 2147483647);
      if (localObject != null)
      {
        bqi localbqi = new com/tencent/mm/protocal/protobuf/bqi;
        localbqi.<init>();
        localbqi.parseFrom((byte[])localObject);
        ab.d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", "GroupCount2: %d", new Object[] { Integer.valueOf(localbqi.wHG) });
        localObject = localbqi.wSD;
        AppMethodBeat.o(13842);
        return localObject;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", localException.getMessage());
        ab.printErrStackTrace("MicroMsg.BrandService.NetSceneGroupRecommendBiz", localException, "", new Object[0]);
        LinkedList localLinkedList = new LinkedList();
        AppMethodBeat.o(13842);
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(13840);
    jKz = System.currentTimeMillis();
    this.ehi = paramf;
    paramf = new b.a();
    paramf.fsJ = new asb();
    paramf.fsK = new asc();
    paramf.uri = "/cgi-bin/micromsg-bin/grouprecommendbiz";
    paramf.fsI = 456;
    paramf.fsL = 0;
    paramf.fsM = 0;
    this.ehh = paramf.acD();
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(13840);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(13841);
    ab.d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = (asc)this.ehh.fsH.fsP;
      if (paramArrayOfByte.wvP.wHG <= 0)
        break label335;
      ab.d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", "GroupCount, %d", new Object[] { Integer.valueOf(paramArrayOfByte.wvP.wHG) });
      try
      {
        paramq = paramArrayOfByte.wvP.toByteArray();
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        com.tencent.mm.vfs.e.b(g.RP().eJM + "search_biz_recommend", paramq, paramq.length);
        paramq = paramArrayOfByte.wvP.wSD.iterator();
        while (paramq.hasNext())
        {
          localObject = ((bqh)paramq.next()).wSC.iterator();
          while (((Iterator)localObject).hasNext())
          {
            bvn localbvn = (bvn)((Iterator)localObject).next();
            paramArrayOfByte = new com/tencent/mm/ah/h;
            paramArrayOfByte.<init>();
            paramArrayOfByte.username = aa.a(localbvn.wcB);
            paramArrayOfByte.frW = localbvn.vXm;
            paramArrayOfByte.frV = localbvn.vXn;
            paramArrayOfByte.bJt = -1;
            paramArrayOfByte.dtR = 3;
            paramArrayOfByte.cB(true);
            o.act().b(paramArrayOfByte);
          }
        }
      }
      catch (IOException paramq)
      {
        ab.d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", paramq.getMessage());
        ab.printErrStackTrace("MicroMsg.BrandService.NetSceneGroupRecommendBiz", paramq, "", new Object[0]);
      }
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(13841);
      return;
      label335: com.tencent.mm.vfs.e.deleteFile(g.RP().eJM + "search_biz_recommend");
    }
  }

  public final int getType()
  {
    return 456;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.b.f
 * JD-Core Version:    0.6.2
 */