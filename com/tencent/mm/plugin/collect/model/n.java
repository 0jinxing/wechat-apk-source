package com.tencent.mm.plugin.collect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.pi;
import com.tencent.mm.protocal.protobuf.pj;
import com.tencent.mm.sdk.platformtools.ab;

public final class n extends m
  implements k
{
  private final String TAG;
  public String cva;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public pj kCB;

  public n(int paramInt, com.tencent.mm.bt.b paramb, String paramString)
  {
    AppMethodBeat.i(40983);
    this.TAG = "MicroMsg.NetSceneMDRcvVoice";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new pi();
    ((b.a)localObject).fsK = new pj();
    ((b.a)localObject).fsI = 1317;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/getmdrcvvoice";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (pi)this.ehh.fsG.fsP;
    ((pi)localObject).nUf = paramInt;
    ((pi)localObject).vWi = 0;
    ((pi)localObject).kCK = paramString;
    ((pi)localObject).vWg = null;
    ((pi)localObject).vWh = paramb;
    this.cva = paramString;
    ab.i("MicroMsg.NetSceneMDRcvVoice", "amount: %d, outtradeno: %s", new Object[] { Integer.valueOf(paramInt), paramString });
    AppMethodBeat.o(40983);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(40984);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(40984);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(40985);
    ab.i("MicroMsg.NetSceneMDRcvVoice", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.kCB = ((pj)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneMDRcvVoice", "ret_code: %d, ret_msg: %s，voice_type: %d", new Object[] { Integer.valueOf(this.kCB.kCl), this.kCB.kCm, Integer.valueOf(this.kCB.vWi) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(40985);
  }

  public final int getType()
  {
    return 1317;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.n
 * JD-Core Version:    0.6.2
 */