package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bdv;
import com.tencent.mm.protocal.protobuf.bqy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class o extends p
  implements k, e
{
  private final q ftU;
  private boolean lSP;
  private String lSU;

  public o(long paramLong, String paramString1, String paramString2)
  {
    AppMethodBeat.i(88);
    this.lSP = false;
    this.lSU = "";
    this.ftU = new f();
    j.a locala = (j.a)this.ftU.acF();
    locala.lSB.wmM = p.lSV;
    locala.lSB.wmO = paramLong;
    locala.lSB.wTm = paramString1;
    locala.lSB.wTn = paramString2;
    AppMethodBeat.o(88);
  }

  final void Lo(String paramString)
  {
    AppMethodBeat.i(91);
    ((j.a)this.ftU.acF()).lSB.wmM = paramString;
    AppMethodBeat.o(91);
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

  public final boolean bsg()
  {
    return true;
  }

  public final String bsh()
  {
    return this.lSU;
  }

  public final void c(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    boolean bool1 = true;
    AppMethodBeat.i(90);
    ab.d("MicroMsg.NetSceneFaceRegFaceRsa", "hy: onGYNetEnd  errType:" + paramInt1 + " errCode:" + paramInt2);
    paramq = (j.b)paramq.ZS();
    boolean bool2;
    int i;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (paramq.lSC.wTp == 0)
      {
        bool2 = true;
        this.lSP = bool2;
        this.lSU = paramq.lSC.wTo;
        i = paramq.lSC.wTp;
        boolean bool3 = this.lSP;
        paramInt2 = paramq.lSC.wTp;
        if (bo.isNullOrNil(this.lSU))
          break label189;
        bool2 = bool1;
        label129: ab.i("MicroMsg.NetSceneFaceRegFaceRsa", "hy: is verify ok: %b, youtuRet; %d, has random pwd: %b", new Object[] { Boolean.valueOf(bool3), Integer.valueOf(paramInt2), Boolean.valueOf(bool2) });
      }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt1, i, paramString, this);
      AppMethodBeat.o(90);
      return;
      bool2 = false;
      break;
      label189: bool2 = false;
      break label129;
      i = paramInt2;
      if (paramq != null)
      {
        i = paramInt2;
        if (paramq.lSC != null)
        {
          i = paramInt2;
          if (paramq.lSC.wTp != 0)
          {
            ab.i("MicroMsg.NetSceneFaceRegFaceRsa", "hy: has detail ret. use");
            i = paramq.lSC.wTp;
          }
        }
      }
    }
  }

  final int g(com.tencent.mm.network.e parame)
  {
    AppMethodBeat.i(89);
    this.ftU.acF();
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(89);
    return i;
  }

  protected final bdv g(q paramq)
  {
    AppMethodBeat.i(92);
    paramq = ((j.b)paramq.ZS()).lSC.wmQ;
    AppMethodBeat.o(92);
    return paramq;
  }

  public final int getType()
  {
    return 930;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.o
 * JD-Core Version:    0.6.2
 */