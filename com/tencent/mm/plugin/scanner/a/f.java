package com.tencent.mm.plugin.scanner.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ben;
import com.tencent.mm.protocal.protobuf.beo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class f extends m
  implements k
{
  private int ctE;
  private int eCW = 1;
  public b ehh;
  private com.tencent.mm.ai.f ehi;
  private byte[] pZD;
  private String pZE = "en";
  private String pZF = "zh_CN";

  public f(byte[] paramArrayOfByte, String paramString1, String paramString2, int paramInt)
  {
    this.pZD = paramArrayOfByte;
    this.eCW = 1;
    this.pZE = paramString1;
    this.pZF = paramString2;
    this.ctE = paramInt;
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(80840);
    this.ehi = paramf;
    paramf = new b.a();
    paramf.fsJ = new ben();
    paramf.fsK = new beo();
    paramf.uri = "/cgi-bin/micromsg-bin/ocrtranslation";
    paramf.fsI = 392;
    paramf.fsL = 199;
    paramf.fsM = 1000000199;
    this.ehh = paramf.acD();
    paramf = (ben)this.ehh.fsG.fsP;
    paramf.vOn = ((int)bo.anU() & 0x7FFFFFFF);
    paramf.vOo = new SKBuiltinBuffer_t().setBuffer(this.pZD);
    paramf.vOr = this.eCW;
    paramf.wID = this.pZE;
    paramf.wIE = this.pZF;
    paramf.vOs = this.ctE;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(80840);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(80842);
    ab.d("MicroMsg.scanner.NetSceneOCRTranslate", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(80842);
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(80841);
    paramq = (ben)((b)paramq).fsG.fsP;
    if ((paramq.vOn <= 0) || (bo.isNullOrNil(paramq.wIE)) || (bo.isNullOrNil(paramq.wID)) || (paramq.vOr < 0) || (paramq.vOo == null) || (paramq.vOo.getILen() <= 0))
    {
      ab.e("MicroMsg.scanner.NetSceneOCRTranslate", "ERR: Security Check Failed");
      paramq = m.b.ftv;
      AppMethodBeat.o(80841);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftu;
      AppMethodBeat.o(80841);
    }
  }

  public final int getType()
  {
    return 392;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.f
 * JD-Core Version:    0.6.2
 */