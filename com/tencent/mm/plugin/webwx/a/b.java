package com.tencent.mm.plugin.webwx.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.zg;
import com.tencent.mm.protocal.protobuf.zh;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends m
  implements k
{
  public int czE;
  private f ehi;
  private final com.tencent.mm.ai.b fAT;

  public b(int paramInt)
  {
    AppMethodBeat.i(26494);
    this.czE = paramInt;
    b.a locala = new b.a();
    zg localzg = new zg();
    zh localzh = new zh();
    locala.fsJ = localzg;
    locala.fsK = localzh;
    locala.uri = "/cgi-bin/micromsg-bin/extdevicecontrol";
    locala.fsI = 792;
    locala.fsL = 0;
    locala.fsM = 0;
    localzg.nbk = paramInt;
    localzg.weF = 1;
    this.fAT = locala.acD();
    AppMethodBeat.o(26494);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(26496);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(26496);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26495);
    ab.d("MicroMsg.NetSceneExtDeviceControl", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " errMsg:" + paramString);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(26495);
  }

  public final int getType()
  {
    return 792;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.a.b
 * JD-Core Version:    0.6.2
 */