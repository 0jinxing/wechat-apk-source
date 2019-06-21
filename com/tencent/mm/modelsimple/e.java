package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.wd;
import com.tencent.mm.protocal.protobuf.we;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;

  public e(String paramString)
  {
    AppMethodBeat.i(16564);
    ab.i("MicroMsg.NetSceneDelTempSession", "NetSceneDelTempSession %s", new Object[] { paramString });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new wd();
    ((b.a)localObject).fsK = new we();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/deltempsession";
    ((b.a)localObject).fsI = 1067;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (wd)this.ehh.fsG.fsP;
    ((wd)localObject).vMR = paramString;
    ((wd)localObject).wcJ = com.tencent.mm.bt.b.bI(new byte[0]);
    AppMethodBeat.o(16564);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(16565);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(16565);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16566);
    ab.i("MicroMsg.NetSceneDelTempSession", "onGYNetEnd: %d, %d, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16566);
  }

  public final int getType()
  {
    return 1067;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.e
 * JD-Core Version:    0.6.2
 */