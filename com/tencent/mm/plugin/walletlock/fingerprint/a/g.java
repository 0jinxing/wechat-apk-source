package com.tencent.mm.plugin.walletlock.fingerprint.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.soter.b.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.soter.a.f.e.b;

public final class g extends d
  implements k, com.tencent.soter.a.f.e
{
  public com.tencent.mm.ai.b ehh;
  private f ehi;
  private String gHr = null;
  private com.tencent.soter.a.f.b<e.b> msq = null;

  public g(String paramString)
  {
    this.gHr = paramString;
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(51484);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(51484);
    return i;
  }

  public final void a(com.tencent.soter.a.f.b<e.b> paramb)
  {
    this.msq = paramb;
  }

  public final void bxO()
  {
    AppMethodBeat.i(51486);
    ab.i("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "hy: authkey required");
    if (this.ehi != null)
      this.ehi.onSceneEnd(4, -1, "", this);
    if (this.msq != null)
    {
      ab.e("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "alvinluo pay auth key expired when upload pay auth key");
      this.msq.dd(new e.b(false));
    }
    AppMethodBeat.o(51486);
  }

  public final void d(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(51485);
    ab.d("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "alvinluo onGYNetEnd errType: %d , errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    if (this.msq != null)
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.msq.dd(new e.b(true));
        AppMethodBeat.o(51485);
      }
    while (true)
    {
      return;
      this.msq.dd(new e.b(false));
      AppMethodBeat.o(51485);
    }
  }

  public final void execute()
  {
    AppMethodBeat.i(51488);
    com.tencent.mm.kernel.g.Rg().a(this, 0);
    AppMethodBeat.o(51488);
  }

  public final int getType()
  {
    return 1665;
  }

  public final void vL(int paramInt)
  {
    AppMethodBeat.i(51487);
    ab.i("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "hy: onError: errType: %d, errcode: %d", new Object[] { Integer.valueOf(3), Integer.valueOf(paramInt) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(4, -1, "", this);
    AppMethodBeat.o(51487);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.a.g
 * JD-Core Version:    0.6.2
 */