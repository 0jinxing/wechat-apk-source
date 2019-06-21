package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.awv;
import com.tencent.mm.sdk.platformtools.ab;

public final class v extends m
  implements k
{
  public b ehh;
  private f ehi;
  public String fwO;

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11454);
    this.ehi = paramf;
    ab.i("MicroMsg.NetSceneKFGetDefaultList", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11454);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11453);
    ab.i("MicroMsg.NetSceneKFGetDefaultList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11453);
  }

  public final awv aeN()
  {
    if ((this.ehh != null) && (this.ehh.fsH.fsP != null));
    for (awv localawv = (awv)this.ehh.fsH.fsP; ; localawv = null)
      return localawv;
  }

  public final int getType()
  {
    return 672;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.v
 * JD-Core Version:    0.6.2
 */