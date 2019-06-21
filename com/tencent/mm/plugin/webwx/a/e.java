package com.tencent.mm.plugin.webwx.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.zo;
import com.tencent.mm.protocal.protobuf.zp;

public final class e extends m
  implements k
{
  private f ehi;
  public final b fAT;
  public boolean uLe;

  public e(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(26503);
    this.uLe = paramBoolean;
    b.a locala = new b.a();
    zo localzo = new zo();
    zp localzp = new zp();
    locala.fsJ = localzo;
    locala.fsK = localzp;
    locala.uri = "/cgi-bin/micromsg-bin/extdeviceloginconfirmok";
    locala.fsI = 972;
    locala.fsL = 0;
    locala.fsM = 0;
    localzo.weG = paramString1;
    localzo.weR = paramString2;
    localzo.weT = paramBoolean;
    this.fAT = locala.acD();
    AppMethodBeat.o(26503);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(26504);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(26504);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26505);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(26505);
  }

  public final int getType()
  {
    return 972;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.a.e
 * JD-Core Version:    0.6.2
 */