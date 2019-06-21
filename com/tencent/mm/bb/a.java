package com.tencent.mm.bb;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.ana;
import com.tencent.mm.protocal.protobuf.anb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

public final class a extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public String fMC;
  public String fMD;
  public byte[] fME;

  public a()
  {
    this(r.Yz(), bo.h((Integer)g.RP().Ry().get(66561, null)), 0);
    AppMethodBeat.i(78520);
    AppMethodBeat.o(78520);
  }

  public a(String paramString, int paramInt)
  {
    this(paramString, paramInt, 0);
  }

  public a(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(78521);
    this.ehi = null;
    this.fMC = null;
    this.fMD = null;
    this.fME = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ana();
    ((b.a)localObject).fsK = new anb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getqrcode";
    ((b.a)localObject).fsI = 168;
    ((b.a)localObject).fsL = 67;
    ((b.a)localObject).fsM = 1000000067;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ana)this.ehh.fsG.fsP;
    ((ana)localObject).wcB = aa.vy(paramString);
    ((ana)localObject).wrF = paramInt1;
    ((ana)localObject).OpCode = paramInt2;
    ab.i("MicroMsg.NetSceneGetQRCode", "username:%s, style:%d, opcode:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(78521);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(78522);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78522);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78523);
    ab.d("MicroMsg.NetSceneGetQRCode", "onGYNetEnd errType:" + paramInt2 + " errCode" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = (ana)this.ehh.fsG.fsP;
      paramq = (anb)this.ehh.fsH.fsP;
      paramArrayOfByte = aa.a(paramArrayOfByte.wcB);
      this.fME = aa.a(paramq.wrG, new byte[0]);
      this.fMC = paramq.wrH;
      ab.i("MicroMsg.NetSceneGetQRCode", "expiredWording:%s, revokeId:%s, revokeWording:%s", new Object[] { this.fMC, paramq.wrI, paramq.wrJ });
      if (r.Yz().equals(paramArrayOfByte))
      {
        paramArrayOfByte = paramq.wrI;
        String str = (String)g.RP().Ry().get(66563, "");
        if ((paramArrayOfByte != null) && (!str.equals(paramArrayOfByte)))
        {
          g.RP().Ry().set(66563, paramArrayOfByte);
          this.fMD = paramq.wrJ;
        }
        g.RP().Ry().set(66561, Integer.valueOf(paramq.wrF));
      }
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78523);
  }

  public final int getType()
  {
    return 168;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bb.a
 * JD-Core Version:    0.6.2
 */