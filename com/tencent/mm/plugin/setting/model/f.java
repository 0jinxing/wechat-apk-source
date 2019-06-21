package com.tencent.mm.plugin.setting.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.apk;
import com.tencent.mm.protocal.protobuf.apl;
import com.tencent.mm.protocal.protobuf.cmd;

public final class f extends m
  implements k
{
  private com.tencent.mm.ai.f ehi;
  public apl qjE;
  public byte[] qjF;

  public f(byte[] paramArrayOfByte)
  {
    this.qjF = paramArrayOfByte;
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(126849);
    this.ehi = paramf;
    b.a locala = new b.a();
    paramf = new apk();
    if (this.qjF != null)
      paramf.wtt = aa.ad(this.qjF).getBuffer();
    locala.fsJ = paramf;
    this.qjE = new apl();
    locala.fsK = this.qjE;
    locala.uri = "/cgi-bin/mmbiz-bin/getuserauthlist";
    locala.fsI = 1146;
    locala.fsL = 0;
    locala.fsM = 0;
    int i = a(parame, locala.acD(), this);
    AppMethodBeat.o(126849);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(126850);
    this.qjE = ((apl)((b)paramq).fsH.fsP);
    if (this.qjE.wcK != null)
    {
      paramInt3 = this.qjE.wcK.cyE;
      paramString = this.qjE.wcK.cyF;
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(126850);
  }

  public final int getType()
  {
    return 1146;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.f
 * JD-Core Version:    0.6.2
 */