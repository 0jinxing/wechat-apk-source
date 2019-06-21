package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.afj;
import com.tencent.mm.protocal.protobuf.afk;
import com.tencent.mm.sdk.platformtools.ab;

public final class u extends m
  implements k, b
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private long lTa;
  private byte[] lTb;

  public u(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109);
    this.lTa = -1L;
    this.lTb = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new afj();
    ((b.a)localObject).fsK = new afk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getbioconfig";
    ((b.a)localObject).fsI = 732;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (afj)this.ehh.fsG.fsP;
    ((afj)localObject).jCt = 1;
    ((afj)localObject).Scene = paramInt1;
    ((afj)localObject).wmN = paramInt2;
    ab.i("MicroMsg.NetSceneGetBioConfig", "carson logic ");
    ab.i("MicroMsg.NetSceneGetBioConfig", "mChechLiveFlag is ".concat(String.valueOf(paramInt2)));
    AppMethodBeat.o(109);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(110);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(110);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(111);
    paramq = (afk)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    long l;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.lTa = paramq.wmO;
      this.lTb = paramq.wmP.wR;
      ab.i("MicroMsg.NetSceneGetBioConfig", "carson logic ");
      ab.i("MicroMsg.NetSceneGetBioConfig", "Config is " + this.lTb);
      l = this.lTa;
      if (this.lTb != null)
        break label149;
    }
    label149: for (paramInt1 = 0; ; paramInt1 = this.lTb.length)
    {
      ab.i("MicroMsg.NetSceneGetBioConfig", "hy: get bio config: bioId: %s, bioConfigSize: %d", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1) });
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(111);
      return;
    }
  }

  public final long bse()
  {
    return this.lTa;
  }

  public final byte[] bsf()
  {
    return this.lTb;
  }

  public final int getType()
  {
    return 732;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.u
 * JD-Core Version:    0.6.2
 */