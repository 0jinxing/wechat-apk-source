package com.tencent.mm.plugin.webwx.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.zm;
import com.tencent.mm.protocal.protobuf.zn;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends m
  implements k
{
  private f ehi;
  final b fAT;

  public d(String paramString)
  {
    AppMethodBeat.i(26500);
    b.a locala = new b.a();
    zm localzm = new zm();
    zn localzn = new zn();
    locala.fsJ = localzm;
    locala.fsK = localzn;
    locala.uri = "/cgi-bin/micromsg-bin/extdeviceloginconfirmget";
    locala.fsI = 971;
    locala.fsL = 0;
    locala.fsM = 0;
    this.fAT = locala.acD();
    localzm.weG = paramString;
    ab.d("MicroMsg.NetSceneExtDeviceLoginConfirmGet", "[oneliang][NetSceneExtDeviceLoginConfirmGet]loginUrl:%s", new Object[] { paramString });
    AppMethodBeat.o(26500);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(26501);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(26501);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26502);
    ab.d("MicroMsg.NetSceneExtDeviceLoginConfirmGet", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " errMsg:" + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(26502);
  }

  public final int getType()
  {
    return 971;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.a.d
 * JD-Core Version:    0.6.2
 */