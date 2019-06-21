package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cmz;
import com.tencent.mm.protocal.protobuf.cna;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class aa extends m
  implements k
{
  public b ehh;
  private f ehi;
  public long fPN;

  public aa(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, int paramInt2)
  {
    this(paramInt1, paramString1, paramString2, paramString3, paramString4, paramBoolean, paramInt2, true);
  }

  public aa(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    AppMethodBeat.i(60000);
    this.fPN = 0L;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cmz();
    ((b.a)localObject).fsK = new cna();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/newverifypasswd";
    ((b.a)localObject).fsI = 384;
    ((b.a)localObject).fsL = 182;
    ((b.a)localObject).fsM = 1000000182;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cmz)this.ehh.fsG.fsP;
    ((cmz)localObject).OpCode = paramInt1;
    ((cmz)localObject).wXN = paramInt2;
    ((cmz)localObject).xkw = bo.ane(paramString1);
    ((cmz)localObject).vLW = bo.and(paramString1);
    ((cmz)localObject).wtZ = new bts().alV(paramString2);
    ((cmz)localObject).xkx = new bts().alV(paramString3);
    ((cmz)localObject).vMa = new bts().alV(paramString4);
    if ((paramInt1 == 5) || (paramInt1 == 2))
    {
      this.fPN = new p(r.Yy()).longValue();
      if (paramBoolean1)
      {
        paramString1 = g.RN().QR().d(this.fPN, paramString3);
        ((cmz)localObject).vJT = new SKBuiltinBuffer_t().setBuffer(paramString1);
      }
    }
    else
    {
      paramString1 = bo.nullAsNil((String)g.RP().Ry().get(47, null));
      ((cmz)localObject).vMb = new SKBuiltinBuffer_t().setBuffer(bo.anf(paramString1));
      paramInt2 = ((cmz)localObject).OpCode;
      if (((cmz)localObject).vJT != null)
        break label387;
      paramInt1 = -1;
      label301: if (((cmz)localObject).vJT != null)
        break label399;
    }
    label387: label399: for (paramString1 = "null"; ; paramString1 = bo.anv(bo.ca(((cmz)localObject).vJT.getBufferToBytes())))
    {
      ab.i("MicroMsg.NetSceneVerifyPswd", "summerauth opCode[%d], hasSecCode[%b], isManualAuth[%b], len:%d, content:[%s]", new Object[] { Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramInt1), paramString1 });
      AppMethodBeat.o(60000);
      return;
      paramString1 = g.RN().QR().a(this.fPN, bo.ane(paramString1), paramBoolean2);
      break;
      paramInt1 = ((cmz)localObject).vJT.getILen();
      break label301;
    }
  }

  public aa(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this(1, paramString1, paramString2, paramString3, paramString4, false, 0);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(60001);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(60001);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(60003);
    paramArrayOfByte = (cmz)this.ehh.fsG.fsP;
    paramq = (cna)this.ehh.fsH.fsP;
    if ((paramq.vHJ != null) && (paramq.vHJ.getILen() > 0))
      ab.i("MicroMsg.NetSceneVerifyPswd", "summerauth parseRet[%b], len[%d]", new Object[] { Boolean.valueOf(g.RN().QR().a(this.fPN, com.tencent.mm.platformtools.aa.a(paramq.vHJ))), Integer.valueOf(paramq.vHJ.getILen()) });
    int i;
    label263: int j;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      g.RP().Ry().set(77830, paramq.wdB);
      g.RP().Ry().set(32, paramArrayOfByte.xkw);
      g.RP().Ry().set(33, paramArrayOfByte.vLW);
      g.RP().Ry().set(46, bo.cd(com.tencent.mm.platformtools.aa.a(paramq.vHP)));
      paramArrayOfByte = bo.cd(com.tencent.mm.platformtools.aa.a(paramArrayOfByte.vMb));
      g.RP().Ry().set(47, paramArrayOfByte);
      g.RP().eJH.set(18, paramArrayOfByte);
      g.RP().Ry().set(-1535680990, paramq.vHO);
      if (paramq.vHP == null)
      {
        paramInt1 = 0;
        if (paramq.vHO != null)
          break label341;
        i = 0;
        if (paramq.wdB != null)
          break label354;
        j = 0;
        label274: ab.i("MicroMsg.NetSceneVerifyPswd", "A2Key.len %d, authKey.len: %d, ticketLen:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i), Integer.valueOf(j) });
      }
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(60003);
      return;
      paramInt1 = paramq.vHP.getILen();
      break;
      label341: i = paramq.vHO.length();
      break label263;
      label354: j = paramq.wdB.length();
      break label274;
      if (paramInt2 == 4)
      {
        g.RP().Ry().set(32, "");
        g.RP().Ry().set(33, "");
      }
    }
  }

  public final String agg()
  {
    AppMethodBeat.i(60002);
    try
    {
      String str = ((cna)this.ehh.fsH.fsP).wdB;
      AppMethodBeat.o(60002);
      return str;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetSceneVerifyPswd", localException, "", new Object[0]);
        Object localObject = null;
        AppMethodBeat.o(60002);
      }
    }
  }

  public final int getType()
  {
    return 384;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.aa
 * JD-Core Version:    0.6.2
 */