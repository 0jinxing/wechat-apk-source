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
import com.tencent.mm.protocal.protobuf.bco;
import com.tencent.mm.protocal.protobuf.bcp;
import com.tencent.mm.protocal.protobuf.cmd;

public final class h extends m
  implements k
{
  private final String csB;
  private f ehi;
  public final String qjG;
  public final int qjH;
  private final int scene;

  public h(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    this.csB = paramString1;
    this.qjG = paramString2;
    this.qjH = paramInt1;
    this.scene = paramInt2;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(126855);
    this.ehi = paramf;
    b.a locala = new b.a();
    paramf = new bco();
    paramf.csB = this.csB;
    paramf.wGP = this.qjG;
    paramf.wGQ = this.qjH;
    locala.fsJ = paramf;
    locala.uri = "/cgi-bin/mmbiz-bin/moduserauth";
    locala.fsK = new bcp();
    locala.fsI = 1144;
    locala.fsL = 0;
    locala.fsM = 0;
    int i = a(parame, locala.acD(), this);
    AppMethodBeat.o(126855);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(126854);
    paramString = (bcp)((b)paramq).fsH.fsP;
    this.ehi.onSceneEnd(paramInt2, paramString.wcK.cyE, paramString.wcK.cyF, this);
    AppMethodBeat.o(126854);
  }

  public final int getType()
  {
    return 1144;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.h
 * JD-Core Version:    0.6.2
 */