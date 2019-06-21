package com.tencent.mm.plugin.voip_cs.b.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cot;
import com.tencent.mm.protocal.protobuf.cou;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends m
  implements k
{
  public com.tencent.mm.ai.b ehh;
  private f ehi;

  public c(int paramInt1, String paramString1, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString2)
  {
    AppMethodBeat.i(135377);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cot();
    ((b.a)localObject).fsK = new cou();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/csvoipinvite";
    ((b.a)localObject).fsI = 823;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cot)this.ehh.fsG.fsP;
    ((cot)localObject).wOQ = paramInt1;
    ((cot)localObject).xmv = paramString1;
    ((cot)localObject).vZF = paramInt2;
    ((cot)localObject).xmw = com.tencent.mm.bt.b.bI(paramArrayOfByte1);
    ((cot)localObject).xmx = com.tencent.mm.bt.b.bI(paramArrayOfByte2);
    ((cot)localObject).wOP = System.currentTimeMillis();
    if ((paramString2 != null) && (!paramString2.equals("")))
      ((cot)localObject).xmy = paramString2;
    AppMethodBeat.o(135377);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(135379);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(135379);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(135378);
    ab.i("MicroMsg.NetSceneVoipCSInvite", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(135378);
  }

  public final int getType()
  {
    return 823;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.c.c
 * JD-Core Version:    0.6.2
 */