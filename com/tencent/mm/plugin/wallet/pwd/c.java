package com.tencent.mm.plugin.wallet.pwd;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.pwd.a.n;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletResetPwdAdapterUI;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class c extends com.tencent.mm.wallet_core.c
{
  public final int a(MMActivity paramMMActivity, int paramInt)
  {
    return 2131305355;
  }

  public final com.tencent.mm.wallet_core.c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(46160);
    ab.d("MicroMsg.ResetPwdProcessByToken", "start Process : ResetPwdProcessByToken");
    b(paramActivity, WalletSetPasswordUI.class, paramBundle);
    AppMethodBeat.o(46160);
    return this;
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(46164);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new c.1(this, paramMMActivity, parami);
      AppMethodBeat.o(46164);
    }
    while (true)
    {
      return paramMMActivity;
      if ((paramMMActivity instanceof WalletPwdConfirmUI))
      {
        paramMMActivity = new g(paramMMActivity, parami)
        {
          public final boolean c(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
          {
            boolean bool = true;
            AppMethodBeat.i(46157);
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
            {
              if ((paramAnonymousm instanceof n))
              {
                c.a(c.this).putInt("RESET_PWD_USER_ACTION", 1);
                c.this.a(this.hwd, 0, c.b(c.this));
                h.bQ(this.hwd, this.hwd.getString(2131305123));
              }
              AppMethodBeat.o(46157);
            }
            while (true)
            {
              return bool;
              if ((paramAnonymousm instanceof n))
              {
                h.a(this.hwd, paramAnonymousString, "", false, new c.2.1(this));
                AppMethodBeat.o(46157);
              }
              else
              {
                AppMethodBeat.o(46157);
                bool = false;
              }
            }
          }

          public final boolean p(Object[] paramAnonymousArrayOfObject)
          {
            AppMethodBeat.i(46158);
            paramAnonymousArrayOfObject = (s)paramAnonymousArrayOfObject[0];
            c.e(c.this).getString("key_pwd1");
            this.Agm.a(new n(paramAnonymousArrayOfObject.guu, paramAnonymousArrayOfObject.token), true, 1);
            AppMethodBeat.o(46158);
            return true;
          }
        };
        AppMethodBeat.o(46164);
      }
      else
      {
        paramMMActivity = super.a(paramMMActivity, parami);
        AppMethodBeat.o(46164);
      }
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(46161);
    if ((paramActivity instanceof WalletSetPasswordUI))
    {
      b(paramActivity, WalletPwdConfirmUI.class, paramBundle);
      AppMethodBeat.o(46161);
    }
    while (true)
    {
      return;
      if ((paramActivity instanceof WalletPwdConfirmUI))
        b(paramActivity, paramBundle);
      AppMethodBeat.o(46161);
    }
  }

  public final boolean a(WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(46165);
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(46165);
    case 404:
    }
    while (true)
    {
      return bool;
      h.a(paramWalletBaseUI, paramString, null, paramWalletBaseUI.getString(2131305355), false, new c.3(this, paramWalletBaseUI));
      bool = true;
      AppMethodBeat.o(46165);
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(46163);
    Intent localIntent = new Intent(paramActivity, WalletResetPwdAdapterUI.class);
    localIntent.putExtra("RESET_PWD_USER_ACTION", paramBundle.getInt("RESET_PWD_USER_ACTION", 0));
    a(paramActivity, WalletResetPwdAdapterUI.class, -1, localIntent, false);
    AppMethodBeat.o(46163);
  }

  public final String bxP()
  {
    return "ResetPwdProcessByToken";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(46162);
    if ((paramActivity instanceof WalletPwdConfirmUI))
      a(paramActivity, WalletSetPasswordUI.class, paramInt);
    AppMethodBeat.o(46162);
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.c
 * JD-Core Version:    0.6.2
 */