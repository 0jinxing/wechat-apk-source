package com.tencent.mm.plugin.soter.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.soter.a.f.e.b;

public final class e extends d
  implements k, com.tencent.soter.a.f.e
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private com.tencent.soter.a.f.b<e.b> msq = null;

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(59304);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(59304);
    return i;
  }

  public final void a(com.tencent.soter.a.f.b<e.b> paramb)
  {
    this.msq = paramb;
  }

  public final void bxO()
  {
    AppMethodBeat.i(59306);
    ab.i("MicroMsg.NetSceneSoterMPUpdateAuthKey", "hy:NetSceneSoterMPUpdateAuthKey authkey required");
    if (this.ehi != null)
      this.ehi.onSceneEnd(4, -1, "", this);
    if (this.msq != null)
      this.msq.dd(new e.b(false));
    AppMethodBeat.o(59306);
  }

  public final void d(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(59305);
    ab.d("MicroMsg.NetSceneSoterMPUpdateAuthKey", "hy: NetSceneSoterMPUpdateAuthKey onGYNetEnd errType: %d , errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    if (this.msq != null)
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.msq.dd(new e.b(true));
        AppMethodBeat.o(59305);
      }
    while (true)
    {
      return;
      this.msq.dd(new e.b(false));
      AppMethodBeat.o(59305);
    }
  }

  public final void execute()
  {
    AppMethodBeat.i(59308);
    g.Rg().a(this, 0);
    AppMethodBeat.o(59308);
  }

  public final int getType()
  {
    return 1185;
  }

  public final void vL(int paramInt)
  {
    AppMethodBeat.i(59307);
    ab.i("MicroMsg.NetSceneSoterMPUpdateAuthKey", "hy: NetSceneSoterMPUpdateAuthKey onError: errType: %d, errcode: %d", new Object[] { Integer.valueOf(3), Integer.valueOf(paramInt) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(4, -1, "", this);
    AppMethodBeat.o(59307);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.b.e
 * JD-Core Version:    0.6.2
 */