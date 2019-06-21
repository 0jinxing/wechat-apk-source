package com.tencent.mm.plugin.wallet.pwd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdBindNewUI;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdSelectUI;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdUI;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletForgotPwdVerifyIdUI;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class a extends com.tencent.mm.plugin.wallet_core.b.a
{
  public final int a(MMActivity paramMMActivity, int paramInt)
  {
    return 2131304813;
  }

  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(46137);
    ab.d("MicroMsg.ProcessManager", "start Process : ForgotPwdProcess");
    Bundle localBundle = this.mqu;
    s.cNC();
    boolean bool;
    int i;
    if (!s.cND().cQp())
    {
      bool = true;
      localBundle.putBoolean("key_is_oversea", bool);
      localBundle = this.mqu;
      s.cNC();
      if (!s.cND().cQp())
        break label114;
      i = 1;
      label62: localBundle.putInt("key_support_bankcard", i);
      this.mqu.putBoolean("key_is_forgot_process", true);
      s.cNC();
      if (!s.cND().cQp())
        break label120;
      b(paramActivity, WalletForgotPwdVerifyIdUI.class, paramBundle);
    }
    while (true)
    {
      AppMethodBeat.o(46137);
      return this;
      bool = false;
      break;
      label114: i = 2;
      break label62;
      label120: b(paramActivity, WalletForgotPwdUI.class, paramBundle);
    }
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(46140);
    if ((paramMMActivity instanceof WalletForgotPwdUI))
    {
      paramMMActivity = new a.1(this, paramMMActivity, parami);
      AppMethodBeat.o(46140);
    }
    while (true)
    {
      return paramMMActivity;
      if ((paramMMActivity instanceof WalletForgotPwdVerifyIdUI))
      {
        paramMMActivity = new a.2(this, paramMMActivity, parami);
        AppMethodBeat.o(46140);
      }
      else if ((paramMMActivity instanceof WalletCardElementUI))
      {
        paramMMActivity = new a.3(this, paramMMActivity, parami);
        AppMethodBeat.o(46140);
      }
      else if ((paramMMActivity instanceof WalletVerifyCodeUI))
      {
        paramMMActivity = new a.4(this, paramMMActivity, parami);
        AppMethodBeat.o(46140);
      }
      else if ((paramMMActivity instanceof WalletPwdConfirmUI))
      {
        paramMMActivity = new a.5(this, paramMMActivity, parami);
        AppMethodBeat.o(46140);
      }
      else
      {
        paramMMActivity = super.a(paramMMActivity, parami);
        AppMethodBeat.o(46140);
      }
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(46138);
    if ((paramActivity instanceof WalletForgotPwdUI))
      if ((paramBundle.containsKey("key_is_force_bind")) && (paramBundle.getBoolean("key_is_force_bind")))
      {
        b(paramActivity, WalletForgotPwdBindNewUI.class, paramBundle);
        AppMethodBeat.o(46138);
      }
    while (true)
    {
      return;
      b(paramActivity, WalletCardElementUI.class, paramBundle);
      AppMethodBeat.o(46138);
      continue;
      if ((paramActivity instanceof WalletCardElementUI))
      {
        if (!cRY())
        {
          b(paramActivity, WalletVerifyCodeUI.class, paramBundle);
          AppMethodBeat.o(46138);
        }
        else
        {
          b(paramActivity, WalletSetPasswordUI.class, paramBundle);
          AppMethodBeat.o(46138);
        }
      }
      else if ((paramActivity instanceof WalletVerifyCodeUI))
      {
        b(paramActivity, WalletSetPasswordUI.class, paramBundle);
        AppMethodBeat.o(46138);
      }
      else if ((paramActivity instanceof WalletSetPasswordUI))
      {
        b(paramActivity, WalletPwdConfirmUI.class, paramBundle);
        AppMethodBeat.o(46138);
      }
      else if ((paramActivity instanceof WalletPwdConfirmUI))
      {
        b(paramActivity, paramBundle);
        AppMethodBeat.o(46138);
      }
      else if (((paramActivity instanceof WalletBankcardIdUI)) || ((paramActivity instanceof WalletConfirmCardIDUI)))
      {
        F(new Object[] { "startActivity2", paramActivity, WalletCardElementUI.class, paramBundle, "flag: 67108864" });
        Intent localIntent = new Intent(paramActivity, WalletCardElementUI.class);
        localIntent.putExtra("process_id", getClass().hashCode());
        localIntent.addFlags(67108864);
        paramActivity.startActivity(localIntent);
        if (paramBundle != null)
          this.mqu.putAll(paramBundle);
        ab.d("MicroMsg.ProcessManager", "bankcard tag :" + dNE());
        AppMethodBeat.o(46138);
      }
      else if ((paramActivity instanceof WalletForgotPwdVerifyIdUI))
      {
        if ((paramBundle.containsKey("key_is_support_face")) && (paramBundle.getInt("key_is_support_face") == 1))
        {
          ab.i("MicroMsg.ProcessManager", "forward support face");
          com.tencent.mm.plugin.report.service.h.pYm.e(15774, new Object[] { Integer.valueOf(this.mqu.getInt("key_forgot_scene", 1)), Integer.valueOf(1) });
          b(paramActivity, WalletForgotPwdSelectUI.class, paramBundle);
          AppMethodBeat.o(46138);
        }
        else
        {
          ab.i("MicroMsg.ProcessManager", "forward not support face");
          b(paramActivity, WalletForgotPwdUI.class, paramBundle);
          AppMethodBeat.o(46138);
        }
      }
      else if ((paramActivity instanceof WalletForgotPwdSelectUI))
      {
        if ((paramBundle.containsKey("key_select_bank_card")) && (paramBundle.getBoolean("key_select_bank_card")))
        {
          ab.i("MicroMsg.ProcessManager", "forward select bankcard");
          b(paramActivity, WalletForgotPwdUI.class, paramBundle);
          AppMethodBeat.o(46138);
        }
        else
        {
          ab.i("MicroMsg.ProcessManager", "forward after face check");
          b(paramActivity, WalletSetPasswordUI.class, paramBundle);
        }
      }
      else
      {
        AppMethodBeat.o(46138);
      }
    }
  }

  public final boolean a(WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(46141);
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(46141);
    case 404:
    }
    while (true)
    {
      return bool;
      com.tencent.mm.ui.base.h.a(paramWalletBaseUI, paramString, null, paramWalletBaseUI.getString(2131304813), false, new a.6(this, paramWalletBaseUI));
      bool = true;
      AppMethodBeat.o(46141);
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(46139);
    s.cNC();
    if (s.cND().cQp())
    {
      a(paramActivity, WalletForgotPwdVerifyIdUI.class, -1, false);
      AppMethodBeat.o(46139);
    }
    while (true)
    {
      return;
      a(paramActivity, WalletForgotPwdUI.class, -1, false);
      AppMethodBeat.o(46139);
    }
  }

  public final String bxP()
  {
    return "ForgotPwdProcess";
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return paramActivity instanceof WalletPwdConfirmUI;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a
 * JD-Core Version:    0.6.2
 */