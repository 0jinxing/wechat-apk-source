package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cjt;
import com.tencent.mm.protocal.protobuf.cju;
import com.tencent.mm.sdk.platformtools.ab;

public final class m extends com.tencent.mm.ai.m
  implements k
{
  private b ehh;
  private f ehi;
  public String lvx;
  public String lvy;

  public m(String paramString1, String paramString2)
  {
    AppMethodBeat.i(19469);
    this.ehi = null;
    this.ehh = null;
    this.lvx = paramString1;
    this.lvy = paramString2;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cjt();
    ((b.a)localObject).fsK = new cju();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/rank/updatecover";
    ((b.a)localObject).fsI = 1040;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cjt)this.ehh.fsG.fsP;
    ((cjt)localObject).wtC = paramString1;
    ((cjt)localObject).lvy = paramString2;
    AppMethodBeat.o(19469);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(19470);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(19470);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19471);
    ab.d("MicroMsg.NetSceneUpdateRankCoverAndMotto", "hy: scene end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19471);
  }

  public final int getType()
  {
    return 1040;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.a.m
 * JD-Core Version:    0.6.2
 */