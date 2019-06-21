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
import com.tencent.mm.protocal.protobuf.oz;
import com.tencent.mm.protocal.protobuf.pa;
import com.tencent.mm.sdk.platformtools.ab;

public final class i extends m
  implements k
{
  public String cva;
  public long cvc;
  public int cvd;
  private f ehi;
  private com.tencent.mm.ai.b gme;
  public pa kCf;
  public long kCg;
  private long kCh;

  public i(int paramInt1, com.tencent.mm.bt.b paramb, String paramString, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(40967);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new oz();
    ((b.a)localObject).fsK = new pa();
    ((b.a)localObject).fsI = 1384;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/getf2frcvvoice";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.gme = ((b.a)localObject).acD();
    localObject = (oz)this.gme.fsG.fsP;
    ((oz)localObject).nUf = paramInt1;
    ((oz)localObject).vWi = 0;
    ((oz)localObject).kCK = paramString;
    ((oz)localObject).vWg = null;
    ((oz)localObject).vWh = paramb;
    this.cva = paramString;
    this.cvd = paramInt2;
    this.cvc = paramLong;
    this.kCh = System.currentTimeMillis();
    ab.i("MicroMsg.NetSceneF2FRcvVoice", "amount: %d, outtradeno: %s", new Object[] { Integer.valueOf(paramInt1), paramString });
    AppMethodBeat.o(40967);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(40968);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(40968);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(40969);
    ab.i("MicroMsg.NetSceneF2FRcvVoice", "errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.kCf = ((pa)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneF2FRcvVoice", "ret_code: %d, ret_msg: %s，voice_type: %d", new Object[] { Integer.valueOf(this.kCf.kCl), this.kCf.kCm, Integer.valueOf(this.kCf.vWi) });
    this.kCg = (System.currentTimeMillis() - this.kCh);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(40969);
  }

  public final int getType()
  {
    return 1384;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.i
 * JD-Core Version:    0.6.2
 */