package com.tencent.mm.plugin.fingerprint.faceid.auth;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.s;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fingerprint.b.i;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c;
import com.tencent.soter.a.g.f;

public abstract class WalletFaceIdAuthUI$c
{
  protected String gHr;
  protected Bundle hRX;
  protected l mra;
  protected com.tencent.mm.plugin.fingerprint.b.m mrb;
  protected WalletFaceIdAuthUI mrc;

  public WalletFaceIdAuthUI$c(WalletFaceIdAuthUI paramWalletFaceIdAuthUI)
  {
    this.mrc = paramWalletFaceIdAuthUI;
    if (paramWalletFaceIdAuthUI.gOW == 0);
    for (paramWalletFaceIdAuthUI = paramWalletFaceIdAuthUI.dOD().mqu; ; paramWalletFaceIdAuthUI = paramWalletFaceIdAuthUI.getIntent().getExtras())
    {
      this.hRX = paramWalletFaceIdAuthUI;
      this.mrb = new com.tencent.mm.plugin.fingerprint.b.m();
      this.mra = ((l)g.K(l.class));
      return;
    }
  }

  protected abstract boolean bwP();

  protected abstract void bwR();

  protected abstract void bwS();

  protected abstract void bwT();

  protected abstract int bwU();

  protected final void bwX()
  {
    ab.i("MicroMsg.WalletFaceIdAuthUI", "do face id auth");
    i locali = (i)g.K(i.class);
    Bundle localBundle = new Bundle();
    localBundle.putInt("face_auth_scene", 0);
    locali.a(this.mrc, new WalletFaceIdAuthUI.c.2(this), localBundle);
  }

  protected abstract boolean c(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm);

  public void onCreate()
  {
    boolean bool1 = true;
    if (this.mra == null)
    {
      ab.w("MicroMsg.WalletFaceIdAuthUI", "no mgr");
      this.mrc.Ml(this.mrc.getString(2131299559));
    }
    while (true)
    {
      return;
      boolean bool2 = this.mra.bxA();
      boolean bool3 = this.mra.bxB();
      boolean bool4;
      if (q.etg.etr != 1)
      {
        bool4 = true;
        label66: if ((bool2) && (bool3) && (!bool4) && (this.hRX != null))
          break label163;
        if (this.hRX != null)
          break label158;
      }
      while (true)
      {
        ab.w("MicroMsg.WalletFaceIdAuthUI", "support: %s, enrolled: %s, forceClose: %s, data: %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool1) });
        this.mrc.Ml(this.mrc.getString(2131299559));
        break;
        bool4 = false;
        break label66;
        label158: bool1 = false;
      }
      label163: this.gHr = this.hRX.getString("pwd");
      if (bo.isNullOrNil(this.gHr))
      {
        ab.w("MicroMsg.WalletFaceIdAuthUI", "no pwd");
        this.mrc.Ml(this.mrc.getString(2131299559));
      }
      else
      {
        f.dRn().dRo();
        bwR();
      }
    }
  }

  protected final void vK(int paramInt)
  {
    int i = 1;
    this.mrc.bgj();
    if (bwU() == 1)
      i = 2;
    this.mrb.a(new WalletFaceIdAuthUI.c.1(this), String.valueOf(paramInt), i);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI.c
 * JD-Core Version:    0.6.2
 */