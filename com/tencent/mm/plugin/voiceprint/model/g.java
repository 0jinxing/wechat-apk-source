package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.ba.a;
import com.tencent.mm.model.ba.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.aqc;
import com.tencent.mm.protocal.protobuf.bsx;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public final class g extends m
  implements k
{
  f ehi;
  private final q ftU;
  String sKW;
  int sKX;
  private String sKY;

  public g(String paramString)
  {
    AppMethodBeat.i(26092);
    this.sKW = "";
    this.sKX = 0;
    this.sKY = "";
    this.ftU = new a();
    ba.a locala = (ba.a)this.ftU.acF();
    ab.i("MicroMsg.NetSceneRsaGetVoicePrintResource", "sceneType %d %s", new Object[] { Integer.valueOf(73), paramString });
    locala.flW.wub = 73;
    locala.flW.wuc = paramString;
    AppMethodBeat.o(26092);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(26093);
    this.ehi = paramf;
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(26093);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26094);
    ab.d("MicroMsg.NetSceneRsaGetVoicePrintResource", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramArrayOfByte = (ba.b)paramq.ZS();
    if ((paramInt2 == 4) && (paramInt3 == -102))
    {
      paramInt1 = paramq.acF().vyj.ver;
      ab.d("MicroMsg.NetSceneRsaGetVoicePrintResource", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      aw.RS().aa(new g.1(this, paramInt1));
      AppMethodBeat.o(26094);
    }
    while (true)
    {
      return;
      if ((paramInt2 == 0) || (paramInt3 == 0))
        break;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(26094);
    }
    if (paramArrayOfByte.flX.wud != null)
    {
      this.sKW = new String(paramArrayOfByte.flX.wud.wVc.getBufferToBytes());
      this.sKX = paramArrayOfByte.flX.wud.wTu;
      ab.d("MicroMsg.NetSceneRsaGetVoicePrintResource", "resid %d mVertifyKey %s mtext %s", new Object[] { Integer.valueOf(this.sKX), this.sKY, this.sKW });
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(26094);
      break;
      ab.e("MicroMsg.NetSceneRsaGetVoicePrintResource", "resp ResourceData null ");
    }
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

  public final int getType()
  {
    return 616;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.g
 * JD-Core Version:    0.6.2
 */