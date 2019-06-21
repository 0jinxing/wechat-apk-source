package com.tencent.mm.plugin.mall.a;

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
import com.tencent.mm.protocal.protobuf.ame;
import com.tencent.mm.protocal.protobuf.amf;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class g extends m
  implements k
{
  private f ehi;
  private b gme;
  private ame okU;
  public amf okV;

  public g()
  {
    AppMethodBeat.i(43102);
    b.a locala = new b.a();
    locala.fsJ = new ame();
    locala.fsK = new amf();
    locala.fsI = 1754;
    locala.uri = "/cgi-bin/mmpay-bin/tenpay/getpaymenu";
    locala.fsL = 0;
    locala.fsM = 0;
    this.gme = locala.acD();
    this.okU = ((ame)this.gme.fsG.fsP);
    AppMethodBeat.o(43102);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(43103);
    ab.d("MicroMsg.NetSceneGetPayMenu", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(43103);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(43104);
    ab.i("MicroMsg.NetSceneGetPayMenu", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.okV = ((amf)this.gme.fsH.fsP);
      paramq = this.okV.title;
      paramArrayOfByte = this.okV.wrk;
      if (this.okV.wrk == null)
        break label142;
    }
    label142: for (paramInt1 = this.okV.wrk.size(); ; paramInt1 = 0)
    {
      ab.i("MicroMsg.NetSceneGetPayMenu", "onGYNetEnd, title: %s, sectors: %s, sectors.size: %s", new Object[] { paramq, paramArrayOfByte, Integer.valueOf(paramInt1) });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(43104);
      return;
    }
  }

  public final int getType()
  {
    return 1754;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.a.g
 * JD-Core Version:    0.6.2
 */