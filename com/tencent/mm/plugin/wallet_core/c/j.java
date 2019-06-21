package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.zb;
import com.tencent.mm.protocal.protobuf.zc;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends m
  implements k
{
  private f ehi;
  private b gme;
  private boolean ttT;
  private zb ttZ;
  public zc tua;

  public j(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(46515);
    this.ttT = paramBoolean;
    b.a locala = new b.a();
    locala.fsJ = new zb();
    locala.fsK = new zc();
    if (paramBoolean)
      locala.fsI = 2529;
    for (locala.uri = "/cgi-bin/mmpay-bin/mktf2fmodifyexposure"; ; locala.uri = "/cgi-bin/mmpay-bin/mktmodifyexposure")
    {
      locala.fsL = 0;
      locala.fsM = 0;
      this.gme = locala.acD();
      this.ttZ = ((zb)this.gme.fsG.fsP);
      this.ttZ.wev = paramString;
      AppMethodBeat.o(46515);
      return;
      locala.fsI = 2888;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(46516);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(46516);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(46517);
    ab.i("MicroMsg.NetSceneMktModifyExposure", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.tua = ((zc)((b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(46517);
  }

  public final int getType()
  {
    if (this.ttT);
    for (int i = 2529; ; i = 2888)
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.j
 * JD-Core Version:    0.6.2
 */