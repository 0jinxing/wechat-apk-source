package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.al.a;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.afk;
import com.tencent.mm.protocal.protobuf.bdv;
import com.tencent.mm.protocal.protobuf.jv;
import com.tencent.mm.sdk.platformtools.ab;

public final class v extends p
  implements k, b
{
  private final q ftU;
  private long lTa;
  private byte[] lTb;

  public v(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112);
    this.lTa = -1L;
    this.lTb = null;
    this.ftU = new h();
    i.a locala = (i.a)this.ftU.acF();
    locala.lSz.wmM = p.lSV;
    locala.lSz.jCt = 1;
    locala.lSz.Scene = paramInt1;
    locala.lSz.wmN = paramInt2;
    AppMethodBeat.o(112);
  }

  final void Lo(String paramString)
  {
    AppMethodBeat.i(115);
    ((i.a)this.ftU.acF()).lSz.wmM = paramString;
    AppMethodBeat.o(115);
  }

  public final void a(m.a parama)
  {
  }

  public final int acn()
  {
    return 3;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final long bse()
  {
    return this.lTa;
  }

  public final byte[] bsf()
  {
    return this.lTb;
  }

  public final void c(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(114);
    ab.d("MicroMsg.NetSceneGetBioConfigRsa", "hy: onGYNetEnd  errType:" + paramInt1 + " errCode:" + paramInt2);
    i.b localb;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      localb = (i.b)paramq.ZS();
      this.lTa = localb.lSA.wmO;
      if (localb.lSA.wmP != null)
        this.lTb = localb.lSA.wmP.wR;
      if (localb.lSA.wmR != null)
      {
        if ((localb.lSA.wmR.vMo == null) || (localb.lSA.wmR.vMo.getILen() <= 0))
          break label393;
        ab.i("MicroMsg.NetSceneGetBioConfigRsa", "summersafecdn onGYNetEnd cdnrule:%d", new Object[] { Integer.valueOf(localb.lSA.wmR.vMo.getILen()) });
      }
    }
    label393: for (paramq = aa.a(localb.lSA.wmR.vMo); ; paramq = null)
    {
      if ((localb.lSA.wmR.vMp != null) && (localb.lSA.wmR.vMp.getILen() > 0))
        ab.i("MicroMsg.NetSceneGetBioConfigRsa", "summersafecdn onGYNetEnd safecdnrule:%d", new Object[] { Integer.valueOf(localb.lSA.wmR.vMp.getILen()) });
      for (byte[] arrayOfByte = aa.a(localb.lSA.wmR.vMp); ; arrayOfByte = null)
      {
        com.tencent.mm.al.f.afy().a(localb.lSA.wmR.vMl, localb.lSA.wmR.vMm, localb.lSA.wmR.vMn, paramq, arrayOfByte, localb.lSA.wmR.vMq);
        long l = this.lTa;
        if (this.lTb == null);
        for (int i = 0; ; i = this.lTb.length)
        {
          ab.i("MicroMsg.NetSceneGetBioConfigRsa", "hy: get bio config: bioId: %s, bioConfigSize: %d", new Object[] { Long.valueOf(l), Integer.valueOf(i) });
          this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
          AppMethodBeat.o(114);
          return;
        }
      }
    }
  }

  final int g(e parame)
  {
    AppMethodBeat.i(113);
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(113);
    return i;
  }

  protected final bdv g(q paramq)
  {
    AppMethodBeat.i(116);
    paramq = ((i.b)paramq.ZS()).lSA.wmQ;
    AppMethodBeat.o(116);
    return paramq;
  }

  public final int getType()
  {
    return 733;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.v
 * JD-Core Version:    0.6.2
 */