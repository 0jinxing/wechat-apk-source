package com.tencent.mm.plugin.exdevice.f.a;

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
import com.tencent.mm.protocal.protobuf.cjv;
import com.tencent.mm.protocal.protobuf.cjw;
import com.tencent.mm.sdk.platformtools.ab;

public final class n extends m
  implements k
{
  private b ehh;
  private f ehi;
  public int lwc;
  public int lwd;
  public int opType;

  public n(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(19472);
    this.ehi = null;
    this.ehh = null;
    this.opType = paramInt1;
    this.lwc = paramInt2;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cjv();
    ((b.a)localObject).fsK = new cjw();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/rank/updateranksetting";
    ((b.a)localObject).fsI = 1044;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cjv)this.ehh.fsG.fsP;
    ((cjv)localObject).cKJ = this.opType;
    ((cjv)localObject).bJt = this.lwc;
    AppMethodBeat.o(19472);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(19473);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(19473);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19474);
    ab.d("MicroMsg.NetSceneUpdateRankSetting", "hy: scene end. errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
      this.lwd = ((cjw)this.ehh.fsH.fsP).bJt;
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19474);
  }

  public final int getType()
  {
    return 1044;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.a.n
 * JD-Core Version:    0.6.2
 */