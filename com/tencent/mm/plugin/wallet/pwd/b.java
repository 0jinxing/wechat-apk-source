package com.tencent.mm.plugin.wallet.pwd;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class b extends c
{
  public final int a(MMActivity paramMMActivity, int paramInt)
  {
    return 2131305355;
  }

  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(46148);
    ab.d("MicroMsg.ProcessManager", "start Process : ModifyPwdProcess");
    b(paramActivity, WalletCheckPwdUI.class, paramBundle);
    AppMethodBeat.o(46148);
    return this;
  }

  public final g a(MMActivity paramMMActivity, i parami)
  {
    AppMethodBeat.i(46152);
    if ((paramMMActivity instanceof WalletCheckPwdUI))
    {
      paramMMActivity = new b.1(this, paramMMActivity, parami);
      AppMethodBeat.o(46152);
    }
    while (true)
    {
      return paramMMActivity;
      if ((paramMMActivity instanceof WalletPwdConfirmUI))
      {
        paramMMActivity = new b.2(this, paramMMActivity, parami);
        AppMethodBeat.o(46152);
      }
      else
      {
        paramMMActivity = super.a(paramMMActivity, parami);
        AppMethodBeat.o(46152);
      }
    }
  }

  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(46149);
    if ((paramActivity instanceof WalletCheckPwdUI))
    {
      b(paramActivity, WalletSetPasswordUI.class, paramBundle);
      AppMethodBeat.o(46149);
    }
    while (true)
    {
      return;
      if ((paramActivity instanceof WalletSetPasswordUI))
      {
        b(paramActivity, WalletPwdConfirmUI.class, paramBundle);
        AppMethodBeat.o(46149);
      }
      else
      {
        if ((paramActivity instanceof WalletPwdConfirmUI))
          b(paramActivity, paramBundle);
        AppMethodBeat.o(46149);
      }
    }
  }

  public final boolean a(final WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(46153);
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(46153);
    case 404:
    }
    while (true)
    {
      return bool;
      h.a(paramWalletBaseUI, paramString, null, paramWalletBaseUI.getString(2131305355), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(46147);
          b.this.b(paramWalletBaseUI, b.c(b.this));
          if (paramWalletBaseUI.bwP())
            paramWalletBaseUI.finish();
          WalletBaseUI.dOB();
          AppMethodBeat.o(46147);
        }
      });
      bool = true;
      AppMethodBeat.o(46153);
    }
  }

  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(46151);
    a(paramActivity, WalletPasswordSettingUI.class, -1, false);
    AppMethodBeat.o(46151);
  }

  public final String bxP()
  {
    return "ModifyPwdProcess";
  }

  public final void c(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(46150);
    if ((paramActivity instanceof WalletPwdConfirmUI))
      a(paramActivity, WalletSetPasswordUI.class, paramInt);
    AppMethodBeat.o(46150);
  }

  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.b
 * JD-Core Version:    0.6.2
 */