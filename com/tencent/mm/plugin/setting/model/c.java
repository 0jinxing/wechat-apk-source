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
import com.tencent.mm.protocal.protobuf.cmd;
import com.tencent.mm.protocal.protobuf.wf;
import com.tencent.mm.protocal.protobuf.wg;

public final class c extends m
  implements k
{
  public final String appId;
  private f ehi;
  private final int scene;

  public c(String paramString, int paramInt)
  {
    this.appId = paramString;
    this.scene = paramInt;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(126842);
    this.ehi = paramf;
    b.a locala = new b.a();
    paramf = new wf();
    paramf.csB = this.appId;
    paramf.cME = this.scene;
    locala.fsJ = paramf;
    locala.uri = "/cgi-bin/mmbiz-bin/deluserauth";
    locala.fsK = new wg();
    locala.fsI = 1127;
    locala.fsL = 0;
    locala.fsM = 0;
    int i = a(parame, locala.acD(), this);
    AppMethodBeat.o(126842);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(126843);
    paramString = (wg)((b)paramq).fsH.fsP;
    this.ehi.onSceneEnd(paramInt2, paramString.wcK.cyE, paramString.wcK.cyF, this);
    AppMethodBeat.o(126843);
  }

  public final int getType()
  {
    return 1127;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.c
 * JD-Core Version:    0.6.2
 */