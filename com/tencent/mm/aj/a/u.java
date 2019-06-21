package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bop;
import com.tencent.mm.protocal.protobuf.boq;
import com.tencent.mm.sdk.platformtools.ab;

public final class u extends m
  implements k
{
  public b ehh;
  private f ehi;

  public u(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11633);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bop();
    ((b.a)localObject).fsK = new boq();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/quitbizchat";
    ((b.a)localObject).fsI = 1358;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bop)this.ehh.fsG.fsP;
    ((bop)localObject).vNb = paramString1;
    ((bop)localObject).vMV = paramString2;
    AppMethodBeat.o(11633);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11635);
    this.ehi = paramf;
    ab.i("MicroMsg.brandservice.NetSceneQuitBizChat", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11635);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11634);
    ab.d("MicroMsg.brandservice.NetSceneQuitBizChat", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11634);
  }

  public final int getType()
  {
    return 1358;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.u
 * JD-Core Version:    0.6.2
 */