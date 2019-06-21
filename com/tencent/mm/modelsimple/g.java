package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.yo;
import com.tencent.mm.protocal.protobuf.yp;
import com.tencent.mm.sdk.platformtools.ab;

public final class g extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;

  public g(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(16572);
    ab.i("MicroMsg.NetSceneEnterTempSession", "NetSceneEnterTempSession %s, %s, %s", new Object[] { paramString1, Integer.valueOf(paramInt), paramString2 });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new yo();
    ((b.a)localObject).fsK = new yp();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/entertempsession";
    ((b.a)localObject).fsI = 1066;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    if (paramString2 != null)
    {
      localObject = paramString2;
      if (paramString2.length() > 32)
      {
        localObject = paramString2;
        if (paramInt == 19);
      }
    }
    for (localObject = paramString2.substring(0, 32); ; localObject = "")
    {
      paramString2 = (yo)this.ehh.fsG.fsP;
      paramString2.vMR = paramString1;
      paramString2.vFH = paramInt;
      paramString2.wer = com.tencent.mm.bt.b.akB((String)localObject);
      paramString2.wcJ = com.tencent.mm.bt.b.bI(new byte[0]);
      ab.i("MicroMsg.NetSceneEnterTempSession", "NetSceneEnterTempSession %s, %s, %s", new Object[] { paramString1, Integer.valueOf(paramInt), Integer.valueOf(paramString2.wcJ.wR.length) });
      AppMethodBeat.o(16572);
      return;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16573);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(16573);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16574);
    ab.i("MicroMsg.NetSceneEnterTempSession", "onGYNetEnd: %d, %d, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16574);
  }

  public final int getType()
  {
    return 1066;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.g
 * JD-Core Version:    0.6.2
 */