package com.tencent.mm.plugin.setting.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bvr;
import com.tencent.mm.protocal.protobuf.bvs;
import com.tencent.mm.protocal.protobuf.cmd;

public final class i extends m
  implements k
{
  private String ctj;
  private f ehi;
  public byte[] qjF;
  public bvs qjI;

  public i(String paramString)
  {
    this.ctj = paramString;
  }

  public i(byte[] paramArrayOfByte)
  {
    this.qjF = paramArrayOfByte;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(126856);
    this.ehi = paramf;
    paramf = new b.a();
    bvr localbvr = new bvr();
    localbvr.ctj = this.ctj;
    if (this.qjF != null)
      localbvr.wtt = aa.ad(this.qjF).getBuffer();
    paramf.fsJ = localbvr;
    paramf.fsK = new bvs();
    paramf.fsI = 1169;
    paramf.uri = "/cgi-bin/mmbiz-bin/searchuserauth";
    paramf.fsL = 0;
    paramf.fsM = 0;
    int i = a(parame, paramf.acD(), this);
    AppMethodBeat.o(126856);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(126857);
    this.qjI = ((bvs)((b)paramq).fsH.fsP);
    if (this.qjI.wcK != null)
    {
      paramInt3 = this.qjI.wcK.cyE;
      paramString = this.qjI.wcK.cyF;
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(126857);
  }

  public final int getType()
  {
    return 1169;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.i
 * JD-Core Version:    0.6.2
 */