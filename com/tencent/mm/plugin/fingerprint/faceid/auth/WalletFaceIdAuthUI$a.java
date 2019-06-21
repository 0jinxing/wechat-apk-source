package com.tencent.mm.plugin.fingerprint.faceid.auth;

import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.soter.d.a;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class WalletFaceIdAuthUI$a extends WalletFaceIdAuthUI.c
{
  public WalletFaceIdAuthUI$a(WalletFaceIdAuthUI paramWalletFaceIdAuthUI)
  {
    super(paramWalletFaceIdAuthUI);
    AppMethodBeat.i(41370);
    a.EB(0);
    AppMethodBeat.o(41370);
  }

  private void bwV()
  {
    AppMethodBeat.i(41375);
    ab.i("MicroMsg.WalletFaceIdAuthUI", "do finish");
    this.mrc.finish();
    AppMethodBeat.o(41375);
  }

  protected final boolean bwP()
  {
    return true;
  }

  protected final void bwR()
  {
    AppMethodBeat.i(41372);
    ab.i("MicroMsg.WalletFaceIdAuthUI", "do prepare ");
    this.mrc.bgj();
    this.mrb.a(this.mrc, new WalletFaceIdAuthUI.a.1(this), this.gHr);
    AppMethodBeat.o(41372);
  }

  protected final void bwS()
  {
    AppMethodBeat.i(41374);
    bwV();
    AppMethodBeat.o(41374);
  }

  protected final void bwT()
  {
  }

  protected final int bwU()
  {
    return 1;
  }

  protected final boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(41373);
    if (this.mrb.c(paramInt1, paramInt2, paramString, paramm))
    {
      AppMethodBeat.o(41373);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((paramm instanceof y))
      {
        this.mrc.bgk();
        h.a(this.mrc, this.mrc.getString(2131299561), this.mrc.getString(2131299560), this.mrc.getString(2131305147), false, new WalletFaceIdAuthUI.a.2(this));
        AppMethodBeat.o(41373);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(41373);
      }
    }
  }

  public final void onCreate()
  {
    AppMethodBeat.i(41371);
    this.mrc.getWindow().setDimAmount(0.0F);
    super.onCreate();
    this.mrc.mController.hideTitleView();
    this.mrc.dyb();
    this.mrc.AM(8);
    AppMethodBeat.o(41371);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI.a
 * JD-Core Version:    0.6.2
 */