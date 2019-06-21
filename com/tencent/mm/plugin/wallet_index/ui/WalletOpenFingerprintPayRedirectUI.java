package com.tencent.mm.plugin.wallet_index.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.wallet.b.a;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

public class WalletOpenFingerprintPayRedirectUI extends AutoLoginActivity
  implements f
{
  private boolean VO = false;
  private Dialog gII = null;

  private void a(int paramInt, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(48296);
    ab.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: redirect to open fingerprint failed. errCode: %d", new Object[] { Integer.valueOf(paramInt) });
    if ((this.gII != null) && (this.gII.isShowing()))
    {
      this.gII.dismiss();
      this.gII = null;
    }
    if (paramBoolean)
    {
      h.a(this, paramString, "", false, new WalletOpenFingerprintPayRedirectUI.2(this));
      AppMethodBeat.o(48296);
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(48296);
    }
  }

  public final boolean O(Intent paramIntent)
  {
    return true;
  }

  public final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    AppMethodBeat.i(48295);
    ab.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin, loginResult = ".concat(String.valueOf(parama)));
    switch (3.jDI[parama.ordinal()])
    {
    default:
      ab.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin, unknown login result = ".concat(String.valueOf(parama)));
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      a(2, true, getString(2131304517));
      AppMethodBeat.o(48295);
      while (true)
      {
        return;
        ab.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: login ok.");
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a(new y(null, 19), 0);
        if (this.gII != null)
        {
          this.gII.dismiss();
          this.gII = null;
        }
        this.gII = com.tencent.mm.wallet_core.ui.g.g(this, new WalletOpenFingerprintPayRedirectUI.1(this));
        AppMethodBeat.o(48295);
      }
      ab.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "postLogin fail, loginResult = ".concat(String.valueOf(parama)));
      a(1, false, "");
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48293);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(385, this);
    AppMethodBeat.o(48293);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(48294);
    super.onDestroy();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(385, this);
    AppMethodBeat.o(48294);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48298);
    if ((paramm instanceof y))
      if (!this.VO)
      {
        this.VO = true;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          ab.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: bind query ok. start judge.");
          com.tencent.mm.plugin.wallet.a.s.cNC();
          paramString = com.tencent.mm.plugin.wallet.a.s.cND();
          if ((paramString == null) || (!paramString.cQg()))
          {
            ab.i("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: not open wechat payment. hint bind bankcard");
            a(5, true, getString(2131304807));
            AppMethodBeat.o(48298);
          }
        }
      }
    while (true)
    {
      return;
      if ((!a.cOQ()) || (q.etg.ets != 1))
      {
        ab.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: not support wechat fp pay or not allow");
        a(6, true, getString(2131304809));
        AppMethodBeat.o(48298);
      }
      else
      {
        paramString = new Intent();
        paramString.putExtra("key_is_from_system", true);
        d.b(this, "wallet", ".pwd.ui.WalletPasswordSettingUI", paramString);
        finish();
        AppMethodBeat.o(48298);
        continue;
        ab.e("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: bind query failed. inform fail.");
        a(3, true, getString(2131304517));
        AppMethodBeat.o(48298);
        continue;
        ab.w("MicroMsg.WalletOpenFingerprintPayRedirectUI", "hy: is already handled");
        AppMethodBeat.o(48298);
      }
    }
  }

  public void onStop()
  {
    AppMethodBeat.i(48297);
    super.onStop();
    if ((this.gII != null) && (this.gII.isShowing()))
    {
      this.gII.dismiss();
      this.gII = null;
    }
    AppMethodBeat.o(48297);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.WalletOpenFingerprintPayRedirectUI
 * JD-Core Version:    0.6.2
 */