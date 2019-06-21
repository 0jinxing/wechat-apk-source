package com.tencent.mm.plugin.fingerprint.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.soter.b.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.soter.a.f.e.b;

public final class c extends d
  implements k, com.tencent.soter.a.f.e
{
  private int cOi;
  public com.tencent.mm.ai.b ehh;
  private f ehi;
  private String gHr = null;
  private int msp;
  private com.tencent.soter.a.f.b<e.b> msq = null;

  public c(String paramString, int paramInt)
  {
    this.gHr = paramString;
    this.msp = paramInt;
    this.cOi = paramInt;
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(41578);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(41578);
    return i;
  }

  public final void a(com.tencent.soter.a.f.b<e.b> paramb)
  {
    this.msq = paramb;
  }

  public final void bxO()
  {
    AppMethodBeat.i(41580);
    ab.i("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "hy: authkey required");
    if (this.ehi != null)
      this.ehi.onSceneEnd(4, -1, "", this);
    if (this.msq != null)
    {
      ab.e("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "alvinluo pay auth key expired when upload pay auth key");
      this.msq.dd(new e.b(false));
    }
    AppMethodBeat.o(41580);
  }

  public final void d(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41579);
    ab.d("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "onGYNetEnd errType: %d , errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    if (this.msq != null)
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.msq.dd(new e.b(true));
        AppMethodBeat.o(41579);
      }
    while (true)
    {
      return;
      this.msq.dd(new e.b(false));
      AppMethodBeat.o(41579);
    }
  }

  public final void execute()
  {
    AppMethodBeat.i(41582);
    g.Rg().a(this, 0);
    AppMethodBeat.o(41582);
  }

  public final int getType()
  {
    return 1665;
  }

  public final void vL(int paramInt)
  {
    AppMethodBeat.i(41581);
    ab.i("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "hy: onError: errType: %d, errcode: %d", new Object[] { Integer.valueOf(3), Integer.valueOf(paramInt) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(4, -1, "", this);
    AppMethodBeat.o(41581);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.c.c
 * JD-Core Version:    0.6.2
 */