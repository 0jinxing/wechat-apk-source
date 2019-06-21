package com.tencent.mm.aj;

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
import com.tencent.mm.protocal.protobuf.awt;
import com.tencent.mm.protocal.protobuf.awu;
import com.tencent.mm.sdk.platformtools.ab;

public final class u extends m
  implements k
{
  public b ehh;
  private f ehi;
  public String fwO;

  public u(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11450);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new awt();
    ((b.a)localObject).fsK = new awu();
    ((b.a)localObject).uri = "/cgi-bin/mmkf-bin/kfgetbindlist";
    ((b.a)localObject).fsI = 674;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (awt)this.ehh.fsG.fsP;
    ((awt)localObject).wAZ = paramString1;
    ((awt)localObject).wBa = paramString2;
    this.fwO = paramString1;
    AppMethodBeat.o(11450);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11452);
    this.ehi = paramf;
    ab.i("MicroMsg.NetSceneKFGetBindList", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11452);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11451);
    ab.i("MicroMsg.NetSceneKFGetBindList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11451);
  }

  public final awu aeM()
  {
    if ((this.ehh != null) && (this.ehh.fsH.fsP != null));
    for (awu localawu = (awu)this.ehh.fsH.fsP; ; localawu = null)
      return localawu;
  }

  public final int getType()
  {
    return 674;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.u
 * JD-Core Version:    0.6.2
 */