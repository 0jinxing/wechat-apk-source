package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bdv;
import com.tencent.mm.protocal.protobuf.cmt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class t extends p
  implements k, e
{
  private final q ftU;
  private boolean lSP;
  private String lSU;

  public t(long paramLong, String paramString1, String paramString2)
  {
    AppMethodBeat.i(104);
    this.lSP = false;
    this.lSU = "";
    this.ftU = new g();
    k.a locala = (k.a)this.ftU.acF();
    locala.lSD.wmM = p.lSV;
    locala.lSD.wmO = paramLong;
    locala.lSD.wTn = paramString2;
    locala.lSD.wTm = paramString1;
    AppMethodBeat.o(104);
  }

  final void Lo(String paramString)
  {
    AppMethodBeat.i(107);
    ((k.a)this.ftU.acF()).lSD.wmM = paramString;
    AppMethodBeat.o(107);
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
    AppMethodBeat.i(106);
    ab.d("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: onGYNetEnd  errType:" + paramInt1 + " errCode:" + paramInt2);
    paramq = (k.b)paramq.ZS();
    boolean bool2;
    label119: int i;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (paramq.lSE.wTp == 0)
      {
        bool2 = true;
        this.lSP = bool2;
        this.lSU = paramq.lSE.wTo;
        boolean bool3 = this.lSP;
        paramInt2 = paramq.lSE.wTp;
        if (bo.isNullOrNil(this.lSU))
          break label189;
        bool2 = bool1;
        ab.i("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: is verify ok: %b, youtuRet: %d, has random pwd: %b", new Object[] { Boolean.valueOf(bool3), Integer.valueOf(paramInt2), Boolean.valueOf(bool2) });
        i = paramq.lSE.wTp;
      }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt1, i, paramString, this);
      AppMethodBeat.o(106);
      return;
      bool2 = false;
      break;
      label189: bool2 = false;
      break label119;
      i = paramInt2;
      if (paramq != null)
      {
        i = paramInt2;
        if (paramq.lSE != null)
        {
          i = paramInt2;
          if (paramq.lSE.wTp != 0)
          {
            ab.i("MicroMsg.NetSceneFaceVerifyFaceRsa", "hy: has detail ret. use");
            i = paramq.lSE.wTp;
          }
        }
      }
    }
  }

  final int g(com.tencent.mm.network.e parame)
  {
    AppMethodBeat.i(105);
    this.ftU.acF();
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(105);
    return i;
  }

  protected final bdv g(q paramq)
  {
    AppMethodBeat.i(108);
    paramq = ((k.b)paramq.ZS()).lSE.wmQ;
    AppMethodBeat.o(108);
    return paramq;
  }

  public final int getType()
  {
    return 930;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.t
 * JD-Core Version:    0.6.2
 */