package com.tencent.mm.plugin.scanner.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ky;
import com.tencent.mm.protocal.protobuf.kz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class h extends m
  implements k
{
  private int ctE;
  private int eCW = 1;
  public b ehh;
  private f ehi;
  private int frO;
  private int offset;
  private byte[] pZD;

  public h(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.pZD = paramArrayOfByte;
    this.eCW = 1;
    this.frO = paramInt1;
    this.offset = 0;
    this.ctE = paramInt2;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(80847);
    this.ehi = paramf;
    paramf = new b.a();
    paramf.fsJ = new ky();
    paramf.fsK = new kz();
    paramf.uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscanimg";
    paramf.fsI = 1062;
    paramf.fsL = 0;
    paramf.fsM = 0;
    this.ehh = paramf.acD();
    paramf = (ky)this.ehh.fsG.fsP;
    paramf.vOn = ((int)bo.anU() & 0x7FFFFFFF);
    paramf.vOo = new SKBuiltinBuffer_t().setBuffer(this.pZD);
    paramf.vOp = this.frO;
    paramf.vOq = this.offset;
    if (this.offset + this.pZD.length < this.frO);
    for (paramf.fJT = 0; ; paramf.fJT = 1)
    {
      paramf.vOr = this.eCW;
      paramf.vOs = this.ctE;
      int i = a(parame, this.ehh, this);
      AppMethodBeat.o(80847);
      return i;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(80849);
    ab.d("MicroMsg.scanner.NetSceneScanImage", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(80849);
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(80848);
    paramq = (ky)((b)paramq).fsG.fsP;
    if ((paramq.vOn <= 0) || (paramq.vOr < 0) || (paramq.vOo == null) || (paramq.vOo.getILen() <= 0) || (paramq.vOp <= 0) || (paramq.vOq < 0) || (paramq.vOq + paramq.vOo.getILen() > paramq.vOp))
    {
      ab.e("MicroMsg.scanner.NetSceneScanImage", "ERR: Security Check Failed, imageType = %s, totalLen = %s, offset = %s", new Object[] { Integer.valueOf(paramq.vOr), Integer.valueOf(paramq.vOp), Integer.valueOf(paramq.vOq) });
      if (paramq.vOo != null)
        ab.e("MicroMsg.scanner.NetSceneScanImage", "buffer length = %s", new Object[] { Integer.valueOf(paramq.vOo.getILen()) });
      paramq = m.b.ftv;
      AppMethodBeat.o(80848);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftu;
      AppMethodBeat.o(80848);
    }
  }

  public final int getType()
  {
    return 1062;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.h
 * JD-Core Version:    0.6.2
 */