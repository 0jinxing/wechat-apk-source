package com.tencent.mm.plugin.account.bind.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bx;
import com.tencent.mm.model.r;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.jq;
import com.tencent.mm.protocal.protobuf.jr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.Set;

public final class b extends m
  implements com.tencent.mm.network.k
{
  private String cCU;
  private String cCW;
  public final com.tencent.mm.ai.b ehh;
  private f ehi;
  public long fPN;

  public b(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(13320);
    this.fPN = 0L;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new jq();
    ((b.a)localObject).fsK = new jr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bindqq";
    ((b.a)localObject).fsI = 144;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    this.fPN = paramLong;
    localObject = (jq)this.ehh.fsG.fsP;
    ((jq)localObject).vLV = new p(paramLong).intValue();
    ((jq)localObject).vLJ = "";
    ((jq)localObject).vLW = "";
    ((jq)localObject).vLX = "";
    ((jq)localObject).vLY = "";
    ((jq)localObject).vMa = new bts().alV("");
    ((jq)localObject).vLZ = 1;
    if (paramBoolean == true);
    for (paramString1 = g.RN().QR().d(paramLong, paramString3); ; paramString1 = g.RN().QR().a(paramLong, bo.ane(paramString1), true))
    {
      ((jq)localObject).vJT = new SKBuiltinBuffer_t().setBuffer(paramString1);
      String str = bo.nullAsNil((String)g.RP().Ry().get(47, null));
      ((jq)localObject).vMb = new SKBuiltinBuffer_t().setBuffer(bo.anf(str));
      ab.i("MicroMsg.NetSceneBindQQ", "init opcode:%d qq:%d  wtbuf:%d img[%s,%s,%s] ksid:%s", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong), Integer.valueOf(bo.cc(paramString1)), paramString3, paramString2, paramString4, str });
      AppMethodBeat.o(13320);
      return;
    }
  }

  public b(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean)
  {
    this(paramLong, paramString1, paramString2, paramString3, paramString4, 1, paramBoolean);
    AppMethodBeat.i(13321);
    this.cCU = paramString5;
    this.cCW = paramString6;
    paramString1 = (jq)this.ehh.fsG.fsP;
    paramString1.vLx = paramString5;
    paramString1.vLy = paramString6;
    AppMethodBeat.o(13321);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(13322);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(13322);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(13323);
    paramArrayOfByte = (jq)this.ehh.fsG.fsP;
    paramq = (jr)this.ehh.fsH.fsP;
    Object localObject1 = aa.a(paramq.vHJ);
    if (!bo.cb((byte[])localObject1));
    for (boolean bool1 = g.RN().QR().a(new p(paramArrayOfByte.vLV).longValue(), (byte[])localObject1); ; bool1 = false)
    {
      ab.i("MicroMsg.NetSceneBindQQ", "onGYNetEnd[%d,%d] wtret:%b wtRespBuf:%d imgsid:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Boolean.valueOf(bool1), Integer.valueOf(bo.cc((byte[])localObject1)), paramq.vLX });
      boolean bool2;
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        paramInt1 = g.RP().Ry().getInt(9, 0);
        g.RP().Ry().set(9, Integer.valueOf(paramArrayOfByte.vLV));
        if (paramInt1 != 0)
        {
          if (g.RP().Ry().get(ac.a.xVa, "").equals(String.valueOf(paramInt1)))
            g.RP().Ry().set(ac.a.xVa, r.Yz());
          localObject2 = bx.fnB.aat().iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject1 = (String)((Iterator)localObject2).next();
            if (String.valueOf(paramInt1).equals(bx.fnB.getString((String)localObject1, "login_user_name")))
              bx.fnB.n((String)localObject1, "login_user_name", (String)localObject1);
          }
        }
        if (paramArrayOfByte.vLZ == 1)
          g.RP().Ry().set(17, Integer.valueOf(paramq.vCo));
        Object localObject2 = ((j)g.K(j.class)).XU();
        localObject1 = paramq.vMe;
        if (paramq.vMd == 1)
        {
          bool2 = true;
          ((com.tencent.mm.plugin.messenger.foundation.a.a.k)localObject2).aT((String)localObject1, bool2);
          paramInt1 = paramArrayOfByte.vLV;
          if (paramInt1 != 0)
            ((j)g.K(j.class)).XU().cE(new p(paramInt1) + "@qqim", 3);
          com.tencent.mm.ah.b.d(paramInt1, 3);
          g.RP().Ry().set(32, paramArrayOfByte.vLJ);
          g.RP().Ry().set(33, paramArrayOfByte.vLW);
          localObject1 = bo.cd(g.RN().QR().ft(new p(paramArrayOfByte.vLV).longValue()));
          ab.i("MicroMsg.NetSceneBindQQ", "onGYNetEnd wtret:%b newa2key:%s ", new Object[] { Boolean.valueOf(bool1), bo.anv((String)localObject1) });
          g.RP().Ry().set(72, localObject1);
          g.RP().Ry().set(46, bo.cd(aa.a(paramq.vHP)));
          localObject1 = bo.cd(aa.a(paramArrayOfByte.vMb));
          g.RP().Ry().set(47, localObject1);
          g.RP().eJH.set(18, localObject1);
          g.RP().Ry().set(-1535680990, paramq.vMf);
        }
      }
      while (true)
      {
        paramInt1 = paramInt3;
        if (paramArrayOfByte.vLZ == 3)
        {
          paramInt1 = paramInt3;
          if (paramInt3 == -3)
          {
            paramInt1 = 10000;
            ab.d("MicroMsg.NetSceneBindQQ", "onGYNetEnd : retCode = 10000");
          }
        }
        this.ehi.onSceneEnd(paramInt2, paramInt1, paramString, this);
        AppMethodBeat.o(13323);
        return;
        bool2 = false;
        break;
        if (paramInt2 == 4)
        {
          g.RP().Ry().set(32, "");
          g.RP().Ry().set(33, "");
        }
      }
    }
  }

  public final int getType()
  {
    return 144;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.a.b
 * JD-Core Version:    0.6.2
 */