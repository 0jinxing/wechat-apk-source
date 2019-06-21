package com.tencent.mm.plugin.location.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.akj;
import com.tencent.mm.protocal.protobuf.akk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class g extends m
  implements k
{
  public final com.tencent.mm.ai.b ehh;
  private f ehi;
  private byte[] nJF;
  String nJG;

  public g(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2)
  {
    AppMethodBeat.i(113312);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new akj();
    ((b.a)localObject).fsK = new akk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getlocimg";
    ((b.a)localObject).fsI = 648;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (akj)this.ehh.fsG.fsP;
    ((akj)localObject).luQ = paramString2;
    if (bo.gT(ah.getContext()));
    for (((akj)localObject).wqd = 1; ; ((akj)localObject).wqd = 0)
    {
      ((akj)localObject).vRq = paramFloat1;
      ((akj)localObject).vRp = paramFloat2;
      ((akj)localObject).wqe = paramInt1;
      ab.i("MicroMsg.NetSceneGetLocImg", "src w %d h %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      while (paramInt2 * paramInt3 > 270000)
      {
        paramInt2 = (int)(paramInt2 / 1.2D);
        paramInt3 = (int)(paramInt3 / 1.2D);
      }
    }
    ab.i("MicroMsg.NetSceneGetLocImg", "NetSceneGetLocImg %f %f %d w = %d h = %d lan=%s", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), ((akj)localObject).luQ });
    ((akj)localObject).Height = paramInt3;
    ((akj)localObject).Width = paramInt2;
    this.nJG = paramString1;
    AppMethodBeat.o(113312);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(113313);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(113313);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(113314);
    ab.d("MicroMsg.NetSceneGetLocImg", "onGYNetEnd errType %d errCode%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    paramq = (akk)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    try
    {
      this.nJF = paramq.vEF.getBuffer().wR;
      com.tencent.mm.vfs.e.b(this.nJG, this.nJF, this.nJF.length);
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(113314);
      return;
    }
    catch (Exception paramq)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.NetSceneGetLocImg", paramq, "", new Object[0]);
    }
  }

  public final int getType()
  {
    return 648;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.model.g
 * JD-Core Version:    0.6.2
 */