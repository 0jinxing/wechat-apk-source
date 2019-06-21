package com.tencent.mm.plugin.fingerprint.faceid.auth;

import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.sdk.platformtools.ab;

public final class WalletFaceIdAuthUI$b extends WalletFaceIdAuthUI.c
{
  public WalletFaceIdAuthUI$b(WalletFaceIdAuthUI paramWalletFaceIdAuthUI)
  {
    super(paramWalletFaceIdAuthUI);
    AppMethodBeat.i(41378);
    com.tencent.mm.plugin.soter.d.a.EB(1);
    AppMethodBeat.o(41378);
  }

  private void bwW()
  {
    AppMethodBeat.i(41383);
    ab.i("MicroMsg.WalletFaceIdAuthUI", "do end process");
    com.tencent.mm.wallet_core.a.b(this.mrc, new Bundle(), 0);
    AppMethodBeat.o(41383);
  }

  protected final boolean bwP()
  {
    return false;
  }

  protected final void bwR()
  {
    AppMethodBeat.i(41379);
    ab.i("MicroMsg.WalletFaceIdAuthUI", "do prepare ");
    this.mrc.bgj();
    this.mrb.a(this.mrc, new WalletFaceIdAuthUI.b.1(this), this.gHr);
    AppMethodBeat.o(41379);
  }

  public final void bwS()
  {
    AppMethodBeat.i(41382);
    bwW();
    AppMethodBeat.o(41382);
  }

  public final void bwT()
  {
    AppMethodBeat.i(41381);
    ab.i("MicroMsg.WalletFaceIdAuthUI", "do verify face id");
    bwX();
    AppMethodBeat.o(41381);
  }

  protected final int bwU()
  {
    return 0;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(41380);
    if (this.mrb.c(paramInt1, paramInt2, paramString, paramm))
      AppMethodBeat.o(41380);
    while (true)
    {
      return bool;
      if ((paramm instanceof y))
      {
        this.mrc.bgk();
        bwW();
        Toast.makeText(this.mrc, 2131299874, 0).show();
        AppMethodBeat.o(41380);
      }
      else
      {
        AppMethodBeat.o(41380);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI.b
 * JD-Core Version:    0.6.2
 */