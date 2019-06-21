package com.tencent.mm.plugin.soter.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.soter.a.f.e.b;

public final class f extends m
  implements k, com.tencent.soter.a.f.e
{
  private com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  private com.tencent.soter.a.f.b<e.b> msq = null;

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(59310);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(59310);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(59311);
    ab.i("MicroMsg.NetSceneUploadSoterASK", "MicroMsg.NetSceneUploadSoterASK errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      ab.i("MicroMsg.NetSceneUploadSoterASK", "netscene upload soter ask successfully");
      if (this.msq == null)
        break label132;
      this.msq.dd(new e.b(true));
      AppMethodBeat.o(59311);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.NetSceneUploadSoterASK", "netscene upload soter ask failed");
      if (this.msq != null)
        this.msq.dd(new e.b(false));
      label132: AppMethodBeat.o(59311);
    }
  }

  public final void a(com.tencent.soter.a.f.b<e.b> paramb)
  {
    this.msq = paramb;
  }

  public final void execute()
  {
    AppMethodBeat.i(59312);
    ab.v("MicroMsg.NetSceneUploadSoterASK", "alvinluo NetSceneUploadSoterASK execute doScene");
    g.Rg().a(this, 0);
    AppMethodBeat.o(59312);
  }

  public final int getType()
  {
    return 619;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.b.f
 * JD-Core Version:    0.6.2
 */