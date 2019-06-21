package com.tencent.mm.plugin.webwx.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.zi;
import com.tencent.mm.protocal.protobuf.zj;

public final class c extends m
  implements k
{
  private f ehi;
  private final b fAT;

  public c(String paramString)
  {
    AppMethodBeat.i(26497);
    b.a locala = new b.a();
    zi localzi = new zi();
    zj localzj = new zj();
    locala.fsJ = localzi;
    locala.fsK = localzj;
    locala.uri = "/cgi-bin/micromsg-bin/extdeviceloginconfirmcancel";
    locala.fsI = 973;
    locala.fsL = 0;
    locala.fsM = 0;
    localzi.weG = paramString;
    this.fAT = locala.acD();
    AppMethodBeat.o(26497);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(26498);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(26498);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26499);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(26499);
  }

  public final int getType()
  {
    return 973;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.a.c
 * JD-Core Version:    0.6.2
 */